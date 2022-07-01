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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider14);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        int int19 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4000 + "'", int19 == 4000);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(requestInterceptor16);
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com/");
        java.lang.String str3 = server2.getName();
        java.lang.String str4 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        retrofit.client.Request request35 = new retrofit.client.Request("default", "", headerList23, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean17 = logLevel16.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.RestAdapter restAdapter8 = builder6.build();
        retrofit.client.Client.Provider provider9 = null;
        builder6.setclientProvider(provider9);
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(restAdapter8);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("Retrofit-", "http://example.com/", headerList2, typedOutput3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        retrofit.client.Request request19 = new retrofit.client.Request("default", "", headerList13, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(log15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(executor17);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(log13);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        retrofit.Server server2 = new retrofit.Server("http://example.com/", "Retrofit-Idle");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", (java.util.List<retrofit.client.Header>) headerList15, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "default", (java.util.List<retrofit.client.Header>) headerList15, typedOutput29);
        java.lang.String str31 = request30.getUrl();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "default" + "'", str31, "default");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "default", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com/", "hi!", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.Server server2 = new retrofit.Server("", "default");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", headerList16, typedOutput19);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
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
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        java.lang.String str34 = request32.getMethod();
        java.lang.String str35 = request32.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request36 = restAdapter10.logAndReplaceRequest(request32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(executor16);
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
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput25);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.Server server13 = restAdapter10.getserver();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(server13);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.RestAdapter.Log log9 = builder3.log;
        retrofit.RestAdapter restAdapter10 = builder3.build();
        java.util.concurrent.Executor executor11 = builder3.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(restAdapter10);
        org.junit.Assert.assertNotNull(executor11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("default", "Retrofit-", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler17 = restAdapter10.profiler;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(log19);
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
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.logLevel;
        retrofit.Profiler profiler23 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(logLevel22);
        org.junit.Assert.assertNull(profiler23);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "http://example.com/", headerList13, typedOutput14);
        java.lang.String str16 = request15.getMethod();
        java.lang.String str17 = request15.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-", "hi!", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList19, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        retrofit.client.Client.Provider provider16 = builder13.clientProvider;
        retrofit.RestAdapter restAdapter17 = builder13.build();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(restAdapter17);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        retrofit.client.Client client15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder13.setClient(client15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        builder3.ensureSaneDefaults();
        builder3.ensureSaneDefaults();
        retrofit.RequestInterceptor requestInterceptor11 = builder3.requestInterceptor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(requestInterceptor11);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(provider19);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList31, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "", headerList31, typedOutput36);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request38 = restAdapter10.logAndReplaceRequest(request37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList31);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.converter.Converter converter23 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNull(converter23);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList28, typedOutput34);
        java.util.List<retrofit.client.Header> headerList36 = request35.getHeaders();
        java.lang.String str37 = request35.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request38 = restAdapter10.logAndReplaceRequest(request35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Retrofit-Idle" + "'", str37, "Retrofit-Idle");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = server1.name;
        java.lang.String str3 = server1.apiUrl;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler18 = builder17.errorHandler;
        retrofit.RestAdapter.Builder builder20 = builder17.setServer("hi!");
        java.util.concurrent.Executor executor21 = null;
        builder20.callbackExecutor = executor21;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler24 = builder23.errorHandler;
        retrofit.RestAdapter.Builder builder26 = builder23.setServer("hi!");
        retrofit.client.Client.Provider provider27 = null;
        builder26.clientProvider = provider27;
        java.util.concurrent.Executor executor29 = builder26.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel30 = builder26.logLevel;
        builder20.logLevel = logLevel30;
        restAdapter10.logLevel = logLevel30;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(errorHandler24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.Server server21 = restAdapter10.server;
        java.util.concurrent.Executor executor22 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(executor22);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(executor18);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.Profiler profiler12 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(logLevel13);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        retrofit.Server server2 = new retrofit.Server("http://example.com", "");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.RestAdapter.Log log9 = builder3.log;
        retrofit.Profiler profiler10 = builder3.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(profiler10);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler10 = builder9.errorHandler;
        retrofit.RestAdapter.Builder builder12 = builder9.setServer("hi!");
        retrofit.client.Client.Provider provider13 = null;
        builder12.clientProvider = provider13;
        java.util.concurrent.Executor executor15 = builder12.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = builder12.logLevel;
        retrofit.client.Client.Provider provider17 = builder12.clientProvider;
        retrofit.RestAdapter restAdapter18 = builder12.build();
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
        retrofit.client.Request request42 = restAdapter18.logAndReplaceRequest(request41);
        retrofit.RestAdapter.RestHandler restHandler43 = restAdapter18.new RestHandler();
        java.util.concurrent.Executor executor44 = restAdapter18.gethttpExecutor();
        builder3.httpExecutor = executor44;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(errorHandler10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(restAdapter18);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(executor44);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.RestAdapter.Log log9 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.BASIC;
        retrofit.RestAdapter.Builder builder11 = builder3.setLogLevel(logLevel10);
        retrofit.RestAdapter.Log log12 = builder11.log;
        retrofit.client.Client.Provider provider13 = builder11.clientProvider;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(provider13);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        retrofit.client.Request request26 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.util.List<retrofit.client.Header> headerList28 = request26.getHeaders();
        java.lang.String str29 = request26.getMethod();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com" + "'", str27, "http://example.com");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList17, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = request16.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "Retrofit-", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList19, typedOutput24);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.Server server19 = restAdapter10.server;
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.Profiler profiler21 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider22 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
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
        java.lang.String str45 = request44.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request46 = restAdapter10.logAndReplaceRequest(request44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        retrofit.client.Request request29 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList21, typedOutput30);
        java.lang.String str32 = request31.getUrl();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-" + "'", str32, "Retrofit-");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(converter15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.Server server19 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.String str18 = request14.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.Profiler profiler18 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(logLevel20);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "http://example.com/", headerList2, typedOutput3);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler12 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-Idle", "default", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "Retrofit-Idle", headerList11, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString9();
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
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(server18);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.logLevel;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        retrofit.RestAdapter.Log log12 = builder3.log;
        retrofit.RestAdapter.LogLevel logLevel13 = builder3.logLevel;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.Profiler profiler5 = builder0.profiler;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler7 = builder6.errorHandler;
        retrofit.RestAdapter.Builder builder9 = builder6.setServer("hi!");
        retrofit.client.Client.Provider provider10 = null;
        builder9.clientProvider = provider10;
        java.util.concurrent.Executor executor12 = builder9.callbackExecutor;
        retrofit.client.Client.Provider provider13 = null;
        builder9.clientProvider = provider13;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        builder9.log = log15;
        log15.log("default");
        log15.log("Retrofit-Idle");
        log15.log("http://example.com");
        retrofit.RestAdapter.Builder builder23 = builder0.setLog(log15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server25 = serializedObjectSupporter24.deserializeObjectServer1();
        builder23.server = server25;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(profiler5);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(server25);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        log9.log("Retrofit-");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(errorHandler15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("default", "default", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(errorHandler19);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList17, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList17, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("Retrofit-Idle", "http://example.com", (java.util.List<retrofit.client.Header>) headerList17, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "default", (java.util.List<retrofit.client.Header>) headerList17, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput33);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler19 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(profiler19);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(logLevel17);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = request15.getBody();
        java.lang.String str18 = request15.getUrl();
        java.util.List<retrofit.client.Header> headerList19 = request15.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor4 = null;
        builder0.requestInterceptor = requestInterceptor4;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = null;
        builder3.callbackExecutor = executor6;
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder3.requestInterceptor = requestInterceptor8;
        retrofit.converter.Converter converter10 = builder3.converter;
        retrofit.Server server11 = null;
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.RequestInterceptor requestInterceptor15 = null;
        retrofit.converter.Converter converter16 = null;
        retrofit.Profiler profiler17 = null;
        retrofit.ErrorHandler errorHandler18 = null;
        retrofit.RestAdapter.Log log19 = null;
        retrofit.RestAdapter.LogLevel logLevel20 = null;
        retrofit.RestAdapter restAdapter21 = new retrofit.RestAdapter(server11, provider12, executor13, executor14, requestInterceptor15, converter16, profiler17, errorHandler18, log19, logLevel20);
        retrofit.client.Client.Provider provider22 = restAdapter21.clientProvider;
        java.util.concurrent.Executor executor23 = restAdapter21.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = restAdapter21.serializedObjectSupporter;
        retrofit.Server server25 = restAdapter21.server;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter21.logLevel = logLevel26;
        boolean boolean28 = logLevel26.log();
        builder3.logLevel = logLevel26;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNull(serializedObjectSupporter24);
        org.junit.Assert.assertNull(server25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
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
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
        org.junit.Assert.assertNull(errorHandler22);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
        org.junit.Assert.assertNull(executor14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor15);
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter18.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse3();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter20 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter21;
        retrofit.client.Client.Provider provider23 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(provider23);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        retrofit.Server server1 = new retrofit.Server("http://example.com/");
        java.lang.String str2 = server1.getapiUrl();
        java.lang.String str3 = server1.getName();
        java.lang.String str4 = server1.name;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "http://example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        retrofit.Profiler profiler4 = null;
        builder0.profiler = profiler4;
        retrofit.Profiler profiler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder7 = builder0.setProfiler(profiler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        retrofit.Server server2 = new retrofit.Server("", "http://example.com/");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.client.Client.Provider provider7 = builder6.getclientProvider();
        retrofit.Profiler profiler8 = builder6.profiler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(profiler8);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler20 = restAdapter10.getprofiler();
        retrofit.Profiler profiler21 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-Idle", "default", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "Retrofit-Idle", headerList11, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        retrofit.Server server2 = new retrofit.Server("http://example.com/", "");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("http://example.com/", "Retrofit-", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "http://example.com", headerList19, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.Server server3 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(server3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
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
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor22 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log23 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(requestInterceptor22);
        org.junit.Assert.assertNull(log23);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor4 = null;
        builder0.requestInterceptor = requestInterceptor4;
        builder0.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.Server server2 = new retrofit.Server("Retrofit-", "http://example.com");
        java.lang.String str3 = server2.getapiUrl();
        java.lang.String str4 = server2.getDEFAULT_NAME();
        java.lang.String str5 = server2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-" + "'", str3, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler19);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.httpExecutor = executor7;
        java.util.concurrent.Executor executor9 = builder3.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler17.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList15, typedOutput18);
        java.lang.String str20 = request19.getMethod();
        java.lang.String str21 = request19.getUrl();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.client.Client.Provider provider7 = builder6.getclientProvider();
        retrofit.Server server8 = builder6.server;
        java.lang.String str9 = server8.getDEFAULT_NAME();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "default" + "'", str9, "default");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Server server21 = restAdapter10.server;
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable22, "Retrofit-Idle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(server21);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        retrofit.client.Request request39 = new retrofit.client.Request("default", "", headerList25, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNull(typedOutput40);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler16 = builder15.errorHandler;
        retrofit.RestAdapter.Builder builder18 = builder15.setServer("hi!");
        retrofit.client.Client.Provider provider19 = null;
        builder18.clientProvider = provider19;
        java.util.concurrent.Executor executor21 = builder18.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        restAdapter10.logLevel = logLevel22;
        retrofit.client.Client.Provider provider24 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("default", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "default", headerList19, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", headerList24, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com/", "hi!", headerList24, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com/", "hi!", headerList24, typedOutput31);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList24);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(executor14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        retrofit.client.Client.Provider provider7 = null;
        builder3.clientProvider = provider7;
        retrofit.ErrorHandler errorHandler9 = builder3.errorHandler;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        log10.log("Retrofit-");
        builder3.log = log10;
        log10.log("http://example.com");
        log10.log("http://example.com/");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        retrofit.RestAdapter.RestHandler restHandler34 = restAdapter9.new RestHandler();
        java.util.concurrent.Executor executor35 = restAdapter9.gethttpExecutor();
        retrofit.client.Client.Provider provider36 = restAdapter9.getclientProvider();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(executor35);
        org.junit.Assert.assertNotNull(provider36);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(errorHandler15);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        retrofit.Server server2 = new retrofit.Server("", "hi!");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter19.deserializeObjectErrorHandler1();
        java.lang.Class class22 = serializedObjectSupporter19.deserializeObjectClass1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter19;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        retrofit.client.Client.Provider provider16 = builder13.clientProvider;
        retrofit.RestAdapter restAdapter17 = builder13.build();
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        retrofit.client.Request request30 = restAdapter17.logAndReplaceRequest(request28);
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(restAdapter17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(request30);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.Server server1 = new retrofit.Server("default");
        java.lang.String str2 = server1.getUrl();
        java.lang.String str3 = server1.getDEFAULT_NAME();
        java.lang.String str4 = server1.apiUrl;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.Server server14 = restAdapter10.getserver();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(server14);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        java.lang.String str34 = request33.getUrl();
        java.lang.String str35 = request33.getUrl();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler12 = restAdapter10.profiler;
        retrofit.ErrorHandler errorHandler13 = restAdapter10.errorHandler;
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
        retrofit.client.Client.Provider provider25 = restAdapter24.clientProvider;
        java.util.concurrent.Executor executor26 = restAdapter24.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = restAdapter24.serializedObjectSupporter;
        retrofit.Server server28 = restAdapter24.server;
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter24.logLevel = logLevel29;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNull(server28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.BASIC));
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
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
        java.util.concurrent.Executor executor20 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        java.lang.String str19 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-" + "'", str19, "Retrofit-");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.Log log13 = restAdapter10.log;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(log13);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        retrofit.Server server2 = new retrofit.Server("hi!", "http://example.com/");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        retrofit.client.Header[] headerArray44 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList45 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList45, headerArray44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList45, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList45, typedOutput49);
        java.util.List<retrofit.client.Header> headerList51 = request50.getHeaders();
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "", headerList51, typedOutput54);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "default", headerList51, typedOutput56);
        retrofit.client.Request request58 = restAdapter9.logAndReplaceRequest(request57);
        java.util.concurrent.Executor executor59 = restAdapter9.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertNotNull(executor59);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("default", "default", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com/", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList15, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "http://example.com", (java.util.List<retrofit.client.Header>) headerList15, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList15, typedOutput29);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        retrofit.Server server2 = new retrofit.Server("default", "");
        java.lang.String str3 = server2.apiUrl;
        java.lang.String str4 = server2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-Idle", "default", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "Retrofit-", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "http://example.com", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList21, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList21, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = request35.getBody();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput36);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.client.Client.Provider provider6 = builder3.clientProvider;
        builder3.ensureSaneDefaults();
        builder3.ensureSaneDefaults();
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
        retrofit.client.Client.Provider provider20 = restAdapter19.clientProvider;
        java.util.concurrent.Executor executor21 = restAdapter19.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = restAdapter19.serializedObjectSupporter;
        retrofit.Server server23 = restAdapter19.server;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter19.logLevel = logLevel24;
        boolean boolean26 = logLevel24.log();
        retrofit.RestAdapter.Builder builder27 = builder3.setLogLevel(logLevel24);
        boolean boolean28 = logLevel24.log();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
        org.junit.Assert.assertNull(server23);
        org.junit.Assert.assertTrue("'" + logLevel24 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel24.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log18 = restAdapter10.log;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(log18);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Client.Provider provider9 = restAdapter8.clientProvider;
        java.lang.String str10 = restAdapter8.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter8.new RestHandler();
        retrofit.converter.Converter converter12 = restAdapter8.getconverter();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Retrofit-Idle" + "'", str10, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(converter12);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.Server server2 = new retrofit.Server("http://example.com", "Retrofit-Idle");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(executor19);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel7 = builder3.logLevel;
        retrofit.RestAdapter restAdapter8 = builder3.build();
        retrofit.client.Client.Provider provider9 = restAdapter8.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler10 = restAdapter8.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter8.new RestHandler();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(restAdapter8);
        org.junit.Assert.assertNotNull(provider9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        java.util.List<retrofit.client.Header> headerList34 = request33.getHeaders();
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "Retrofit-", headerList34, typedOutput35);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList34);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("Retrofit-", "http://example.com/", headerList11, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput26);
        java.lang.String str28 = request27.getMethod();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        java.lang.String str30 = request27.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request31 = restAdapter10.logAndReplaceRequest(request27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Retrofit-Idle" + "'", str28, "Retrofit-Idle");
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-Idle" + "'", str30, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        restHandler14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter2();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter15.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
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
        retrofit.client.Client.Provider provider15 = builder3.clientProvider;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(errorHandler7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider15);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler12 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(errorHandler12);
        org.junit.Assert.assertNull(provider14);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        java.lang.String str29 = request27.getUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = restAdapter10.logAndReplaceRequest(request27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
        retrofit.client.Request request35 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList25, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList25, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList25, typedOutput38);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor21 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
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
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com/", "default", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getUrl();
        java.lang.String str17 = request14.getUrl();
        java.lang.String str18 = request14.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Server server14 = restAdapter10.getserver();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        retrofit.RequestInterceptor requestInterceptor22 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler23 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(requestInterceptor22);
        org.junit.Assert.assertNull(errorHandler23);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(executor20);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restHandler14.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor15);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(logLevel17);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor18 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(executor18);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("Retrofit-", "Retrofit-Idle", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("http://example.com", "Retrofit-", headerList11, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restHandler11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server14 = serializedObjectSupporter13.deserializeObjectServer1();
        restHandler11.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString4();
        retrofit.client.Response response17 = serializedObjectSupporter13.deserializeObjectResponse7();
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNotNull(server14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.client.Client.Provider provider2 = builder0.getclientProvider();
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        org.junit.Assert.assertNull(converter1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(executor3);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        log9.log("default");
        log9.log("Retrofit-Idle");
        log9.log("http://example.com");
        log9.log("hi!");
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor20 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor20);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.Server server21 = restAdapter10.server;
        java.util.concurrent.Executor executor22 = restAdapter10.getcallbackExecutor();
        java.lang.String str23 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Retrofit-" + "'", str23, "Retrofit-");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("Retrofit-Idle", "default", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "Retrofit-Idle", headerList25, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList25, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "Retrofit-", headerList25, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("default", "http://example.com", headerList25, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList25, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList25, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("Retrofit-Idle", "", headerList25, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList25, typedOutput42);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.Server server1 = new retrofit.Server("http://example.com/");
        java.lang.String str2 = server1.getapiUrl();
        java.lang.String str3 = server1.apiUrl;
        java.lang.String str4 = server1.getapiUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        java.util.List<retrofit.client.Header> headerList21 = request19.getHeaders();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider16 = restAdapter10.clientProvider;
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com/", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request24 = restAdapter10.logAndReplaceRequest(request23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "Retrofit-Idle");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("Retrofit-Idle", "default", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "Retrofit-Idle", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "Retrofit-", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "http://example.com", headerList17, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("default", "", headerList17, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("Retrofit-Idle", "default", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-" + "'", str1, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString4();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com/" + "'", str20, "http://example.com/");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        int int21 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4000 + "'", int21 == 4000);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
        java.util.List<retrofit.client.Header> headerList18 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "http://example.com/", headerList18, typedOutput19);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.String str23 = request22.getMethod();
        java.lang.String str24 = request22.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Retrofit-" + "'", str23, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Retrofit-" + "'", str24, "Retrofit-");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "default", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList19, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = request27.getBody();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput28);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        retrofit.Server server2 = new retrofit.Server("default", "default");
        java.lang.String str3 = server2.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
        java.lang.String str29 = server28.getDEFAULT_NAME();
        java.lang.String str30 = server28.apiUrl;
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(requestInterceptor14);
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
        java.util.concurrent.Executor executor11 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider12 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-Idle", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "Retrofit-Idle", headerList25, typedOutput26);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.Server server3 = builder0.server;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
        org.junit.Assert.assertNull(server3);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.converter.Converter converter20 = restAdapter10.converter;
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList28, typedOutput34);
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
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        retrofit.Server server2 = new retrofit.Server("default", "http://example.com/");
        java.lang.String str3 = server2.getapiUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor20 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        retrofit.Profiler profiler22 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(profiler22);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.converter.Converter converter15 = restAdapter10.converter;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(converter15);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler12 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(errorHandler12);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(logLevel12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-" + "'", str2, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter3);
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
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("default", "default", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        builder3.ensureSaneDefaults();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        retrofit.Server server18 = restAdapter10.getserver();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
        retrofit.client.Request request29 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-", "", headerList21, typedOutput30);
        java.lang.String str32 = request31.getUrl();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-Idle", "default", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "Retrofit-", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "http://example.com", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-", "hi!", headerList21, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = request35.getBody();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput36);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder3.serializedObjectSupporter;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        java.lang.String str4 = server2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
        retrofit.RestAdapter.Log log12 = builder3.log;
        java.util.concurrent.Executor executor13 = builder3.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(executor13);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler18 = builder17.errorHandler;
        retrofit.RestAdapter.Builder builder20 = builder17.setServer("hi!");
        retrofit.client.Client.Provider provider21 = null;
        builder20.clientProvider = provider21;
        retrofit.client.Client.Provider provider23 = builder20.clientProvider;
        builder20.ensureSaneDefaults();
        builder20.ensureSaneDefaults();
        retrofit.Server server26 = null;
        retrofit.client.Client.Provider provider27 = null;
        java.util.concurrent.Executor executor28 = null;
        java.util.concurrent.Executor executor29 = null;
        retrofit.RequestInterceptor requestInterceptor30 = null;
        retrofit.converter.Converter converter31 = null;
        retrofit.Profiler profiler32 = null;
        retrofit.ErrorHandler errorHandler33 = null;
        retrofit.RestAdapter.Log log34 = null;
        retrofit.RestAdapter.LogLevel logLevel35 = null;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server26, provider27, executor28, executor29, requestInterceptor30, converter31, profiler32, errorHandler33, log34, logLevel35);
        retrofit.client.Client.Provider provider37 = restAdapter36.clientProvider;
        java.util.concurrent.Executor executor38 = restAdapter36.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = restAdapter36.serializedObjectSupporter;
        retrofit.Server server40 = restAdapter36.server;
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter36.logLevel = logLevel41;
        boolean boolean43 = logLevel41.log();
        retrofit.RestAdapter.Builder builder44 = builder20.setLogLevel(logLevel41);
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(errorHandler18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNull(serializedObjectSupporter39);
        org.junit.Assert.assertNull(server40);
        org.junit.Assert.assertTrue("'" + logLevel41 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel41.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(logLevel15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder4.serializedObjectSupporter;
        retrofit.Server server6 = builder4.server;
        builder4.ensureSaneDefaults();
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(server6);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder3.logLevel;
        java.util.concurrent.Executor executor7 = null;
        builder3.sethttpExecutor(executor7);
        java.util.concurrent.Executor executor9 = builder3.httpExecutor;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-Idle");
        java.lang.String str3 = server2.name;
        java.lang.String str4 = server2.apiUrl;
        java.lang.String str5 = server2.getapiUrl();
        java.lang.String str6 = server2.apiUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("Retrofit-Idle", "default", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "Retrofit-", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("default", "http://example.com", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList21, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList21, typedOutput34);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList21);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(executor20);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("default", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "default", headerList17, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList22, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("default", "Retrofit-Idle", headerList22, typedOutput27);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "http://example.com/", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList15, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        int int18 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4000 + "'", int18 == 4000);
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
        retrofit.client.Response response21 = serializedObjectSupporter16.deserializeObjectResponse2();
        retrofit.client.Response response22 = serializedObjectSupporter16.deserializeObjectResponse2();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(errorHandler19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response22);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RestAdapter.Log log14 = restAdapter10.log;
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(log14);
        org.junit.Assert.assertNull(executor15);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.ErrorHandler errorHandler19 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor20 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(errorHandler19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(requestInterceptor21);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.Server server17 = restAdapter10.getserver();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "Retrofit-Idle", headerList14, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        java.lang.String str4 = server2.apiUrl;
        java.lang.String str5 = server2.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = request15.getBody();
        java.lang.String str18 = request15.getUrl();
        java.lang.String str19 = request15.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        retrofit.Server server2 = new retrofit.Server("hi!", "Retrofit-");
        java.lang.String str3 = server2.getDEFAULT_NAME();
        java.lang.String str4 = server2.apiUrl;
        java.lang.String str5 = server2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "http://example.com", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("default", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-Idle", "default", headerList21, typedOutput30);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString8();
        retrofit.client.Response response18 = serializedObjectSupporter16.deserializeObjectResponse7();
        retrofit.ErrorHandler errorHandler19 = serializedObjectSupporter16.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(errorHandler19);
        org.junit.Assert.assertNull(requestInterceptor21);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log12 = restAdapter10.log;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter10.gethttpExecutor();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable19, "Retrofit-");
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
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(converter18);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider11);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.profiler;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.Server server17 = restAdapter10.server;
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(errorHandler18);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        retrofit.Server server1 = new retrofit.Server("http://example.com/");
        java.lang.String str2 = server1.getapiUrl();
        java.lang.String str3 = server1.apiUrl;
        java.lang.String str4 = server1.getDEFAULT_NAME();
        java.lang.String str5 = server1.getName();
        java.lang.String str6 = server1.apiUrl;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
        retrofit.client.Request request29 = new retrofit.client.Request("", "Retrofit-Idle", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-", "hi!", headerList21, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        java.lang.String str33 = request31.getMethod();
        retrofit.mime.TypedOutput typedOutput34 = request31.getBody();
        java.lang.String str35 = request31.getMethod();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Retrofit-" + "'", str33, "Retrofit-");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
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
        retrofit.Server server19 = restAdapter10.getserver();
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.requestInterceptor;
        java.util.concurrent.Executor executor21 = restAdapter10.gethttpExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(requestInterceptor20);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
        retrofit.client.Request request19 = new retrofit.client.Request("", "default", headerList13, typedOutput18);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
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
        retrofit.ErrorHandler errorHandler11 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(executor15);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
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
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-", "Retrofit-", headerList21, typedOutput30);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter9.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter9.httpExecutor;
        retrofit.client.Client.Provider provider13 = restAdapter9.clientProvider;
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter9.logException(throwable14, "Retrofit-");
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
        org.junit.Assert.assertNotNull(executor12);
        org.junit.Assert.assertNotNull(provider13);
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
        retrofit.ErrorHandler errorHandler23 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(errorHandler20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(errorHandler23);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(profiler20);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("default", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.getMethod();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
        java.lang.String str15 = restAdapter14.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter14.getrequestInterceptor();
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(restAdapter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(requestInterceptor16);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        retrofit.Profiler profiler20 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler22 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(errorHandler22);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
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
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.RequestInterceptor requestInterceptor19 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor21 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(requestInterceptor19);
        org.junit.Assert.assertNull(executor21);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
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
        retrofit.RequestInterceptor requestInterceptor11 = builder3.requestInterceptor;
        retrofit.Server server12 = builder3.server;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(requestInterceptor11);
        org.junit.Assert.assertNotNull(server12);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(requestInterceptor16);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = restAdapter10.serializedObjectSupporter;
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = builder0.log;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.client.Client.Provider provider3 = builder0.getclientProvider();
        java.util.concurrent.Executor executor4 = builder0.gethttpExecutor();
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(log1);
        org.junit.Assert.assertNull(log2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor12 = restAdapter10.getrequestInterceptor();
        retrofit.Profiler profiler13 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        int int15 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4000 + "'", int15 == 4000);
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
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        java.util.concurrent.Executor executor19 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor19);
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
        retrofit.client.Client.Provider provider11 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList29, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList29, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("Retrofit-Idle", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("Retrofit-", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput39);
        java.util.List<retrofit.client.Header> headerList41 = request40.getHeaders();
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("http://example.com/", "default", headerList41, typedOutput42);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request44 = restAdapter10.logAndReplaceRequest(request43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerList41);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Profiler profiler1 = builder0.profiler;
        retrofit.Server server4 = new retrofit.Server("Retrofit-Idle", "http://example.com");
        java.lang.String str5 = server4.getapiUrl();
        java.lang.String str6 = server4.getDEFAULT_NAME();
        builder0.server = server4;
        org.junit.Assert.assertNull(profiler1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "default" + "'", str6, "default");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
        retrofit.RestAdapter.RestHandler restHandler34 = restAdapter9.new RestHandler();
        java.util.concurrent.Executor executor35 = restAdapter9.gethttpExecutor();
        retrofit.client.Client.Provider provider36 = restAdapter9.clientProvider;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertTrue("'" + logLevel7 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel7.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(restAdapter9);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(executor35);
        org.junit.Assert.assertNotNull(provider36);
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
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(profiler15);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
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
        retrofit.client.Request request22 = new retrofit.client.Request("", "Retrofit-Idle", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("default", "Retrofit-", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com/", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("Retrofit-Idle", "default", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "Retrofit-Idle", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "Retrofit-", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("default", "http://example.com", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList23, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList23, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("Retrofit-", "default", headerList23, typedOutput38);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.lang.String str9 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler2 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        java.lang.Class class3 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.Server server6 = serializedObjectSupporter0.deserializeObjectServer1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = serializedObjectSupporter0.deserializeObjectLogLevel2();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(errorHandler2);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(server6);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.client.Client.Provider provider4 = null;
        builder3.clientProvider = provider4;
        java.util.concurrent.Executor executor6 = builder3.callbackExecutor;
        java.util.concurrent.Executor executor7 = null;
        builder3.setcallbackExecutor(executor7);
        retrofit.Profiler profiler9 = builder3.profiler;
        retrofit.ErrorHandler errorHandler10 = builder3.errorHandler;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(errorHandler10);
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        int int17 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4000 + "'", int17 == 4000);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        retrofit.client.Client.Provider provider29 = restAdapter28.clientProvider;
        java.util.concurrent.Executor executor30 = restAdapter28.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = restAdapter28.serializedObjectSupporter;
        retrofit.Server server32 = restAdapter28.server;
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter28.logLevel = logLevel33;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNull(serializedObjectSupporter31);
        org.junit.Assert.assertNull(server32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-", "hi!", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com/", "Retrofit-Idle", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-Idle", "Retrofit-", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "Retrofit-Idle", headerList23, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = request35.getBody();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNull(typedOutput36);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(provider18);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.httpExecutor;
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request42 = restAdapter10.logAndReplaceRequest(request41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerList35);
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
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter20 = serializedObjectSupporter15.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
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
        java.util.concurrent.Executor executor23 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(requestInterceptor21);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(executor23);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        retrofit.client.Request request29 = new retrofit.client.Request("Retrofit-", "http://example.com", headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("Retrofit-", "", headerList23, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("Retrofit-Idle", "http://example.com/", headerList23, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com/", "", headerList23, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter21 = serializedObjectSupporter16.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(errorHandler19);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
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
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(log12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restHandler14.serializedObjectSupporter;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "default", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput29);
        java.lang.reflect.Method method31 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = restHandler14.invoke((java.lang.Object) "", method31, objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
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
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str20 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-" + "'", str20, "Retrofit-");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("Retrofit-Idle", "default", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "Retrofit-Idle", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList15, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
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
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        java.util.List<retrofit.client.Header> headerList18 = request17.getHeaders();
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList19, typedOutput20);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.ErrorHandler errorHandler3 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        java.util.concurrent.Executor executor4 = null;
        builder3.callbackExecutor = executor4;
        java.util.concurrent.Executor executor6 = builder3.httpExecutor;
        retrofit.converter.Converter converter7 = builder3.converter;
        java.util.concurrent.Executor executor8 = builder3.gethttpExecutor();
        retrofit.converter.Converter converter9 = builder3.converter;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler11 = builder10.errorHandler;
        retrofit.RestAdapter.Builder builder13 = builder10.setServer("hi!");
        retrofit.client.Client.Provider provider14 = null;
        builder13.clientProvider = provider14;
        java.util.concurrent.Executor executor16 = builder13.callbackExecutor;
        retrofit.client.Client.Provider provider17 = null;
        builder13.clientProvider = provider17;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        builder13.log = log19;
        log19.log("default");
        log19.log("Retrofit-Idle");
        log19.log("");
        builder3.log = log19;
        org.junit.Assert.assertNull(errorHandler1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(log19);
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(logLevel18);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }
}

