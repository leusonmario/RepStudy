import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file8);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo10);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList15 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList15);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter6 = initializer5.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = initializer5.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = initializer5.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        java.util.ArrayList arrayList14 = serializedObjectSupporter12.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        initializer11.serializedObjectSupporter = serializedObjectSupporter12;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.lang.ClassLoader classLoader17 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(classLoader17);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer12 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray8);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(embeddedServletContainer12);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        int int5 = undertowEmbeddedServletContainerFactory1.getPort();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        io.undertow.Undertow.Builder builder9 = undertowEmbeddedServletContainerFactory1.createBuilder(1);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        java.lang.Integer int15 = undertowEmbeddedServletContainerFactory1.bufferSize;
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray11);
        undertowEmbeddedServletContainerFactory10.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList16 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList16, undertowDeploymentInfoCustomizerArray15);
        undertowEmbeddedServletContainerFactory10.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList16);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory10.setDocumentRoot(file19);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray21);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory10.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray26);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory25.getListenAddress();
        io.undertow.Undertow.Builder builder30 = undertowEmbeddedServletContainerFactory25.createBuilder(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray33);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory32.getErrorPages();
        undertowEmbeddedServletContainerFactory32.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        io.undertow.servlet.api.DeploymentManager deploymentManager44 = undertowEmbeddedServletContainerFactory32.createDeploymentManager(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer46 = undertowEmbeddedServletContainerFactory10.getUndertowEmbeddedServletContainer(builder30, deploymentManager44, (int) (short) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList47 = undertowEmbeddedServletContainerFactory10.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList47);
        java.lang.ClassLoader classLoader49 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray52 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray52);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList56 = undertowEmbeddedServletContainerFactory55.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory51.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList56);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo58 = null;
        undertowEmbeddedServletContainerFactory51.configureErrorPages(deploymentInfo58);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList60 = undertowEmbeddedServletContainerFactory51.builderCustomizers;
        undertowEmbeddedServletContainerFactory51.workerThreads = 1;
        undertowEmbeddedServletContainerFactory51.workerThreads = 0;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList65 = undertowEmbeddedServletContainerFactory51.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList65;
        java.lang.Integer int67 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0.0.0.0" + "'", str28, "0.0.0.0");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(errorPageSet35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        org.junit.Assert.assertNotNull(deploymentManager44);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer46);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList47);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray52);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList56);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList60);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList65);
        org.junit.Assert.assertNull(int67);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        io.undertow.server.handlers.resource.ResourceManager resourceManager12 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(resourceManager12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        int int2 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.Set<java.lang.Class<?>> wildcardClassSet4 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.boot.context.embedded.ErrorPage errorPage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage6 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1800 + "'", int2 == 1800);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClassSet4);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray15);
        undertowEmbeddedServletContainerFactory14.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList20 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList20, undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory14.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList20);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList20;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray26);
        java.lang.ClassLoader classLoader28 = undertowEmbeddedServletContainerFactory25.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        int int30 = undertowEmbeddedServletContainerFactory29.getSessionTimeout();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList31 = undertowEmbeddedServletContainerFactory29.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory25.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList31);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList31;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1800 + "'", int30 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList31);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = initializer6.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        int int2 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1800 + "'", int2 == 1800);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.bufferSize = 1800;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray15);
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory14.buffersPerRegion;
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory14.bufferSize = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory23.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer28 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray29 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer28 };
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray29);
        java.lang.Integer int31 = undertowEmbeddedServletContainerFactory23.bufferSize;
        java.lang.String str32 = undertowEmbeddedServletContainerFactory23.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer33 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer33 };
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory41.setSessionTimeout((int) (short) 100);
        int int44 = undertowEmbeddedServletContainerFactory41.getSessionTimeout();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory41.getMimeMappings();
        undertowEmbeddedServletContainerFactory41.setRegisterDefaultServlet(true);
        java.lang.Integer int48 = undertowEmbeddedServletContainerFactory41.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo51 = null;
        undertowEmbeddedServletContainerFactory50.configureErrorPages(deploymentInfo51);
        java.lang.String str53 = undertowEmbeddedServletContainerFactory50.getContextPath();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet54 = undertowEmbeddedServletContainerFactory50.getErrorPages();
        undertowEmbeddedServletContainerFactory50.setWorkerThreads((java.lang.Integer) (-1));
        org.springframework.core.io.ResourceLoader resourceLoader57 = null;
        undertowEmbeddedServletContainerFactory50.setResourceLoader(resourceLoader57);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo61 = null;
        undertowEmbeddedServletContainerFactory60.configureErrorPages(deploymentInfo61);
        java.lang.String str63 = undertowEmbeddedServletContainerFactory60.getContextPath();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = undertowEmbeddedServletContainerFactory60.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray67 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory66.addInitializers(servletContextInitializerArray67);
        undertowEmbeddedServletContainerFactory66.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer71 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer71 };
        undertowEmbeddedServletContainerFactory66.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        java.lang.Integer int74 = undertowEmbeddedServletContainerFactory66.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter75 = undertowEmbeddedServletContainerFactory66.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory66.bufferSize = 10;
        org.springframework.boot.context.embedded.ErrorPage errorPage78 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray79 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage78 };
        undertowEmbeddedServletContainerFactory66.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory60.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory50.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory41.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray79);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray29);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(errorPageSet54);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(errorPageSet64);
        org.junit.Assert.assertNotNull(servletContextInitializerArray67);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray72);
        org.junit.Assert.assertNull(int74);
        org.junit.Assert.assertNull(serializedObjectSupporter75);
        org.junit.Assert.assertNotNull(errorPageArray79);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList3 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory7.buffersPerRegion;
        int int11 = undertowEmbeddedServletContainerFactory7.getPort();
        undertowEmbeddedServletContainerFactory7.buffersPerRegion = 0;
        java.lang.Boolean boolean14 = undertowEmbeddedServletContainerFactory7.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory16.setSessionTimeout((int) (short) 100);
        java.io.File file19 = undertowEmbeddedServletContainerFactory16.getDocumentRoot();
        undertowEmbeddedServletContainerFactory16.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray24);
        java.lang.String str26 = undertowEmbeddedServletContainerFactory23.getListenAddress();
        java.lang.Boolean boolean27 = undertowEmbeddedServletContainerFactory23.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory23.getBuilderCustomizers();
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory23.bufferSize;
        undertowEmbeddedServletContainerFactory23.setBuffersPerRegion((java.lang.Integer) (-1));
        io.undertow.server.handlers.resource.ResourceManager resourceManager32 = undertowEmbeddedServletContainerFactory23.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray35);
        undertowEmbeddedServletContainerFactory34.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer39 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer39 };
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        undertowEmbeddedServletContainerFactory34.bufferSize = (-1);
        int int44 = undertowEmbeddedServletContainerFactory34.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl45 = null;
        undertowEmbeddedServletContainerFactory34.setSsl(ssl45);
        java.io.File file47 = undertowEmbeddedServletContainerFactory34.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory34.getMimeMappings();
        undertowEmbeddedServletContainerFactory23.setMimeMappings(mimeMappings48);
        undertowEmbeddedServletContainerFactory16.setMimeMappings(mimeMappings48);
        undertowEmbeddedServletContainerFactory7.setMimeMappings(mimeMappings48);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings48);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray53 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0.0.0.0" + "'", str26, "0.0.0.0");
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(resourceManager32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1800 + "'", int44 == 1800);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(mimeMappings48);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory6.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray11 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList12, undertowDeploymentInfoCustomizerArray11);
        undertowEmbeddedServletContainerFactory6.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList12);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory6.setDocumentRoot(file15);
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory6.setAddress(inetAddress17);
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory6.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory6.workerThreads = 10;
        int int24 = undertowEmbeddedServletContainerFactory6.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray27);
        java.lang.String str29 = undertowEmbeddedServletContainerFactory26.getListenAddress();
        io.undertow.Undertow.Builder builder31 = undertowEmbeddedServletContainerFactory26.createBuilder((int) ' ');
        io.undertow.servlet.api.DeploymentManager deploymentManager32 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer34 = undertowEmbeddedServletContainerFactory6.getUndertowEmbeddedServletContainer(builder31, deploymentManager32, (int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory36.addInitializers(servletContextInitializerArray37);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet39 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory43.addInitializers(servletContextInitializerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray44);
        io.undertow.servlet.api.DeploymentManager deploymentManager48 = undertowEmbeddedServletContainerFactory36.createDeploymentManager(servletContextInitializerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer50 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder31, deploymentManager48, (int) '4');
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0.0.0.0" + "'", str29, "0.0.0.0");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(errorPageSet39);
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        org.junit.Assert.assertNotNull(deploymentManager48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer50);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        io.undertow.Undertow.Builder builder17 = undertowEmbeddedServletContainerFactory1.createBuilder(10);
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList19 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray22);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory21.getErrorPages();
        undertowEmbeddedServletContainerFactory21.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        io.undertow.servlet.api.DeploymentManager deploymentManager33 = undertowEmbeddedServletContainerFactory21.createDeploymentManager(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer35 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory37.setSessionTimeout((int) (short) 100);
        java.io.File file40 = undertowEmbeddedServletContainerFactory37.getDocumentRoot();
        int int41 = undertowEmbeddedServletContainerFactory37.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = undertowEmbeddedServletContainerFactory37.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet42);
        int int44 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(errorPageSet24);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNotNull(deploymentManager33);
        org.junit.Assert.assertNotNull(embeddedServletContainer35);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(errorPageSet42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        java.lang.String str2 = jarResourcemanager1.getjarPath();
        boolean boolean3 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.String str11 = jarResourcemanager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter12;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource22 = jarResourcemanager1.getResource("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory18.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList23);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo25 = null;
        undertowEmbeddedServletContainerFactory18.configureErrorPages(deploymentInfo25);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList27 = undertowEmbeddedServletContainerFactory18.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList27;
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory1.ioThreads;
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        java.lang.ClassLoader classLoader34 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(errorPageArray15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(classLoader34);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory12.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer17 };
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        java.lang.Integer int20 = undertowEmbeddedServletContainerFactory12.bufferSize;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory12.setSessionTimeout((int) (short) 100);
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory12.buffersPerRegion;
        java.lang.Integer int25 = undertowEmbeddedServletContainerFactory12.ioThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings26);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter28 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray18);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(mimeMappings26);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection4 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray8);
        undertowEmbeddedServletContainerFactory7.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer12 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray13 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer12 };
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray13);
        java.lang.Integer int15 = undertowEmbeddedServletContainerFactory7.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter16 = undertowEmbeddedServletContainerFactory7.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory7.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray21);
        undertowEmbeddedServletContainerFactory20.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList26 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList26, undertowDeploymentInfoCustomizerArray25);
        undertowEmbeddedServletContainerFactory20.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList26);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file29);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray31);
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray31);
        java.lang.ClassLoader classLoader34 = undertowEmbeddedServletContainerFactory7.getServletClassLoader();
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file35);
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory7.buffersPerRegion;
        boolean boolean38 = undertowEmbeddedServletContainerFactory7.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory7.buffersPerRegion = 1800;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray43 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray43);
        java.lang.String str45 = undertowEmbeddedServletContainerFactory42.getListenAddress();
        java.lang.Boolean boolean46 = undertowEmbeddedServletContainerFactory42.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings47 = undertowEmbeddedServletContainerFactory42.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo48 = null;
        undertowEmbeddedServletContainerFactory42.configureErrorPages(deploymentInfo48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer51 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap50);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer53 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer55 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap54);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer57 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap56);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer59 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap58);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer61 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap60);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray62 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer51, initParameterConfiguringServletContextInitializer53, initParameterConfiguringServletContextInitializer55, initParameterConfiguringServletContextInitializer57, initParameterConfiguringServletContextInitializer59, initParameterConfiguringServletContextInitializer61 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray62);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray65 = initializer64.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray65);
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray65);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter68 = undertowEmbeddedServletContainerFactory42.serializedObjectSupporter;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList69 = undertowEmbeddedServletContainerFactory42.builderCustomizers;
        undertowEmbeddedServletContainerFactory7.builderCustomizers = undertowBuilderCustomizerList69;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList69;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray31);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0.0.0.0" + "'", str45, "0.0.0.0");
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNotNull(mimeMappings47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray62);
        org.junit.Assert.assertNotNull(servletContextInitializerArray65);
        org.junit.Assert.assertNull(serializedObjectSupporter68);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList69);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        java.net.InetAddress inetAddress15 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory17.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList23, undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory17.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList23);
        boolean boolean26 = undertowEmbeddedServletContainerFactory17.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer36 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory38.directBuffers = false;
        org.springframework.core.io.ResourceLoader resourceLoader41 = null;
        undertowEmbeddedServletContainerFactory38.setResourceLoader(resourceLoader41);
        undertowEmbeddedServletContainerFactory38.directBuffers = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray47);
        undertowEmbeddedServletContainerFactory46.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer51 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray52 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer51 };
        undertowEmbeddedServletContainerFactory46.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray52);
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory46.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter55 = undertowEmbeddedServletContainerFactory46.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory46.bufferSize = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory59.addInitializers(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory59.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer64 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray65 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer64 };
        undertowEmbeddedServletContainerFactory59.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray65);
        java.lang.Integer int67 = undertowEmbeddedServletContainerFactory59.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter68 = undertowEmbeddedServletContainerFactory59.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory59.bufferSize = 10;
        org.springframework.boot.context.embedded.ErrorPage errorPage71 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray72 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage71 };
        undertowEmbeddedServletContainerFactory59.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(inetAddress15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNotNull(embeddedServletContainer36);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray52);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(serializedObjectSupporter55);
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray65);
        org.junit.Assert.assertNull(int67);
        org.junit.Assert.assertNull(serializedObjectSupporter68);
        org.junit.Assert.assertNotNull(errorPageArray72);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray15);
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) (short) 100);
        int int22 = undertowEmbeddedServletContainerFactory19.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory24.addInitializers(servletContextInitializerArray25);
        undertowEmbeddedServletContainerFactory24.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection29 = undertowEmbeddedServletContainerFactory24.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory19.setDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerCollection29);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList31 = undertowEmbeddedServletContainerFactory19.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray34);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = undertowEmbeddedServletContainerFactory33.getErrorPages();
        undertowEmbeddedServletContainerFactory33.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray41);
        java.lang.String str43 = undertowEmbeddedServletContainerFactory40.getListenAddress();
        java.lang.Boolean boolean44 = undertowEmbeddedServletContainerFactory40.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList48 = undertowEmbeddedServletContainerFactory47.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList49 = undertowEmbeddedServletContainerFactory47.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory40.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList49);
        undertowEmbeddedServletContainerFactory40.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory54.addInitializers(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory54.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer59 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray60 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer59 };
        undertowEmbeddedServletContainerFactory54.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        java.lang.Integer int62 = undertowEmbeddedServletContainerFactory54.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter63 = undertowEmbeddedServletContainerFactory54.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory54.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray68 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory67.addInitializers(servletContextInitializerArray68);
        undertowEmbeddedServletContainerFactory67.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList73 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList73, undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory67.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList73);
        java.io.File file76 = null;
        undertowEmbeddedServletContainerFactory67.setDocumentRoot(file76);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray78 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory67.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory54.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory40.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory33.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory19.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray78);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        boolean boolean87 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(errorPageArray15);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertNotNull(errorPageSet36);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0.0.0.0" + "'", str43, "0.0.0.0");
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList48);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray60);
        org.junit.Assert.assertNull(int62);
        org.junit.Assert.assertNull(serializedObjectSupporter63);
        org.junit.Assert.assertNotNull(servletContextInitializerArray68);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray78);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray11);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory10.getListenAddress();
        java.lang.Boolean boolean14 = undertowEmbeddedServletContainerFactory10.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory17.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList19 = undertowEmbeddedServletContainerFactory17.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory10.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList19);
        io.undertow.server.handlers.resource.ResourceManager resourceManager21 = undertowEmbeddedServletContainerFactory10.getDocumentRootResourceManager();
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory10.bufferSize;
        java.lang.String str23 = undertowEmbeddedServletContainerFactory10.getContextPath();
        io.undertow.Undertow.Builder builder25 = undertowEmbeddedServletContainerFactory10.createBuilder((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory27.setSessionTimeout((int) (short) 100);
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory27.ioThreads;
        java.util.Set<java.lang.Class<?>> wildcardClassSet31 = undertowEmbeddedServletContainerFactory27.getNO_CLASSES();
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory27.setResourceLoader(resourceLoader32);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList34 = undertowEmbeddedServletContainerFactory27.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory10.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList34);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList34;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.SslClientAuthMode sslClientAuthMode39 = undertowEmbeddedServletContainerFactory1.getSslClientAuthMode(ssl38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0.0.0" + "'", str13, "0.0.0.0");
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList19);
        org.junit.Assert.assertNotNull(resourceManager21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(wildcardClassSet31);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList34);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = initializer18.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = initializer18.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray20);
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(deploymentManager22);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptySet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory9.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList15 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList15, undertowDeploymentInfoCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList15);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory9.setDocumentRoot(file18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer22 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray20);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4');
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(embeddedServletContainer22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory1.ioThreads;
        undertowEmbeddedServletContainerFactory1.bufferSize = 1800;
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((int) (short) 100);
        java.io.File file22 = undertowEmbeddedServletContainerFactory19.getDocumentRoot();
        undertowEmbeddedServletContainerFactory19.ioThreads = 100;
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory19.setResourceLoader(resourceLoader25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory19.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray30 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray30);
        undertowEmbeddedServletContainerFactory29.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer34 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer34 };
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory29.bufferSize;
        java.lang.String str38 = undertowEmbeddedServletContainerFactory29.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer39 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer39 };
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        io.undertow.server.handlers.resource.ResourceManager resourceManager44 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertNotNull(resourceManager44);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 10);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList21 = undertowEmbeddedServletContainerFactory20.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory16.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList21);
        org.springframework.core.io.ResourceLoader resourceLoader23 = null;
        undertowEmbeddedServletContainerFactory16.setResourceLoader(resourceLoader23);
        java.util.Set<java.lang.Class<?>> wildcardClassSet25 = undertowEmbeddedServletContainerFactory16.getNO_CLASSES();
        undertowEmbeddedServletContainerFactory16.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory16.bufferSize = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray32);
        undertowEmbeddedServletContainerFactory31.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer36 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray37 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer36 };
        undertowEmbeddedServletContainerFactory31.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray37);
        java.lang.Integer int39 = undertowEmbeddedServletContainerFactory31.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter40 = undertowEmbeddedServletContainerFactory31.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory31.setPort((int) (short) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList44 = undertowEmbeddedServletContainerFactory31.builderCustomizers;
        undertowEmbeddedServletContainerFactory16.builderCustomizers = undertowBuilderCustomizerList44;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList44;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList21);
        org.junit.Assert.assertNotNull(wildcardClassSet25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray37);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(serializedObjectSupporter40);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList44);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.ioThreads = 10;
        java.net.InetAddress inetAddress7 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ErrorPage errorPage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage9 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(inetAddress7);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory12.getServletClassLoader();
        java.lang.String str16 = undertowEmbeddedServletContainerFactory12.getListenAddress();
        undertowEmbeddedServletContainerFactory12.workerThreads = 1;
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory12.setDocumentRoot(file19);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory12.workerThreads = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = initializer32.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer34 = undertowEmbeddedServletContainerFactory12.getEmbeddedServletContainer(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray33);
        java.lang.Integer int36 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.lang.Class<?> wildcardClass37 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0.0.0" + "'", str16, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(embeddedServletContainer34);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        java.lang.String str3 = jarResourcemanager1.jarPath;
        java.lang.String str4 = jarResourcemanager1.getjarPath();
        jarResourcemanager1.close();
        boolean boolean6 = jarResourcemanager1.isResourceChangeListenerSupported();
        java.lang.String str7 = jarResourcemanager1.getjarPath();
        boolean boolean8 = jarResourcemanager1.isResourceChangeListenerSupported();
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter10;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        io.undertow.servlet.api.DeploymentManager deploymentManager13 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray9);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = initializer23.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = initializer23.initializers;
        io.undertow.servlet.api.DeploymentManager deploymentManager26 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNotNull(deploymentManager13);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(deploymentManager26);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = 100;
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory0.getAddress();
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory6.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer11 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer11 };
        undertowEmbeddedServletContainerFactory6.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory6.bufferSize;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings15 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray19);
        java.lang.ClassLoader classLoader21 = undertowEmbeddedServletContainerFactory18.getServletClassLoader();
        java.lang.String str22 = undertowEmbeddedServletContainerFactory18.getListenAddress();
        java.lang.String str23 = undertowEmbeddedServletContainerFactory18.getListenAddress();
        undertowEmbeddedServletContainerFactory18.setDirectBuffers((java.lang.Boolean) true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList26 = undertowEmbeddedServletContainerFactory18.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory0.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList26);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(mimeMappings15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0.0.0" + "'", str22, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.0.0.0" + "'", str23, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList26);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        java.util.Set<java.lang.Class<?>> wildcardClassSet9 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo12 = null;
        undertowEmbeddedServletContainerFactory11.configureErrorPages(deploymentInfo12);
        undertowEmbeddedServletContainerFactory11.setPort(0);
        org.springframework.core.io.ResourceLoader resourceLoader16 = undertowEmbeddedServletContainerFactory11.resourceLoader;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo17 = null;
        undertowEmbeddedServletContainerFactory11.configureErrorPages(deploymentInfo17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = initializer26.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = initializer28.initializers;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer30 = undertowEmbeddedServletContainerFactory11.getEmbeddedServletContainer(servletContextInitializerArray29);
        boolean boolean31 = undertowEmbeddedServletContainerFactory11.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray34);
        undertowEmbeddedServletContainerFactory33.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList39 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList39, undertowDeploymentInfoCustomizerArray38);
        undertowEmbeddedServletContainerFactory33.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList39);
        java.io.File file42 = null;
        undertowEmbeddedServletContainerFactory33.setDocumentRoot(file42);
        java.net.InetAddress inetAddress44 = null;
        undertowEmbeddedServletContainerFactory33.setAddress(inetAddress44);
        java.lang.Integer int46 = undertowEmbeddedServletContainerFactory33.ioThreads;
        java.io.File file47 = undertowEmbeddedServletContainerFactory33.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory49.addInitializers(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = initializer54.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray55);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray55);
        io.undertow.servlet.api.DeploymentManager deploymentManager58 = undertowEmbeddedServletContainerFactory11.createDeploymentManager(servletContextInitializerArray55);
        io.undertow.servlet.api.DeploymentManager deploymentManager59 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNotNull(wildcardClassSet9);
        org.junit.Assert.assertNull(resourceLoader16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNotNull(embeddedServletContainer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertNotNull(deploymentManager58);
        org.junit.Assert.assertNotNull(deploymentManager59);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.ClassLoader classLoader14 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader17;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classLoader14);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        int int15 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.String str16 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0.0.0" + "'", str16, "0.0.0.0");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = initializer6.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = initializer6.getinitializers();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter9 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        initializer6.serializedObjectSupporter = serializedObjectSupporter9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        java.util.ArrayList arrayList17 = serializedObjectSupporter9.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter9.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Set<java.lang.Class<?>> wildcardClassSet7 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(wildcardClassSet7);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setPort((int) '#');
        undertowEmbeddedServletContainerFactory1.ioThreads = 32;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory1.workerThreads = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory12.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerCollection13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray17);
        undertowEmbeddedServletContainerFactory16.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection21 = undertowEmbeddedServletContainerFactory16.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory16.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory16.setRegisterDefaultServlet(false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet26);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection21);
        org.junit.Assert.assertNotNull(errorPageSet26);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        int int4 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory6.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory6.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerCollection11);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList13 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.Integer int15 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList16 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.Set<java.lang.Class<?>> wildcardClassSet17 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList16);
        org.junit.Assert.assertNotNull(wildcardClassSet17);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings15 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory17.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer22 };
        undertowEmbeddedServletContainerFactory17.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        java.lang.Integer int25 = undertowEmbeddedServletContainerFactory17.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList28 = undertowEmbeddedServletContainerFactory27.builderCustomizers;
        undertowEmbeddedServletContainerFactory17.builderCustomizers = undertowBuilderCustomizerList28;
        boolean boolean30 = undertowEmbeddedServletContainerFactory17.isRegisterJspServlet();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList31 = undertowEmbeddedServletContainerFactory17.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray34);
        java.lang.String str36 = undertowEmbeddedServletContainerFactory33.getListenAddress();
        java.lang.Boolean boolean37 = undertowEmbeddedServletContainerFactory33.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        io.undertow.server.handlers.resource.ResourceManager resourceManager39 = undertowEmbeddedServletContainerFactory33.getDocumentRootResourceManager();
        org.springframework.core.io.ResourceLoader resourceLoader40 = null;
        undertowEmbeddedServletContainerFactory33.resourceLoader = resourceLoader40;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory43.setSessionTimeout((int) (short) 100);
        int int46 = undertowEmbeddedServletContainerFactory43.getSessionTimeout();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings47 = undertowEmbeddedServletContainerFactory43.getMimeMappings();
        io.undertow.server.handlers.resource.ResourceManager resourceManager48 = undertowEmbeddedServletContainerFactory43.getDocumentRootResourceManager();
        int int49 = undertowEmbeddedServletContainerFactory43.getPort();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList50 = undertowEmbeddedServletContainerFactory43.builderCustomizers;
        undertowEmbeddedServletContainerFactory33.builderCustomizers = undertowBuilderCustomizerList50;
        undertowEmbeddedServletContainerFactory17.builderCustomizers = undertowBuilderCustomizerList50;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList50;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(mimeMappings15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0.0.0.0" + "'", str36, "0.0.0.0");
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        org.junit.Assert.assertNotNull(resourceManager39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(mimeMappings47);
        org.junit.Assert.assertNotNull(resourceManager48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList50);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory12.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer17 };
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        java.lang.Integer int20 = undertowEmbeddedServletContainerFactory12.bufferSize;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory12.setSessionTimeout((int) (short) 100);
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory12.buffersPerRegion;
        java.lang.Integer int25 = undertowEmbeddedServletContainerFactory12.ioThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings26);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray18);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(mimeMappings26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        java.lang.String str2 = jarResourcemanager1.getjarPath();
        boolean boolean3 = jarResourcemanager1.isResourceChangeListenerSupported();
        jarResourcemanager1.close();
        boolean boolean5 = jarResourcemanager1.isResourceChangeListenerSupported();
        boolean boolean6 = jarResourcemanager1.isResourceChangeListenerSupported();
        boolean boolean7 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        int int14 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.core.io.ResourceLoader resourceLoader15 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1800 + "'", int14 == 1800);
        org.junit.Assert.assertNull(resourceLoader15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory12.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList18, undertowDeploymentInfoCustomizerArray17);
        undertowEmbeddedServletContainerFactory12.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList18);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory12.setDocumentRoot(file21);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray23);
        java.lang.String str25 = undertowEmbeddedServletContainerFactory12.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray28);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory27.getListenAddress();
        io.undertow.Undertow.Builder builder32 = undertowEmbeddedServletContainerFactory27.createBuilder(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray35);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        undertowEmbeddedServletContainerFactory34.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray42);
        io.undertow.servlet.api.DeploymentManager deploymentManager46 = undertowEmbeddedServletContainerFactory34.createDeploymentManager(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer48 = undertowEmbeddedServletContainerFactory12.getUndertowEmbeddedServletContainer(builder32, deploymentManager46, (int) (short) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList49 = undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList49);
        org.springframework.core.io.ResourceLoader resourceLoader51 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader51);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory54.setWorkerThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory58.addInitializers(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory58.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer63 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray64 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer63 };
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        java.lang.Integer int66 = undertowEmbeddedServletContainerFactory58.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter67 = undertowEmbeddedServletContainerFactory58.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory58.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray72 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory71.addInitializers(servletContextInitializerArray72);
        undertowEmbeddedServletContainerFactory71.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray76 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList77 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList77, undertowDeploymentInfoCustomizerArray76);
        undertowEmbeddedServletContainerFactory71.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList77);
        java.io.File file80 = null;
        undertowEmbeddedServletContainerFactory71.setDocumentRoot(file80);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray82 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory71.addBuilderCustomizers(undertowBuilderCustomizerArray82);
        undertowEmbeddedServletContainerFactory58.addBuilderCustomizers(undertowBuilderCustomizerArray82);
        undertowEmbeddedServletContainerFactory54.addBuilderCustomizers(undertowBuilderCustomizerArray82);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray82);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0.0.0.0" + "'", str30, "0.0.0.0");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(errorPageSet37);
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        org.junit.Assert.assertNotNull(deploymentManager46);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer48);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray64);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNull(serializedObjectSupporter67);
        org.junit.Assert.assertNotNull(servletContextInitializerArray72);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray82);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray5 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory4.addInitializers(servletContextInitializerArray5);
        java.lang.ClassLoader classLoader7 = undertowEmbeddedServletContainerFactory4.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        int int9 = undertowEmbeddedServletContainerFactory8.getSessionTimeout();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory4.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory4.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory2.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList12;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray16);
        java.lang.String str18 = undertowEmbeddedServletContainerFactory15.getListenAddress();
        java.lang.Boolean boolean19 = undertowEmbeddedServletContainerFactory15.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList24 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory15.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter32 = initializer31.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = initializer31.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = initializer31.getinitializers();
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray34);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray34);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = initializer36.initializers;
        io.undertow.servlet.api.DeploymentManager deploymentManager38 = undertowEmbeddedServletContainerFactory2.createDeploymentManager(servletContextInitializerArray37);
        org.springframework.boot.context.embedded.Ssl ssl39 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl39);
        org.junit.Assert.assertNotNull(servletContextInitializerArray5);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0.0.0" + "'", str18, "0.0.0.0");
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList24);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertNull(serializedObjectSupporter32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(deploymentManager38);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader11;
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        io.undertow.Undertow.Builder builder8 = undertowEmbeddedServletContainerFactory1.createBuilder((int) 'a');
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray23);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = initializer26.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = initializer26.initializers;
        io.undertow.servlet.api.DeploymentManager deploymentManager29 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(deploymentManager29);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourcemanager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter4;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = jarResourcemanager1.serializedObjectSupporter;
        jarResourcemanager1.close();
        jarResourcemanager1.close();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file8);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory1.workerThreads = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = initializer21.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer23 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray22);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader25;
        org.springframework.boot.context.embedded.Ssl ssl27 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(embeddedServletContainer23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList24);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter8;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory23();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter8.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        java.util.Set<java.lang.Class<?>> wildcardClassSet5 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNotNull(wildcardClassSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(errorPageSet7);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray15);
        undertowEmbeddedServletContainerFactory14.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList20 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList20, undertowDeploymentInfoCustomizerArray19);
        undertowEmbeddedServletContainerFactory14.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList20);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file23);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        java.lang.ClassLoader classLoader28 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file29);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4');
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList35 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray25);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList35);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory18.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList23);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo25 = null;
        undertowEmbeddedServletContainerFactory18.configureErrorPages(deploymentInfo25);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList27 = undertowEmbeddedServletContainerFactory18.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList27;
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory1.ioThreads;
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        boolean boolean34 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(errorPageArray15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory7.buffersPerRegion;
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory7.isRegisterJspServlet();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList14;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file18);
        undertowEmbeddedServletContainerFactory1.bufferSize = 1;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Initializers must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        io.undertow.Undertow.Builder builder10 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (short) 10);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray17);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory16.getListenAddress();
        java.lang.Boolean boolean20 = undertowEmbeddedServletContainerFactory16.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList24 = undertowEmbeddedServletContainerFactory23.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList25 = undertowEmbeddedServletContainerFactory23.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory16.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList25);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        undertowEmbeddedServletContainerFactory16.setBufferSize((java.lang.Integer) 0);
        java.net.InetAddress inetAddress30 = null;
        undertowEmbeddedServletContainerFactory16.setAddress(inetAddress30);
        org.springframework.boot.context.embedded.Ssl ssl32 = null;
        undertowEmbeddedServletContainerFactory16.setSsl(ssl32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory35.addInitializers(servletContextInitializerArray36);
        java.lang.String str38 = undertowEmbeddedServletContainerFactory35.getListenAddress();
        undertowEmbeddedServletContainerFactory35.setIoThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray41 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray41);
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray41);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray41);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0.0.0" + "'", str19, "0.0.0.0");
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList25);
        org.junit.Assert.assertNotNull(errorPageSet27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0.0.0.0" + "'", str38, "0.0.0.0");
        org.junit.Assert.assertNotNull(errorPageArray41);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory42();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.bufferSize;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray14);
        undertowEmbeddedServletContainerFactory13.setPort((-1));
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory13.setAddress(inetAddress18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray22);
        undertowEmbeddedServletContainerFactory21.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList27 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList27, undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory21.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList27);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file30);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer34 = undertowEmbeddedServletContainerFactory13.getEmbeddedServletContainer(servletContextInitializerArray32);
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory13.buffersPerRegion;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory37.addInitializers(servletContextInitializerArray38);
        java.lang.ClassLoader classLoader40 = undertowEmbeddedServletContainerFactory37.getServletClassLoader();
        java.lang.String str41 = undertowEmbeddedServletContainerFactory37.getListenAddress();
        undertowEmbeddedServletContainerFactory37.workerThreads = 1;
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory37.setDocumentRoot(file44);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo46 = null;
        undertowEmbeddedServletContainerFactory37.configureErrorPages(deploymentInfo46);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList50 = undertowEmbeddedServletContainerFactory49.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList53 = undertowEmbeddedServletContainerFactory52.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList54 = undertowEmbeddedServletContainerFactory52.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory49.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList54);
        undertowEmbeddedServletContainerFactory37.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList54;
        undertowEmbeddedServletContainerFactory13.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList54);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList54;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter59 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        java.util.ArrayList arrayList63 = serializedObjectSupporter59.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = serializedObjectSupporter59.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        java.util.ArrayList arrayList65 = serializedObjectSupporter59.deserializeObjectList1();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter59;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertNotNull(embeddedServletContainer34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0.0.0.0" + "'", str41, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList50);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList53);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList54);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory60);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory61);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory62);
        org.junit.Assert.assertNotNull(arrayList63);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory64);
        org.junit.Assert.assertNotNull(arrayList65);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourcemanager1.serializedObjectSupporter;
        java.lang.String str4 = jarResourcemanager1.jarPath;
        jarResourcemanager1.close();
        java.lang.String str6 = jarResourcemanager1.getjarPath();
        boolean boolean7 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager9.close();
        java.lang.String str11 = jarResourcemanager9.jarPath;
        java.lang.String str12 = jarResourcemanager9.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter13 = jarResourcemanager9.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        java.util.ArrayList arrayList17 = serializedObjectSupporter14.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        jarResourcemanager9.serializedObjectSupporter = serializedObjectSupporter14;
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter14;
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        int int4 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory6.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory6.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerCollection11);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo14 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0.0.0" + "'", str13, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray14);
        io.undertow.servlet.api.DeploymentManager deploymentManager20 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray14);
        undertowEmbeddedServletContainerFactory1.workerThreads = 32;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory24.directBuffers = false;
        org.springframework.core.io.ResourceLoader resourceLoader27 = null;
        undertowEmbeddedServletContainerFactory24.setResourceLoader(resourceLoader27);
        undertowEmbeddedServletContainerFactory24.directBuffers = true;
        undertowEmbeddedServletContainerFactory24.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo35 = null;
        undertowEmbeddedServletContainerFactory34.configureErrorPages(deploymentInfo35);
        undertowEmbeddedServletContainerFactory34.setPort(0);
        org.springframework.boot.context.embedded.Ssl ssl39 = null;
        undertowEmbeddedServletContainerFactory34.setSsl(ssl39);
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file41);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings43 = undertowEmbeddedServletContainerFactory34.getMimeMappings();
        undertowEmbeddedServletContainerFactory24.setMimeMappings(mimeMappings43);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings43);
        org.springframework.boot.context.embedded.Ssl ssl46 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.net.InetAddress inetAddress47 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertNotNull(deploymentManager20);
        org.junit.Assert.assertNotNull(mimeMappings43);
        org.junit.Assert.assertNull(ssl46);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        java.lang.ClassLoader classLoader8 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory12.getServletClassLoader();
        java.lang.String str16 = undertowEmbeddedServletContainerFactory12.getListenAddress();
        undertowEmbeddedServletContainerFactory12.workerThreads = 1;
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory12.setDocumentRoot(file19);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory12.workerThreads = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = initializer32.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer34 = undertowEmbeddedServletContainerFactory12.getEmbeddedServletContainer(servletContextInitializerArray33);
        boolean boolean35 = undertowEmbeddedServletContainerFactory12.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory37.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory41.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray46 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList47 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList47, undertowDeploymentInfoCustomizerArray46);
        undertowEmbeddedServletContainerFactory41.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList47);
        java.io.File file50 = null;
        undertowEmbeddedServletContainerFactory41.setDocumentRoot(file50);
        java.net.InetAddress inetAddress52 = null;
        undertowEmbeddedServletContainerFactory41.setAddress(inetAddress52);
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory41.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory41.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory37.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray55);
        org.springframework.boot.context.embedded.Ssl ssl60 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl60);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0.0.0" + "'", str16, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(embeddedServletContainer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(errorPageArray55);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter8 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = 100;
        java.io.File file3 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file3);
        org.springframework.core.io.ResourceLoader resourceLoader5 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory0.bufferSize;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory0.configureErrorPages(deploymentInfo7);
        org.junit.Assert.assertNull(resourceLoader5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        int int14 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '4');
        undertowEmbeddedServletContainerFactory17.setContextPath("");
        io.undertow.Undertow.Builder builder21 = undertowEmbeddedServletContainerFactory17.createBuilder((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray24);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        undertowEmbeddedServletContainerFactory23.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        io.undertow.servlet.api.DeploymentManager deploymentManager35 = undertowEmbeddedServletContainerFactory23.createDeploymentManager(servletContextInitializerArray31);
        undertowEmbeddedServletContainerFactory23.bufferSize = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = initializer45.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = initializer45.initializers;
        io.undertow.servlet.api.DeploymentManager deploymentManager48 = undertowEmbeddedServletContainerFactory23.createDeploymentManager(servletContextInitializerArray47);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer50 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder21, deploymentManager48, 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory52.directBuffers = false;
        java.lang.ClassLoader classLoader55 = undertowEmbeddedServletContainerFactory52.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory57.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer62 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer62 };
        undertowEmbeddedServletContainerFactory57.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        java.lang.Integer int65 = undertowEmbeddedServletContainerFactory57.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter66 = undertowEmbeddedServletContainerFactory57.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory57.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray71 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory70.addInitializers(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory70.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray75 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList76 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList76, undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory70.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList76);
        java.io.File file79 = null;
        undertowEmbeddedServletContainerFactory70.setDocumentRoot(file79);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray81 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory70.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory57.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory52.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet86 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1800 + "'", int14 == 1800);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertNotNull(deploymentManager35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(deploymentManager48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer50);
        org.junit.Assert.assertNotNull(classLoader55);
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNull(serializedObjectSupporter66);
        org.junit.Assert.assertNotNull(servletContextInitializerArray71);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray81);
        org.junit.Assert.assertNotNull(errorPageSet86);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        java.lang.String str3 = jarResourcemanager1.jarPath;
        java.lang.String str4 = jarResourcemanager1.getjarPath();
        jarResourcemanager1.close();
        boolean boolean6 = jarResourcemanager1.isResourceChangeListenerSupported();
        java.lang.String str7 = jarResourcemanager1.getjarPath();
        boolean boolean8 = jarResourcemanager1.isResourceChangeListenerSupported();
        jarResourcemanager1.close();
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter11 = jarResourcemanager1.serializedObjectSupporter;
        java.lang.String str12 = jarResourcemanager1.getjarPath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.boot.context.embedded.Ssl ssl2 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.junit.Assert.assertNull(ssl2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter3;
        boolean boolean10 = jarResourcemanager1.isResourceChangeListenerSupported();
        jarResourcemanager1.close();
        boolean boolean12 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo2 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.directBuffers = true;
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray10 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0.0.0" + "'", str7, "0.0.0.0");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer14 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer16 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12, initParameterConfiguringServletContextInitializer14, initParameterConfiguringServletContextInitializer16, initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = initializer23.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray24);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        java.lang.Boolean boolean28 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        io.undertow.Undertow.Builder builder33 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (byte) 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNull(serializedObjectSupporter27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(errorPageSet31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Set<java.lang.Class<?>> wildcardClassSet15 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.ioThreads = 100;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClassSet15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = initializer22.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer24 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray23);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) -1);
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory28.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList36 = undertowEmbeddedServletContainerFactory35.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory31.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList36);
        undertowEmbeddedServletContainerFactory28.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList36;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList36);
        boolean boolean40 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(embeddedServletContainer24);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray16);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter20 = initializer19.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = initializer19.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.Ssl ssl24 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl24);
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.net.InetAddress inetAddress27 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(inetAddress27);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer6.serializedObjectSupporter = serializedObjectSupporter7;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = initializer6.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray9 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        io.undertow.servlet.api.DeploymentManager deploymentManager13 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager16.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter18 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        jarResourcemanager16.serializedObjectSupporter = serializedObjectSupporter18;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter18.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        initializer14.serializedObjectSupporter = serializedObjectSupporter18;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = initializer14.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = initializer14.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNotNull(servletContextInitializerArray9);
        org.junit.Assert.assertNotNull(deploymentManager13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader11 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader13 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(resourceLoader11);
        org.junit.Assert.assertNull(ssl12);
        org.junit.Assert.assertNull(resourceLoader13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory24);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 0);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory12();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.springframework.core.io.ResourceLoader resourceLoader12 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertNull(resourceLoader12);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory1.createBuilder((int) ' ');
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader3 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection5);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = undertowEmbeddedServletContainerFactory1.serializedObjectSupporter;
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Set<java.lang.Class<?>> wildcardClassSet16 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(wildcardClassSet16);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory11();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader11;
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.workerThreads = 32;
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file5);
        java.net.InetAddress inetAddress7 = undertowEmbeddedServletContainerFactory1.getAddress();
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader11;
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress18);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        java.lang.String str3 = jarResourcemanager1.getjarPath();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource5 = jarResourcemanager1.getResource("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer6.serializedObjectSupporter = serializedObjectSupporter7;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = initializer6.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader11 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader13 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter14 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter14.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(resourceLoader11);
        org.junit.Assert.assertNull(ssl12);
        org.junit.Assert.assertNull(resourceLoader13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory24);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory27();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.directBuffers = true;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory24();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) -1);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo3 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo3);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList5);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.lang.ClassLoader classLoader11 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        int int5 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        java.lang.Boolean boolean8 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray16);
        java.lang.ClassLoader classLoader18 = undertowEmbeddedServletContainerFactory15.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        int int20 = undertowEmbeddedServletContainerFactory19.getSessionTimeout();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList21 = undertowEmbeddedServletContainerFactory19.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory15.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList21);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = undertowEmbeddedServletContainerFactory15.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory13.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList23;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList23;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1800 + "'", int20 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList23);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList2 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList2);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean9 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory12.setResourceLoader(resourceLoader13);
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory12.getServletClassLoader();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList16 = undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList16;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0.0.0" + "'", str8, "0.0.0.0");
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList16);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        java.lang.String str2 = jarResourcemanager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourcemanager1.serializedObjectSupporter;
        jarResourcemanager1.close();
        java.lang.String str5 = jarResourcemanager1.getjarPath();
        java.lang.String str6 = jarResourcemanager1.jarPath;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter13 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter13.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter13;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(errorPageSet12);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory23);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo2 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(ssl5);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Integer int5 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory9.setResourceLoader(resourceLoader10);
        undertowEmbeddedServletContainerFactory9.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory9.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory9.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory19.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer24 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer24 };
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray25);
        java.lang.Integer int27 = undertowEmbeddedServletContainerFactory19.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter28 = undertowEmbeddedServletContainerFactory19.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory19.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory32.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray37 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList38 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList38, undertowDeploymentInfoCustomizerArray37);
        undertowEmbeddedServletContainerFactory32.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList38);
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory32.setDocumentRoot(file41);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory32.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        undertowEmbeddedServletContainerFactory19.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        java.lang.ClassLoader classLoader46 = undertowEmbeddedServletContainerFactory19.getServletClassLoader();
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory19.setDocumentRoot(file47);
        undertowEmbeddedServletContainerFactory19.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.Ssl ssl51 = null;
        undertowEmbeddedServletContainerFactory19.setSsl(ssl51);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory54.addInitializers(servletContextInitializerArray55);
        java.lang.String str57 = undertowEmbeddedServletContainerFactory54.getListenAddress();
        java.lang.Boolean boolean58 = undertowEmbeddedServletContainerFactory54.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings59 = undertowEmbeddedServletContainerFactory54.getMimeMappings();
        undertowEmbeddedServletContainerFactory19.setMimeMappings(mimeMappings59);
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings59);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray65 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory64.addInitializers(servletContextInitializerArray65);
        java.lang.ClassLoader classLoader67 = undertowEmbeddedServletContainerFactory64.getServletClassLoader();
        java.lang.String str68 = undertowEmbeddedServletContainerFactory64.getListenAddress();
        undertowEmbeddedServletContainerFactory64.workerThreads = 1;
        java.io.File file71 = null;
        undertowEmbeddedServletContainerFactory64.setDocumentRoot(file71);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo73 = null;
        undertowEmbeddedServletContainerFactory64.configureErrorPages(deploymentInfo73);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList77 = undertowEmbeddedServletContainerFactory76.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList80 = undertowEmbeddedServletContainerFactory79.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList81 = undertowEmbeddedServletContainerFactory79.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory76.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList81);
        undertowEmbeddedServletContainerFactory64.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList81;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList81;
        java.lang.String str85 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo86 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo86);
        java.lang.String str88 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray25);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(serializedObjectSupporter28);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray43);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0.0.0.0" + "'", str57, "0.0.0.0");
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNotNull(mimeMappings59);
        org.junit.Assert.assertNotNull(servletContextInitializerArray65);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0.0.0.0" + "'", str68, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList77);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList80);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0.0.0.0" + "'", str85, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList6 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList6);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList6);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file8);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList14 = undertowEmbeddedServletContainerFactory13.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory16.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory16.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory13.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList18);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList18;
        undertowEmbeddedServletContainerFactory1.setPort(1);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray27);
        java.lang.String str29 = undertowEmbeddedServletContainerFactory26.getListenAddress();
        java.lang.Boolean boolean30 = undertowEmbeddedServletContainerFactory26.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList34 = undertowEmbeddedServletContainerFactory33.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList35 = undertowEmbeddedServletContainerFactory33.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory26.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList35);
        undertowEmbeddedServletContainerFactory26.buffersPerRegion = 100;
        java.io.File file39 = undertowEmbeddedServletContainerFactory26.getDocumentRoot();
        org.springframework.core.io.ResourceLoader resourceLoader40 = null;
        undertowEmbeddedServletContainerFactory26.setResourceLoader(resourceLoader40);
        io.undertow.server.handlers.resource.ResourceManager resourceManager42 = undertowEmbeddedServletContainerFactory26.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory43.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory47.addInitializers(servletContextInitializerArray48);
        undertowEmbeddedServletContainerFactory47.setPort((-1));
        java.net.InetAddress inetAddress52 = null;
        undertowEmbeddedServletContainerFactory47.setAddress(inetAddress52);
        undertowEmbeddedServletContainerFactory47.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory57.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer62 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer62 };
        undertowEmbeddedServletContainerFactory57.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        java.lang.Integer int65 = undertowEmbeddedServletContainerFactory57.bufferSize;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter66 = undertowEmbeddedServletContainerFactory57.serializedObjectSupporter;
        undertowEmbeddedServletContainerFactory57.setPort((int) (short) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection69 = undertowEmbeddedServletContainerFactory57.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings70 = undertowEmbeddedServletContainerFactory57.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet71 = undertowEmbeddedServletContainerFactory57.getErrorPages();
        undertowEmbeddedServletContainerFactory47.setErrorPages(errorPageSet71);
        undertowEmbeddedServletContainerFactory43.setErrorPages(errorPageSet71);
        undertowEmbeddedServletContainerFactory26.setErrorPages(errorPageSet71);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet71);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0.0.0.0" + "'", str29, "0.0.0.0");
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList35);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(resourceManager42);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNull(serializedObjectSupporter66);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection69);
        org.junit.Assert.assertNotNull(mimeMappings70);
        org.junit.Assert.assertNotNull(errorPageSet71);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        int int5 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        java.lang.Boolean boolean8 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.workerThreads = (-1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory41();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory35();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = jarResourcemanager1.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter4;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory7.buffersPerRegion;
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory7.isRegisterJspServlet();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList14;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray22);
        java.lang.ClassLoader classLoader24 = undertowEmbeddedServletContainerFactory21.getServletClassLoader();
        java.lang.String str25 = undertowEmbeddedServletContainerFactory21.getListenAddress();
        undertowEmbeddedServletContainerFactory21.workerThreads = 1;
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file28);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo30 = null;
        undertowEmbeddedServletContainerFactory21.configureErrorPages(deploymentInfo30);
        undertowEmbeddedServletContainerFactory21.setBufferSize((java.lang.Integer) 1);
        java.net.InetAddress inetAddress34 = undertowEmbeddedServletContainerFactory21.getAddress();
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory21.setSsl(ssl35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray39);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory38.getListenAddress();
        java.lang.Boolean boolean42 = undertowEmbeddedServletContainerFactory38.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList46 = undertowEmbeddedServletContainerFactory45.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList47 = undertowEmbeddedServletContainerFactory45.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory38.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList47);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = undertowEmbeddedServletContainerFactory38.getErrorPages();
        undertowEmbeddedServletContainerFactory38.setBufferSize((java.lang.Integer) 0);
        java.net.InetAddress inetAddress52 = null;
        undertowEmbeddedServletContainerFactory38.setAddress(inetAddress52);
        org.springframework.boot.context.embedded.Ssl ssl54 = null;
        undertowEmbeddedServletContainerFactory38.setSsl(ssl54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray58);
        java.lang.String str60 = undertowEmbeddedServletContainerFactory57.getListenAddress();
        undertowEmbeddedServletContainerFactory57.setIoThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray63 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory57.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray63);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(classLoader24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0.0.0" + "'", str25, "0.0.0.0");
        org.junit.Assert.assertNull(inetAddress34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0.0.0.0" + "'", str41, "0.0.0.0");
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList46);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList47);
        org.junit.Assert.assertNotNull(errorPageSet49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0.0.0.0" + "'", str60, "0.0.0.0");
        org.junit.Assert.assertNotNull(errorPageArray63);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter7 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter7.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        initializer6.serializedObjectSupporter = serializedObjectSupporter7;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter10 = initializer6.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter10.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo2 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo2);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.core.io.ResourceLoader resourceLoader6 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNull(resourceLoader6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory12.getServletClassLoader();
        java.lang.String str16 = undertowEmbeddedServletContainerFactory12.getListenAddress();
        undertowEmbeddedServletContainerFactory12.workerThreads = 1;
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory12.setDocumentRoot(file19);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory12.workerThreads = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = initializer32.getinitializers();
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer34 = undertowEmbeddedServletContainerFactory12.getEmbeddedServletContainer(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray33);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter37 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory15();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = serializedObjectSupporter37.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        initializer36.serializedObjectSupporter = serializedObjectSupporter37;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = initializer36.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0.0.0" + "'", str16, "0.0.0.0");
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(embeddedServletContainer34);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory38);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory39);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory40);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory44);
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet9 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader10;
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = initializer20.getinitializers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = initializer20.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        io.undertow.servlet.api.DeploymentManager deploymentManager25 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(errorPageSet9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertNotNull(deploymentManager25);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer14 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer16 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12, initParameterConfiguringServletContextInitializer14, initParameterConfiguringServletContextInitializer16, initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = initializer23.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray24);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter27 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter27;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory21();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = serializedObjectSupporter27.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory30);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory31);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory32);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory33);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory35);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory36);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory10();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings2 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo3 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureMimeMappings(deploymentInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mimeMappings2);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        int int6 = undertowEmbeddedServletContainerFactory5.getSessionTimeout();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.ioThreads = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory13.setResourceLoader(resourceLoader14);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory13.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray19);
        undertowEmbeddedServletContainerFactory18.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList24 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList24, undertowDeploymentInfoCustomizerArray23);
        undertowEmbeddedServletContainerFactory18.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList24);
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory18.setDocumentRoot(file27);
        java.net.InetAddress inetAddress29 = null;
        undertowEmbeddedServletContainerFactory18.setAddress(inetAddress29);
        java.lang.Integer int31 = undertowEmbeddedServletContainerFactory18.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray32 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory18.addErrorPages(errorPageArray32);
        undertowEmbeddedServletContainerFactory18.workerThreads = 10;
        int int36 = undertowEmbeddedServletContainerFactory18.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray39);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory38.getListenAddress();
        io.undertow.Undertow.Builder builder43 = undertowEmbeddedServletContainerFactory38.createBuilder((int) ' ');
        io.undertow.servlet.api.DeploymentManager deploymentManager44 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer46 = undertowEmbeddedServletContainerFactory18.getUndertowEmbeddedServletContainer(builder43, deploymentManager44, (int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray49 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory48.addInitializers(servletContextInitializerArray49);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet51 = undertowEmbeddedServletContainerFactory48.getErrorPages();
        undertowEmbeddedServletContainerFactory48.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray56 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory55.addInitializers(servletContextInitializerArray56);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray56);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray56);
        io.undertow.servlet.api.DeploymentManager deploymentManager60 = undertowEmbeddedServletContainerFactory48.createDeploymentManager(servletContextInitializerArray56);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer62 = undertowEmbeddedServletContainerFactory13.getUndertowEmbeddedServletContainer(builder43, deploymentManager60, (int) '4');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.core.io.ResourceLoader resourceLoader65 = null;
        undertowEmbeddedServletContainerFactory64.setResourceLoader(resourceLoader65);
        undertowEmbeddedServletContainerFactory64.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory64.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray73 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory72.addInitializers(servletContextInitializerArray73);
        io.undertow.servlet.api.DeploymentManager deploymentManager75 = undertowEmbeddedServletContainerFactory64.createDeploymentManager(servletContextInitializerArray73);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer77 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder43, deploymentManager75, (int) (short) 100);
        boolean boolean78 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory82 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory82.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer86 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter87 = initializer86.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray88 = initializer86.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray89 = initializer86.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer90 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray89);
        io.undertow.servlet.api.DeploymentManager deploymentManager91 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray89);
        java.io.File file92 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(errorPageArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0.0.0.0" + "'", str41, "0.0.0.0");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray49);
        org.junit.Assert.assertNotNull(errorPageSet51);
        org.junit.Assert.assertNotNull(servletContextInitializerArray56);
        org.junit.Assert.assertNotNull(deploymentManager60);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer62);
        org.junit.Assert.assertNotNull(servletContextInitializerArray73);
        org.junit.Assert.assertNotNull(deploymentManager75);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        org.junit.Assert.assertNull(serializedObjectSupporter87);
        org.junit.Assert.assertNotNull(servletContextInitializerArray88);
        org.junit.Assert.assertNotNull(servletContextInitializerArray89);
        org.junit.Assert.assertNotNull(deploymentManager91);
        org.junit.Assert.assertNull(file92);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Set<java.lang.Class<?>> wildcardClassSet15 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader16;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClassSet15);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Set<java.lang.Class<?>> wildcardClassSet15 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 8080);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClassSet15);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer1 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer3 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer5 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer7 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer9 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer11 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap10);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer1, initParameterConfiguringServletContextInitializer3, initParameterConfiguringServletContextInitializer5, initParameterConfiguringServletContextInitializer7, initParameterConfiguringServletContextInitializer9, initParameterConfiguringServletContextInitializer11 };
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray12);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter15 = initializer14.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter16 = initializer14.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter17.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        initializer14.serializedObjectSupporter = serializedObjectSupporter17;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = initializer14.initializers;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter25 = initializer14.serializedObjectSupporter;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter25.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory22);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(serializedObjectSupporter25);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory26);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.net.InetAddress inetAddress3 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress3);
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray6 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory5();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray14);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory13.getListenAddress();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList17 = undertowEmbeddedServletContainerFactory13.builderCustomizers;
        undertowEmbeddedServletContainerFactory13.directBuffers = true;
        undertowEmbeddedServletContainerFactory13.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray24);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        undertowEmbeddedServletContainerFactory23.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        io.undertow.servlet.api.DeploymentManager deploymentManager35 = undertowEmbeddedServletContainerFactory23.createDeploymentManager(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager38.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter40 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        jarResourcemanager38.serializedObjectSupporter = serializedObjectSupporter40;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = serializedObjectSupporter40.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        initializer36.serializedObjectSupporter = serializedObjectSupporter40;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = initializer36.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = initializer36.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray48);
        io.undertow.servlet.api.DeploymentManager deploymentManager50 = undertowEmbeddedServletContainerFactory13.createDeploymentManager(servletContextInitializerArray48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray48);
        io.undertow.servlet.api.DeploymentManager deploymentManager52 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0.0.0" + "'", str16, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertNotNull(deploymentManager35);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory41);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory42);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory43);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory45);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(deploymentManager50);
        org.junit.Assert.assertNotNull(deploymentManager52);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory9();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory10);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory11);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory12);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory9.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList15 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList15, undertowDeploymentInfoCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList15);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory9.setDocumentRoot(file18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer22 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.Ssl ssl25 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray29);
        java.lang.Integer int31 = undertowEmbeddedServletContainerFactory28.buffersPerRegion;
        undertowEmbeddedServletContainerFactory28.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory28.bufferSize = (-1);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings36 = undertowEmbeddedServletContainerFactory28.getMimeMappings();
        io.undertow.Undertow.Builder builder38 = undertowEmbeddedServletContainerFactory28.createBuilder((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureSsl(ssl25, 0, builder38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(embeddedServletContainer22);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(mimeMappings36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        undertowEmbeddedServletContainerFactory1.directBuffers = true;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureMimeMappings(deploymentInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        io.undertow.Undertow.Builder builder4 = undertowEmbeddedServletContainerFactory2.createBuilder((int) ' ');
        io.undertow.Undertow.Builder builder6 = undertowEmbeddedServletContainerFactory2.createBuilder((int) (byte) -1);
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file8);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList14 = undertowEmbeddedServletContainerFactory13.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory16.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory16.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory13.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList18);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList18;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory23.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer28 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray29 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer28 };
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray29);
        undertowEmbeddedServletContainerFactory23.bufferSize = (-1);
        int int33 = undertowEmbeddedServletContainerFactory23.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl34 = null;
        undertowEmbeddedServletContainerFactory23.setSsl(ssl34);
        java.io.File file36 = undertowEmbeddedServletContainerFactory23.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings37 = undertowEmbeddedServletContainerFactory23.getMimeMappings();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList38 = undertowEmbeddedServletContainerFactory23.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList38;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1800 + "'", int33 == 1800);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(mimeMappings37);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList38);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        int int15 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1800 + "'", int15 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet16);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.lang.ClassLoader classLoader14 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNotNull(classLoader14);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection4 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (byte) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1800;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection4);
        org.junit.Assert.assertNull(ssl5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader18 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertNull(resourceLoader18);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList7 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        io.undertow.server.handlers.resource.ResourceManager resourceManager10 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray13);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter17 = initializer16.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = initializer16.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = initializer16.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter22 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory26();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory33();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = serializedObjectSupporter22.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        initializer21.serializedObjectSupporter = serializedObjectSupporter22;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = initializer21.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = initializer21.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter36 = initializer35.serializedObjectSupporter;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = initializer35.initializers;
        io.undertow.servlet.api.DeploymentManager deploymentManager38 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList7);
        org.junit.Assert.assertNotNull(resourceManager10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory23);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory24);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory27);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory28);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory29);
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertNull(serializedObjectSupporter36);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(deploymentManager38);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.ClassLoader classLoader4 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = null;
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter3;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter5 = jarResourcemanager1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList3 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.lang.ClassLoader classLoader7 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList3);
        org.junit.Assert.assertNotNull(errorPageSet6);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.ioThreads = 1;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory6.setSessionTimeout((int) (short) 100);
        int int9 = undertowEmbeddedServletContainerFactory6.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray12);
        undertowEmbeddedServletContainerFactory11.setPort((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory6.setDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerCollection16);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList18 = undertowEmbeddedServletContainerFactory6.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList18;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        boolean boolean22 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Set<java.lang.Class<?>> wildcardClassSet23 = undertowEmbeddedServletContainerFactory1.getNO_CLASSES();
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray24 = undertowEmbeddedServletContainerFactory1.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClassSet23);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager1.close();
        java.lang.String str3 = jarResourcemanager1.getjarPath();
        java.lang.String str4 = jarResourcemanager1.getjarPath();
        boolean boolean5 = jarResourcemanager1.isResourceChangeListenerSupported();
        io.undertow.server.handlers.resource.ResourceChangeListener resourceChangeListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarResourcemanager1.registerResourceChangeListener(resourceChangeListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000073: Resource change listeners are not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.0" + "'", str3, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer6 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer6 };
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        undertowEmbeddedServletContainerFactory1.bufferSize = (-1);
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray16);
        java.lang.String str18 = undertowEmbeddedServletContainerFactory15.getListenAddress();
        java.lang.Boolean boolean19 = undertowEmbeddedServletContainerFactory15.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList23 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList24 = undertowEmbeddedServletContainerFactory22.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory15.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList24);
        undertowEmbeddedServletContainerFactory15.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory15.setPort((int) (byte) 10);
        io.undertow.Undertow.Builder builder31 = undertowEmbeddedServletContainerFactory15.createBuilder(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray34);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = undertowEmbeddedServletContainerFactory33.getErrorPages();
        undertowEmbeddedServletContainerFactory33.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray41);
        io.undertow.servlet.api.DeploymentManager deploymentManager45 = undertowEmbeddedServletContainerFactory33.createDeploymentManager(servletContextInitializerArray41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer47 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder31, deploymentManager45, (int) (short) 0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection48 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0.0.0" + "'", str18, "0.0.0.0");
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList24);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertNotNull(errorPageSet36);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertNotNull(deploymentManager45);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer47);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection48);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7, undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList7);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory39();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory25();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory36();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray11);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory10.buffersPerRegion;
        int int14 = undertowEmbeddedServletContainerFactory10.getPort();
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter24 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = serializedObjectSupporter24.deserializeObjectUndertowEmbeddedServletContainerFactory32();
        initializer23.serializedObjectSupporter = serializedObjectSupporter24;
        undertowEmbeddedServletContainerFactory10.serializedObjectSupporter = serializedObjectSupporter24;
        undertowEmbeddedServletContainerFactory1.serializedObjectSupporter = serializedObjectSupporter24;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 8080);
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory25);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory26);
        org.junit.Assert.assertNull(ssl32);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray2);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = initializer7.getinitializers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = initializer9.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray11 = initializer9.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = initializer9.getinitializers();
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str8 = jarResourcemanager1.jarPath;
        java.lang.String str9 = jarResourcemanager1.jarPath;
        java.lang.String str10 = jarResourcemanager1.getjarPath();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource12 = jarResourcemanager1.getResource("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0.0.0" + "'", str8, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0.0.0" + "'", str9, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0.0.0" + "'", str10, "0.0.0.0");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        jarResourcemanager1.close();
        java.lang.String str3 = jarResourcemanager1.jarPath;
        java.lang.String str4 = jarResourcemanager1.getjarPath();
        jarResourcemanager1.close();
        java.lang.String str6 = jarResourcemanager1.jarPath;
        jarResourcemanager1.close();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource9 = jarResourcemanager1.getResource("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory37();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory43();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory29();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory3();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList2 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        undertowEmbeddedServletContainerFactory1.workerThreads = 1800;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList2);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection4 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection4);
        org.junit.Assert.assertNull(ssl5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray2 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray2);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Boolean boolean5 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList9 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress15);
        org.springframework.boot.context.embedded.Ssl ssl17 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray21);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory20.getListenAddress();
        undertowEmbeddedServletContainerFactory20.setIoThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory20.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray26);
        org.springframework.boot.context.embedded.Ssl ssl29 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray33);
        java.lang.ClassLoader classLoader35 = undertowEmbeddedServletContainerFactory32.getServletClassLoader();
        java.lang.String str36 = undertowEmbeddedServletContainerFactory32.getListenAddress();
        java.lang.String str37 = undertowEmbeddedServletContainerFactory32.getListenAddress();
        undertowEmbeddedServletContainerFactory32.setIoThreads((java.lang.Integer) 0);
        java.lang.ClassLoader classLoader40 = undertowEmbeddedServletContainerFactory32.getServletClassLoader();
        undertowEmbeddedServletContainerFactory32.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory32.bufferSize = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray47);
        undertowEmbeddedServletContainerFactory46.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray51 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList52 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList52, undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory46.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList52);
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory46.setDocumentRoot(file55);
        java.net.InetAddress inetAddress57 = null;
        undertowEmbeddedServletContainerFactory46.setAddress(inetAddress57);
        java.lang.Integer int59 = undertowEmbeddedServletContainerFactory46.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray60 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray60);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray64 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory63.addInitializers(servletContextInitializerArray64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList68 = undertowEmbeddedServletContainerFactory67.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory63.setDeploymentInfoCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList68);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo70 = null;
        undertowEmbeddedServletContainerFactory63.configureErrorPages(deploymentInfo70);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList72 = undertowEmbeddedServletContainerFactory63.builderCustomizers;
        undertowEmbeddedServletContainerFactory46.builderCustomizers = undertowBuilderCustomizerList72;
        undertowEmbeddedServletContainerFactory46.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray76 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory46.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray76);
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray76);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray76);
        org.springframework.core.io.ResourceLoader resourceLoader80 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader80);
        org.junit.Assert.assertNotNull(servletContextInitializerArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0.0.0" + "'", str4, "0.0.0.0");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(errorPageSet12);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.0.0.0" + "'", str23, "0.0.0.0");
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(classLoader35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0.0.0.0" + "'", str36, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0.0.0.0" + "'", str37, "0.0.0.0");
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNotNull(errorPageArray60);
        org.junit.Assert.assertNotNull(servletContextInitializerArray64);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList68);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList72);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray76);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("");
        java.lang.String str2 = jarResourcemanager1.getjarPath();
        boolean boolean3 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter4 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory20();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = serializedObjectSupporter4.deserializeObjectUndertowEmbeddedServletContainerFactory16();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.String str11 = jarResourcemanager1.getjarPath();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory13();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter12;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory22();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory22);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager jarResourcemanager1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourcemanager("0.0.0.0");
        jarResourcemanager1.close();
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter3 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter3.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str8 = jarResourcemanager1.jarPath;
        java.lang.String str9 = jarResourcemanager1.jarPath;
        boolean boolean10 = jarResourcemanager1.isResourceChangeListenerSupported();
        java.lang.String str11 = jarResourcemanager1.jarPath;
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter12 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory34();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory18();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory38();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory2();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory40();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory4();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = serializedObjectSupporter12.deserializeObjectUndertowEmbeddedServletContainerFactory19();
        jarResourcemanager1.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str23 = jarResourcemanager1.getjarPath();
        boolean boolean24 = jarResourcemanager1.isResourceChangeListenerSupported();
        boolean boolean25 = jarResourcemanager1.isResourceChangeListenerSupported();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0.0.0" + "'", str8, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0.0.0" + "'", str9, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0.0.0" + "'", str11, "0.0.0.0");
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory13);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory14);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory15);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory16);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory17);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory18);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory19);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory20);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.0.0.0" + "'", str23, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter serializedObjectSupporter0 = new org.springframework.boot.context.embedded.undertow.SerializedObjectSupporter();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory17();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory1();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory30();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory14();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = serializedObjectSupporter0.deserializeObjectUndertowEmbeddedServletContainerFactory31();
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory1);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory2);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory3);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory4);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory5);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory6);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory7);
        org.junit.Assert.assertNull(undertowEmbeddedServletContainerFactory8);
    }
}

