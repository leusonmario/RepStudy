import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory5.getCompression();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(compression6);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '4');
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray3);
        io.undertow.server.HttpHandler httpHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.accesslog.AccessLogHandler accessLogHandler6 = undertowEmbeddedServletContainerFactory1.createAccessLogHandler(httpHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray3);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        undertowEmbeddedServletContainerFactory17.serializedObjectSupporter = serializedObjectSupporter18;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        undertowEmbeddedServletContainerFactory9.setIoThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("/tmp/junit15641907838534958188", 100);
        org.springframework.core.io.ResourceLoader resourceLoader3 = undertowEmbeddedServletContainerFactory2.resourceLoader;
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        org.junit.Assert.assertNull(resourceLoader3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager5 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = initializer8.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer8.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = initializer8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(deploymentManager5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.core.io.ResourceLoader resourceLoader5 = undertowEmbeddedServletContainerFactory4.resourceLoader;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(resourceLoader5);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory9.useForwardHeaders = false;
        java.io.File file12 = undertowEmbeddedServletContainerFactory9.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file12);
        jarResourceManager14.close();
        jarResourceManager14.close();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file12.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter2 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter2;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory17.setSessionTimeout(1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptySet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        io.undertow.server.handlers.resource.ResourceManager resourceManager5 = undertowEmbeddedServletContainerFactory4.getDocumentRootResourceManager();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(resourceManager5);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        undertowEmbeddedServletContainerFactory7.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = undertowEmbeddedServletContainerFactory11.deploymentInfoCustomizers;
        java.io.File file14 = undertowEmbeddedServletContainerFactory11.getDocumentRoot();
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory11.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer16 };
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(errorPageSet12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray17);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory6.useForwardHeaders = false;
        java.io.File file9 = undertowEmbeddedServletContainerFactory6.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file9);
        java.lang.String str11 = jarResourceManager10.getjarPath();
        boolean boolean12 = jarResourceManager10.isResourceChangeListenerSupported();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file9.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/tmp/junit15641907838534958188" + "'", str11, "/tmp/junit15641907838534958188");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray3 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = initializer1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList3 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.lang.ClassLoader classLoader5 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = true;
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.util.Set<java.lang.Class<?>> wildcardClassSet9 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClassSet9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        undertowEmbeddedServletContainerFactory9.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory9.directBuffers = false;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.Set<java.lang.Class<?>> wildcardClassSet5 = undertowEmbeddedServletContainerFactory4.getNO_CLASSES();
        undertowEmbeddedServletContainerFactory4.ioThreads = 1800;
        boolean boolean8 = undertowEmbeddedServletContainerFactory4.accessLogEnabled;
        undertowEmbeddedServletContainerFactory4.accessLogPattern = "/say";
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory5.workerThreads = 0;
        boolean boolean10 = undertowEmbeddedServletContainerFactory5.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory17.useForwardHeaders = false;
        java.io.File file20 = undertowEmbeddedServletContainerFactory17.getDocumentRoot();
        undertowEmbeddedServletContainerFactory5.accessLogDirectory = file20;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file20);
        undertowEmbeddedServletContainerFactory3.accessLogDirectory = file20;
        java.lang.ClassLoader classLoader24 = undertowEmbeddedServletContainerFactory3.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file20.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNotNull(classLoader24);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory10.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager14 = undertowEmbeddedServletContainerFactory10.createDeploymentManager(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        initializer17.serializedObjectSupporter = serializedObjectSupporter18;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        undertowEmbeddedServletContainerFactory8.serializedObjectSupporter = serializedObjectSupporter18;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(deploymentManager14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory3.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory3.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory3.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray11);
        undertowEmbeddedServletContainerFactory9.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        undertowEmbeddedServletContainerFactory3.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage23 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage23 };
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory3.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray24);
        org.springframework.core.io.ResourceLoader resourceLoader28 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader28);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter32 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        io.undertow.server.handlers.resource.ResourceManager resourceManager33 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter34 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList37 = serializedObjectSupporter34.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        java.net.InetAddress inetAddress45 = null;
        undertowEmbeddedServletContainerFactory44.setAddress(inetAddress45);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray47);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray49 = initializer48.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter50 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = serializedObjectSupporter50.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer48.serializedObjectSupporter = serializedObjectSupporter50;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter53 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer48.serializedObjectSupporter = serializedObjectSupporter53;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter53.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl62 = undertowEmbeddedServletContainerFactory61.getSsl();
        undertowEmbeddedServletContainerFactory44.setSsl(ssl62);
        undertowEmbeddedServletContainerFactory1.setSsl(ssl62);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        org.junit.Assert.assertNotNull(errorPageArray24);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(resourceManager33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray49);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory51);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory54);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory55);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory56);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory57);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory58);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNotNull(ssl62);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray15);
        undertowEmbeddedServletContainerFactory14.workerThreads = 0;
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter20 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory26.useForwardHeaders = false;
        java.io.File file29 = undertowEmbeddedServletContainerFactory26.getDocumentRoot();
        undertowEmbeddedServletContainerFactory14.accessLogDirectory = file29;
        undertowEmbeddedServletContainerFactory11.setAccessLogDirectory(file29);
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file29);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file29.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory9.serializedObjectSupporter = serializedObjectSupporter10;
        undertowEmbeddedServletContainerFactory9.bufferSize = 1800;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = initializer1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = initializer1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        java.lang.ClassLoader classLoader7 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory6.useForwardHeaders = false;
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory6.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory16.setSessionStoreDir(file17);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory16.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory21.workerThreads = 0;
        boolean boolean26 = undertowEmbeddedServletContainerFactory21.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory33.useForwardHeaders = false;
        java.io.File file36 = undertowEmbeddedServletContainerFactory33.getDocumentRoot();
        undertowEmbeddedServletContainerFactory21.accessLogDirectory = file36;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file36);
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file36);
        undertowEmbeddedServletContainerFactory14.accessLogDirectory = file36;
        undertowEmbeddedServletContainerFactory6.setSessionStoreDir(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file36.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        java.util.Set<java.lang.Class<?>> wildcardClassSet7 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray11);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = undertowEmbeddedServletContainerFactory9.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory9.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory9.getSsl();
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory9.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet16);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        int int21 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNotNull(jspServlet16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        int int7 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1800 + "'", int7 == 1800);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList11 = undertowEmbeddedServletContainerFactory9.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList11;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        java.net.InetAddress inetAddress16 = undertowEmbeddedServletContainerFactory14.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager18 = undertowEmbeddedServletContainerFactory14.createDeploymentManager(servletContextInitializerArray17);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray17);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter21 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory27.useForwardHeaders = false;
        java.io.File file30 = undertowEmbeddedServletContainerFactory27.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file30);
        java.lang.String str32 = jarResourceManager31.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter33 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        jarResourceManager31.serializedObjectSupporter = serializedObjectSupporter33;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        initializer20.serializedObjectSupporter = serializedObjectSupporter33;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList11);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNull(inetAddress16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        org.junit.Assert.assertNotNull(deploymentManager18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file30.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/tmp/junit15641907838534958188" + "'", str32, "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList16 = undertowEmbeddedServletContainerFactory15.builderCustomizers;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList16);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory8.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory8.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory8.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage15 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray16 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage15 };
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray16);
        undertowEmbeddedServletContainerFactory14.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer26 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray27 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer26 };
        undertowEmbeddedServletContainerFactory8.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory30.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int33 = undertowEmbeddedServletContainerFactory30.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory30.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage37 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray38 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage37 };
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray38);
        undertowEmbeddedServletContainerFactory36.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory36.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer48 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray49 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer48 };
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray49);
        undertowEmbeddedServletContainerFactory8.addBuilderCustomizers(undertowBuilderCustomizerArray49);
        undertowEmbeddedServletContainerFactory6.addBuilderCustomizers(undertowBuilderCustomizerArray49);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo53 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = initializer56.initializers;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory6.registerServletContainerInitializerToDriveServletContextInitializers(deploymentInfo53, servletContextInitializerArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(ssl12);
        org.junit.Assert.assertNotNull(errorPageArray16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray22);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray27);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(ssl34);
        org.junit.Assert.assertNotNull(errorPageArray38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '4');
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureAccessLog(deploymentInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = initializer5.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = initializer5.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = initializer5.getinitializers();
        io.undertow.servlet.api.DeploymentManager deploymentManager9 = undertowEmbeddedServletContainerFactory3.createDeploymentManager(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        initializer10.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(deploymentManager9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        int int6 = undertowEmbeddedServletContainerFactory5.getPort();
        undertowEmbeddedServletContainerFactory5.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory10.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        boolean boolean14 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet15 = undertowEmbeddedServletContainerFactory10.getJspServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter16 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter16.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter16.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter16.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter16.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory22.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int25 = undertowEmbeddedServletContainerFactory22.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl26 = undertowEmbeddedServletContainerFactory22.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage29 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage29 };
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory28.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray36 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        undertowEmbeddedServletContainerFactory28.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory22.setSsl(ssl40);
        java.net.InetAddress inetAddress42 = undertowEmbeddedServletContainerFactory22.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage45 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray46 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage45 };
        undertowEmbeddedServletContainerFactory44.addErrorPages(errorPageArray46);
        undertowEmbeddedServletContainerFactory44.buffersPerRegion = (-1);
        boolean boolean50 = undertowEmbeddedServletContainerFactory44.isAccessLogEnabled();
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory44.ioThreads;
        boolean boolean52 = undertowEmbeddedServletContainerFactory44.isPersistSession();
        undertowEmbeddedServletContainerFactory44.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory56.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory56.workerThreads = 0;
        boolean boolean61 = undertowEmbeddedServletContainerFactory56.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter62 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = serializedObjectSupporter62.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory68.useForwardHeaders = false;
        java.io.File file71 = undertowEmbeddedServletContainerFactory68.getDocumentRoot();
        undertowEmbeddedServletContainerFactory56.accessLogDirectory = file71;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file71);
        undertowEmbeddedServletContainerFactory44.setDocumentRoot(file71);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file71);
        undertowEmbeddedServletContainerFactory22.setAccessLogDirectory(file71);
        undertowEmbeddedServletContainerFactory20.setAccessLogDirectory(file71);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file71);
        undertowEmbeddedServletContainerFactory10.setSessionStoreDir(file71);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter80 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory81 = serializedObjectSupporter80.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory82 = serializedObjectSupporter80.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = serializedObjectSupporter80.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.JspServlet jspServlet84 = undertowEmbeddedServletContainerFactory83.getJspServlet();
        undertowEmbeddedServletContainerFactory10.setJspServlet(jspServlet84);
        undertowEmbeddedServletContainerFactory5.setJspServlet(jspServlet84);
        org.springframework.core.io.ResourceLoader resourceLoader87 = null;
        undertowEmbeddedServletContainerFactory5.setResourceLoader(resourceLoader87);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertNotNull(errorPageSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jspServlet15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(ssl26);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray36);
        org.junit.Assert.assertNull(inetAddress42);
        org.junit.Assert.assertNotNull(errorPageArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory63);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory64);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory65);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory66);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory67);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory68);
        org.junit.Assert.assertNotNull(file71);
        org.junit.Assert.assertEquals(file71.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file71.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory81);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory82);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory83);
        org.junit.Assert.assertNotNull(jspServlet84);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        boolean boolean4 = undertowEmbeddedServletContainerFactory3.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory6.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager10 = undertowEmbeddedServletContainerFactory6.createDeploymentManager(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = initializer13.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = initializer13.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = initializer13.getinitializers();
        io.undertow.servlet.api.DeploymentManager deploymentManager17 = undertowEmbeddedServletContainerFactory3.createDeploymentManager(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNull(inetAddress8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNotNull(deploymentManager10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(deploymentManager17);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.lang.Integer int5 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory8.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker11 = undertowEmbeddedServletContainerFactory8.createWorker();
        undertowEmbeddedServletContainerFactory8.bufferSize = 100;
        java.util.Set<java.lang.Class<?>> wildcardClassSet14 = undertowEmbeddedServletContainerFactory8.getNO_CLASSES();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo15 = null;
        undertowEmbeddedServletContainerFactory8.configureErrorPages(deploymentInfo15);
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory8.createBuilder(1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage21 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray22 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage21 };
        undertowEmbeddedServletContainerFactory20.addErrorPages(errorPageArray22);
        undertowEmbeddedServletContainerFactory20.buffersPerRegion = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory28.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList30 = undertowEmbeddedServletContainerFactory28.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory20.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList30;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory33.getErrorPages();
        java.net.InetAddress inetAddress35 = undertowEmbeddedServletContainerFactory33.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager37 = undertowEmbeddedServletContainerFactory33.createDeploymentManager(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray36);
        io.undertow.servlet.api.DeploymentManager deploymentManager40 = undertowEmbeddedServletContainerFactory8.createDeploymentManager(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(xnioWorker11);
        org.junit.Assert.assertNotNull(wildcardClassSet14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(errorPageArray22);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNotNull(errorPageSet29);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList30);
        org.junit.Assert.assertNotNull(errorPageSet34);
        org.junit.Assert.assertNull(inetAddress35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertNotNull(deploymentManager37);
        org.junit.Assert.assertNotNull(deploymentManager40);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        undertowEmbeddedServletContainerFactory14.workerThreads = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(jspServlet8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        jarResourceManager1.close();
        java.lang.String str4 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = jarResourceManager1.serializedObjectSupporter;
        java.lang.String str7 = jarResourceManager1.jarPath;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer9.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer9.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("0.0.0.0", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("0.0.0.0");
        jarResourceManager1.close();
        io.undertow.server.handlers.resource.Resource resource4 = jarResourceManager1.getResource("/tmp/junit15641907838534958188");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = jarResourceManager1.serializedObjectSupporter;
        java.lang.String str7 = jarResourceManager1.jarPath;
        org.junit.Assert.assertNull(resource4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0.0.0" + "'", str7, "0.0.0.0");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.accessLogEnabled;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        undertowEmbeddedServletContainerFactory6.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory6.setIoThreads((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection13 = undertowEmbeddedServletContainerFactory6.getBuilderCustomizers();
        io.undertow.server.handlers.resource.ResourceManager resourceManager14 = undertowEmbeddedServletContainerFactory6.getDocumentRootResourceManager();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection13);
        org.junit.Assert.assertNotNull(resourceManager14);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = null;
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter4;
        boolean boolean6 = jarResourceManager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = jarResourceManager1.serializedObjectSupporter;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList12 = serializedObjectSupporter9.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = jarResourceManager1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(serializedObjectSupporter18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        java.util.ArrayList arrayList13 = serializedObjectSupporter6.deserializeObjectList1();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        undertowEmbeddedServletContainerFactory15.useForwardHeaders = false;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter15;
        jarResourceManager14.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter22 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer1.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        jarResourceManager1.close();
        java.lang.String str4 = jarResourceManager1.getjarPath();
        java.lang.String str5 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter7;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        java.util.ArrayList arrayList21 = serializedObjectSupporter18.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter18;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter2 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter2;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory15.getJspServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo25 = null;
        undertowEmbeddedServletContainerFactory24.configureErrorPages(deploymentInfo25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage29 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage29 };
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory28.buffersPerRegion = (-1);
        boolean boolean34 = undertowEmbeddedServletContainerFactory28.isAccessLogEnabled();
        org.xnio.XnioWorker xnioWorker35 = undertowEmbeddedServletContainerFactory28.createWorker();
        org.springframework.boot.context.embedded.Compression compression36 = null;
        undertowEmbeddedServletContainerFactory28.setCompression(compression36);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings38 = undertowEmbeddedServletContainerFactory28.getMimeMappings();
        boolean boolean39 = undertowEmbeddedServletContainerFactory28.isPersistSession();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer45 = undertowEmbeddedServletContainerFactory24.getEmbeddedServletContainer(servletContextInitializerArray40);
        io.undertow.servlet.api.DeploymentManager deploymentManager46 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray40);
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(jspServlet16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(xnioWorker35);
        org.junit.Assert.assertNotNull(mimeMappings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        org.junit.Assert.assertNotNull(embeddedServletContainer45);
        org.junit.Assert.assertNotNull(deploymentManager46);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 100);
        undertowEmbeddedServletContainerFactory2.accessLogPattern = "0.0.0.0";
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory12.getCompression();
        undertowEmbeddedServletContainerFactory2.setCompression(compression13);
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory2.resourceLoader = resourceLoader15;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(compression13);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "";
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        undertowEmbeddedServletContainerFactory18.setPort((int) '4');
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = undertowEmbeddedServletContainerFactory18.getNO_CLASSES();
        org.springframework.boot.context.embedded.Compression compression22 = undertowEmbeddedServletContainerFactory18.getCompression();
        undertowEmbeddedServletContainerFactory1.setCompression(compression22);
        undertowEmbeddedServletContainerFactory1.setContextPath("/say");
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(jspServlet8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(wildcardClassSet21);
        org.junit.Assert.assertNotNull(compression22);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory3.configureMimeMappings(deploymentInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        java.io.File file16 = undertowEmbeddedServletContainerFactory15.accessLogDirectory;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.createAccessLogDirectoryIfNecessary();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        undertowEmbeddedServletContainerFactory8.bufferSize = (-1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.core.io.ResourceLoader resourceLoader8 = undertowEmbeddedServletContainerFactory7.resourceLoader;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(resourceLoader8);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.core.io.ResourceLoader resourceLoader9 = undertowEmbeddedServletContainerFactory8.resourceLoader;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(resourceLoader9);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.createAccessLogDirectoryIfNecessary();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory14.getSsl();
        undertowEmbeddedServletContainerFactory14.accessLogEnabled = false;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(ssl15);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        java.util.Set<java.lang.Class<?>> wildcardClassSet8 = undertowEmbeddedServletContainerFactory7.getNO_CLASSES();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(wildcardClassSet8);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.workerThreads = (-1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet15);
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList21 = serializedObjectSupporter18.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.core.io.ResourceLoader resourceLoader26 = null;
        undertowEmbeddedServletContainerFactory25.setResourceLoader(resourceLoader26);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter28 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory33.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        undertowEmbeddedServletContainerFactory33.workerThreads = 0;
        boolean boolean38 = undertowEmbeddedServletContainerFactory33.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter39 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = serializedObjectSupporter39.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory45.useForwardHeaders = false;
        java.io.File file48 = undertowEmbeddedServletContainerFactory45.getDocumentRoot();
        undertowEmbeddedServletContainerFactory33.accessLogDirectory = file48;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file48);
        undertowEmbeddedServletContainerFactory31.accessLogDirectory = file48;
        undertowEmbeddedServletContainerFactory25.setDocumentRoot(file48);
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file48);
        java.io.File file54 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file54;
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory45);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file48.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        java.util.ArrayList arrayList12 = serializedObjectSupporter8.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory15.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory15.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage27 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage27 };
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray28);
        undertowEmbeddedServletContainerFactory26.buffersPerRegion = (-1);
        boolean boolean32 = undertowEmbeddedServletContainerFactory26.isAccessLogEnabled();
        java.lang.Integer int33 = undertowEmbeddedServletContainerFactory26.ioThreads;
        boolean boolean34 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        undertowEmbeddedServletContainerFactory26.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        undertowEmbeddedServletContainerFactory38.workerThreads = 0;
        boolean boolean43 = undertowEmbeddedServletContainerFactory38.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter44 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory50.useForwardHeaders = false;
        java.io.File file53 = undertowEmbeddedServletContainerFactory50.getDocumentRoot();
        undertowEmbeddedServletContainerFactory38.accessLogDirectory = file53;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file53);
        undertowEmbeddedServletContainerFactory26.setDocumentRoot(file53);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file53);
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file53);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray59 = undertowEmbeddedServletContainerFactory1.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(errorPageArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory45);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory46);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory47);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory49);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory50);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file53.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        java.util.ArrayList arrayList14 = serializedObjectSupporter10.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory17.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList19 = undertowEmbeddedServletContainerFactory17.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = initializer27.getinitializers();
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(errorPageSet18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory7.resourceLoader = resourceLoader8;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        java.util.Set<java.lang.Class<?>> wildcardClassSet11 = undertowEmbeddedServletContainerFactory10.getNO_CLASSES();
        boolean boolean12 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(wildcardClassSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        undertowEmbeddedServletContainerFactory5.accessLogEnabled = false;
        org.springframework.core.io.ResourceLoader resourceLoader8 = undertowEmbeddedServletContainerFactory5.resourceLoader;
        java.io.File file9 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(resourceLoader8);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray17);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = initializer18.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter20 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer18.serializedObjectSupporter = serializedObjectSupporter20;
        java.util.ArrayList arrayList23 = serializedObjectSupporter20.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter20.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        undertowEmbeddedServletContainerFactory16.serializedObjectSupporter = serializedObjectSupporter20;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory7.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory5.addInitializers(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList21 = serializedObjectSupporter18.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer17.serializedObjectSupporter = serializedObjectSupporter18;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter25 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter25.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter25.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        initializer17.serializedObjectSupporter = serializedObjectSupporter25;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter25.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        int int30 = undertowEmbeddedServletContainerFactory29.getSessionTimeout();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1800 + "'", int30 == 1800);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = initializer3.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer3.serializedObjectSupporter = serializedObjectSupporter5;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer3.serializedObjectSupporter = serializedObjectSupporter8;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory16.getSsl();
        undertowEmbeddedServletContainerFactory1.setSsl(ssl17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(ssl17);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager9.serializedObjectSupporter = serializedObjectSupporter10;
        jarResourceManager9.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager9.serializedObjectSupporter = serializedObjectSupporter17;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = undertowEmbeddedServletContainerFactory23.getJspServlet();
        undertowEmbeddedServletContainerFactory7.setJspServlet(jspServlet24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage28 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage28 };
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray29);
        undertowEmbeddedServletContainerFactory27.buffersPerRegion = (-1);
        boolean boolean33 = undertowEmbeddedServletContainerFactory27.isAccessLogEnabled();
        java.lang.Integer int34 = undertowEmbeddedServletContainerFactory27.bufferSize;
        java.io.File file35 = undertowEmbeddedServletContainerFactory27.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory37.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.String str40 = undertowEmbeddedServletContainerFactory37.accessLogPattern;
        java.net.InetAddress inetAddress41 = null;
        undertowEmbeddedServletContainerFactory37.setAddress(inetAddress41);
        undertowEmbeddedServletContainerFactory37.accessLogEnabled = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray47 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory46.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray47);
        undertowEmbeddedServletContainerFactory46.workerThreads = 0;
        boolean boolean51 = undertowEmbeddedServletContainerFactory46.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter52 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory58.useForwardHeaders = false;
        java.io.File file61 = undertowEmbeddedServletContainerFactory58.getDocumentRoot();
        undertowEmbeddedServletContainerFactory46.accessLogDirectory = file61;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file61);
        undertowEmbeddedServletContainerFactory37.setSessionStoreDir(file61);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file61);
        undertowEmbeddedServletContainerFactory27.setAccessLogDirectory(file61);
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file61);
        java.lang.Integer int68 = undertowEmbeddedServletContainerFactory7.workerThreads;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(jspServlet24);
        org.junit.Assert.assertNotNull(errorPageArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory53);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory54);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory55);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory56);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory57);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory58);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file61.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNull(int68);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory8.setSessionStoreDir(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory8.setSessionStoreDir(file11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        java.net.InetAddress inetAddress16 = undertowEmbeddedServletContainerFactory14.getAddress();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file17);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory14.accessLogDirectory = file19;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer24 = undertowEmbeddedServletContainerFactory8.getEmbeddedServletContainer(servletContextInitializerArray21);
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray21);
        undertowEmbeddedServletContainerFactory6.setAccessLogPattern("/say");
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNull(inetAddress16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(embeddedServletContainer24);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList3 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        io.undertow.server.handlers.resource.ResourceManager resourceManager8 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.lang.ClassLoader classLoader10 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage13 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage13 };
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray14);
        undertowEmbeddedServletContainerFactory12.buffersPerRegion = (-1);
        boolean boolean18 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter19 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory25.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int28 = undertowEmbeddedServletContainerFactory25.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl29 = undertowEmbeddedServletContainerFactory25.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage32 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage32 };
        undertowEmbeddedServletContainerFactory31.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory31.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        undertowEmbeddedServletContainerFactory31.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        org.springframework.boot.context.embedded.Ssl ssl43 = null;
        undertowEmbeddedServletContainerFactory25.setSsl(ssl43);
        java.net.InetAddress inetAddress45 = undertowEmbeddedServletContainerFactory25.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage48 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage48 };
        undertowEmbeddedServletContainerFactory47.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory47.buffersPerRegion = (-1);
        boolean boolean53 = undertowEmbeddedServletContainerFactory47.isAccessLogEnabled();
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory47.ioThreads;
        boolean boolean55 = undertowEmbeddedServletContainerFactory47.isPersistSession();
        undertowEmbeddedServletContainerFactory47.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray60 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory59.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        undertowEmbeddedServletContainerFactory59.workerThreads = 0;
        boolean boolean64 = undertowEmbeddedServletContainerFactory59.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter65 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = serializedObjectSupporter65.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory71.useForwardHeaders = false;
        java.io.File file74 = undertowEmbeddedServletContainerFactory71.getDocumentRoot();
        undertowEmbeddedServletContainerFactory59.accessLogDirectory = file74;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file74);
        undertowEmbeddedServletContainerFactory47.setDocumentRoot(file74);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file74);
        undertowEmbeddedServletContainerFactory25.setAccessLogDirectory(file74);
        undertowEmbeddedServletContainerFactory23.setAccessLogDirectory(file74);
        undertowEmbeddedServletContainerFactory12.setSessionStoreDir(file74);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager82 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file74);
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file74;
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList3);
        org.junit.Assert.assertNotNull(resourceManager8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(ssl29);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertNull(inetAddress45);
        org.junit.Assert.assertNotNull(errorPageArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory66);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory67);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory68);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory69);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory70);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory71);
        org.junit.Assert.assertNotNull(file74);
        org.junit.Assert.assertEquals(file74.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file74.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory7.workerThreads = 1800;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        undertowEmbeddedServletContainerFactory8.setAccessLogEnabled(true);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        undertowEmbeddedServletContainerFactory16.setPort((int) '4');
        java.util.Set<java.lang.Class<?>> wildcardClassSet19 = undertowEmbeddedServletContainerFactory16.getNO_CLASSES();
        org.springframework.boot.context.embedded.Compression compression20 = undertowEmbeddedServletContainerFactory16.getCompression();
        undertowEmbeddedServletContainerFactory8.setCompression(compression20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(wildcardClassSet19);
        org.junit.Assert.assertNotNull(compression20);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = null;
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter9;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.lang.Boolean boolean14 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.accessLogEnabled;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        undertowEmbeddedServletContainerFactory6.setRegisterJspServlet(true);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory6.resourceLoader = resourceLoader11;
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray13 = undertowEmbeddedServletContainerFactory6.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageSet8);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet9 = undertowEmbeddedServletContainerFactory8.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList10;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 0);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(errorPageSet9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer1 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer3 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer5 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer7 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap6);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer1, initParameterConfiguringServletContextInitializer3, initParameterConfiguringServletContextInitializer5, initParameterConfiguringServletContextInitializer7 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList13 = serializedObjectSupporter10.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer9.serializedObjectSupporter = serializedObjectSupporter10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory17.deploymentInfoCustomizers;
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo5 = null;
        undertowEmbeddedServletContainerFactory4.configureErrorPages(deploymentInfo5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = undertowEmbeddedServletContainerFactory4.resourceLoader;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(resourceLoader7);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        jarResourceManager1.close();
        java.lang.String str4 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = jarResourceManager1.serializedObjectSupporter;
        java.lang.String str7 = jarResourceManager1.jarPath;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer9.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer9.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList30 = serializedObjectSupporter27.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter34 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList37 = serializedObjectSupporter34.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage43 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray44 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage43 };
        undertowEmbeddedServletContainerFactory42.addErrorPages(errorPageArray44);
        undertowEmbeddedServletContainerFactory42.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection48 = undertowEmbeddedServletContainerFactory42.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory42.workerThreads = (-1);
        undertowEmbeddedServletContainerFactory42.setRegisterDefaultServlet(true);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory42.setDocumentRoot(file53);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray55);
        io.undertow.servlet.api.DeploymentManager deploymentManager58 = undertowEmbeddedServletContainerFactory40.createDeploymentManager(servletContextInitializerArray55);
        io.undertow.servlet.api.DeploymentManager deploymentManager59 = undertowEmbeddedServletContainerFactory33.createDeploymentManager(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray55);
        java.net.InetAddress inetAddress61 = null;
        undertowEmbeddedServletContainerFactory26.setAddress(inetAddress61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(errorPageArray44);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(deploymentManager58);
        org.junit.Assert.assertNotNull(deploymentManager59);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory10.useForwardHeaders = false;
        java.io.File file13 = undertowEmbeddedServletContainerFactory10.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file13);
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file13;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file13);
        java.lang.String str17 = jarResourceManager16.getjarPath();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file13.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/tmp/junit15641907838534958188" + "'", str17, "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        undertowEmbeddedServletContainerFactory3.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 0);
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory3.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList12 = serializedObjectSupporter9.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        undertowEmbeddedServletContainerFactory3.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        java.util.ArrayList arrayList21 = serializedObjectSupporter9.deserializeObjectList1();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(arrayList21);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        undertowEmbeddedServletContainerFactory5.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory5.setUseForwardHeaders(false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        undertowEmbeddedServletContainerFactory10.setWorkerThreads((java.lang.Integer) 1800);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager5 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray4);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList13 = serializedObjectSupporter10.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory16.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory16.useForwardHeaders = false;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection21 = undertowEmbeddedServletContainerFactory16.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        io.undertow.servlet.api.DeploymentManager deploymentManager24 = undertowEmbeddedServletContainerFactory16.createDeploymentManager(servletContextInitializerArray22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        io.undertow.servlet.api.DeploymentManager deploymentManager26 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray22);
        io.undertow.servlet.api.DeploymentManager deploymentManager27 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(deploymentManager5);
        org.junit.Assert.assertNotNull(errorPageSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(deploymentManager24);
        org.junit.Assert.assertNotNull(deploymentManager26);
        org.junit.Assert.assertNotNull(deploymentManager27);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        java.util.Set<java.lang.Class<?>> wildcardClassSet8 = undertowEmbeddedServletContainerFactory7.getNO_CLASSES();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(wildcardClassSet8);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        java.lang.ClassLoader classLoader8 = undertowEmbeddedServletContainerFactory7.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(classLoader8);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray8 = undertowEmbeddedServletContainerFactory7.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = initializer1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        initializer1.serializedObjectSupporter = serializedObjectSupporter4;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory11.getListenAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        io.undertow.Undertow.Builder builder16 = undertowEmbeddedServletContainerFactory14.createBuilder((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory14.setResourceLoader(resourceLoader17);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter19 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList30 = serializedObjectSupporter27.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        java.io.File file36 = undertowEmbeddedServletContainerFactory35.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl37 = undertowEmbeddedServletContainerFactory35.getSsl();
        org.xnio.SslClientAuthMode sslClientAuthMode38 = undertowEmbeddedServletContainerFactory26.getSslClientAuthMode(ssl37);
        org.xnio.SslClientAuthMode sslClientAuthMode39 = undertowEmbeddedServletContainerFactory14.getSslClientAuthMode(ssl37);
        undertowEmbeddedServletContainerFactory11.setSsl(ssl37);
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0.0.0" + "'", str12, "0.0.0.0");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file36.toString(), "/tmp/junit7806213710858929942");
        org.junit.Assert.assertNotNull(ssl37);
        org.junit.Assert.assertTrue("'" + sslClientAuthMode38 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode38.equals(org.xnio.SslClientAuthMode.REQUESTED));
        org.junit.Assert.assertTrue("'" + sslClientAuthMode39 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode39.equals(org.xnio.SslClientAuthMode.REQUESTED));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "";
        io.undertow.server.handlers.resource.ResourceManager resourceManager7 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.Compression compression8 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(resourceManager7);
        org.junit.Assert.assertNull(compression8);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = initializer10.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer10.serializedObjectSupporter = serializedObjectSupporter12;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer10.serializedObjectSupporter = serializedObjectSupporter15;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter24 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager23.serializedObjectSupporter = serializedObjectSupporter24;
        jarResourceManager23.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter31 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager23.serializedObjectSupporter = serializedObjectSupporter31;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer10.serializedObjectSupporter = serializedObjectSupporter31;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter40 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        initializer10.serializedObjectSupporter = serializedObjectSupporter40;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter44 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList47 = serializedObjectSupporter44.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        initializer10.serializedObjectSupporter = serializedObjectSupporter44;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = serializedObjectSupporter44.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter57 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = serializedObjectSupporter57.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory63.useForwardHeaders = false;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings66 = undertowEmbeddedServletContainerFactory63.getMimeMappings();
        java.io.File file67 = undertowEmbeddedServletContainerFactory63.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file67);
        undertowEmbeddedServletContainerFactory56.setAccessLogDirectory(file67);
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file67;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file67);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory45);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory46);
        org.junit.Assert.assertNotNull(arrayList47);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory49);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory50);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory51);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory52);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory53);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory55);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory56);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory58);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory59);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory62);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory63);
        org.junit.Assert.assertNotNull(mimeMappings66);
        org.junit.Assert.assertNotNull(file67);
        org.junit.Assert.assertEquals(file67.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file67.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        undertowEmbeddedServletContainerFactory6.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory6.ioThreads = 10;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo11 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory6.registerServletContainerInitializerToDriveServletContextInitializers(deploymentInfo11, servletContextInitializerArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray3 = initializer1.getinitializers();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = initializer1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray5 = initializer1.getinitializers();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = initializer1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory4.configureAccessLog(deploymentInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager5 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray4);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray8 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(deploymentManager5);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.Ssl ssl3 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory2.deploymentInfoCustomizers;
        org.springframework.core.io.ResourceLoader resourceLoader6 = undertowEmbeddedServletContainerFactory2.resourceLoader;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
        org.junit.Assert.assertNull(resourceLoader6);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        undertowEmbeddedServletContainerFactory7.setWorkerThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory7.createAccessLogDirectoryIfNecessary();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager5 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = initializer6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(deploymentManager5);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        org.junit.Assert.assertNotNull(xnioWorker4);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        undertowEmbeddedServletContainerFactory3.setBufferSize((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray8 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray8);
        undertowEmbeddedServletContainerFactory7.workerThreads = 0;
        io.undertow.Undertow.Builder builder13 = undertowEmbeddedServletContainerFactory7.createBuilder((-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory15.getErrorPages();
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory15.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory3.getUndertowEmbeddedServletContainer(builder13, deploymentManager19, (int) (byte) 0);
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory3.ioThreads;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNull(inetAddress17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(deploymentManager19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        java.lang.String str10 = undertowEmbeddedServletContainerFactory8.getDisplayName();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.workerThreads = (-1);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = undertowEmbeddedServletContainerFactory12.getErrorPages();
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory12.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory12.getErrorPages();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings16);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(errorPageSet13);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNotNull(mimeMappings16);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        undertowEmbeddedServletContainerFactory4.setPersistSession(true);
        undertowEmbeddedServletContainerFactory4.setPort((int) (byte) 0);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader5;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory11.bufferSize;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory11.ioThreads = 1;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory11.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory11.accessLogEnabled = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory22.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker25 = undertowEmbeddedServletContainerFactory22.createWorker();
        undertowEmbeddedServletContainerFactory22.bufferSize = 100;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings28 = undertowEmbeddedServletContainerFactory22.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory30.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int33 = undertowEmbeddedServletContainerFactory30.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory30.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage37 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray38 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage37 };
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray38);
        undertowEmbeddedServletContainerFactory36.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory36.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage50 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray51 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage50 };
        undertowEmbeddedServletContainerFactory49.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory30.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray51);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet55 = undertowEmbeddedServletContainerFactory22.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet55);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet55);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertNotNull(xnioWorker25);
        org.junit.Assert.assertNotNull(mimeMappings28);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(ssl34);
        org.junit.Assert.assertNotNull(errorPageArray38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNotNull(errorPageArray51);
        org.junit.Assert.assertNotNull(errorPageSet55);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray3 = initializer1.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray3);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray5 = initializer4.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray5);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory5.getListenAddress();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        undertowEmbeddedServletContainerFactory5.accessLogPattern = "";
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        java.util.Set<java.lang.Class<?>> wildcardClassSet7 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray6);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = initializer7.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer7.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer7.serializedObjectSupporter = serializedObjectSupporter12;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory20.getSsl();
        undertowEmbeddedServletContainerFactory5.setSsl(ssl21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(ssl21);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        java.lang.String str3 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourceManager1.serializedObjectSupporter;
        boolean boolean6 = jarResourceManager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter7;
        boolean boolean17 = jarResourceManager1.isResourceChangeListenerSupported();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.lang.ClassLoader classLoader8 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList9 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory17.getSsl();
        undertowEmbeddedServletContainerFactory1.setSsl(ssl18);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(ssl18);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray11);
        undertowEmbeddedServletContainerFactory9.buffersPerRegion = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory17.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList19 = undertowEmbeddedServletContainerFactory17.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory9.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList19;
        undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList19;
        undertowEmbeddedServletContainerFactory7.setAccessLogEnabled(false);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNotNull(errorPageSet18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList19);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager5 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = initializer6.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = initializer6.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = initializer6.getinitializers();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(deploymentManager5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        undertowEmbeddedServletContainerFactory4.setContextPath("/tmp/junit15641907838534958188");
        boolean boolean7 = undertowEmbeddedServletContainerFactory4.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory8.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory8.useForwardHeaders = false;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory8.getDeploymentInfoCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        io.undertow.server.handlers.resource.ResourceManager resourceManager15 = undertowEmbeddedServletContainerFactory8.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.Ssl ssl16 = undertowEmbeddedServletContainerFactory8.getSsl();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory24.getSsl();
        org.xnio.SslClientAuthMode sslClientAuthMode26 = undertowEmbeddedServletContainerFactory8.getSslClientAuthMode(ssl25);
        org.xnio.SslClientAuthMode sslClientAuthMode27 = undertowEmbeddedServletContainerFactory4.getSslClientAuthMode(ssl25);
        undertowEmbeddedServletContainerFactory4.setPort(100);
        io.undertow.server.handlers.resource.ResourceManager resourceManager30 = undertowEmbeddedServletContainerFactory4.getDocumentRootResourceManager();
        java.lang.Integer int31 = undertowEmbeddedServletContainerFactory4.workerThreads;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        org.junit.Assert.assertNotNull(resourceManager15);
        org.junit.Assert.assertNull(ssl16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(ssl25);
        org.junit.Assert.assertTrue("'" + sslClientAuthMode26 + "' != '" + org.xnio.SslClientAuthMode.NOT_REQUESTED + "'", sslClientAuthMode26.equals(org.xnio.SslClientAuthMode.NOT_REQUESTED));
        org.junit.Assert.assertTrue("'" + sslClientAuthMode27 + "' != '" + org.xnio.SslClientAuthMode.NOT_REQUESTED + "'", sslClientAuthMode27.equals(org.xnio.SslClientAuthMode.NOT_REQUESTED));
        org.junit.Assert.assertNotNull(resourceManager30);
        org.junit.Assert.assertNull(int31);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.useForwardHeaders;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = true;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet9 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(errorPageSet9);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = initializer1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        initializer1.serializedObjectSupporter = serializedObjectSupporter4;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        jarResourceManager1.close();
        java.lang.String str4 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = jarResourceManager1.serializedObjectSupporter;
        java.lang.String str7 = jarResourceManager1.jarPath;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer9.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer9.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray26);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = initializer27.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter29 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter29.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer27.serializedObjectSupporter = serializedObjectSupporter29;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter32 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer27.serializedObjectSupporter = serializedObjectSupporter32;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter32.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        undertowEmbeddedServletContainerFactory40.setIoThreads((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage45 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray46 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage45 };
        undertowEmbeddedServletContainerFactory44.addErrorPages(errorPageArray46);
        undertowEmbeddedServletContainerFactory44.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection50 = undertowEmbeddedServletContainerFactory44.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory44.workerThreads = (-1);
        java.io.File file53 = undertowEmbeddedServletContainerFactory44.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory44.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage58 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray59 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage58 };
        undertowEmbeddedServletContainerFactory57.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory57.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection63 = undertowEmbeddedServletContainerFactory57.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory57.workerThreads = (-1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory57.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray69 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray69);
        java.io.File file71 = undertowEmbeddedServletContainerFactory68.accessLogDirectory;
        undertowEmbeddedServletContainerFactory68.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray74 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory68.addBuilderCustomizers(undertowBuilderCustomizerArray74);
        undertowEmbeddedServletContainerFactory57.addBuilderCustomizers(undertowBuilderCustomizerArray74);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter77 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = serializedObjectSupporter77.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = serializedObjectSupporter77.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory80 = serializedObjectSupporter77.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory81 = serializedObjectSupporter77.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter82 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory84 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList85 = serializedObjectSupporter82.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory86 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory87 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory88 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory89 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory90 = serializedObjectSupporter82.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        java.io.File file91 = undertowEmbeddedServletContainerFactory90.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl92 = undertowEmbeddedServletContainerFactory90.getSsl();
        org.xnio.SslClientAuthMode sslClientAuthMode93 = undertowEmbeddedServletContainerFactory81.getSslClientAuthMode(ssl92);
        undertowEmbeddedServletContainerFactory57.setSsl(ssl92);
        org.xnio.SslClientAuthMode sslClientAuthMode95 = undertowEmbeddedServletContainerFactory44.getSslClientAuthMode(ssl92);
        undertowEmbeddedServletContainerFactory40.setSsl(ssl92);
        undertowEmbeddedServletContainerFactory25.setSsl(ssl92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(errorPageArray46);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection50);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNotNull(errorPageArray59);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection63);
        org.junit.Assert.assertNotNull(errorPageSet66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray69);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray74);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory78);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory79);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory80);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory81);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory83);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory84);
        org.junit.Assert.assertNotNull(arrayList85);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory86);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory87);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory88);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory89);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory90);
        org.junit.Assert.assertNotNull(file91);
        org.junit.Assert.assertEquals(file91.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file91.toString(), "/tmp/junit7806213710858929942");
        org.junit.Assert.assertNotNull(ssl92);
        org.junit.Assert.assertTrue("'" + sslClientAuthMode93 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode93.equals(org.xnio.SslClientAuthMode.REQUESTED));
        org.junit.Assert.assertTrue("'" + sslClientAuthMode95 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode95.equals(org.xnio.SslClientAuthMode.REQUESTED));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        undertowEmbeddedServletContainerFactory4.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory4.setRegisterJspServlet(false);
        java.io.File file9 = undertowEmbeddedServletContainerFactory4.getSessionStoreDir();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        java.lang.Boolean boolean8 = undertowEmbeddedServletContainerFactory7.directBuffers;
        undertowEmbeddedServletContainerFactory7.setWorkerThreads((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage8 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage8 };
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray9);
        undertowEmbeddedServletContainerFactory7.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray15);
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray15);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray15);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.lang.Integer int20 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.core.io.ResourceLoader resourceLoader23 = undertowEmbeddedServletContainerFactory22.resourceLoader;
        boolean boolean24 = undertowEmbeddedServletContainerFactory22.accessLogEnabled;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray25);
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray25);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer29 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray25);
        io.undertow.server.handlers.resource.ResourceManager resourceManager30 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(ssl5);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray15);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(resourceLoader23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(embeddedServletContainer29);
        org.junit.Assert.assertNotNull(resourceManager30);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = initializer12.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer12.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer12.serializedObjectSupporter = serializedObjectSupporter17;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter26 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter26.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter26.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter26.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter26.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager25.serializedObjectSupporter = serializedObjectSupporter26;
        jarResourceManager25.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter33 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager25.serializedObjectSupporter = serializedObjectSupporter33;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer12.serializedObjectSupporter = serializedObjectSupporter33;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter42 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter42.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter42.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        initializer12.serializedObjectSupporter = serializedObjectSupporter42;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter46 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList49 = serializedObjectSupporter46.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = serializedObjectSupporter46.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        initializer12.serializedObjectSupporter = serializedObjectSupporter46;
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter46;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter58 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = serializedObjectSupporter58.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter58.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter58.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = serializedObjectSupporter58.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        java.lang.String str63 = undertowEmbeddedServletContainerFactory62.getDisplayName();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter64 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = serializedObjectSupporter64.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = serializedObjectSupporter64.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = serializedObjectSupporter64.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = serializedObjectSupporter64.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = serializedObjectSupporter64.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory73.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int76 = undertowEmbeddedServletContainerFactory73.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl77 = undertowEmbeddedServletContainerFactory73.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage80 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray81 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage80 };
        undertowEmbeddedServletContainerFactory79.addErrorPages(errorPageArray81);
        undertowEmbeddedServletContainerFactory79.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory86 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray87 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory86.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray87);
        undertowEmbeddedServletContainerFactory79.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray87);
        undertowEmbeddedServletContainerFactory73.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray87);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer91 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray92 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer91 };
        undertowEmbeddedServletContainerFactory73.addBuilderCustomizers(undertowBuilderCustomizerArray92);
        undertowEmbeddedServletContainerFactory71.addBuilderCustomizers(undertowBuilderCustomizerArray92);
        undertowEmbeddedServletContainerFactory69.addBuilderCustomizers(undertowBuilderCustomizerArray92);
        undertowEmbeddedServletContainerFactory62.addBuilderCustomizers(undertowBuilderCustomizerArray92);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray92);
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory47);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory48);
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory50);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory51);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory52);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory53);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory54);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory55);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory59);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory65);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory66);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory67);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory68);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory69);
        org.junit.Assert.assertNull(int76);
        org.junit.Assert.assertNull(ssl77);
        org.junit.Assert.assertNotNull(errorPageArray81);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray87);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray92);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        java.lang.Boolean boolean9 = undertowEmbeddedServletContainerFactory8.directBuffers;
        undertowEmbeddedServletContainerFactory8.setDisplayName("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList15 = undertowEmbeddedServletContainerFactory13.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory13.setContextPath("");
        undertowEmbeddedServletContainerFactory13.useForwardHeaders = false;
        org.springframework.core.io.ResourceLoader resourceLoader20 = null;
        undertowEmbeddedServletContainerFactory13.setResourceLoader(resourceLoader20);
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory13.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter23 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter23.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.Compression compression31 = undertowEmbeddedServletContainerFactory30.getCompression();
        undertowEmbeddedServletContainerFactory13.setCompression(compression31);
        undertowEmbeddedServletContainerFactory8.setCompression(compression31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(errorPageSet14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList15);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(compression31);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        undertowEmbeddedServletContainerFactory4.setUseForwardHeaders(true);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory4.getDisplayName();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        java.io.File file20 = undertowEmbeddedServletContainerFactory19.getDocumentRoot();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = initializer22.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = initializer22.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = initializer22.getinitializers();
        undertowEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray25);
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        undertowEmbeddedServletContainerFactory3.ioThreads = 1800;
        java.io.File file6 = undertowEmbeddedServletContainerFactory3.getSessionStoreDir();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        int int9 = undertowEmbeddedServletContainerFactory8.getSessionTimeout();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.workerThreads;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo5 = null;
        undertowEmbeddedServletContainerFactory4.configureErrorPages(deploymentInfo5);
        undertowEmbeddedServletContainerFactory4.setBuffersPerRegion((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory6.useForwardHeaders = false;
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory6.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory16.setSessionStoreDir(file17);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory16.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory21.workerThreads = 0;
        boolean boolean26 = undertowEmbeddedServletContainerFactory21.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory33.useForwardHeaders = false;
        java.io.File file36 = undertowEmbeddedServletContainerFactory33.getDocumentRoot();
        undertowEmbeddedServletContainerFactory21.accessLogDirectory = file36;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file36);
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file36);
        undertowEmbeddedServletContainerFactory14.accessLogDirectory = file36;
        undertowEmbeddedServletContainerFactory6.setSessionStoreDir(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory44.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int47 = undertowEmbeddedServletContainerFactory44.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl48 = undertowEmbeddedServletContainerFactory44.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage51 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray52 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage51 };
        undertowEmbeddedServletContainerFactory50.addErrorPages(errorPageArray52);
        undertowEmbeddedServletContainerFactory50.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray58 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory57.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        undertowEmbeddedServletContainerFactory44.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer62 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer62 };
        undertowEmbeddedServletContainerFactory44.addBuilderCustomizers(undertowBuilderCustomizerArray63);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory66.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int69 = undertowEmbeddedServletContainerFactory66.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl70 = undertowEmbeddedServletContainerFactory66.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage73 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray74 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage73 };
        undertowEmbeddedServletContainerFactory72.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory72.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray80 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory79.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray80);
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray80);
        undertowEmbeddedServletContainerFactory66.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray80);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer84 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray85 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer84 };
        undertowEmbeddedServletContainerFactory66.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        undertowEmbeddedServletContainerFactory44.addBuilderCustomizers(undertowBuilderCustomizerArray85);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray88 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory44.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory6.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file36.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNull(ssl48);
        org.junit.Assert.assertNotNull(errorPageArray52);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray58);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray63);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(ssl70);
        org.junit.Assert.assertNotNull(errorPageArray74);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray80);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray85);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray88);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        undertowEmbeddedServletContainerFactory5.setBuffersPerRegion((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter2 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter2;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage19 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage19 };
        undertowEmbeddedServletContainerFactory18.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory18.setUseForwardHeaders(true);
        boolean boolean24 = undertowEmbeddedServletContainerFactory18.isAccessLogEnabled();
        io.undertow.Undertow.Builder builder26 = undertowEmbeddedServletContainerFactory18.createBuilder(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker31 = undertowEmbeddedServletContainerFactory28.createWorker();
        undertowEmbeddedServletContainerFactory28.bufferSize = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage36 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage36 };
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray37);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList39 = undertowEmbeddedServletContainerFactory35.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection40 = undertowEmbeddedServletContainerFactory35.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory35.getSsl();
        int int42 = undertowEmbeddedServletContainerFactory35.getPort();
        io.undertow.Undertow.Builder builder44 = undertowEmbeddedServletContainerFactory35.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet47 = undertowEmbeddedServletContainerFactory46.getErrorPages();
        java.net.InetAddress inetAddress48 = undertowEmbeddedServletContainerFactory46.getAddress();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray49 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        io.undertow.servlet.api.DeploymentManager deploymentManager50 = undertowEmbeddedServletContainerFactory46.createDeploymentManager(servletContextInitializerArray49);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer52 = undertowEmbeddedServletContainerFactory28.getUndertowEmbeddedServletContainer(builder44, deploymentManager50, (int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer54 = undertowEmbeddedServletContainerFactory16.getUndertowEmbeddedServletContainer(builder26, deploymentManager50, 100);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter55 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter55.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory61.useForwardHeaders = false;
        java.io.File file64 = undertowEmbeddedServletContainerFactory61.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file64);
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file64);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter69 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = serializedObjectSupporter69.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = serializedObjectSupporter69.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = serializedObjectSupporter69.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = serializedObjectSupporter69.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory74 = serializedObjectSupporter69.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        jarResourceManager68.serializedObjectSupporter = serializedObjectSupporter69;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(xnioWorker31);
        org.junit.Assert.assertNotNull(errorPageArray37);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList39);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection40);
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(errorPageSet47);
        org.junit.Assert.assertNull(inetAddress48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray49);
        org.junit.Assert.assertNotNull(deploymentManager50);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer52);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer54);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory56);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory57);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory58);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory59);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNotNull(file64);
        org.junit.Assert.assertEquals(file64.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file64.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory70);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory71);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory72);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory73);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory74);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        undertowEmbeddedServletContainerFactory8.setAccessLogEnabled(true);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        undertowEmbeddedServletContainerFactory8.ioThreads = 100;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("0.0.0.0");
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourceManager1.serializedObjectSupporter;
        io.undertow.server.handlers.resource.Resource resource5 = jarResourceManager1.getResource("/tmp/junit15641907838534958188");
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(resource5);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList3 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.lang.ClassLoader classLoader5 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter8;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.useForwardHeaders;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer9.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer9.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter21 = initializer9.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory6.serializedObjectSupporter = serializedObjectSupporter21;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList24 = undertowEmbeddedServletContainerFactory23.deploymentInfoCustomizers;
        io.undertow.Undertow.Builder builder26 = undertowEmbeddedServletContainerFactory23.createBuilder((int) '4');
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        boolean boolean12 = undertowEmbeddedServletContainerFactory11.isAccessLogEnabled();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory5.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory5.resourceLoader = resourceLoader10;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(mimeMappings8);
        org.junit.Assert.assertNotNull(mimeMappings9);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(errorPageSet7);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        undertowEmbeddedServletContainerFactory8.buffersPerRegion = 1;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourceManager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = null;
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter4;
        boolean boolean6 = jarResourceManager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = jarResourceManager1.serializedObjectSupporter;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList12 = serializedObjectSupporter9.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        io.undertow.server.handlers.resource.ResourceChangeListener resourceChangeListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarResourceManager1.removeResourceChangeListener(resourceChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000073: Resource change listeners are not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage2 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray3 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage2 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.lang.Class<?> wildcardClass13 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(errorPageArray3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter15;
        jarResourceManager14.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter22 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer1.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter31 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter31.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        initializer1.serializedObjectSupporter = serializedObjectSupporter31;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter35 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList38 = serializedObjectSupporter35.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter35.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        initializer1.serializedObjectSupporter = serializedObjectSupporter35;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter46 = initializer1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(serializedObjectSupporter46);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter2 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter2;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage8 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage8 };
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray9);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList11 = undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory7.getSsl();
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory7.getJspServlet();
        undertowEmbeddedServletContainerFactory5.setJspServlet(jspServlet14);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter16 = undertowEmbeddedServletContainerFactory5.serializedObjectSupporter;
        java.lang.String str17 = undertowEmbeddedServletContainerFactory5.getDisplayName();
        undertowEmbeddedServletContainerFactory5.setDisplayName("/tmp/junit15641907838534958188");
        undertowEmbeddedServletContainerFactory5.useForwardHeaders = false;
        boolean boolean22 = undertowEmbeddedServletContainerFactory5.accessLogEnabled;
        org.xnio.XnioWorker xnioWorker23 = undertowEmbeddedServletContainerFactory5.createWorker();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertNotNull(jspServlet14);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(xnioWorker23);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.useForwardHeaders;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter11.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer9.serializedObjectSupporter = serializedObjectSupporter11;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer9.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter21 = initializer9.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory6.serializedObjectSupporter = serializedObjectSupporter21;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(serializedObjectSupporter21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        undertowEmbeddedServletContainerFactory6.accessLogEnabled = false;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter15;
        jarResourceManager14.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter22 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer1.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory33);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList5 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray7);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = initializer8.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = initializer8.serializedObjectSupporter;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer14 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer16 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer12, initParameterConfiguringServletContextInitializer14, initParameterConfiguringServletContextInitializer16, initParameterConfiguringServletContextInitializer18 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter21 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList24 = serializedObjectSupporter21.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer20.serializedObjectSupporter = serializedObjectSupporter21;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        initializer8.serializedObjectSupporter = serializedObjectSupporter21;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter21.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = initializer32.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = initializer32.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray34);
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray34);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.registerServletContainerInitializerToDriveServletContextInitializers(deploymentInfo6, servletContextInitializerArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory3.getAddress();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList8 = serializedObjectSupporter5.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter5.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(false);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList30 = undertowEmbeddedServletContainerFactory27.builderCustomizers;
        undertowEmbeddedServletContainerFactory12.builderCustomizers = undertowBuilderCustomizerList30;
        undertowEmbeddedServletContainerFactory3.builderCustomizers = undertowBuilderCustomizerList30;
        undertowEmbeddedServletContainerFactory3.useForwardHeaders = true;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList30);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        undertowEmbeddedServletContainerFactory3.ioThreads = 0;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings1 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.accessLogPattern = "/tmp/junit15641907838534958188";
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl4);
        org.junit.Assert.assertNotNull(mimeMappings1);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray0 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = initializer1.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer1.serializedObjectSupporter = serializedObjectSupporter6;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter15.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter15;
        jarResourceManager14.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter22 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager14.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer1.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.junit.Assert.assertNotNull(servletContextInitializerArray0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter6.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList13;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter2 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter2.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter2;
        jarResourceManager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        jarResourceManager1.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        int int18 = undertowEmbeddedServletContainerFactory17.getPort();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter19 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter19.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter28 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter28.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter33 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList36 = serializedObjectSupporter33.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter33.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        java.io.File file42 = undertowEmbeddedServletContainerFactory41.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl43 = undertowEmbeddedServletContainerFactory41.getSsl();
        org.xnio.SslClientAuthMode sslClientAuthMode44 = undertowEmbeddedServletContainerFactory32.getSslClientAuthMode(ssl43);
        org.xnio.SslClientAuthMode sslClientAuthMode45 = undertowEmbeddedServletContainerFactory27.getSslClientAuthMode(ssl43);
        undertowEmbeddedServletContainerFactory17.setSsl(ssl43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory34);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(arrayList36);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file42.toString(), "/tmp/junit7806213710858929942");
        org.junit.Assert.assertNotNull(ssl43);
        org.junit.Assert.assertTrue("'" + sslClientAuthMode44 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode44.equals(org.xnio.SslClientAuthMode.REQUESTED));
        org.junit.Assert.assertTrue("'" + sslClientAuthMode45 + "' != '" + org.xnio.SslClientAuthMode.REQUESTED + "'", sslClientAuthMode45.equals(org.xnio.SslClientAuthMode.REQUESTED));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory9.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory9.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory9.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage29 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage29 };
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 10;
        java.net.InetAddress inetAddress36 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertNull(inetAddress36);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory7.accessLogPattern;
        undertowEmbeddedServletContainerFactory7.setPort((-1));
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager("");
        jarResourceManager1.close();
        java.lang.String str3 = jarResourceManager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = jarResourceManager1.serializedObjectSupporter;
        java.lang.String str5 = jarResourceManager1.jarPath;
        java.lang.String str6 = jarResourceManager1.jarPath;
        boolean boolean7 = jarResourceManager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = jarResourceManager1.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource10 = jarResourceManager1.getResource("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory6.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory6.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage13 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage13 };
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray14);
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray14);
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray14);
        java.lang.String str18 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings19 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(mimeMappings19);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        undertowEmbeddedServletContainerFactory7.setContextPath("");
        undertowEmbeddedServletContainerFactory7.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet12 = undertowEmbeddedServletContainerFactory7.getJspServlet();
        undertowEmbeddedServletContainerFactory7.accessLogEnabled = false;
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(jspServlet12);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        undertowEmbeddedServletContainerFactory1.workerThreads = 0;
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory13.useForwardHeaders = false;
        java.io.File file16 = undertowEmbeddedServletContainerFactory13.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file16;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file16);
        java.lang.String str19 = jarResourceManager18.getjarPath();
        boolean boolean20 = jarResourceManager18.isResourceChangeListenerSupported();
        boolean boolean21 = jarResourceManager18.isResourceChangeListenerSupported();
        java.lang.String str22 = jarResourceManager18.getjarPath();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file16.toString(), "/tmp/junit15641907838534958188");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/tmp/junit15641907838534958188" + "'", str19, "/tmp/junit15641907838534958188");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/tmp/junit15641907838534958188" + "'", str22, "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory3.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker6 = undertowEmbeddedServletContainerFactory3.createWorker();
        undertowEmbeddedServletContainerFactory3.bufferSize = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory10.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory3.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList12;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory3.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 0);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = undertowEmbeddedServletContainerFactory3.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = initializer19.initializers;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer21 = undertowEmbeddedServletContainerFactory3.getEmbeddedServletContainer(servletContextInitializerArray20);
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(xnioWorker6);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(embeddedServletContainer21);
        org.junit.Assert.assertNotNull(deploymentManager22);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        java.util.Set<java.lang.Class<?>> wildcardClassSet7 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray11);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = undertowEmbeddedServletContainerFactory9.deploymentInfoCustomizers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory9.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory9.getSsl();
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory9.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet16);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory26.getErrorPages();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter28 = undertowEmbeddedServletContainerFactory26.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray31);
        undertowEmbeddedServletContainerFactory30.workerThreads = 0;
        boolean boolean35 = undertowEmbeddedServletContainerFactory30.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter36 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory42.useForwardHeaders = false;
        java.io.File file45 = undertowEmbeddedServletContainerFactory42.getDocumentRoot();
        undertowEmbeddedServletContainerFactory30.accessLogDirectory = file45;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file45);
        undertowEmbeddedServletContainerFactory26.setAccessLogDirectory(file45);
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file45;
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNotNull(jspServlet16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        org.junit.Assert.assertNotNull(errorPageSet27);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file45.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        undertowEmbeddedServletContainerFactory8.setDirectBuffers((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage9 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage9 };
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory8.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory8.getDeploymentInfoCustomizers();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList15 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage19 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage19 };
        undertowEmbeddedServletContainerFactory18.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory18.buffersPerRegion = (-1);
        boolean boolean24 = undertowEmbeddedServletContainerFactory18.isAccessLogEnabled();
        java.lang.Integer int25 = undertowEmbeddedServletContainerFactory18.ioThreads;
        boolean boolean26 = undertowEmbeddedServletContainerFactory18.isPersistSession();
        undertowEmbeddedServletContainerFactory18.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray31);
        undertowEmbeddedServletContainerFactory30.workerThreads = 0;
        boolean boolean35 = undertowEmbeddedServletContainerFactory30.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter36 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter36.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        undertowEmbeddedServletContainerFactory42.useForwardHeaders = false;
        java.io.File file45 = undertowEmbeddedServletContainerFactory42.getDocumentRoot();
        undertowEmbeddedServletContainerFactory30.accessLogDirectory = file45;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager(file45);
        undertowEmbeddedServletContainerFactory18.setDocumentRoot(file45);
        undertowEmbeddedServletContainerFactory8.setSessionStoreDir(file45);
        undertowEmbeddedServletContainerFactory6.setSessionStoreDir(file45);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file45.toString(), "/tmp/junit15641907838534958188");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.xnio.XnioWorker xnioWorker4 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory9.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory9.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory9.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage29 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage29 };
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray30);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter34 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        java.util.ArrayList arrayList37 = serializedObjectSupporter34.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = serializedObjectSupporter34.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray46);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = initializer47.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter49 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = serializedObjectSupporter49.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer47.serializedObjectSupporter = serializedObjectSupporter49;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter52 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = serializedObjectSupporter52.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer47.serializedObjectSupporter = serializedObjectSupporter52;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter59 = initializer47.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        java.io.File file62 = undertowEmbeddedServletContainerFactory61.getDocumentRoot();
        undertowEmbeddedServletContainerFactory45.accessLogDirectory = file62;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file62);
        org.junit.Assert.assertNotNull(xnioWorker4);
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory36);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory45);
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory50);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory53);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory54);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory55);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory56);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory57);
        org.junit.Assert.assertNotNull(serializedObjectSupporter59);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file62.toString(), "/tmp/junit4885555198640750798");
    }
}

