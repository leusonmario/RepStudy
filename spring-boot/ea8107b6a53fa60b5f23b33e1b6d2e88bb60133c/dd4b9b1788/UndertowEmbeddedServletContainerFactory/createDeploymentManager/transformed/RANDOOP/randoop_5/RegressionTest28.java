import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        boolean boolean1 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        jarResourceManager0.close();
        java.lang.String str4 = jarResourceManager0.jarPath;
        java.lang.String str5 = jarResourceManager0.jarPath;
        jarResourceManager0.close();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList6 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.workerThreads = 10;
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList6);
        org.junit.Assert.assertNotNull(mimeMappings7);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo3 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo3);
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.close();
        boolean boolean4 = jarResourceManager0.isResourceChangeListenerSupported();
        boolean boolean5 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.jarPath = "";
        jarResourceManager0.jarPath = "";
        jarResourceManager0.jarPath = "";
        boolean boolean12 = jarResourceManager0.isResourceChangeListenerSupported();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource14 = jarResourceManager0.getResource("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "";
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory14.workerThreads;
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file17);
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory21.workerThreads;
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file24);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection26 = undertowEmbeddedServletContainerFactory21.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory28.getBuilderCustomizers();
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory28.workerThreads;
        undertowEmbeddedServletContainerFactory28.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file33 = null;
        undertowEmbeddedServletContainerFactory28.setAccessLogDirectory(file33);
        undertowEmbeddedServletContainerFactory28.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer38 = undertowEmbeddedServletContainerFactory28.getEmbeddedServletContainer(servletContextInitializerArray37);
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray37);
        io.undertow.servlet.api.DeploymentManager deploymentManager40 = undertowEmbeddedServletContainerFactory14.createDeploymentManager(servletContextInitializerArray37);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer41 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray37);
        boolean boolean42 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory44.setPersistSession(false);
        undertowEmbeddedServletContainerFactory44.setPersistSession(false);
        undertowEmbeddedServletContainerFactory44.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory44.setSessionStoreDir(file51);
        int int53 = undertowEmbeddedServletContainerFactory44.getPort();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList54 = undertowEmbeddedServletContainerFactory44.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList54;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection26);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(embeddedServletContainer38);
        org.junit.Assert.assertNotNull(deploymentManager40);
        org.junit.Assert.assertNotNull(embeddedServletContainer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList54);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 52);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file15);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ErrorPages must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0.0.0" + "'", str13, "0.0.0.0");
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader9;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection13 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory12.workerThreads;
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(false);
        java.lang.String str17 = undertowEmbeddedServletContainerFactory12.getDisplayName();
        undertowEmbeddedServletContainerFactory12.setBufferSize((java.lang.Integer) 1);
        boolean boolean20 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory22.workerThreads;
        undertowEmbeddedServletContainerFactory22.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray27 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int32 = undertowEmbeddedServletContainerFactory31.ioThreads;
        org.springframework.boot.context.embedded.Compression compression33 = null;
        undertowEmbeddedServletContainerFactory31.setCompression(compression33);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection35 = undertowEmbeddedServletContainerFactory31.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo36 = null;
        undertowEmbeddedServletContainerFactory31.configureErrorPages(deploymentInfo36);
        java.net.InetAddress inetAddress38 = null;
        undertowEmbeddedServletContainerFactory31.setAddress(inetAddress38);
        java.io.File file40 = undertowEmbeddedServletContainerFactory31.getDocumentRoot();
        io.undertow.Undertow.Builder builder42 = undertowEmbeddedServletContainerFactory31.createBuilder((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory44.getBuilderCustomizers();
        java.lang.Integer int46 = undertowEmbeddedServletContainerFactory44.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection50 = undertowEmbeddedServletContainerFactory49.getBuilderCustomizers();
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory49.workerThreads;
        undertowEmbeddedServletContainerFactory49.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file54 = null;
        undertowEmbeddedServletContainerFactory49.setAccessLogDirectory(file54);
        undertowEmbeddedServletContainerFactory49.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer59 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray58);
        initializer47.initializers = servletContextInitializerArray58;
        io.undertow.servlet.api.DeploymentManager deploymentManager61 = undertowEmbeddedServletContainerFactory44.createDeploymentManager(servletContextInitializerArray58);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer63 = undertowEmbeddedServletContainerFactory12.getUndertowEmbeddedServletContainer(builder42, deploymentManager61, 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager64 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer66 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder42, deploymentManager64, (int) ' ');
        int int67 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray27);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection35);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        org.junit.Assert.assertNotNull(embeddedServletContainer59);
        org.junit.Assert.assertNotNull(deploymentManager61);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer63);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        io.undertow.Undertow.Builder builder12 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (short) 100);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory15.workerThreads;
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory15.setAccessLogDirectory(file20);
        undertowEmbeddedServletContainerFactory15.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer25 = undertowEmbeddedServletContainerFactory15.getEmbeddedServletContainer(servletContextInitializerArray24);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer26 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray24);
        org.springframework.boot.context.embedded.Ssl ssl27 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl27);
        undertowEmbeddedServletContainerFactory1.ioThreads = 52;
        org.springframework.boot.context.embedded.ErrorPage errorPage31 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage32 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(embeddedServletContainer25);
        org.junit.Assert.assertNotNull(embeddedServletContainer26);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList6 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader9;
        io.undertow.server.handlers.resource.ResourceManager resourceManager11 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList6);
        org.junit.Assert.assertNotNull(resourceManager11);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        java.lang.Boolean boolean2 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.io.File file3 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file3);
        undertowEmbeddedServletContainerFactory1.ioThreads = 1;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory8.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet11);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(jspServlet11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(errorPageSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory11.ioThreads;
        java.lang.String str13 = undertowEmbeddedServletContainerFactory11.accessLogPattern;
        undertowEmbeddedServletContainerFactory11.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory17.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray19);
        undertowEmbeddedServletContainerFactory11.addErrorPages(errorPageArray19);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray19);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory25.ioThreads;
        org.springframework.boot.context.embedded.Compression compression27 = null;
        undertowEmbeddedServletContainerFactory25.setCompression(compression27);
        int int29 = undertowEmbeddedServletContainerFactory25.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker30 = undertowEmbeddedServletContainerFactory25.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList31 = undertowEmbeddedServletContainerFactory25.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList31;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        int int35 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 52);
        org.springframework.boot.context.embedded.Ssl ssl38 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1800 + "'", int29 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1800 + "'", int35 == 1800);
        org.junit.Assert.assertNull(ssl38);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.springframework.core.io.ResourceLoader resourceLoader11 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(52, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0.0.0" + "'", str10, "0.0.0.0");
        org.junit.Assert.assertNull(resourceLoader11);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker6 = undertowEmbeddedServletContainerFactory1.createWorker();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList11 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 52);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.server.HttpHandler httpHandler18 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.accesslog.AccessLogHandler accessLogHandler19 = undertowEmbeddedServletContainerFactory1.createAccessLogHandler(httpHandler18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList11);
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader17;
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory21.setPersistSession(false);
        io.undertow.Undertow.Builder builder25 = undertowEmbeddedServletContainerFactory21.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory21.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory29.ioThreads;
        org.springframework.boot.context.embedded.Compression compression31 = null;
        undertowEmbeddedServletContainerFactory29.setCompression(compression31);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection33 = undertowEmbeddedServletContainerFactory29.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo34 = null;
        undertowEmbeddedServletContainerFactory29.configureErrorPages(deploymentInfo34);
        java.net.InetAddress inetAddress36 = null;
        undertowEmbeddedServletContainerFactory29.setAddress(inetAddress36);
        java.lang.Integer int38 = undertowEmbeddedServletContainerFactory29.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings39 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        undertowEmbeddedServletContainerFactory21.setMimeMappings(mimeMappings39);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings39);
        java.io.File file42 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.springframework.core.io.ResourceLoader resourceLoader45 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader45;
        io.undertow.server.handlers.resource.ResourceManager resourceManager47 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.io.File file48 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection49 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection33);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(mimeMappings39);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(resourceManager47);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection49);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader6;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.xnio.XnioWorker xnioWorker10 = undertowEmbeddedServletContainerFactory1.createWorker();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo11 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo11);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList13 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory15.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory15.resourceLoader = resourceLoader18;
        org.springframework.core.io.ResourceLoader resourceLoader20 = undertowEmbeddedServletContainerFactory15.resourceLoader;
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        undertowEmbeddedServletContainerFactory15.resourceLoader = resourceLoader21;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList24, undertowBuilderCustomizerArray23);
        undertowEmbeddedServletContainerFactory15.builderCustomizers = undertowBuilderCustomizerList24;
        undertowEmbeddedServletContainerFactory15.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory15.accessLogEnabled = true;
        org.springframework.core.io.ResourceLoader resourceLoader31 = undertowEmbeddedServletContainerFactory15.resourceLoader;
        java.io.File file32 = undertowEmbeddedServletContainerFactory15.getSessionStoreDir();
        java.io.File file33 = undertowEmbeddedServletContainerFactory15.getDocumentRoot();
        org.springframework.boot.context.embedded.JspServlet jspServlet34 = undertowEmbeddedServletContainerFactory15.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet34);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(xnioWorker10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(resourceLoader20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(resourceLoader31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(jspServlet34);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        java.lang.Boolean boolean16 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory9.workerThreads;
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(false);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory9.getDisplayName();
        boolean boolean15 = undertowEmbeddedServletContainerFactory9.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory18.ioThreads;
        java.lang.String str20 = undertowEmbeddedServletContainerFactory18.accessLogPattern;
        undertowEmbeddedServletContainerFactory18.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList24, undertowBuilderCustomizerArray23);
        undertowEmbeddedServletContainerFactory18.builderCustomizers = undertowBuilderCustomizerList24;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory28.getBuilderCustomizers();
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory28.workerThreads;
        undertowEmbeddedServletContainerFactory28.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory28.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory9.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection39 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        java.lang.Integer int40 = undertowEmbeddedServletContainerFactory38.workerThreads;
        java.util.Map<java.lang.String, java.lang.String> strMap41 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer42 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer44 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer46 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap45);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer42, initParameterConfiguringServletContextInitializer44, initParameterConfiguringServletContextInitializer46 };
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray47);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection51 = undertowEmbeddedServletContainerFactory50.getBuilderCustomizers();
        java.lang.Integer int52 = undertowEmbeddedServletContainerFactory50.workerThreads;
        undertowEmbeddedServletContainerFactory50.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory50.setAccessLogDirectory(file55);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList57 = undertowEmbeddedServletContainerFactory50.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection60 = undertowEmbeddedServletContainerFactory59.getBuilderCustomizers();
        java.lang.Integer int61 = undertowEmbeddedServletContainerFactory59.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet62 = undertowEmbeddedServletContainerFactory59.getJspServlet();
        undertowEmbeddedServletContainerFactory50.setJspServlet(jspServlet62);
        undertowEmbeddedServletContainerFactory38.setJspServlet(jspServlet62);
        undertowEmbeddedServletContainerFactory9.setJspServlet(jspServlet62);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet62);
        java.net.InetAddress inetAddress67 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress67);
        org.springframework.core.io.ResourceLoader resourceLoader69 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader69;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList57);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection60);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(jspServlet62);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory6.getBuilderCustomizers();
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory6.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet9 = undertowEmbeddedServletContainerFactory6.getJspServlet();
        undertowEmbeddedServletContainerFactory4.setJspServlet(jspServlet9);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet9);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file13;
        io.undertow.Undertow.Builder builder16 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory18.ioThreads;
        java.lang.String str20 = undertowEmbeddedServletContainerFactory18.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager21 = undertowEmbeddedServletContainerFactory18.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory18.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory18.setBufferSize((java.lang.Integer) 100);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList26 = undertowEmbeddedServletContainerFactory18.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory18.setIoThreads((java.lang.Integer) 100);
        io.undertow.server.handlers.resource.ResourceManager resourceManager29 = undertowEmbeddedServletContainerFactory18.getDocumentRootResourceManager();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory31.getMimeMappings();
        java.net.InetAddress inetAddress33 = undertowEmbeddedServletContainerFactory31.getAddress();
        java.lang.Integer int34 = undertowEmbeddedServletContainerFactory31.workerThreads;
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory31.ioThreads;
        boolean boolean36 = undertowEmbeddedServletContainerFactory31.isAccessLogEnabled();
        boolean boolean37 = undertowEmbeddedServletContainerFactory31.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection40 = undertowEmbeddedServletContainerFactory39.getBuilderCustomizers();
        java.lang.Integer int41 = undertowEmbeddedServletContainerFactory39.workerThreads;
        undertowEmbeddedServletContainerFactory39.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory39.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection48 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        java.lang.Integer int49 = undertowEmbeddedServletContainerFactory47.workerThreads;
        undertowEmbeddedServletContainerFactory47.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file52 = null;
        undertowEmbeddedServletContainerFactory47.setAccessLogDirectory(file52);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo54 = null;
        undertowEmbeddedServletContainerFactory47.configureErrorPages(deploymentInfo54);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer56 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer56 };
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        java.lang.Integer int60 = undertowEmbeddedServletContainerFactory39.bufferSize;
        undertowEmbeddedServletContainerFactory39.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 10);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray66 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory65.addBuilderCustomizers(undertowBuilderCustomizerArray66);
        undertowEmbeddedServletContainerFactory39.addBuilderCustomizers(undertowBuilderCustomizerArray66);
        undertowEmbeddedServletContainerFactory31.addBuilderCustomizers(undertowBuilderCustomizerArray66);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray66);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(jspServlet9);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(resourceManager21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList26);
        org.junit.Assert.assertNotNull(resourceManager29);
        org.junit.Assert.assertNotNull(mimeMappings32);
        org.junit.Assert.assertNull(inetAddress33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray57);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray66);
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        undertowEmbeddedServletContainerFactory1.ioThreads = (-1);
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory1.workerThreads;
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.lang.Boolean boolean13 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory15.workerThreads;
        undertowEmbeddedServletContainerFactory15.setUseForwardHeaders(false);
        java.lang.String str20 = undertowEmbeddedServletContainerFactory15.getDisplayName();
        undertowEmbeddedServletContainerFactory15.setBufferSize((java.lang.Integer) 1);
        boolean boolean23 = undertowEmbeddedServletContainerFactory15.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        java.lang.Integer int27 = undertowEmbeddedServletContainerFactory25.workerThreads;
        undertowEmbeddedServletContainerFactory25.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        undertowEmbeddedServletContainerFactory15.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory34.ioThreads;
        org.springframework.boot.context.embedded.Compression compression36 = null;
        undertowEmbeddedServletContainerFactory34.setCompression(compression36);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection38 = undertowEmbeddedServletContainerFactory34.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo39 = null;
        undertowEmbeddedServletContainerFactory34.configureErrorPages(deploymentInfo39);
        java.net.InetAddress inetAddress41 = null;
        undertowEmbeddedServletContainerFactory34.setAddress(inetAddress41);
        java.io.File file43 = undertowEmbeddedServletContainerFactory34.getDocumentRoot();
        io.undertow.Undertow.Builder builder45 = undertowEmbeddedServletContainerFactory34.createBuilder((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection48 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        java.lang.Integer int49 = undertowEmbeddedServletContainerFactory47.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection53 = undertowEmbeddedServletContainerFactory52.getBuilderCustomizers();
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory52.workerThreads;
        undertowEmbeddedServletContainerFactory52.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory52.setAccessLogDirectory(file57);
        undertowEmbeddedServletContainerFactory52.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray61 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer62 = undertowEmbeddedServletContainerFactory52.getEmbeddedServletContainer(servletContextInitializerArray61);
        initializer50.initializers = servletContextInitializerArray61;
        io.undertow.servlet.api.DeploymentManager deploymentManager64 = undertowEmbeddedServletContainerFactory47.createDeploymentManager(servletContextInitializerArray61);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer66 = undertowEmbeddedServletContainerFactory15.getUndertowEmbeddedServletContainer(builder45, deploymentManager64, 0);
        java.lang.String str67 = undertowEmbeddedServletContainerFactory15.accessLogPattern;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int70 = undertowEmbeddedServletContainerFactory69.ioThreads;
        org.springframework.boot.context.embedded.Compression compression71 = null;
        undertowEmbeddedServletContainerFactory69.setCompression(compression71);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection73 = undertowEmbeddedServletContainerFactory69.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo74 = null;
        undertowEmbeddedServletContainerFactory69.configureErrorPages(deploymentInfo74);
        java.net.InetAddress inetAddress76 = null;
        undertowEmbeddedServletContainerFactory69.setAddress(inetAddress76);
        java.io.File file78 = undertowEmbeddedServletContainerFactory69.getDocumentRoot();
        io.undertow.Undertow.Builder builder80 = undertowEmbeddedServletContainerFactory69.createBuilder((int) (short) 100);
        boolean boolean81 = undertowEmbeddedServletContainerFactory69.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection84 = undertowEmbeddedServletContainerFactory83.getBuilderCustomizers();
        java.lang.Integer int85 = undertowEmbeddedServletContainerFactory83.workerThreads;
        undertowEmbeddedServletContainerFactory83.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file88 = null;
        undertowEmbeddedServletContainerFactory83.setAccessLogDirectory(file88);
        undertowEmbeddedServletContainerFactory83.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray92 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer93 = undertowEmbeddedServletContainerFactory83.getEmbeddedServletContainer(servletContextInitializerArray92);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer94 = undertowEmbeddedServletContainerFactory69.getEmbeddedServletContainer(servletContextInitializerArray92);
        io.undertow.servlet.api.DeploymentManager deploymentManager95 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray92);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray92);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray30);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection38);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection53);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(servletContextInitializerArray61);
        org.junit.Assert.assertNotNull(embeddedServletContainer62);
        org.junit.Assert.assertNotNull(deploymentManager64);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(int70);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection73);
        org.junit.Assert.assertNull(file78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection84);
        org.junit.Assert.assertNull(int85);
        org.junit.Assert.assertNotNull(servletContextInitializerArray92);
        org.junit.Assert.assertNotNull(embeddedServletContainer93);
        org.junit.Assert.assertNotNull(embeddedServletContainer94);
        org.junit.Assert.assertNotNull(deploymentManager95);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList7 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.Ssl ssl8 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression9 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression9);
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList7);
        org.junit.Assert.assertNull(ssl8);
        org.junit.Assert.assertNull(inetAddress11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader7;
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = false;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.workerThreads;
        undertowEmbeddedServletContainerFactory8.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory8.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory16.workerThreads;
        undertowEmbeddedServletContainerFactory16.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file21);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo23 = null;
        undertowEmbeddedServletContainerFactory16.configureErrorPages(deploymentInfo23);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer25 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer25 };
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.ioThreads = 1800;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory35.getBuilderCustomizers();
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory35.workerThreads;
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory35.setDocumentRoot(file38);
        boolean boolean40 = undertowEmbeddedServletContainerFactory35.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory42.getBuilderCustomizers();
        java.lang.Integer int44 = undertowEmbeddedServletContainerFactory42.workerThreads;
        java.io.File file45 = null;
        undertowEmbeddedServletContainerFactory42.setDocumentRoot(file45);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection47 = undertowEmbeddedServletContainerFactory42.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection50 = undertowEmbeddedServletContainerFactory49.getBuilderCustomizers();
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory49.workerThreads;
        undertowEmbeddedServletContainerFactory49.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file54 = null;
        undertowEmbeddedServletContainerFactory49.setAccessLogDirectory(file54);
        undertowEmbeddedServletContainerFactory49.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer59 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray58);
        io.undertow.servlet.api.DeploymentManager deploymentManager61 = undertowEmbeddedServletContainerFactory35.createDeploymentManager(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray58);
        java.lang.Integer int63 = undertowEmbeddedServletContainerFactory1.bufferSize;
        boolean boolean64 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str65 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.lang.ClassLoader classLoader66 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection47);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        org.junit.Assert.assertNotNull(embeddedServletContainer59);
        org.junit.Assert.assertNotNull(deploymentManager61);
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(classLoader66);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setPort(0);
        int int16 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file17);
        boolean boolean19 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 0);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        java.net.InetAddress inetAddress4 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress4);
        org.springframework.boot.context.embedded.Compression compression6 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader17;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer11 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray10);
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader12);
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1800;
        java.lang.String str20 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(embeddedServletContainer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0.0.0" + "'", str21, "0.0.0.0");
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader2;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory1.getCompression();
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(compression10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory11.workerThreads;
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(false);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory11.getDisplayName();
        undertowEmbeddedServletContainerFactory11.setBufferSize((java.lang.Integer) 1);
        boolean boolean19 = undertowEmbeddedServletContainerFactory11.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory21.workerThreads;
        undertowEmbeddedServletContainerFactory21.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file30;
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.workerThreads = (-1);
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file36);
        org.springframework.boot.context.embedded.Compression compression38 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.boot.context.embedded.Compression compression39 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray26);
        org.junit.Assert.assertNull(compression38);
        org.junit.Assert.assertNull(compression39);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        io.undertow.server.handlers.resource.ResourceManager resourceManager10 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file11);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(resourceManager10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory10.workerThreads;
        undertowEmbeddedServletContainerFactory10.setUseForwardHeaders(false);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        undertowEmbeddedServletContainerFactory10.setBufferSize((java.lang.Integer) 1);
        boolean boolean18 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        java.lang.Boolean boolean19 = undertowEmbeddedServletContainerFactory10.directBuffers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList20 = undertowEmbeddedServletContainerFactory10.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList20;
        java.net.InetAddress inetAddress22 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress22);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.io.File file27 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression30 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression30);
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader32;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList20);
        org.junit.Assert.assertNotNull(errorPageSet24);
        org.junit.Assert.assertNull(file27);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet4);
        java.io.File file6 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo13 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage17 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray4 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList5, undertowDeploymentInfoCustomizerArray4);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList5;
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory15.ioThreads;
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory15.setCompression(compression17);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory22.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray24);
        org.springframework.core.io.ResourceLoader resourceLoader28 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.core.io.ResourceLoader resourceLoader33 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader33;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(errorPageArray24);
        org.junit.Assert.assertNull(resourceLoader28);
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory8.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory14.workerThreads;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer22 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20, initParameterConfiguringServletContextInitializer22 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray23);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray23);
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory29.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory29.addErrorPages(errorPageArray31);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray31);
        java.lang.Integer int34 = undertowEmbeddedServletContainerFactory1.ioThreads;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(errorPageSet37);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        int int15 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        io.undertow.servlet.api.DeploymentInfo deploymentInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureAccessLog(deploymentInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file8);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory12.ioThreads;
        org.springframework.boot.context.embedded.Compression compression14 = null;
        undertowEmbeddedServletContainerFactory12.setCompression(compression14);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory12.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory12.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int20 = undertowEmbeddedServletContainerFactory19.ioThreads;
        java.lang.String str21 = undertowEmbeddedServletContainerFactory19.accessLogPattern;
        undertowEmbeddedServletContainerFactory19.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList25 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList25, undertowBuilderCustomizerArray24);
        undertowEmbeddedServletContainerFactory19.builderCustomizers = undertowBuilderCustomizerList25;
        undertowEmbeddedServletContainerFactory12.builderCustomizers = undertowBuilderCustomizerList25;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList25;
        int int30 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int33 = undertowEmbeddedServletContainerFactory32.ioThreads;
        org.springframework.boot.context.embedded.Compression compression34 = null;
        undertowEmbeddedServletContainerFactory32.setCompression(compression34);
        int int36 = undertowEmbeddedServletContainerFactory32.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker37 = undertowEmbeddedServletContainerFactory32.createWorker();
        boolean boolean38 = undertowEmbeddedServletContainerFactory32.isAccessLogEnabled();
        boolean boolean39 = undertowEmbeddedServletContainerFactory32.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int42 = undertowEmbeddedServletContainerFactory41.ioThreads;
        org.springframework.boot.context.embedded.Compression compression43 = null;
        undertowEmbeddedServletContainerFactory41.setCompression(compression43);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection45 = undertowEmbeddedServletContainerFactory41.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo46 = null;
        undertowEmbeddedServletContainerFactory41.configureErrorPages(deploymentInfo46);
        java.net.InetAddress inetAddress48 = null;
        undertowEmbeddedServletContainerFactory41.setAddress(inetAddress48);
        io.undertow.server.handlers.resource.ResourceManager resourceManager50 = undertowEmbeddedServletContainerFactory41.getDocumentRootResourceManager();
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory41.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory53.setPersistSession(false);
        undertowEmbeddedServletContainerFactory53.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList58 = undertowEmbeddedServletContainerFactory53.builderCustomizers;
        undertowEmbeddedServletContainerFactory41.builderCustomizers = undertowBuilderCustomizerList58;
        undertowEmbeddedServletContainerFactory41.setDisplayName("hi!");
        int int62 = undertowEmbeddedServletContainerFactory41.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection65 = undertowEmbeddedServletContainerFactory64.getBuilderCustomizers();
        java.lang.Integer int66 = undertowEmbeddedServletContainerFactory64.workerThreads;
        java.io.File file67 = null;
        undertowEmbeddedServletContainerFactory64.setDocumentRoot(file67);
        boolean boolean69 = undertowEmbeddedServletContainerFactory64.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory64.setUseForwardHeaders(true);
        java.io.File file72 = null;
        undertowEmbeddedServletContainerFactory64.setDocumentRoot(file72);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection76 = undertowEmbeddedServletContainerFactory75.getBuilderCustomizers();
        java.lang.Integer int77 = undertowEmbeddedServletContainerFactory75.workerThreads;
        java.io.File file78 = null;
        undertowEmbeddedServletContainerFactory75.setDocumentRoot(file78);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection80 = undertowEmbeddedServletContainerFactory75.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory82 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection83 = undertowEmbeddedServletContainerFactory82.getBuilderCustomizers();
        java.lang.Integer int84 = undertowEmbeddedServletContainerFactory82.workerThreads;
        undertowEmbeddedServletContainerFactory82.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file87 = null;
        undertowEmbeddedServletContainerFactory82.setAccessLogDirectory(file87);
        undertowEmbeddedServletContainerFactory82.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray91 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer92 = undertowEmbeddedServletContainerFactory82.getEmbeddedServletContainer(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory75.addInitializers(servletContextInitializerArray91);
        io.undertow.servlet.api.DeploymentManager deploymentManager94 = undertowEmbeddedServletContainerFactory64.createDeploymentManager(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray91);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
        org.junit.Assert.assertNotNull(errorPageSet17);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1800 + "'", int30 == 1800);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1800 + "'", int36 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection45);
        org.junit.Assert.assertNotNull(resourceManager50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1800 + "'", int62 == 1800);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection65);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection76);
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection80);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection83);
        org.junit.Assert.assertNull(int84);
        org.junit.Assert.assertNotNull(servletContextInitializerArray91);
        org.junit.Assert.assertNotNull(embeddedServletContainer92);
        org.junit.Assert.assertNotNull(deploymentManager94);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer19 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17, initParameterConfiguringServletContextInitializer19 };
        initializer11.initializers = servletContextInitializerArray20;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = initializer11.initializers;
        initializer10.initializers = servletContextInitializerArray22;
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray22);
        java.lang.String str25 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        int int26 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray29 = undertowEmbeddedServletContainerFactory1.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0.0.0" + "'", str25, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1800 + "'", int26 == 1800);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory3.ioThreads;
        org.springframework.boot.context.embedded.Compression compression5 = null;
        undertowEmbeddedServletContainerFactory3.setCompression(compression5);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory3.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory3.configureErrorPages(deploymentInfo8);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = undertowEmbeddedServletContainerFactory3.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList10;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList12 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = false;
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList12);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(jspServlet16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(errorPageSet18);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory5.ioThreads;
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory5.setCompression(compression7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory5.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory5.configureErrorPages(deploymentInfo10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory5.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList12;
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file15);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList19 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
        org.junit.Assert.assertNull(compression14);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList19);
        org.junit.Assert.assertNotNull(errorPageSet22);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        undertowEmbeddedServletContainerFactory1.workerThreads = 100;
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1800);
        org.springframework.boot.context.embedded.Compression compression21 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.boot.context.embedded.Ssl ssl22 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.ioThreads = 32;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNull(compression21);
        org.junit.Assert.assertNull(ssl22);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        java.io.File file6 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Compression compression8 = undertowEmbeddedServletContainerFactory1.getCompression();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(compression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 10);
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        org.springframework.boot.context.embedded.Ssl ssl10 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl10);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.directBuffers = true;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file15);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.bufferSize = 1800;
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("0.0.0.0");
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(ssl10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.bufferSize;
        undertowEmbeddedServletContainerFactory1.ioThreads = (-1);
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        io.undertow.server.HttpHandler httpHandler17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.accesslog.AccessLogHandler accessLogHandler18 = undertowEmbeddedServletContainerFactory1.createAccessLogHandler(httpHandler17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mimeMappings16);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory15.ioThreads;
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory15.setCompression(compression17);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection19 = undertowEmbeddedServletContainerFactory15.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo20 = null;
        undertowEmbeddedServletContainerFactory15.configureErrorPages(deploymentInfo20);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList22 = undertowEmbeddedServletContainerFactory15.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory13.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList22;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = undertowEmbeddedServletContainerFactory13.builderCustomizers;
        undertowEmbeddedServletContainerFactory13.accessLogEnabled = false;
        java.net.InetAddress inetAddress27 = undertowEmbeddedServletContainerFactory13.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory29.buffersPerRegion = 100;
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory29.setAccessLogDirectory(file32);
        undertowEmbeddedServletContainerFactory29.setDirectBuffers((java.lang.Boolean) true);
        java.lang.String str36 = undertowEmbeddedServletContainerFactory29.getListenAddress();
        java.lang.Boolean boolean37 = undertowEmbeddedServletContainerFactory29.directBuffers;
        org.springframework.boot.context.embedded.Ssl ssl38 = null;
        undertowEmbeddedServletContainerFactory29.setSsl(ssl38);
        undertowEmbeddedServletContainerFactory29.setSessionTimeout(1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 100);
        boolean boolean45 = undertowEmbeddedServletContainerFactory44.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection48 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        java.lang.Integer int49 = undertowEmbeddedServletContainerFactory47.workerThreads;
        undertowEmbeddedServletContainerFactory47.setUseForwardHeaders(false);
        java.lang.String str52 = undertowEmbeddedServletContainerFactory47.getDisplayName();
        undertowEmbeddedServletContainerFactory47.setBufferSize((java.lang.Integer) 1);
        boolean boolean55 = undertowEmbeddedServletContainerFactory47.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory57.getBuilderCustomizers();
        java.lang.Integer int59 = undertowEmbeddedServletContainerFactory57.workerThreads;
        undertowEmbeddedServletContainerFactory57.setUseForwardHeaders(false);
        java.lang.String str62 = undertowEmbeddedServletContainerFactory57.getDisplayName();
        undertowEmbeddedServletContainerFactory57.setBufferSize((java.lang.Integer) 1);
        boolean boolean65 = undertowEmbeddedServletContainerFactory57.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection68 = undertowEmbeddedServletContainerFactory67.getBuilderCustomizers();
        java.lang.Integer int69 = undertowEmbeddedServletContainerFactory67.workerThreads;
        undertowEmbeddedServletContainerFactory67.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory67.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory57.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory47.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory44.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory29.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory13.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        int int80 = undertowEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress81 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress81);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList22);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList24);
        org.junit.Assert.assertNull(inetAddress27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0.0.0.0" + "'", str36, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + true + "'", boolean37, true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection68);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray72);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer19 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap18);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17, initParameterConfiguringServletContextInitializer19 };
        initializer11.initializers = servletContextInitializerArray20;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray22 = initializer11.initializers;
        initializer10.initializers = servletContextInitializerArray22;
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray22);
        boolean boolean25 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "";
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory33.buffersPerRegion;
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory33.setAccessLogDirectory(file36);
        org.springframework.core.io.ResourceLoader resourceLoader38 = null;
        undertowEmbeddedServletContainerFactory33.resourceLoader = resourceLoader38;
        boolean boolean40 = undertowEmbeddedServletContainerFactory33.isRegisterDefaultServlet();
        boolean boolean41 = undertowEmbeddedServletContainerFactory33.accessLogEnabled;
        boolean boolean42 = undertowEmbeddedServletContainerFactory33.accessLogEnabled;
        org.springframework.boot.context.embedded.JspServlet jspServlet43 = undertowEmbeddedServletContainerFactory33.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int46 = undertowEmbeddedServletContainerFactory45.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray47 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory45.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory33.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray47);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(servletContextInitializerArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jspServlet43);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(errorPageArray47);
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings11 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        io.undertow.Undertow.Builder builder17 = undertowEmbeddedServletContainerFactory13.createBuilder((int) '4');
        io.undertow.servlet.api.DeploymentManager deploymentManager18 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer20 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder17, deploymentManager18, (int) '4');
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file21);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        int int24 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean25 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Boolean boolean26 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.core.io.ResourceLoader resourceLoader27 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader27;
        io.undertow.server.handlers.resource.ResourceManager resourceManager29 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.core.io.ResourceLoader resourceLoader31 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader31);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(mimeMappings11);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer20);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(resourceManager29);
        org.junit.Assert.assertNull(int30);
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet4);
        java.io.File file6 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer9 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer11 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer9, initParameterConfiguringServletContextInitializer11, initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15 };
        initializer7.initializers = servletContextInitializerArray16;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = initializer7.initializers;
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression20);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression29 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression29);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader4;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory7.ioThreads;
        java.lang.String str9 = undertowEmbeddedServletContainerFactory7.accessLogPattern;
        undertowEmbeddedServletContainerFactory7.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory13.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray15);
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray15);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray15);
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(errorPageArray15);
        org.junit.Assert.assertNotNull(jspServlet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file6);
        int int8 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader11;
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.Ssl ssl21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.SslClientAuthMode sslClientAuthMode22 = undertowEmbeddedServletContainerFactory1.getSslClientAuthMode(ssl21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1800 + "'", int8 == 1800);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.workerThreads = 0;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = null;
        undertowEmbeddedServletContainerFactory13.setJspServlet(jspServlet16);
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory13.resourceLoader = resourceLoader18;
        boolean boolean20 = undertowEmbeddedServletContainerFactory13.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory22.ioThreads;
        java.lang.String str24 = undertowEmbeddedServletContainerFactory22.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager25 = undertowEmbeddedServletContainerFactory22.getDocumentRootResourceManager();
        boolean boolean26 = undertowEmbeddedServletContainerFactory22.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory22.setRegisterJspServlet(true);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory22.accessLogDirectory = file29;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory22.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet32 = undertowEmbeddedServletContainerFactory22.getJspServlet();
        undertowEmbeddedServletContainerFactory13.setJspServlet(jspServlet32);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        java.lang.Integer int38 = undertowEmbeddedServletContainerFactory36.workerThreads;
        undertowEmbeddedServletContainerFactory36.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory36.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(resourceManager25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(errorPageSet31);
        org.junit.Assert.assertNotNull(jspServlet32);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray41);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet20 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        io.undertow.server.handlers.resource.ResourceManager resourceManager21 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 32;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(jspServlet20);
        org.junit.Assert.assertNotNull(resourceManager21);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (short) -1);
        org.springframework.boot.context.embedded.Ssl ssl15 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl15);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file10);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.workerThreads = (-1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo19 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo19);
        java.lang.Integer int21 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer9 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer9 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray10);
        java.lang.ClassLoader classLoader12 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray13 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray10);
        org.junit.Assert.assertNotNull(classLoader12);
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress5 = undertowEmbeddedServletContainerFactory1.getAddress();
        io.undertow.server.handlers.resource.ResourceManager resourceManager6 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.xnio.XnioWorker xnioWorker8 = undertowEmbeddedServletContainerFactory1.createWorker();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory10.workerThreads;
        undertowEmbeddedServletContainerFactory10.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory10.setAccessLogDirectory(file15);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory10.deploymentInfoCustomizers;
        boolean boolean18 = undertowEmbeddedServletContainerFactory10.accessLogEnabled;
        undertowEmbeddedServletContainerFactory10.setRegisterJspServlet(false);
        boolean boolean21 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory10.accessLogPattern = "hi!";
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory25.ioThreads;
        org.springframework.boot.context.embedded.Compression compression27 = null;
        undertowEmbeddedServletContainerFactory25.setCompression(compression27);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout(100);
        boolean boolean31 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo32 = null;
        undertowEmbeddedServletContainerFactory25.configureErrorPages(deploymentInfo32);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList34 = undertowEmbeddedServletContainerFactory25.builderCustomizers;
        undertowEmbeddedServletContainerFactory10.builderCustomizers = undertowBuilderCustomizerList34;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int38 = undertowEmbeddedServletContainerFactory37.ioThreads;
        org.xnio.XnioWorker xnioWorker39 = undertowEmbeddedServletContainerFactory37.createWorker();
        org.springframework.boot.context.embedded.Compression compression40 = undertowEmbeddedServletContainerFactory37.getCompression();
        int int41 = undertowEmbeddedServletContainerFactory37.getPort();
        org.springframework.boot.context.embedded.JspServlet jspServlet42 = undertowEmbeddedServletContainerFactory37.getJspServlet();
        undertowEmbeddedServletContainerFactory37.ioThreads = (-1);
        int int45 = undertowEmbeddedServletContainerFactory37.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory47.buffersPerRegion = 100;
        java.io.File file50 = null;
        undertowEmbeddedServletContainerFactory47.setAccessLogDirectory(file50);
        undertowEmbeddedServletContainerFactory47.setDirectBuffers((java.lang.Boolean) true);
        java.lang.String str54 = undertowEmbeddedServletContainerFactory47.getListenAddress();
        java.lang.Boolean boolean55 = undertowEmbeddedServletContainerFactory47.directBuffers;
        org.springframework.boot.context.embedded.Ssl ssl56 = null;
        undertowEmbeddedServletContainerFactory47.setSsl(ssl56);
        undertowEmbeddedServletContainerFactory47.setSessionTimeout(1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 100);
        boolean boolean63 = undertowEmbeddedServletContainerFactory62.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection66 = undertowEmbeddedServletContainerFactory65.getBuilderCustomizers();
        java.lang.Integer int67 = undertowEmbeddedServletContainerFactory65.workerThreads;
        undertowEmbeddedServletContainerFactory65.setUseForwardHeaders(false);
        java.lang.String str70 = undertowEmbeddedServletContainerFactory65.getDisplayName();
        undertowEmbeddedServletContainerFactory65.setBufferSize((java.lang.Integer) 1);
        boolean boolean73 = undertowEmbeddedServletContainerFactory65.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection76 = undertowEmbeddedServletContainerFactory75.getBuilderCustomizers();
        java.lang.Integer int77 = undertowEmbeddedServletContainerFactory75.workerThreads;
        undertowEmbeddedServletContainerFactory75.setUseForwardHeaders(false);
        java.lang.String str80 = undertowEmbeddedServletContainerFactory75.getDisplayName();
        undertowEmbeddedServletContainerFactory75.setBufferSize((java.lang.Integer) 1);
        boolean boolean83 = undertowEmbeddedServletContainerFactory75.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection86 = undertowEmbeddedServletContainerFactory85.getBuilderCustomizers();
        java.lang.Integer int87 = undertowEmbeddedServletContainerFactory85.workerThreads;
        undertowEmbeddedServletContainerFactory85.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray90 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory85.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory75.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory65.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory62.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory47.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory37.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray90);
        java.lang.ClassLoader classLoader99 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNull(inetAddress5);
        org.junit.Assert.assertNotNull(resourceManager6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList7);
        org.junit.Assert.assertNotNull(xnioWorker8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList34);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(xnioWorker39);
        org.junit.Assert.assertNull(compression40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(jspServlet42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1800 + "'", int45 == 1800);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0.0.0.0" + "'", str54, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + boolean55 + "' != '" + true + "'", boolean55, true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection66);
        org.junit.Assert.assertNull(int67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection76);
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection86);
        org.junit.Assert.assertNull(int87);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray90);
        org.junit.Assert.assertNotNull(classLoader99);
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.io.File file3 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file3);
        org.springframework.boot.context.embedded.Compression compression5 = undertowEmbeddedServletContainerFactory1.getCompression();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory1.createBuilder((int) 'a');
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.bufferSize = 97;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(compression5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int20 = undertowEmbeddedServletContainerFactory19.ioThreads;
        java.lang.String str21 = undertowEmbeddedServletContainerFactory19.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager22 = undertowEmbeddedServletContainerFactory19.getDocumentRootResourceManager();
        boolean boolean23 = undertowEmbeddedServletContainerFactory19.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo24 = null;
        undertowEmbeddedServletContainerFactory19.configureErrorPages(deploymentInfo24);
        undertowEmbeddedServletContainerFactory19.setJspServletClassName("");
        java.lang.Integer int28 = undertowEmbeddedServletContainerFactory19.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = undertowEmbeddedServletContainerFactory19.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection33 = undertowEmbeddedServletContainerFactory32.getBuilderCustomizers();
        java.lang.Integer int34 = undertowEmbeddedServletContainerFactory32.workerThreads;
        undertowEmbeddedServletContainerFactory32.setUseForwardHeaders(false);
        java.lang.String str37 = undertowEmbeddedServletContainerFactory32.getDisplayName();
        undertowEmbeddedServletContainerFactory32.setBufferSize((java.lang.Integer) 1);
        boolean boolean40 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        java.lang.Boolean boolean41 = undertowEmbeddedServletContainerFactory32.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int44 = undertowEmbeddedServletContainerFactory43.ioThreads;
        java.lang.String str45 = undertowEmbeddedServletContainerFactory43.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager46 = undertowEmbeddedServletContainerFactory43.getDocumentRootResourceManager();
        boolean boolean47 = undertowEmbeddedServletContainerFactory43.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo48 = null;
        undertowEmbeddedServletContainerFactory43.configureErrorPages(deploymentInfo48);
        undertowEmbeddedServletContainerFactory43.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory53.ioThreads;
        java.lang.String str55 = undertowEmbeddedServletContainerFactory53.accessLogPattern;
        undertowEmbeddedServletContainerFactory53.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int60 = undertowEmbeddedServletContainerFactory59.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray61 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory59.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory53.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory43.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory32.addErrorPages(errorPageArray61);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory32.getErrorPages();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList67 = undertowEmbeddedServletContainerFactory32.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList67;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(resourceManager22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(jspServlet29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(resourceManager46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNotNull(errorPageArray61);
        org.junit.Assert.assertNotNull(errorPageSet66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList67);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory7.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray9);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray9);
        io.undertow.server.handlers.resource.ResourceManager resourceManager12 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray18 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertNotNull(resourceManager12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression9 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.ioThreads = 10;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(compression9);
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file7);
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = true;
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader12);
        java.lang.Boolean boolean14 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory16.workerThreads;
        undertowEmbeddedServletContainerFactory16.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file21);
        undertowEmbeddedServletContainerFactory16.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer26 = undertowEmbeddedServletContainerFactory16.getEmbeddedServletContainer(servletContextInitializerArray25);
        undertowEmbeddedServletContainerFactory16.directBuffers = false;
        java.io.File file29 = undertowEmbeddedServletContainerFactory16.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory16.setWorkerThreads((java.lang.Integer) (-1));
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList32 = undertowEmbeddedServletContainerFactory16.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList32;
        java.net.InetAddress inetAddress34 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(embeddedServletContainer26);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList32);
        org.junit.Assert.assertNull(inetAddress34);
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.ioThreads = (-1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        int int16 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.Ssl ssl3 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory6.ioThreads;
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory6.setCompression(compression8);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory6.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo11 = null;
        undertowEmbeddedServletContainerFactory6.configureErrorPages(deploymentInfo11);
        java.net.InetAddress inetAddress13 = null;
        undertowEmbeddedServletContainerFactory6.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.ErrorPage errorPage15 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray16 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage15 };
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray16);
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory6.resourceLoader = resourceLoader18;
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory6.setDocumentRoot(file20);
        org.springframework.core.io.ResourceLoader resourceLoader22 = null;
        undertowEmbeddedServletContainerFactory6.resourceLoader = resourceLoader22;
        org.springframework.boot.context.embedded.Ssl ssl24 = undertowEmbeddedServletContainerFactory6.getSsl();
        undertowEmbeddedServletContainerFactory6.useForwardHeaders = true;
        undertowEmbeddedServletContainerFactory6.setDirectBuffers((java.lang.Boolean) true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList29 = undertowEmbeddedServletContainerFactory6.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList29;
        org.springframework.core.io.ResourceLoader resourceLoader31 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader31;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        org.springframework.core.io.ResourceLoader resourceLoader35 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        java.lang.Boolean boolean36 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNull(ssl3);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNotNull(errorPageArray16);
        org.junit.Assert.assertNull(ssl24);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList29);
        org.junit.Assert.assertNull(resourceLoader35);
        org.junit.Assert.assertNull(boolean36);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory11.workerThreads;
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(false);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory11.getDisplayName();
        undertowEmbeddedServletContainerFactory11.setBufferSize((java.lang.Integer) 1);
        boolean boolean19 = undertowEmbeddedServletContainerFactory11.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory21.workerThreads;
        undertowEmbeddedServletContainerFactory21.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = false;
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory35.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet38 = null;
        undertowEmbeddedServletContainerFactory35.setJspServlet(jspServlet38);
        java.io.File file40 = undertowEmbeddedServletContainerFactory35.getDocumentRoot();
        undertowEmbeddedServletContainerFactory35.accessLogPattern = "";
        undertowEmbeddedServletContainerFactory35.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList47 = undertowEmbeddedServletContainerFactory46.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection52 = undertowEmbeddedServletContainerFactory51.getBuilderCustomizers();
        java.lang.Integer int53 = undertowEmbeddedServletContainerFactory51.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet54 = undertowEmbeddedServletContainerFactory51.getJspServlet();
        undertowEmbeddedServletContainerFactory49.setJspServlet(jspServlet54);
        undertowEmbeddedServletContainerFactory46.setJspServlet(jspServlet54);
        undertowEmbeddedServletContainerFactory35.setJspServlet(jspServlet54);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet54);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray26);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList47);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection52);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(jspServlet54);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader6;
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        io.undertow.server.handlers.resource.ResourceManager resourceManager10 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        undertowEmbeddedServletContainerFactory13.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList18 = undertowEmbeddedServletContainerFactory13.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList18;
        java.io.File file20 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        io.undertow.server.HttpHandler httpHandler21 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.accesslog.AccessLogHandler accessLogHandler22 = undertowEmbeddedServletContainerFactory1.createAccessLogHandler(httpHandler21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Access log directory is not set");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(resourceManager10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList18);
        org.junit.Assert.assertNull(file20);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList6 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader9;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        io.undertow.server.handlers.resource.ResourceManager resourceManager10 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(resourceManager10);
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray4 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList5, undertowDeploymentInfoCustomizerArray4);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList5;
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory15.ioThreads;
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory15.setCompression(compression17);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory22.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray24 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray24);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray24);
        org.springframework.core.io.ResourceLoader resourceLoader28 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo29 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo29);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl31);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(errorPageArray24);
        org.junit.Assert.assertNull(resourceLoader28);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory17.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet20 = undertowEmbeddedServletContainerFactory17.getJspServlet();
        undertowEmbeddedServletContainerFactory15.setJspServlet(jspServlet20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory25.ioThreads;
        org.springframework.boot.context.embedded.Compression compression27 = null;
        undertowEmbeddedServletContainerFactory25.setCompression(compression27);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection29 = undertowEmbeddedServletContainerFactory25.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo30 = null;
        undertowEmbeddedServletContainerFactory25.configureErrorPages(deploymentInfo30);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList32 = undertowEmbeddedServletContainerFactory25.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory23.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList32;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList34 = undertowEmbeddedServletContainerFactory23.builderCustomizers;
        undertowEmbeddedServletContainerFactory15.builderCustomizers = undertowBuilderCustomizerList34;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList34;
        org.xnio.XnioWorker xnioWorker37 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.ioThreads = 100;
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl40);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(jspServlet20);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection29);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList32);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList34);
        org.junit.Assert.assertNotNull(xnioWorker37);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = true;
        java.lang.ClassLoader classLoader7 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jspServlet4);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray13 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList14 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList14, undertowBuilderCustomizerArray13);
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList14;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory18.ioThreads;
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory18.setCompression(compression20);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection22 = undertowEmbeddedServletContainerFactory18.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo23 = null;
        undertowEmbeddedServletContainerFactory18.configureErrorPages(deploymentInfo23);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList25 = undertowEmbeddedServletContainerFactory18.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList25;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory28.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray30);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo33 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo33);
        java.io.File file35 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory37.getBuilderCustomizers();
        java.lang.Integer int39 = undertowEmbeddedServletContainerFactory37.workerThreads;
        java.io.File file40 = null;
        undertowEmbeddedServletContainerFactory37.setDocumentRoot(file40);
        boolean boolean42 = undertowEmbeddedServletContainerFactory37.isAccessLogEnabled();
        java.io.File file43 = undertowEmbeddedServletContainerFactory37.accessLogDirectory;
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory37.setAccessLogDirectory(file44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory47.setPersistSession(false);
        java.io.File file50 = undertowEmbeddedServletContainerFactory47.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression51 = null;
        undertowEmbeddedServletContainerFactory47.setCompression(compression51);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory47.setDocumentRoot(file53);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int57 = undertowEmbeddedServletContainerFactory56.ioThreads;
        org.springframework.boot.context.embedded.Compression compression58 = null;
        undertowEmbeddedServletContainerFactory56.setCompression(compression58);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection60 = undertowEmbeddedServletContainerFactory56.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo61 = null;
        undertowEmbeddedServletContainerFactory56.configureErrorPages(deploymentInfo61);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList63 = undertowEmbeddedServletContainerFactory56.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader64 = undertowEmbeddedServletContainerFactory56.getServletClassLoader();
        java.lang.Integer int65 = undertowEmbeddedServletContainerFactory56.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 0);
        java.io.File file69 = null;
        undertowEmbeddedServletContainerFactory68.accessLogDirectory = file69;
        undertowEmbeddedServletContainerFactory68.buffersPerRegion = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory74 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection75 = undertowEmbeddedServletContainerFactory74.getBuilderCustomizers();
        java.lang.Integer int76 = undertowEmbeddedServletContainerFactory74.workerThreads;
        undertowEmbeddedServletContainerFactory74.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file79 = null;
        undertowEmbeddedServletContainerFactory74.setAccessLogDirectory(file79);
        undertowEmbeddedServletContainerFactory74.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory74.getEmbeddedServletContainer(servletContextInitializerArray83);
        org.springframework.core.io.ResourceLoader resourceLoader85 = null;
        undertowEmbeddedServletContainerFactory74.setResourceLoader(resourceLoader85);
        undertowEmbeddedServletContainerFactory74.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer89 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray90 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer89 };
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory56.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection22);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList25);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection60);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList63);
        org.junit.Assert.assertNotNull(classLoader64);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection75);
        org.junit.Assert.assertNull(int76);
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray90);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        java.lang.Boolean boolean2 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.io.File file3 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file3);
        undertowEmbeddedServletContainerFactory1.ioThreads = 1;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory8.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet11);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (short) 100);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(jspServlet11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mimeMappings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression5 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression5);
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file10;
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.workerThreads;
        undertowEmbeddedServletContainerFactory8.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory8.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory16.workerThreads;
        undertowEmbeddedServletContainerFactory16.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file21);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo23 = null;
        undertowEmbeddedServletContainerFactory16.configureErrorPages(deploymentInfo23);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer25 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer25 };
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.ioThreads = 1800;
        java.net.InetAddress inetAddress32 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress32);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(100);
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = true;
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1;
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("0.0.0.0");
        java.lang.Integer int15 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Ssl ssl16 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(ssl16);
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        boolean boolean1 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.close();
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.jarPath = "0.0.0.0";
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.close();
        boolean boolean12 = jarResourceManager0.isResourceChangeListenerSupported();
        io.undertow.server.handlers.resource.ResourceChangeListener resourceChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarResourceManager0.removeResourceChangeListener(resourceChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000073: Resource change listeners are not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList11 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList11);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory17.ioThreads;
        org.springframework.boot.context.embedded.Compression compression19 = null;
        undertowEmbeddedServletContainerFactory17.setCompression(compression19);
        int int21 = undertowEmbeddedServletContainerFactory17.getSessionTimeout();
        undertowEmbeddedServletContainerFactory17.buffersPerRegion = 100;
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory17.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader25 = undertowEmbeddedServletContainerFactory17.resourceLoader;
        undertowEmbeddedServletContainerFactory17.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 10);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray31);
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.net.InetAddress inetAddress36 = null;
        undertowEmbeddedServletContainerFactory35.setAddress(inetAddress36);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory35.setSessionStoreDir(file38);
        undertowEmbeddedServletContainerFactory35.buffersPerRegion = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addBuilderCustomizers(undertowBuilderCustomizerArray42);
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray42);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray42);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection46 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl47 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection51 = undertowEmbeddedServletContainerFactory50.getBuilderCustomizers();
        java.lang.Integer int52 = undertowEmbeddedServletContainerFactory50.workerThreads;
        undertowEmbeddedServletContainerFactory50.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory50.setAccessLogDirectory(file55);
        undertowEmbeddedServletContainerFactory50.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer60 = undertowEmbeddedServletContainerFactory50.getEmbeddedServletContainer(servletContextInitializerArray59);
        org.springframework.core.io.ResourceLoader resourceLoader61 = null;
        undertowEmbeddedServletContainerFactory50.setResourceLoader(resourceLoader61);
        org.springframework.boot.context.embedded.Ssl ssl63 = null;
        undertowEmbeddedServletContainerFactory50.setSsl(ssl63);
        boolean boolean65 = undertowEmbeddedServletContainerFactory50.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory50.useForwardHeaders = false;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList68 = undertowEmbeddedServletContainerFactory50.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory50.setDisplayName("0.0.0.0");
        io.undertow.Undertow.Builder builder72 = undertowEmbeddedServletContainerFactory50.createBuilder((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureSsl(ssl47, (int) (short) -1, builder72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1800 + "'", int21 == 1800);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(resourceLoader25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray31);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection46);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        org.junit.Assert.assertNotNull(embeddedServletContainer60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList68);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader4;
        org.springframework.core.io.ResourceLoader resourceLoader6 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader7;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList10, undertowBuilderCustomizerArray9);
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList10;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        org.springframework.boot.context.embedded.JspServlet jspServlet15 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "";
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(resourceLoader6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jspServlet15);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Boolean boolean15 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory1.workerThreads;
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.lang.ClassLoader classLoader7 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.ioThreads = 0;
        org.springframework.boot.context.embedded.Compression compression10 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression10);
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader12;
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        java.lang.Integer int16 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.springframework.core.io.ResourceLoader resourceLoader12 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0.0.0" + "'", str6, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0.0.0" + "'", str9, "0.0.0.0");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(resourceLoader12);
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        undertowEmbeddedServletContainerFactory1.ioThreads = 10;
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory12.ioThreads;
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager15 = undertowEmbeddedServletContainerFactory12.getDocumentRootResourceManager();
        boolean boolean16 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory12.setRegisterJspServlet(true);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory12.accessLogDirectory = file19;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList25 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList25, undertowBuilderCustomizerArray24);
        undertowEmbeddedServletContainerFactory12.builderCustomizers = undertowBuilderCustomizerList25;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList25;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        java.lang.Integer int32 = undertowEmbeddedServletContainerFactory30.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet33 = undertowEmbeddedServletContainerFactory30.getJspServlet();
        org.springframework.boot.context.embedded.Compression compression34 = null;
        undertowEmbeddedServletContainerFactory30.setCompression(compression34);
        org.springframework.core.io.ResourceLoader resourceLoader36 = null;
        undertowEmbeddedServletContainerFactory30.resourceLoader = resourceLoader36;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader39 = null;
        undertowEmbeddedServletContainerFactory30.setResourceLoader(resourceLoader39);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList41 = undertowEmbeddedServletContainerFactory30.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList41;
        int int43 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.Integer int44 = undertowEmbeddedServletContainerFactory1.bufferSize;
        io.undertow.server.handlers.resource.ResourceManager resourceManager45 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.workerThreads = 1;
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(resourceManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(jspServlet33);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1800 + "'", int43 == 1800);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(resourceManager45);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file6);
        int int8 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader11;
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray21 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1800 + "'", int8 == 1800);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList6 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage11 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList6);
        org.junit.Assert.assertNull(inetAddress9);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory1.bufferSize;
        io.undertow.Undertow.Builder builder8 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '#');
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = true;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        int int16 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo17 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo17);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1800 + "'", int16 == 1800);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings11 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        io.undertow.Undertow.Builder builder17 = undertowEmbeddedServletContainerFactory13.createBuilder((int) '4');
        io.undertow.servlet.api.DeploymentManager deploymentManager18 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer20 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder17, deploymentManager18, (int) '4');
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1800;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int27 = undertowEmbeddedServletContainerFactory26.ioThreads;
        org.springframework.boot.context.embedded.Compression compression28 = null;
        undertowEmbeddedServletContainerFactory26.setCompression(compression28);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection30 = undertowEmbeddedServletContainerFactory26.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo31 = null;
        undertowEmbeddedServletContainerFactory26.configureErrorPages(deploymentInfo31);
        java.net.InetAddress inetAddress33 = null;
        undertowEmbeddedServletContainerFactory26.setAddress(inetAddress33);
        org.springframework.boot.context.embedded.ErrorPage errorPage35 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray36 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage35 };
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray36);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = undertowEmbeddedServletContainerFactory40.getMimeMappings();
        java.net.InetAddress inetAddress42 = undertowEmbeddedServletContainerFactory40.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader43 = null;
        undertowEmbeddedServletContainerFactory40.resourceLoader = resourceLoader43;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory46.setPersistSession(false);
        undertowEmbeddedServletContainerFactory46.setUseForwardHeaders(true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList51 = undertowEmbeddedServletContainerFactory46.builderCustomizers;
        undertowEmbeddedServletContainerFactory40.builderCustomizers = undertowBuilderCustomizerList51;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList51;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(mimeMappings11);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer20);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection30);
        org.junit.Assert.assertNotNull(errorPageArray36);
        org.junit.Assert.assertNotNull(mimeMappings41);
        org.junit.Assert.assertNull(inetAddress42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList51);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory12.ioThreads;
        org.springframework.boot.context.embedded.Compression compression14 = null;
        undertowEmbeddedServletContainerFactory12.setCompression(compression14);
        int int16 = undertowEmbeddedServletContainerFactory12.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker17 = undertowEmbeddedServletContainerFactory12.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory12.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory22.workerThreads;
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory22.setDocumentRoot(file25);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection27 = undertowEmbeddedServletContainerFactory22.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory29.getBuilderCustomizers();
        java.lang.Integer int31 = undertowEmbeddedServletContainerFactory29.workerThreads;
        undertowEmbeddedServletContainerFactory29.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory29.setAccessLogDirectory(file34);
        undertowEmbeddedServletContainerFactory29.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer39 = undertowEmbeddedServletContainerFactory29.getEmbeddedServletContainer(servletContextInitializerArray38);
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray38);
        io.undertow.servlet.api.DeploymentManager deploymentManager41 = undertowEmbeddedServletContainerFactory12.createDeploymentManager(servletContextInitializerArray38);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer42 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray38);
        java.io.File file43 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file43);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList45 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        java.util.concurrent.TimeUnit timeUnit47 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4', timeUnit47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1800 + "'", int16 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList18);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection27);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
        org.junit.Assert.assertNotNull(embeddedServletContainer39);
        org.junit.Assert.assertNotNull(deploymentManager41);
        org.junit.Assert.assertNotNull(embeddedServletContainer42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList45);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory8.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory8.resourceLoader = resourceLoader11;
        org.springframework.core.io.ResourceLoader resourceLoader13 = undertowEmbeddedServletContainerFactory8.resourceLoader;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer16 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer22 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer16, initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20, initParameterConfiguringServletContextInitializer22 };
        initializer14.initializers = servletContextInitializerArray23;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = initializer14.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory27.workerThreads;
        undertowEmbeddedServletContainerFactory27.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory27.setAccessLogDirectory(file32);
        undertowEmbeddedServletContainerFactory27.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray36);
        initializer14.initializers = servletContextInitializerArray36;
        io.undertow.servlet.api.DeploymentManager deploymentManager39 = undertowEmbeddedServletContainerFactory8.createDeploymentManager(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray36);
        org.springframework.boot.context.embedded.Ssl ssl41 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory44.getBuilderCustomizers();
        java.lang.Integer int46 = undertowEmbeddedServletContainerFactory44.workerThreads;
        undertowEmbeddedServletContainerFactory44.setUseForwardHeaders(false);
        java.lang.String str49 = undertowEmbeddedServletContainerFactory44.getDisplayName();
        boolean boolean50 = undertowEmbeddedServletContainerFactory44.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet51 = undertowEmbeddedServletContainerFactory44.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int54 = undertowEmbeddedServletContainerFactory53.ioThreads;
        java.lang.String str55 = undertowEmbeddedServletContainerFactory53.accessLogPattern;
        undertowEmbeddedServletContainerFactory53.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray58 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList59 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList59, undertowBuilderCustomizerArray58);
        undertowEmbeddedServletContainerFactory53.builderCustomizers = undertowBuilderCustomizerList59;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection64 = undertowEmbeddedServletContainerFactory63.getBuilderCustomizers();
        java.lang.Integer int65 = undertowEmbeddedServletContainerFactory63.workerThreads;
        undertowEmbeddedServletContainerFactory63.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray68 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory63.addBuilderCustomizers(undertowBuilderCustomizerArray68);
        undertowEmbeddedServletContainerFactory53.addBuilderCustomizers(undertowBuilderCustomizerArray68);
        undertowEmbeddedServletContainerFactory44.addBuilderCustomizers(undertowBuilderCustomizerArray68);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray68);
        io.undertow.Undertow.Builder builder74 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (short) 100);
        java.io.File file75 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file75);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.io.File file79 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.Integer int80 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(resourceLoader13);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        org.junit.Assert.assertNotNull(deploymentManager39);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(errorPageSet51);
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection64);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray68);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(file79);
        org.junit.Assert.assertNull(int80);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo14 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("0.0.0.0");
        org.springframework.boot.context.embedded.Ssl ssl19 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl19);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customizers must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int21 = undertowEmbeddedServletContainerFactory20.ioThreads;
        org.springframework.boot.context.embedded.Compression compression22 = null;
        undertowEmbeddedServletContainerFactory20.setCompression(compression22);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int28 = undertowEmbeddedServletContainerFactory27.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray29);
        undertowEmbeddedServletContainerFactory20.addErrorPages(errorPageArray29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory33.workerThreads;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer37 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap36);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer39 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer41 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap40);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer37, initParameterConfiguringServletContextInitializer39, initParameterConfiguringServletContextInitializer41 };
        undertowEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray42);
        java.lang.Boolean boolean46 = undertowEmbeddedServletContainerFactory1.directBuffers;
        boolean boolean47 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(errorPageArray29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 100);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) '4');
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory10.ioThreads;
        java.lang.String str12 = undertowEmbeddedServletContainerFactory10.accessLogPattern;
        undertowEmbeddedServletContainerFactory10.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList16 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList16, undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory10.builderCustomizers = undertowBuilderCustomizerList16;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory20.workerThreads;
        undertowEmbeddedServletContainerFactory20.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        java.lang.Integer int32 = undertowEmbeddedServletContainerFactory30.workerThreads;
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer34 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer38 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap37);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer34, initParameterConfiguringServletContextInitializer36, initParameterConfiguringServletContextInitializer38 };
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory42.getBuilderCustomizers();
        java.lang.Integer int44 = undertowEmbeddedServletContainerFactory42.workerThreads;
        undertowEmbeddedServletContainerFactory42.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory42.setAccessLogDirectory(file47);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList49 = undertowEmbeddedServletContainerFactory42.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection52 = undertowEmbeddedServletContainerFactory51.getBuilderCustomizers();
        java.lang.Integer int53 = undertowEmbeddedServletContainerFactory51.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet54 = undertowEmbeddedServletContainerFactory51.getJspServlet();
        undertowEmbeddedServletContainerFactory42.setJspServlet(jspServlet54);
        undertowEmbeddedServletContainerFactory30.setJspServlet(jspServlet54);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet54);
        java.lang.Integer int58 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection59 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file60 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file60;
        java.lang.ClassLoader classLoader62 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList49);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection52);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(jspServlet54);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection59);
        org.junit.Assert.assertNotNull(classLoader62);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection13 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        java.lang.Integer int14 = undertowEmbeddedServletContainerFactory12.workerThreads;
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(false);
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory12.createBuilder(0);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder18, deploymentManager19, (int) (byte) 0);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        org.junit.Assert.assertNull(file24);
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList4 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList4, undertowBuilderCustomizerArray3);
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList4;
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.core.io.ResourceLoader resourceLoader9 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo10);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList16 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.directBuffers = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings21);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.configureMimeMappings(deploymentInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(resourceLoader9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList16);
        org.junit.Assert.assertNotNull(mimeMappings21);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setPort(10);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file8;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        undertowEmbeddedServletContainerFactory1.workerThreads = 52;
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file18);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNotNull(jspServlet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader6;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = null;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList10;
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file13;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.ioThreads = 1800;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jspServlet4);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory11.workerThreads;
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(false);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory11.getDisplayName();
        undertowEmbeddedServletContainerFactory11.setBufferSize((java.lang.Integer) 1);
        boolean boolean19 = undertowEmbeddedServletContainerFactory11.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory21.workerThreads;
        undertowEmbeddedServletContainerFactory21.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory21.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = false;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection32 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file33 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file33);
        java.net.InetAddress inetAddress35 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress35);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection32);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList7 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList7, undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList7;
        undertowEmbeddedServletContainerFactory1.ioThreads = (-1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory15.setDisplayName("hi!");
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory15.setAccessLogDirectory(file18);
        undertowEmbeddedServletContainerFactory15.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory23.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory27.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet30 = null;
        undertowEmbeddedServletContainerFactory27.setJspServlet(jspServlet30);
        java.net.InetAddress inetAddress32 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory35.getBuilderCustomizers();
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory35.workerThreads;
        undertowEmbeddedServletContainerFactory35.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file40 = null;
        undertowEmbeddedServletContainerFactory35.setAccessLogDirectory(file40);
        undertowEmbeddedServletContainerFactory35.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer45 = undertowEmbeddedServletContainerFactory35.getEmbeddedServletContainer(servletContextInitializerArray44);
        initializer33.initializers = servletContextInitializerArray44;
        io.undertow.servlet.api.DeploymentManager deploymentManager47 = undertowEmbeddedServletContainerFactory27.createDeploymentManager(servletContextInitializerArray44);
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray44);
        io.undertow.servlet.api.DeploymentManager deploymentManager49 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray44);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray44);
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file51;
        java.io.File file53 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inetAddress32);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        org.junit.Assert.assertNotNull(embeddedServletContainer45);
        org.junit.Assert.assertNotNull(deploymentManager47);
        org.junit.Assert.assertNotNull(deploymentManager49);
        org.junit.Assert.assertNull(file53);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.net.InetAddress inetAddress2 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = (-1);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.ErrorPage errorPage10 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage10 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader13;
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        java.lang.ClassLoader classLoader17 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        int int19 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        org.junit.Assert.assertNotNull(errorPageArray11);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory12.ioThreads;
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager15 = undertowEmbeddedServletContainerFactory12.getDocumentRootResourceManager();
        boolean boolean16 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo17 = null;
        undertowEmbeddedServletContainerFactory12.configureErrorPages(deploymentInfo17);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory22.ioThreads;
        java.lang.String str24 = undertowEmbeddedServletContainerFactory22.accessLogPattern;
        undertowEmbeddedServletContainerFactory22.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory28.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray30);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory36.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet39 = null;
        undertowEmbeddedServletContainerFactory36.setJspServlet(jspServlet39);
        org.springframework.core.io.ResourceLoader resourceLoader41 = null;
        undertowEmbeddedServletContainerFactory36.resourceLoader = resourceLoader41;
        int int43 = undertowEmbeddedServletContainerFactory36.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer46 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer48 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap47);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer50 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer52 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap51);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray53 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer46, initParameterConfiguringServletContextInitializer48, initParameterConfiguringServletContextInitializer50, initParameterConfiguringServletContextInitializer52 };
        initializer44.initializers = servletContextInitializerArray53;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = initializer44.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory57.getBuilderCustomizers();
        java.lang.Integer int59 = undertowEmbeddedServletContainerFactory57.workerThreads;
        undertowEmbeddedServletContainerFactory57.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file62 = null;
        undertowEmbeddedServletContainerFactory57.setAccessLogDirectory(file62);
        undertowEmbeddedServletContainerFactory57.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray66 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer67 = undertowEmbeddedServletContainerFactory57.getEmbeddedServletContainer(servletContextInitializerArray66);
        initializer44.initializers = servletContextInitializerArray66;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer69 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray66);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray66);
        java.io.File file71 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(resourceManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(servletContextInitializerArray53);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNotNull(servletContextInitializerArray66);
        org.junit.Assert.assertNotNull(embeddedServletContainer67);
        org.junit.Assert.assertNotNull(embeddedServletContainer69);
        org.junit.Assert.assertNull(file71);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory10.workerThreads;
        undertowEmbeddedServletContainerFactory10.setUseForwardHeaders(false);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        undertowEmbeddedServletContainerFactory10.setBufferSize((java.lang.Integer) 1);
        boolean boolean18 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        java.lang.Boolean boolean19 = undertowEmbeddedServletContainerFactory10.directBuffers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList20 = undertowEmbeddedServletContainerFactory10.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList20;
        java.net.InetAddress inetAddress22 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress22);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.io.File file27 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file33 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList20);
        org.junit.Assert.assertNotNull(errorPageSet24);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(ssl30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
        org.junit.Assert.assertNull(file33);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory12.ioThreads;
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager15 = undertowEmbeddedServletContainerFactory12.getDocumentRootResourceManager();
        boolean boolean16 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo17 = null;
        undertowEmbeddedServletContainerFactory12.configureErrorPages(deploymentInfo17);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory22.ioThreads;
        java.lang.String str24 = undertowEmbeddedServletContainerFactory22.accessLogPattern;
        undertowEmbeddedServletContainerFactory22.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory28.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray30);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray30);
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl35);
        undertowEmbeddedServletContainerFactory1.accessLogEnabled = true;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 32);
        java.lang.Integer int41 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(resourceManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertNull(int41);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "hi!";
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer16 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer22 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer16, initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20, initParameterConfiguringServletContextInitializer22 };
        initializer14.initializers = servletContextInitializerArray23;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray25 = initializer14.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        java.lang.Integer int29 = undertowEmbeddedServletContainerFactory27.workerThreads;
        undertowEmbeddedServletContainerFactory27.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory27.setAccessLogDirectory(file32);
        undertowEmbeddedServletContainerFactory27.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray36);
        initializer14.initializers = servletContextInitializerArray36;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = initializer14.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = initializer14.initializers;
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray40);
        org.springframework.boot.context.embedded.Ssl ssl42 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean43 = undertowEmbeddedServletContainerFactory1.useForwardHeaders;
        boolean boolean44 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(errorPageSet13);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        org.junit.Assert.assertNull(ssl42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory10.ioThreads;
        org.springframework.boot.context.embedded.Compression compression12 = null;
        undertowEmbeddedServletContainerFactory10.setCompression(compression12);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory10.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo15 = null;
        undertowEmbeddedServletContainerFactory10.configureErrorPages(deploymentInfo15);
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory10.setAddress(inetAddress17);
        java.lang.Integer int19 = undertowEmbeddedServletContainerFactory10.workerThreads;
        undertowEmbeddedServletContainerFactory10.setBufferSize((java.lang.Integer) 10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList22 = undertowEmbeddedServletContainerFactory10.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory10.ioThreads = 0;
        io.undertow.Undertow.Builder builder26 = undertowEmbeddedServletContainerFactory10.createBuilder(1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory28.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet31 = null;
        undertowEmbeddedServletContainerFactory28.setJspServlet(jspServlet31);
        java.net.InetAddress inetAddress33 = undertowEmbeddedServletContainerFactory28.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        java.lang.Integer int38 = undertowEmbeddedServletContainerFactory36.workerThreads;
        undertowEmbeddedServletContainerFactory36.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory36.setAccessLogDirectory(file41);
        undertowEmbeddedServletContainerFactory36.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray45 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer46 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray45);
        initializer34.initializers = servletContextInitializerArray45;
        io.undertow.servlet.api.DeploymentManager deploymentManager48 = undertowEmbeddedServletContainerFactory28.createDeploymentManager(servletContextInitializerArray45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer50 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder26, deploymentManager48, 10);
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file51;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.Integer int55 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.net.InetAddress inetAddress56 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file57;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(inetAddress33);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(servletContextInitializerArray45);
        org.junit.Assert.assertNotNull(embeddedServletContainer46);
        org.junit.Assert.assertNotNull(deploymentManager48);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer50);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(inetAddress56);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer11 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        java.lang.ClassLoader classLoader14 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader16;
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(embeddedServletContainer11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory8.ioThreads;
        org.springframework.boot.context.embedded.Compression compression10 = null;
        undertowEmbeddedServletContainerFactory8.setCompression(compression10);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory8.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo13 = null;
        undertowEmbeddedServletContainerFactory8.configureErrorPages(deploymentInfo13);
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory8.setAddress(inetAddress15);
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory8.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory8.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings18);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 10;
        org.springframework.boot.context.embedded.Compression compression22 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression22);
        boolean boolean24 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.Boolean boolean6 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        undertowEmbeddedServletContainerFactory1.workerThreads = 1800;
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0.0.0" + "'", str11, "0.0.0.0");
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory9.ioThreads;
        java.lang.String str11 = undertowEmbeddedServletContainerFactory9.accessLogPattern;
        undertowEmbeddedServletContainerFactory9.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList15 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList15, undertowBuilderCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.builderCustomizers = undertowBuilderCustomizerList15;
        undertowEmbeddedServletContainerFactory9.ioThreads = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory21.ioThreads;
        java.lang.String str23 = undertowEmbeddedServletContainerFactory21.accessLogPattern;
        undertowEmbeddedServletContainerFactory21.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList27 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList27, undertowBuilderCustomizerArray26);
        undertowEmbeddedServletContainerFactory21.builderCustomizers = undertowBuilderCustomizerList27;
        undertowEmbeddedServletContainerFactory21.ioThreads = (-1);
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory21.resourceLoader = resourceLoader32;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList35 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList35, undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory21.builderCustomizers = undertowBuilderCustomizerList35;
        undertowEmbeddedServletContainerFactory9.builderCustomizers = undertowBuilderCustomizerList35;
        undertowEmbeddedServletContainerFactory1.builderCustomizers = undertowBuilderCustomizerList35;
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        boolean boolean42 = undertowEmbeddedServletContainerFactory1.accessLogEnabled;
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.JspServlet jspServlet9 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jspServlet9);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList11 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        undertowEmbeddedServletContainerFactory1.workerThreads = 10;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file15);
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.jarPath = "0.0.0.0";
        jarResourceManager0.jarPath = "";
        boolean boolean7 = jarResourceManager0.isResourceChangeListenerSupported();
        boolean boolean8 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.jarPath = "";
        java.lang.String str11 = jarResourceManager0.jarPath;
        boolean boolean12 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        jarResourceManager0.close();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource16 = jarResourceManager0.getResource("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.bufferSize = 100;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 52);
        java.lang.ClassLoader classLoader14 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory1.createBuilder(52);
        java.lang.ClassLoader classLoader19 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection20 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection20);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.io.File file4 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression5 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression5);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.core.io.ResourceLoader resourceLoader11 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0.0.0" + "'", str7, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(resourceLoader11);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader7;
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 0);
        org.xnio.XnioWorker xnioWorker11 = undertowEmbeddedServletContainerFactory1.createWorker();
        io.undertow.Undertow.Builder builder13 = undertowEmbeddedServletContainerFactory1.createBuilder((int) (byte) 0);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xnioWorker11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker6 = undertowEmbeddedServletContainerFactory1.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.lang.Boolean boolean11 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.ioThreads = 1;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo11 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo11);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1800;
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 52;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo20 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo20);
        java.lang.Class<?> wildcardClass22 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory15.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory15.resourceLoader = resourceLoader18;
        org.springframework.core.io.ResourceLoader resourceLoader20 = undertowEmbeddedServletContainerFactory15.resourceLoader;
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        undertowEmbeddedServletContainerFactory15.resourceLoader = resourceLoader21;
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory15.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        java.lang.Integer int27 = undertowEmbeddedServletContainerFactory25.workerThreads;
        undertowEmbeddedServletContainerFactory25.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory25.setAccessLogDirectory(file30);
        undertowEmbeddedServletContainerFactory25.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray34 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer35 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray34);
        io.undertow.servlet.api.DeploymentManager deploymentManager36 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray34);
        io.undertow.servlet.api.DeploymentManager deploymentManager37 = undertowEmbeddedServletContainerFactory1.createDeploymentManager(servletContextInitializerArray34);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file38;
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        io.undertow.servlet.api.DeploymentInfo deploymentInfo42 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo42);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(jspServlet11);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(resourceLoader20);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(servletContextInitializerArray34);
        org.junit.Assert.assertNotNull(embeddedServletContainer35);
        org.junit.Assert.assertNotNull(deploymentManager36);
        org.junit.Assert.assertNotNull(deploymentManager37);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.lang.ClassLoader classLoader18 = undertowEmbeddedServletContainerFactory1.getServletClassLoader();
        org.springframework.boot.context.embedded.Ssl ssl19 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl19);
        java.lang.Boolean boolean21 = undertowEmbeddedServletContainerFactory1.directBuffers;
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file22);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + true + "'", boolean21, true);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader2);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory1.bufferSize;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList7 = undertowEmbeddedServletContainerFactory1.builderCustomizers;
        org.springframework.boot.context.embedded.Ssl ssl8 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader9 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory11.ioThreads;
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory11.setCompression(compression13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        java.lang.Boolean boolean16 = undertowEmbeddedServletContainerFactory11.directBuffers;
        undertowEmbeddedServletContainerFactory11.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory20.workerThreads;
        org.springframework.core.io.ResourceLoader resourceLoader23 = null;
        undertowEmbeddedServletContainerFactory20.resourceLoader = resourceLoader23;
        org.springframework.core.io.ResourceLoader resourceLoader25 = undertowEmbeddedServletContainerFactory20.resourceLoader;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer28 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer30 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer32 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer34 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap33);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer28, initParameterConfiguringServletContextInitializer30, initParameterConfiguringServletContextInitializer32, initParameterConfiguringServletContextInitializer34 };
        initializer26.initializers = servletContextInitializerArray35;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = initializer26.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection40 = undertowEmbeddedServletContainerFactory39.getBuilderCustomizers();
        java.lang.Integer int41 = undertowEmbeddedServletContainerFactory39.workerThreads;
        undertowEmbeddedServletContainerFactory39.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory39.setAccessLogDirectory(file44);
        undertowEmbeddedServletContainerFactory39.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer49 = undertowEmbeddedServletContainerFactory39.getEmbeddedServletContainer(servletContextInitializerArray48);
        initializer26.initializers = servletContextInitializerArray48;
        io.undertow.servlet.api.DeploymentManager deploymentManager51 = undertowEmbeddedServletContainerFactory20.createDeploymentManager(servletContextInitializerArray48);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer52 = undertowEmbeddedServletContainerFactory11.getEmbeddedServletContainer(servletContextInitializerArray48);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer53 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray48);
        undertowEmbeddedServletContainerFactory1.workerThreads = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory57.getBuilderCustomizers();
        java.lang.Integer int59 = undertowEmbeddedServletContainerFactory57.workerThreads;
        undertowEmbeddedServletContainerFactory57.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file62 = null;
        undertowEmbeddedServletContainerFactory57.setAccessLogDirectory(file62);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList64 = undertowEmbeddedServletContainerFactory57.deploymentInfoCustomizers;
        boolean boolean65 = undertowEmbeddedServletContainerFactory57.accessLogEnabled;
        undertowEmbeddedServletContainerFactory57.setUseForwardHeaders(true);
        java.lang.Integer int68 = undertowEmbeddedServletContainerFactory57.bufferSize;
        undertowEmbeddedServletContainerFactory57.accessLogPattern = "";
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList71 = undertowEmbeddedServletContainerFactory57.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList71;
        io.undertow.Undertow.Builder builder74 = undertowEmbeddedServletContainerFactory1.createBuilder(32);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList7);
        org.junit.Assert.assertNull(ssl8);
        org.junit.Assert.assertNull(resourceLoader9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(resourceLoader25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(embeddedServletContainer49);
        org.junit.Assert.assertNotNull(deploymentManager51);
        org.junit.Assert.assertNotNull(embeddedServletContainer52);
        org.junit.Assert.assertNotNull(embeddedServletContainer53);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList71);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        int int8 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1800 + "'", int8 == 1800);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        io.undertow.server.handlers.resource.ResourceManager resourceManager10 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file11);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo15 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo15);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Compression compression18 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression18);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(resourceManager10);
        org.junit.Assert.assertNotNull(errorPageSet17);
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.jarPath = "hi!";
        boolean boolean3 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        java.lang.String str5 = jarResourceManager0.jarPath;
        boolean boolean6 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        java.lang.String str8 = jarResourceManager0.jarPath;
        jarResourceManager0.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file7;
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory11.ioThreads;
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory11.setCompression(compression13);
        int int15 = undertowEmbeddedServletContainerFactory11.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker16 = undertowEmbeddedServletContainerFactory11.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory11.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory11.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection22 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int23 = undertowEmbeddedServletContainerFactory21.workerThreads;
        undertowEmbeddedServletContainerFactory21.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int28 = undertowEmbeddedServletContainerFactory27.ioThreads;
        org.springframework.boot.context.embedded.Compression compression29 = null;
        undertowEmbeddedServletContainerFactory27.setCompression(compression29);
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(true);
        java.lang.Integer int33 = undertowEmbeddedServletContainerFactory27.bufferSize;
        org.springframework.boot.context.embedded.JspServlet jspServlet34 = undertowEmbeddedServletContainerFactory27.getJspServlet();
        undertowEmbeddedServletContainerFactory21.setJspServlet(jspServlet34);
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file36);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList38 = undertowEmbeddedServletContainerFactory21.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory11.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList38;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList38;
        java.net.InetAddress inetAddress41 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.bufferSize = 52;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo44 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo44);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0.0.0" + "'", str9, "0.0.0.0");
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1800 + "'", int15 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNotNull(jspServlet34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList38);
        org.junit.Assert.assertNull(inetAddress41);
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("0.0.0.0");
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getListenAddress();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0.0.0" + "'", str10, "0.0.0.0");
        org.junit.Assert.assertNull(ssl13);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo6 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory1.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings11 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.workerThreads;
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory1.createBuilder(97);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(mimeMappings11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 100);
        org.xnio.XnioWorker xnioWorker3 = undertowEmbeddedServletContainerFactory2.createWorker();
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = undertowEmbeddedServletContainerFactory2.getJspServlet();
        org.junit.Assert.assertNotNull(xnioWorker3);
        org.junit.Assert.assertNotNull(jspServlet4);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList2 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory6.getBuilderCustomizers();
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory6.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet9 = undertowEmbeddedServletContainerFactory6.getJspServlet();
        undertowEmbeddedServletContainerFactory4.setJspServlet(jspServlet9);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet9);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.ioThreads = 10;
        org.xnio.XnioWorker xnioWorker15 = undertowEmbeddedServletContainerFactory1.createWorker();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(jspServlet9);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(xnioWorker15);
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList8 = undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers;
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        io.undertow.server.handlers.resource.ResourceManager resourceManager19 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList8);
        org.junit.Assert.assertNotNull(resourceManager19);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer5 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer7 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer9 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap8);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer5, initParameterConfiguringServletContextInitializer7, initParameterConfiguringServletContextInitializer9 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.lang.Integer int15 = undertowEmbeddedServletContainerFactory13.workerThreads;
        undertowEmbeddedServletContainerFactory13.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory13.setAccessLogDirectory(file18);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList20 = undertowEmbeddedServletContainerFactory13.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        java.lang.Integer int24 = undertowEmbeddedServletContainerFactory22.buffersPerRegion;
        org.springframework.boot.context.embedded.JspServlet jspServlet25 = undertowEmbeddedServletContainerFactory22.getJspServlet();
        undertowEmbeddedServletContainerFactory13.setJspServlet(jspServlet25);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet25);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("0.0.0.0");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(jspServlet25);
        org.junit.Assert.assertNull(inetAddress28);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet4);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader6;
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.ioThreads = 100;
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1800;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray13 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList14, undertowDeploymentInfoCustomizerArray13);
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList14;
        org.xnio.XnioWorker xnioWorker17 = undertowEmbeddedServletContainerFactory1.createWorker();
        undertowEmbeddedServletContainerFactory1.directBuffers = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(xnioWorker17);
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 100;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory9.ioThreads;
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory9.setCompression(compression11);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory9.getDeploymentInfoCustomizers();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo14 = null;
        undertowEmbeddedServletContainerFactory9.configureErrorPages(deploymentInfo14);
        java.net.InetAddress inetAddress16 = null;
        undertowEmbeddedServletContainerFactory9.setAddress(inetAddress16);
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory9.workerThreads;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings19 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.ioThreads = 0;
        java.net.InetAddress inetAddress24 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress24);
        java.net.InetAddress inetAddress26 = undertowEmbeddedServletContainerFactory1.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.KeyManager[] keyManagerArray27 = undertowEmbeddedServletContainerFactory1.getKeyManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(mimeMappings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inetAddress26);
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo8 = null;
        undertowEmbeddedServletContainerFactory1.configureErrorPages(deploymentInfo8);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = true;
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.core.io.ResourceLoader resourceLoader16 = undertowEmbeddedServletContainerFactory1.resourceLoader;
        int int17 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(resourceLoader16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1800 + "'", int17 == 1800);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory1.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.useForwardHeaders = true;
        org.springframework.boot.context.embedded.ErrorPage errorPage17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage18 = undertowEmbeddedServletContainerFactory1.getUndertowErrorPage(errorPage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mimeMappings8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager4 = undertowEmbeddedServletContainerFactory1.getDocumentRootResourceManager();
        java.lang.Integer int5 = undertowEmbeddedServletContainerFactory1.bufferSize;
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader9;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(resourceManager4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.workerThreads;
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file6);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.accessLogDirectory;
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.accessLogPattern = "0.0.0.0";
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader20 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader20);
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        org.xnio.XnioWorker xnioWorker23 = undertowEmbeddedServletContainerFactory1.createWorker();
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory1.accessLogDirectory = file24;
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.lang.String str28 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(xnioWorker23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.accessLogPattern;
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.workerThreads = 1800;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.Integer int3 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader6;
        undertowEmbeddedServletContainerFactory1.bufferSize = 0;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList10 = null;
        undertowEmbeddedServletContainerFactory1.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList10;
        java.lang.Integer int12 = undertowEmbeddedServletContainerFactory1.buffersPerRegion;
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.net.InetAddress inetAddress14 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress14);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.TrustManager[] trustManagerArray16 = undertowEmbeddedServletContainerFactory1.getTrustManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NullPointerException");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.jarPath = "0.0.0.0";
        java.lang.String str3 = jarResourceManager0.jarPath;
        boolean boolean4 = jarResourceManager0.isResourceChangeListenerSupported();
        java.lang.String str5 = jarResourceManager0.jarPath;
        jarResourceManager0.jarPath = "hi!";
        jarResourceManager0.jarPath = "0.0.0.0";
        java.lang.String str10 = jarResourceManager0.jarPath;
        java.lang.String str11 = jarResourceManager0.jarPath;
        java.lang.String str12 = jarResourceManager0.jarPath;
        jarResourceManager0.jarPath = "";
        io.undertow.server.handlers.resource.ResourceChangeListener resourceChangeListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarResourceManager0.removeResourceChangeListener(resourceChangeListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000073: Resource change listeners are not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.0" + "'", str3, "0.0.0.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0.0.0" + "'", str5, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0.0.0" + "'", str10, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0.0.0" + "'", str11, "0.0.0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0.0.0" + "'", str12, "0.0.0.0");
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int2 = undertowEmbeddedServletContainerFactory1.ioThreads;
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory10.setResourceLoader(resourceLoader11);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory10.createBuilder((int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory16.ioThreads;
        org.springframework.boot.context.embedded.Compression compression18 = null;
        undertowEmbeddedServletContainerFactory16.setCompression(compression18);
        int int20 = undertowEmbeddedServletContainerFactory16.getSessionTimeout();
        org.xnio.XnioWorker xnioWorker21 = undertowEmbeddedServletContainerFactory16.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList22 = undertowEmbeddedServletContainerFactory16.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory16.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection27 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        java.lang.Integer int28 = undertowEmbeddedServletContainerFactory26.workerThreads;
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory26.setDocumentRoot(file29);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        java.lang.Integer int35 = undertowEmbeddedServletContainerFactory33.workerThreads;
        undertowEmbeddedServletContainerFactory33.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory33.setAccessLogDirectory(file38);
        undertowEmbeddedServletContainerFactory33.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer43 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray42);
        io.undertow.servlet.api.DeploymentManager deploymentManager45 = undertowEmbeddedServletContainerFactory16.createDeploymentManager(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer47 = undertowEmbeddedServletContainerFactory1.getUndertowEmbeddedServletContainer(builder14, deploymentManager45, (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int50 = undertowEmbeddedServletContainerFactory49.ioThreads;
        java.lang.String str51 = undertowEmbeddedServletContainerFactory49.accessLogPattern;
        io.undertow.server.handlers.resource.ResourceManager resourceManager52 = undertowEmbeddedServletContainerFactory49.getDocumentRootResourceManager();
        boolean boolean53 = undertowEmbeddedServletContainerFactory49.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo54 = null;
        undertowEmbeddedServletContainerFactory49.configureErrorPages(deploymentInfo54);
        undertowEmbeddedServletContainerFactory49.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int60 = undertowEmbeddedServletContainerFactory59.ioThreads;
        java.lang.String str61 = undertowEmbeddedServletContainerFactory59.accessLogPattern;
        undertowEmbeddedServletContainerFactory59.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        java.lang.Integer int66 = undertowEmbeddedServletContainerFactory65.ioThreads;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray67 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory65.addErrorPages(errorPageArray67);
        undertowEmbeddedServletContainerFactory59.addErrorPages(errorPageArray67);
        undertowEmbeddedServletContainerFactory49.addErrorPages(errorPageArray67);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray67);
        boolean boolean72 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl73 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression74 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1800 + "'", int20 == 1800);
        org.junit.Assert.assertNotNull(xnioWorker21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList22);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection31);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        org.junit.Assert.assertNotNull(embeddedServletContainer43);
        org.junit.Assert.assertNotNull(deploymentManager45);
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer47);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(resourceManager52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNotNull(errorPageArray67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(ssl73);
        org.junit.Assert.assertNull(compression74);
    }
}

