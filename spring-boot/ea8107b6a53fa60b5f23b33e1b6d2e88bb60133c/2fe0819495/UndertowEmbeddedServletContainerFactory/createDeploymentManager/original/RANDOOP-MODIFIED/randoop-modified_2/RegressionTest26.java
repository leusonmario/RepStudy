import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory11.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory11.setResourceLoader(resourceLoader14);
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory11.setResourceLoader(resourceLoader16);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory11.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        undertowEmbeddedServletContainerFactory20.setPort((int) (short) 10);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file23);
        undertowEmbeddedServletContainerFactory20.setBufferSize((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30, errorPageArray29);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet30);
        java.net.InetAddress inetAddress33 = undertowEmbeddedServletContainerFactory28.getAddress();
        java.net.InetAddress inetAddress34 = null;
        undertowEmbeddedServletContainerFactory28.setAddress(inetAddress34);
        int int36 = undertowEmbeddedServletContainerFactory28.getSessionTimeout();
        undertowEmbeddedServletContainerFactory28.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str39 = undertowEmbeddedServletContainerFactory28.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader41 = null;
        undertowEmbeddedServletContainerFactory40.setResourceLoader(resourceLoader41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean45 = undertowEmbeddedServletContainerFactory44.isRegisterDefaultServlet();
        java.lang.String str46 = undertowEmbeddedServletContainerFactory44.getContextPath();
        undertowEmbeddedServletContainerFactory44.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory50.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray53 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer54 = undertowEmbeddedServletContainerFactory50.getEmbeddedServletContainer(servletContextInitializerArray53);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory44.getEmbeddedServletContainer(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray53);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer58 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray53);
        java.io.File file61 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file61);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        java.net.InetAddress inetAddress65 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress65);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(inetAddress18);
        org.junit.Assert.assertNotNull(errorPageArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inetAddress33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1800 + "'", int36 == 1800);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray53);
        org.junit.Assert.assertNotNull(embeddedServletContainer54);
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
        org.junit.Assert.assertNotNull(embeddedServletContainer58);
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        undertowEmbeddedServletContainerFactory4.setMimeMappings(mimeMappings7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        undertowEmbeddedServletContainerFactory10.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isRegisterDefaultServlet();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory15.getContextPath();
        undertowEmbeddedServletContainerFactory15.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setPort((int) (byte) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = undertowEmbeddedServletContainerFactory27.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection29 = undertowEmbeddedServletContainerFactory27.getDeploymentInfoCustomizers();
        boolean boolean30 = undertowEmbeddedServletContainerFactory27.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet33 = undertowEmbeddedServletContainerFactory32.getErrorPages();
        undertowEmbeddedServletContainerFactory32.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory32.setPort(0);
        java.net.InetAddress inetAddress38 = undertowEmbeddedServletContainerFactory32.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = undertowEmbeddedServletContainerFactory40.getErrorPages();
        java.io.File file42 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray45 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46, errorPageArray45);
        undertowEmbeddedServletContainerFactory44.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46);
        java.net.InetAddress inetAddress49 = undertowEmbeddedServletContainerFactory44.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray52 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet53 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet53, errorPageArray52);
        undertowEmbeddedServletContainerFactory51.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet53);
        java.net.InetAddress inetAddress56 = undertowEmbeddedServletContainerFactory51.getAddress();
        java.net.InetAddress inetAddress57 = null;
        undertowEmbeddedServletContainerFactory51.setAddress(inetAddress57);
        int int59 = undertowEmbeddedServletContainerFactory51.getSessionTimeout();
        undertowEmbeddedServletContainerFactory51.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str62 = undertowEmbeddedServletContainerFactory51.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader64 = null;
        undertowEmbeddedServletContainerFactory63.setResourceLoader(resourceLoader64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean68 = undertowEmbeddedServletContainerFactory67.isRegisterDefaultServlet();
        java.lang.String str69 = undertowEmbeddedServletContainerFactory67.getContextPath();
        undertowEmbeddedServletContainerFactory67.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory73.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray76 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer77 = undertowEmbeddedServletContainerFactory73.getEmbeddedServletContainer(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer78 = undertowEmbeddedServletContainerFactory67.getEmbeddedServletContainer(servletContextInitializerArray76);
        undertowEmbeddedServletContainerFactory63.addInitializers(servletContextInitializerArray76);
        undertowEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer81 = undertowEmbeddedServletContainerFactory44.getEmbeddedServletContainer(servletContextInitializerArray76);
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer83 = undertowEmbeddedServletContainerFactory32.getEmbeddedServletContainer(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray76);
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer86 = undertowEmbeddedServletContainerFactory10.getEmbeddedServletContainer(servletContextInitializerArray76);
        undertowEmbeddedServletContainerFactory4.addInitializers(servletContextInitializerArray76);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer88 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray76);
        org.springframework.core.io.ResourceLoader resourceLoader89 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader89);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ErrorPages must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorPageSet28);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorPageSet33);
        org.junit.Assert.assertNull(inetAddress38);
        org.junit.Assert.assertNotNull(errorPageSet41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(errorPageArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inetAddress49);
        org.junit.Assert.assertNotNull(errorPageArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inetAddress56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1800 + "'", int59 == 1800);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray76);
        org.junit.Assert.assertNotNull(embeddedServletContainer77);
        org.junit.Assert.assertNotNull(embeddedServletContainer78);
        org.junit.Assert.assertNotNull(embeddedServletContainer81);
        org.junit.Assert.assertNotNull(embeddedServletContainer83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(embeddedServletContainer86);
        org.junit.Assert.assertNotNull(embeddedServletContainer88);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer5 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer7 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap6);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer5, initParameterConfiguringServletContextInitializer7 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader12);
        java.net.InetAddress inetAddress14 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress14);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(ssl10);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(mimeMappings18);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        undertowEmbeddedServletContainerFactory2.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        boolean boolean14 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        boolean boolean15 = undertowEmbeddedServletContainerFactory2.isRegisterJspServlet();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet16);
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean22 = undertowEmbeddedServletContainerFactory21.isRegisterDefaultServlet();
        java.lang.String str23 = undertowEmbeddedServletContainerFactory21.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        undertowEmbeddedServletContainerFactory21.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        undertowEmbeddedServletContainerFactory21.setContextPath("");
        org.springframework.boot.context.embedded.Ssl ssl33 = undertowEmbeddedServletContainerFactory21.getSsl();
        undertowEmbeddedServletContainerFactory21.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray38 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet39 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet39, errorPageArray38);
        undertowEmbeddedServletContainerFactory37.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet39);
        java.net.InetAddress inetAddress42 = undertowEmbeddedServletContainerFactory37.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray45 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46, errorPageArray45);
        undertowEmbeddedServletContainerFactory44.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46);
        java.net.InetAddress inetAddress49 = undertowEmbeddedServletContainerFactory44.getAddress();
        java.net.InetAddress inetAddress50 = null;
        undertowEmbeddedServletContainerFactory44.setAddress(inetAddress50);
        int int52 = undertowEmbeddedServletContainerFactory44.getSessionTimeout();
        undertowEmbeddedServletContainerFactory44.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str55 = undertowEmbeddedServletContainerFactory44.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader57 = null;
        undertowEmbeddedServletContainerFactory56.setResourceLoader(resourceLoader57);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean61 = undertowEmbeddedServletContainerFactory60.isRegisterDefaultServlet();
        java.lang.String str62 = undertowEmbeddedServletContainerFactory60.getContextPath();
        undertowEmbeddedServletContainerFactory60.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory66.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray69 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer70 = undertowEmbeddedServletContainerFactory66.getEmbeddedServletContainer(servletContextInitializerArray69);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer71 = undertowEmbeddedServletContainerFactory60.getEmbeddedServletContainer(servletContextInitializerArray69);
        undertowEmbeddedServletContainerFactory56.addInitializers(servletContextInitializerArray69);
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray69);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer74 = undertowEmbeddedServletContainerFactory37.getEmbeddedServletContainer(servletContextInitializerArray69);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet75 = undertowEmbeddedServletContainerFactory37.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader76 = null;
        undertowEmbeddedServletContainerFactory37.setResourceLoader(resourceLoader76);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray78 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer79 = undertowEmbeddedServletContainerFactory37.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer80 = undertowEmbeddedServletContainerFactory21.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer81 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(ssl33);
        org.junit.Assert.assertNotNull(errorPageArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inetAddress42);
        org.junit.Assert.assertNotNull(errorPageArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inetAddress49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1800 + "'", int52 == 1800);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray69);
        org.junit.Assert.assertNotNull(embeddedServletContainer70);
        org.junit.Assert.assertNotNull(embeddedServletContainer71);
        org.junit.Assert.assertNotNull(embeddedServletContainer74);
        org.junit.Assert.assertNotNull(errorPageSet75);
        org.junit.Assert.assertNotNull(servletContextInitializerArray78);
        org.junit.Assert.assertNotNull(embeddedServletContainer79);
        org.junit.Assert.assertNotNull(embeddedServletContainer80);
        org.junit.Assert.assertNotNull(embeddedServletContainer81);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress22 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress22);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertNotNull(errorPageSet19);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '4');
        org.springframework.boot.context.embedded.Ssl ssl2 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNull(ssl2);
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader1 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet5 = undertowEmbeddedServletContainerFactory4.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory4.getDeploymentInfoCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory4.setDocumentRoot(file7);
        undertowEmbeddedServletContainerFactory4.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory4.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet11);
        undertowEmbeddedServletContainerFactory0.setIoThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory0.setBuffersPerRegion((java.lang.Integer) 100);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader17);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file20);
        org.junit.Assert.assertNotNull(errorPageSet5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNotNull(errorPageSet19);
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20, errorPageArray19);
        undertowEmbeddedServletContainerFactory18.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        java.net.InetAddress inetAddress23 = undertowEmbeddedServletContainerFactory18.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory25.getAddress();
        undertowEmbeddedServletContainerFactory25.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer33 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer33 };
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file38);
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray44 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet45 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45, errorPageArray44);
        undertowEmbeddedServletContainerFactory43.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45);
        java.net.InetAddress inetAddress48 = undertowEmbeddedServletContainerFactory43.getAddress();
        java.net.InetAddress inetAddress49 = null;
        undertowEmbeddedServletContainerFactory43.setAddress(inetAddress49);
        org.springframework.boot.context.embedded.Ssl ssl51 = undertowEmbeddedServletContainerFactory43.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection52 = undertowEmbeddedServletContainerFactory43.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader54 = null;
        undertowEmbeddedServletContainerFactory53.setResourceLoader(resourceLoader54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet58 = undertowEmbeddedServletContainerFactory57.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection59 = undertowEmbeddedServletContainerFactory57.getDeploymentInfoCustomizers();
        java.io.File file60 = null;
        undertowEmbeddedServletContainerFactory57.setDocumentRoot(file60);
        undertowEmbeddedServletContainerFactory57.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = undertowEmbeddedServletContainerFactory57.getErrorPages();
        undertowEmbeddedServletContainerFactory53.setErrorPages(errorPageSet64);
        undertowEmbeddedServletContainerFactory53.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings68 = undertowEmbeddedServletContainerFactory53.getMimeMappings();
        undertowEmbeddedServletContainerFactory53.setSessionTimeout(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory71.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory71.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory77 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray78 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet79 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet79, errorPageArray78);
        undertowEmbeddedServletContainerFactory77.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet79);
        undertowEmbeddedServletContainerFactory71.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet79);
        boolean boolean83 = undertowEmbeddedServletContainerFactory71.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray84 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory71.addErrorPages(errorPageArray84);
        undertowEmbeddedServletContainerFactory53.addErrorPages(errorPageArray84);
        undertowEmbeddedServletContainerFactory43.addErrorPages(errorPageArray84);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray84);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inetAddress23);
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inetAddress30);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray34);
        org.junit.Assert.assertNotNull(errorPageArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inetAddress48);
        org.junit.Assert.assertNull(ssl51);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection52);
        org.junit.Assert.assertNotNull(errorPageSet58);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection59);
        org.junit.Assert.assertNotNull(errorPageSet64);
        org.junit.Assert.assertNotNull(mimeMappings68);
        org.junit.Assert.assertNotNull(errorPageArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(errorPageArray84);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader1 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isRegisterDefaultServlet();
        java.lang.String str6 = undertowEmbeddedServletContainerFactory4.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        undertowEmbeddedServletContainerFactory4.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        undertowEmbeddedServletContainerFactory4.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer21 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory4.addInitializers(servletContextInitializerArray20);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer23 = undertowEmbeddedServletContainerFactory0.getEmbeddedServletContainer(servletContextInitializerArray20);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        org.springframework.boot.context.embedded.Ssl ssl25 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl25);
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1800);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        org.junit.Assert.assertNotNull(embeddedServletContainer21);
        org.junit.Assert.assertNotNull(embeddedServletContainer23);
        org.junit.Assert.assertNotNull(errorPageSet24);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) -1);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader4);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory2.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mimeMappings3);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(35);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory6.setWorkerThreads((java.lang.Integer) 8080);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        undertowEmbeddedServletContainerFactory10.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory10.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory17.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader20 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader20);
        org.springframework.core.io.ResourceLoader resourceLoader22 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader22);
        undertowEmbeddedServletContainerFactory17.setBufferSize((java.lang.Integer) 100);
        org.springframework.core.io.ResourceLoader resourceLoader26 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory30.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory30.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings35 = undertowEmbeddedServletContainerFactory30.getMimeMappings();
        java.net.InetAddress inetAddress36 = null;
        undertowEmbeddedServletContainerFactory30.setAddress(inetAddress36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        java.net.InetAddress inetAddress44 = undertowEmbeddedServletContainerFactory39.getAddress();
        java.net.InetAddress inetAddress45 = null;
        undertowEmbeddedServletContainerFactory39.setAddress(inetAddress45);
        boolean boolean47 = undertowEmbeddedServletContainerFactory39.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl48 = undertowEmbeddedServletContainerFactory39.getSsl();
        undertowEmbeddedServletContainerFactory39.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray51 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet52 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52, errorPageArray51);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        undertowEmbeddedServletContainerFactory30.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory57.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory57.getEmbeddedServletContainer(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer62 = undertowEmbeddedServletContainerFactory30.getEmbeddedServletContainer(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer64 = undertowEmbeddedServletContainerFactory10.getEmbeddedServletContainer(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer65 = undertowEmbeddedServletContainerFactory6.getEmbeddedServletContainer(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray60);
        java.net.InetAddress inetAddress67 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress67);
        org.junit.Assert.assertNull(ssl4);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNotNull(mimeMappings35);
        org.junit.Assert.assertNotNull(errorPageArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inetAddress44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(ssl48);
        org.junit.Assert.assertNotNull(errorPageArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        org.junit.Assert.assertNotNull(embeddedServletContainer62);
        org.junit.Assert.assertNotNull(embeddedServletContainer64);
        org.junit.Assert.assertNotNull(embeddedServletContainer65);
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer5 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory7.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file10);
        undertowEmbeddedServletContainerFactory7.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory7.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        int int25 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(embeddedServletContainer5);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertNotNull(mimeMappings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1800 + "'", int25 == 1800);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(100);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory11.setSsl(ssl12);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory11.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory16.setAddress(inetAddress17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        undertowEmbeddedServletContainerFactory16.setErrorPages(errorPageSet21);
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (short) 10);
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory25.setDocumentRoot(file28);
        undertowEmbeddedServletContainerFactory25.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean34 = undertowEmbeddedServletContainerFactory33.isRegisterDefaultServlet();
        java.lang.String str35 = undertowEmbeddedServletContainerFactory33.getContextPath();
        undertowEmbeddedServletContainerFactory33.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray42 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer43 = undertowEmbeddedServletContainerFactory39.getEmbeddedServletContainer(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer44 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray42);
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer46 = undertowEmbeddedServletContainerFactory11.getEmbeddedServletContainer(servletContextInitializerArray42);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer47 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray42);
        boolean boolean48 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(errorPageSet21);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray42);
        org.junit.Assert.assertNotNull(embeddedServletContainer43);
        org.junit.Assert.assertNotNull(embeddedServletContainer44);
        org.junit.Assert.assertNotNull(embeddedServletContainer46);
        org.junit.Assert.assertNotNull(embeddedServletContainer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPort(1);
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file16 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        int int7 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings10 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1800 + "'", int7 == 1800);
        org.junit.Assert.assertNotNull(mimeMappings10);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory6.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory10.getDeploymentInfoCustomizers();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory10.setDocumentRoot(file13);
        undertowEmbeddedServletContainerFactory10.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        undertowEmbeddedServletContainerFactory6.setErrorPages(errorPageSet17);
        undertowEmbeddedServletContainerFactory6.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        undertowEmbeddedServletContainerFactory6.setSessionTimeout(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory24.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory24.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32, errorPageArray31);
        undertowEmbeddedServletContainerFactory30.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        undertowEmbeddedServletContainerFactory24.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        boolean boolean36 = undertowEmbeddedServletContainerFactory24.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory24.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray37);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        int int44 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file47 = undertowEmbeddedServletContainerFactory46.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection48 = undertowEmbeddedServletContainerFactory46.getDeploymentInfoCustomizers();
        boolean boolean49 = undertowEmbeddedServletContainerFactory46.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory46.setRegisterDefaultServlet(false);
        int int52 = undertowEmbeddedServletContainerFactory46.getSessionTimeout();
        java.io.File file53 = undertowEmbeddedServletContainerFactory46.getDocumentRoot();
        java.net.InetAddress inetAddress54 = null;
        undertowEmbeddedServletContainerFactory46.setAddress(inetAddress54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray58 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet59 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet59, errorPageArray58);
        undertowEmbeddedServletContainerFactory57.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet59);
        java.net.InetAddress inetAddress62 = undertowEmbeddedServletContainerFactory57.getAddress();
        boolean boolean63 = undertowEmbeddedServletContainerFactory57.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory65.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection67 = undertowEmbeddedServletContainerFactory65.getDeploymentInfoCustomizers();
        java.io.File file68 = null;
        undertowEmbeddedServletContainerFactory65.setDocumentRoot(file68);
        undertowEmbeddedServletContainerFactory65.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory65.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory65.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage76 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray77 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage76 };
        undertowEmbeddedServletContainerFactory65.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory57.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory46.setDirectBuffers((java.lang.Boolean) false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection83 = undertowEmbeddedServletContainerFactory46.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray86 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet87 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet87, errorPageArray86);
        undertowEmbeddedServletContainerFactory85.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet87);
        java.net.InetAddress inetAddress90 = undertowEmbeddedServletContainerFactory85.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer91 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray92 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer91 };
        undertowEmbeddedServletContainerFactory85.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray92);
        undertowEmbeddedServletContainerFactory46.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray92);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray92);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet96 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNotNull(errorPageSet17);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(errorPageArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1800 + "'", int44 == 1800);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1800 + "'", int52 == 1800);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNotNull(errorPageArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inetAddress62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(errorPageSet66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection67);
        org.junit.Assert.assertNotNull(errorPageArray77);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection83);
        org.junit.Assert.assertNotNull(errorPageArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(inetAddress90);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray92);
        org.junit.Assert.assertNotNull(errorPageSet96);
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray16 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer15 };
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray16);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray16);
        int int19 = undertowEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress20 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        java.net.InetAddress inetAddress23 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean27 = undertowEmbeddedServletContainerFactory26.isRegisterDefaultServlet();
        java.lang.String str28 = undertowEmbeddedServletContainerFactory26.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32, errorPageArray31);
        undertowEmbeddedServletContainerFactory30.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        undertowEmbeddedServletContainerFactory26.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        undertowEmbeddedServletContainerFactory26.setContextPath("");
        org.springframework.boot.context.embedded.Ssl ssl38 = undertowEmbeddedServletContainerFactory26.getSsl();
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 8080);
        undertowEmbeddedServletContainerFactory26.setPort((int) (byte) 10);
        undertowEmbeddedServletContainerFactory26.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        boolean boolean47 = undertowEmbeddedServletContainerFactory46.isRegisterDefaultServlet();
        int int48 = undertowEmbeddedServletContainerFactory46.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean51 = undertowEmbeddedServletContainerFactory50.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory50.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl54 = undertowEmbeddedServletContainerFactory50.getSsl();
        java.net.InetAddress inetAddress55 = null;
        undertowEmbeddedServletContainerFactory50.setAddress(inetAddress55);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean59 = undertowEmbeddedServletContainerFactory58.isRegisterDefaultServlet();
        java.lang.String str60 = undertowEmbeddedServletContainerFactory58.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray63 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet64, errorPageArray63);
        undertowEmbeddedServletContainerFactory62.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet64);
        undertowEmbeddedServletContainerFactory58.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet64);
        undertowEmbeddedServletContainerFactory58.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory71.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer74 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray75 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer74 };
        undertowEmbeddedServletContainerFactory71.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory46.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection82 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl83 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(inetAddress20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(ssl38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1800 + "'", int48 == 1800);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(ssl54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(errorPageArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray75);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection82);
        org.junit.Assert.assertNull(ssl83);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer5 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray4);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file13);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Undertow does not support JSPs");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(embeddedServletContainer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(inetAddress12);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl10 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl10);
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Undertow does not support JSPs");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNotNull(mimeMappings14);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("");
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader5);
        undertowEmbeddedServletContainerFactory2.setPort(32);
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        int int4 = undertowEmbeddedServletContainerFactory2.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory9.setSessionTimeout(100);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        boolean boolean15 = undertowEmbeddedServletContainerFactory9.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory18.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory18.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings23 = undertowEmbeddedServletContainerFactory18.getMimeMappings();
        java.net.InetAddress inetAddress24 = null;
        undertowEmbeddedServletContainerFactory18.setAddress(inetAddress24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29, errorPageArray28);
        undertowEmbeddedServletContainerFactory27.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29);
        java.net.InetAddress inetAddress32 = undertowEmbeddedServletContainerFactory27.getAddress();
        java.net.InetAddress inetAddress33 = null;
        undertowEmbeddedServletContainerFactory27.setAddress(inetAddress33);
        boolean boolean35 = undertowEmbeddedServletContainerFactory27.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl36 = undertowEmbeddedServletContainerFactory27.getSsl();
        undertowEmbeddedServletContainerFactory27.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray39 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40, errorPageArray39);
        undertowEmbeddedServletContainerFactory27.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory18.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory9.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray47 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet48 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48, errorPageArray47);
        undertowEmbeddedServletContainerFactory46.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48);
        undertowEmbeddedServletContainerFactory9.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48);
        undertowEmbeddedServletContainerFactory6.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer55 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray56 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer55 };
        undertowEmbeddedServletContainerFactory54.addBuilderCustomizers(undertowBuilderCustomizerArray56);
        undertowEmbeddedServletContainerFactory6.addBuilderCustomizers(undertowBuilderCustomizerArray56);
        undertowEmbeddedServletContainerFactory2.addBuilderCustomizers(undertowBuilderCustomizerArray56);
        boolean boolean60 = undertowEmbeddedServletContainerFactory2.isRegisterJspServlet();
        org.springframework.boot.context.embedded.Ssl ssl61 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl61);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mimeMappings23);
        org.junit.Assert.assertNotNull(errorPageArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inetAddress32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(ssl36);
        org.junit.Assert.assertNotNull(errorPageArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorPageArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory5.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory5.getDeploymentInfoCustomizers();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer9 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer11 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap10);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer9, initParameterConfiguringServletContextInitializer11 };
        undertowEmbeddedServletContainerFactory5.addInitializers(servletContextInitializerArray12);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray12);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean22 = undertowEmbeddedServletContainerFactory21.isRegisterDefaultServlet();
        java.lang.String str23 = undertowEmbeddedServletContainerFactory21.getContextPath();
        undertowEmbeddedServletContainerFactory21.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray30 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer31 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray30);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer32 = undertowEmbeddedServletContainerFactory21.getEmbeddedServletContainer(servletContextInitializerArray30);
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray30);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory17.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray34);
        java.net.InetAddress inetAddress37 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.Ssl ssl40 = undertowEmbeddedServletContainerFactory1.getSsl();
        int int41 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(errorPageSet6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray30);
        org.junit.Assert.assertNotNull(embeddedServletContainer31);
        org.junit.Assert.assertNotNull(embeddedServletContainer32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray34);
        org.junit.Assert.assertNull(inetAddress37);
        org.junit.Assert.assertNull(ssl40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer11 = undertowEmbeddedServletContainerFactory7.getEmbeddedServletContainer(servletContextInitializerArray10);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer12 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray10);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        int int15 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory16.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory16.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        boolean boolean28 = undertowEmbeddedServletContainerFactory16.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory16.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34, errorPageArray33);
        undertowEmbeddedServletContainerFactory32.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34);
        java.net.InetAddress inetAddress37 = undertowEmbeddedServletContainerFactory32.getAddress();
        java.net.InetAddress inetAddress38 = null;
        undertowEmbeddedServletContainerFactory32.setAddress(inetAddress38);
        boolean boolean40 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory32.getSsl();
        int int42 = undertowEmbeddedServletContainerFactory32.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray45 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46, errorPageArray45);
        undertowEmbeddedServletContainerFactory44.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet46);
        java.net.InetAddress inetAddress49 = undertowEmbeddedServletContainerFactory44.getAddress();
        undertowEmbeddedServletContainerFactory44.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer52 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray53 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer52 };
        undertowEmbeddedServletContainerFactory44.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        undertowEmbeddedServletContainerFactory32.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        undertowEmbeddedServletContainerFactory32.setRegisterDefaultServlet(true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection58 = undertowEmbeddedServletContainerFactory32.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = undertowEmbeddedServletContainerFactory60.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection62 = undertowEmbeddedServletContainerFactory60.getDeploymentInfoCustomizers();
        java.io.File file63 = null;
        undertowEmbeddedServletContainerFactory60.setDocumentRoot(file63);
        undertowEmbeddedServletContainerFactory60.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory60.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory60.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean73 = undertowEmbeddedServletContainerFactory72.isRegisterDefaultServlet();
        java.lang.String str74 = undertowEmbeddedServletContainerFactory72.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray77 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet78 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78, errorPageArray77);
        undertowEmbeddedServletContainerFactory76.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78);
        undertowEmbeddedServletContainerFactory72.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78);
        undertowEmbeddedServletContainerFactory72.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory85.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray88 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer89 = undertowEmbeddedServletContainerFactory85.getEmbeddedServletContainer(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory72.addInitializers(servletContextInitializerArray88);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer91 = undertowEmbeddedServletContainerFactory60.getEmbeddedServletContainer(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 8080);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(embeddedServletContainer11);
        org.junit.Assert.assertNotNull(embeddedServletContainer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inetAddress37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(errorPageArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inetAddress49);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray53);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection58);
        org.junit.Assert.assertNotNull(errorPageSet61);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection62);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(errorPageArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray88);
        org.junit.Assert.assertNotNull(embeddedServletContainer89);
        org.junit.Assert.assertNotNull(embeddedServletContainer91);
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setPort(32);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet21, errorPageArray20);
        undertowEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet21);
        java.net.InetAddress inetAddress24 = undertowEmbeddedServletContainerFactory19.getAddress();
        java.net.InetAddress inetAddress25 = null;
        undertowEmbeddedServletContainerFactory19.setAddress(inetAddress25);
        int int27 = undertowEmbeddedServletContainerFactory19.getSessionTimeout();
        undertowEmbeddedServletContainerFactory19.setWorkerThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory19.setDirectBuffers((java.lang.Boolean) true);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet32);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inetAddress24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1800 + "'", int27 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet32);
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file3 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file3);
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory0.getSsl();
        int int6 = undertowEmbeddedServletContainerFactory0.getSessionTimeout();
        org.junit.Assert.assertNull(ssl5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer17 };
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl23);
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file25);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        int int29 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl31);
        undertowEmbeddedServletContainerFactory1.setPort(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray18);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory0.setIoThreads((java.lang.Integer) 100);
        java.net.InetAddress inetAddress5 = undertowEmbeddedServletContainerFactory0.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet9 = undertowEmbeddedServletContainerFactory8.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory8.getDeploymentInfoCustomizers();
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory8.setDocumentRoot(file11);
        undertowEmbeddedServletContainerFactory8.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory8.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory8.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage19 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage19 };
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory28.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory28.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray35 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36, errorPageArray35);
        undertowEmbeddedServletContainerFactory34.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36);
        boolean boolean40 = undertowEmbeddedServletContainerFactory28.isRegisterDefaultServlet();
        boolean boolean41 = undertowEmbeddedServletContainerFactory28.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray44 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet45 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45, errorPageArray44);
        undertowEmbeddedServletContainerFactory43.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45);
        java.net.InetAddress inetAddress48 = undertowEmbeddedServletContainerFactory43.getAddress();
        java.net.InetAddress inetAddress49 = null;
        undertowEmbeddedServletContainerFactory43.setAddress(inetAddress49);
        boolean boolean51 = undertowEmbeddedServletContainerFactory43.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl52 = undertowEmbeddedServletContainerFactory43.getSsl();
        int int53 = undertowEmbeddedServletContainerFactory43.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray56 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57, errorPageArray56);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57);
        java.net.InetAddress inetAddress60 = undertowEmbeddedServletContainerFactory55.getAddress();
        undertowEmbeddedServletContainerFactory55.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer63 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray64 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer63 };
        undertowEmbeddedServletContainerFactory55.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory43.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory28.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory8.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory0.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        org.springframework.boot.context.embedded.Ssl ssl71 = undertowEmbeddedServletContainerFactory0.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean74 = undertowEmbeddedServletContainerFactory73.isRegisterDefaultServlet();
        java.lang.String str75 = undertowEmbeddedServletContainerFactory73.getContextPath();
        undertowEmbeddedServletContainerFactory73.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory79.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray82 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer83 = undertowEmbeddedServletContainerFactory79.getEmbeddedServletContainer(servletContextInitializerArray82);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory73.getEmbeddedServletContainer(servletContextInitializerArray82);
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray82);
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNull(inetAddress5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(errorPageSet9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNotNull(errorPageArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorPageArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inetAddress48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(ssl52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(errorPageArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inetAddress60);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray64);
        org.junit.Assert.assertNull(ssl71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray82);
        org.junit.Assert.assertNotNull(embeddedServletContainer83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader17);
        boolean boolean19 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(10);
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file14);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray4 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet5 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet5, errorPageArray4);
        undertowEmbeddedServletContainerFactory3.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet5);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory3.getAddress();
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory3.setAddress(inetAddress9);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory3.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory3.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory3.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory15.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray22 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet23, errorPageArray22);
        undertowEmbeddedServletContainerFactory21.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet23);
        undertowEmbeddedServletContainerFactory15.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet23);
        boolean boolean27 = undertowEmbeddedServletContainerFactory15.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray28);
        undertowEmbeddedServletContainerFactory3.addErrorPages(errorPageArray28);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray28);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(errorPageArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inetAddress8);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNotNull(errorPageArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorPageArray28);
        org.junit.Assert.assertNotNull(errorPageSet32);
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isRegisterDefaultServlet();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory6.getContextPath();
        undertowEmbeddedServletContainerFactory6.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18, errorPageArray17);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        undertowEmbeddedServletContainerFactory12.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer28 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray29 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer28 };
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray29);
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray29);
        java.io.File file32 = undertowEmbeddedServletContainerFactory12.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean35 = undertowEmbeddedServletContainerFactory34.isRegisterDefaultServlet();
        java.lang.String str36 = undertowEmbeddedServletContainerFactory34.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray39 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40, errorPageArray39);
        undertowEmbeddedServletContainerFactory38.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory34.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet44 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray47 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet48 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48, errorPageArray47);
        undertowEmbeddedServletContainerFactory46.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet48);
        java.net.InetAddress inetAddress51 = undertowEmbeddedServletContainerFactory46.getAddress();
        java.net.InetAddress inetAddress52 = null;
        undertowEmbeddedServletContainerFactory46.setAddress(inetAddress52);
        int int54 = undertowEmbeddedServletContainerFactory46.getSessionTimeout();
        undertowEmbeddedServletContainerFactory46.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str57 = undertowEmbeddedServletContainerFactory46.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader59 = null;
        undertowEmbeddedServletContainerFactory58.setResourceLoader(resourceLoader59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean63 = undertowEmbeddedServletContainerFactory62.isRegisterDefaultServlet();
        java.lang.String str64 = undertowEmbeddedServletContainerFactory62.getContextPath();
        undertowEmbeddedServletContainerFactory62.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory68.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray71 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer72 = undertowEmbeddedServletContainerFactory68.getEmbeddedServletContainer(servletContextInitializerArray71);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer73 = undertowEmbeddedServletContainerFactory62.getEmbeddedServletContainer(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory58.addInitializers(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray71);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer78 = undertowEmbeddedServletContainerFactory6.getEmbeddedServletContainer(servletContextInitializerArray71);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray71);
        org.junit.Assert.assertNotNull(mimeMappings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray29);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorPageArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorPageSet44);
        org.junit.Assert.assertNotNull(errorPageArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inetAddress51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1800 + "'", int54 == 1800);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray71);
        org.junit.Assert.assertNotNull(embeddedServletContainer72);
        org.junit.Assert.assertNotNull(embeddedServletContainer73);
        org.junit.Assert.assertNotNull(embeddedServletContainer78);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.Ssl ssl3 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setBuffersPerRegion((java.lang.Integer) 100);
        boolean boolean6 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) false);
        java.net.InetAddress inetAddress11 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress11);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        org.junit.Assert.assertNull(ssl3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory13.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory13.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings18);
        java.net.InetAddress inetAddress20 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress20);
        org.springframework.boot.context.embedded.Ssl ssl22 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl29 = undertowEmbeddedServletContainerFactory25.getSsl();
        java.net.InetAddress inetAddress30 = null;
        undertowEmbeddedServletContainerFactory25.setAddress(inetAddress30);
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory25.setResourceLoader(resourceLoader32);
        undertowEmbeddedServletContainerFactory25.setRegisterDefaultServlet(true);
        boolean boolean36 = undertowEmbeddedServletContainerFactory25.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file41 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection42 = undertowEmbeddedServletContainerFactory40.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory40.setBufferSize((java.lang.Integer) 0);
        java.io.File file45 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean48 = undertowEmbeddedServletContainerFactory47.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory47.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl51 = undertowEmbeddedServletContainerFactory47.getSsl();
        java.net.InetAddress inetAddress52 = null;
        undertowEmbeddedServletContainerFactory47.setAddress(inetAddress52);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean56 = undertowEmbeddedServletContainerFactory55.isRegisterDefaultServlet();
        java.lang.String str57 = undertowEmbeddedServletContainerFactory55.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray60 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet61, errorPageArray60);
        undertowEmbeddedServletContainerFactory59.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet61);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet61);
        undertowEmbeddedServletContainerFactory55.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory68.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer71 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer71 };
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory55.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        org.springframework.boot.context.embedded.Ssl ssl76 = null;
        undertowEmbeddedServletContainerFactory47.setSsl(ssl76);
        java.lang.String str78 = undertowEmbeddedServletContainerFactory47.getContextPath();
        undertowEmbeddedServletContainerFactory47.setSessionTimeout(0);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet81 = undertowEmbeddedServletContainerFactory47.getErrorPages();
        undertowEmbeddedServletContainerFactory40.setErrorPages(errorPageSet81);
        undertowEmbeddedServletContainerFactory25.setErrorPages(errorPageSet81);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet81);
        org.springframework.core.io.ResourceLoader resourceLoader85 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader85);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(ssl29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection42);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(ssl51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(errorPageArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray72);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(errorPageSet81);
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setPort((int) ' ');
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.Ssl ssl8 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(ssl8);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNotNull(mimeMappings14);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertNotNull(mimeMappings16);
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory20.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file26);
        undertowEmbeddedServletContainerFactory20.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory20.setBuffersPerRegion((java.lang.Integer) 8080);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory34.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory34.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress39 = null;
        undertowEmbeddedServletContainerFactory34.setAddress(inetAddress39);
        java.io.File file41 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory45.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader48 = null;
        undertowEmbeddedServletContainerFactory45.setResourceLoader(resourceLoader48);
        org.springframework.core.io.ResourceLoader resourceLoader50 = null;
        undertowEmbeddedServletContainerFactory45.setResourceLoader(resourceLoader50);
        undertowEmbeddedServletContainerFactory45.setBufferSize((java.lang.Integer) 100);
        java.net.InetAddress inetAddress54 = undertowEmbeddedServletContainerFactory45.getAddress();
        org.springframework.boot.context.embedded.Ssl ssl55 = undertowEmbeddedServletContainerFactory45.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray56 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory45.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray56);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray56);
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray56);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray56);
        int int61 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.core.io.ResourceLoader resourceLoader62 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader62);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(mimeMappings25);
        org.junit.Assert.assertNull(inetAddress54);
        org.junit.Assert.assertNull(ssl55);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file17);
        java.io.File file19 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.Ssl ssl23 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        java.lang.String str27 = undertowEmbeddedServletContainerFactory25.getContextPath();
        undertowEmbeddedServletContainerFactory25.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader31 = null;
        undertowEmbeddedServletContainerFactory30.setResourceLoader(resourceLoader31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection36 = undertowEmbeddedServletContainerFactory34.getDeploymentInfoCustomizers();
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file37);
        undertowEmbeddedServletContainerFactory34.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        undertowEmbeddedServletContainerFactory30.setErrorPages(errorPageSet41);
        undertowEmbeddedServletContainerFactory30.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory30.getMimeMappings();
        undertowEmbeddedServletContainerFactory30.setSessionTimeout(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory48.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory48.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet56 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet56, errorPageArray55);
        undertowEmbeddedServletContainerFactory54.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet56);
        undertowEmbeddedServletContainerFactory48.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet56);
        boolean boolean60 = undertowEmbeddedServletContainerFactory48.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray61 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory48.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory30.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray61);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection66 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(ssl23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(errorPageSet35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection36);
        org.junit.Assert.assertNotNull(errorPageSet41);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertNotNull(errorPageArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(errorPageArray61);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection66);
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        int int7 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file13);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1800 + "'", int7 == 1800);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl8);
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress10);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        java.io.File file13 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("");
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNotNull(errorPageSet12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(mimeMappings14);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPort(1);
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory21.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory21.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory21.getMimeMappings();
        java.net.InetAddress inetAddress27 = null;
        undertowEmbeddedServletContainerFactory21.setAddress(inetAddress27);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory21.getErrorPages();
        undertowEmbeddedServletContainerFactory21.setIoThreads((java.lang.Integer) 1);
        int int32 = undertowEmbeddedServletContainerFactory21.getPort();
        undertowEmbeddedServletContainerFactory21.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet38 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet38, errorPageArray37);
        undertowEmbeddedServletContainerFactory36.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet38);
        java.net.InetAddress inetAddress41 = undertowEmbeddedServletContainerFactory36.getAddress();
        java.net.InetAddress inetAddress42 = null;
        undertowEmbeddedServletContainerFactory36.setAddress(inetAddress42);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection44 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory36.setJspServletClassName("");
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory36.setDocumentRoot(file47);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory49.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory49.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray56 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57, errorPageArray56);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57);
        undertowEmbeddedServletContainerFactory49.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57);
        boolean boolean61 = undertowEmbeddedServletContainerFactory49.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray62 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory49.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNotNull(mimeMappings26);
        org.junit.Assert.assertNotNull(errorPageSet29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(errorPageArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inetAddress41);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection44);
        org.junit.Assert.assertNotNull(errorPageArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(errorPageArray62);
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings10 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 0);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory12.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory16.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet21, errorPageArray20);
        undertowEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet21);
        java.net.InetAddress inetAddress24 = undertowEmbeddedServletContainerFactory19.getAddress();
        java.net.InetAddress inetAddress25 = null;
        undertowEmbeddedServletContainerFactory19.setAddress(inetAddress25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory19.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl28 = undertowEmbeddedServletContainerFactory19.getSsl();
        int int29 = undertowEmbeddedServletContainerFactory19.getPort();
        java.io.File file30 = undertowEmbeddedServletContainerFactory19.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.io.File file33 = null;
        undertowEmbeddedServletContainerFactory32.setDocumentRoot(file33);
        int int35 = undertowEmbeddedServletContainerFactory32.getSessionTimeout();
        int int36 = undertowEmbeddedServletContainerFactory32.getSessionTimeout();
        boolean boolean37 = undertowEmbeddedServletContainerFactory32.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        int int44 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(mimeMappings10);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inetAddress24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(ssl28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1800 + "'", int35 == 1800);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1800 + "'", int36 == 1800);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        int int7 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14, errorPageArray13);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14);
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory12.getAddress();
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory12.setAddress(inetAddress18);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory12.setBuffersPerRegion((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray25 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet26, errorPageArray25);
        undertowEmbeddedServletContainerFactory24.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet26);
        java.net.InetAddress inetAddress29 = undertowEmbeddedServletContainerFactory24.getAddress();
        undertowEmbeddedServletContainerFactory24.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer32 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer32 };
        undertowEmbeddedServletContainerFactory24.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        java.io.File file39 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl40);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1800 + "'", int7 == 1800);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inetAddress17);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertNotNull(errorPageArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(inetAddress29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
        org.junit.Assert.assertNull(file39);
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.net.InetAddress inetAddress2 = undertowEmbeddedServletContainerFactory1.getAddress();
        int int3 = undertowEmbeddedServletContainerFactory1.getPort();
        int int4 = undertowEmbeddedServletContainerFactory1.getPort();
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.junit.Assert.assertNull(inetAddress2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer5 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory7.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file10);
        undertowEmbeddedServletContainerFactory7.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory7.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(embeddedServletContainer5);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertNotNull(mimeMappings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection18 = undertowEmbeddedServletContainerFactory16.getDeploymentInfoCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory16.setDocumentRoot(file19);
        undertowEmbeddedServletContainerFactory16.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet23);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl31 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNotNull(errorPageSet17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection18);
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertNull(ssl31);
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        int int15 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory16.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory16.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray30 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet31, errorPageArray30);
        undertowEmbeddedServletContainerFactory29.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet31);
        undertowEmbeddedServletContainerFactory29.setIoThreads((java.lang.Integer) 1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        undertowEmbeddedServletContainerFactory16.setErrorPages(errorPageSet36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean44 = undertowEmbeddedServletContainerFactory43.isRegisterDefaultServlet();
        java.lang.String str45 = undertowEmbeddedServletContainerFactory43.getContextPath();
        undertowEmbeddedServletContainerFactory43.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader49 = null;
        undertowEmbeddedServletContainerFactory48.setResourceLoader(resourceLoader49);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet53 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection54 = undertowEmbeddedServletContainerFactory52.getDeploymentInfoCustomizers();
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory52.setDocumentRoot(file55);
        undertowEmbeddedServletContainerFactory52.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet59 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        undertowEmbeddedServletContainerFactory48.setErrorPages(errorPageSet59);
        undertowEmbeddedServletContainerFactory48.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings63 = undertowEmbeddedServletContainerFactory48.getMimeMappings();
        undertowEmbeddedServletContainerFactory48.setSessionTimeout(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory66.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory66.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray73 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet74 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet74, errorPageArray73);
        undertowEmbeddedServletContainerFactory72.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet74);
        undertowEmbeddedServletContainerFactory66.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet74);
        boolean boolean78 = undertowEmbeddedServletContainerFactory66.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray79 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory66.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory48.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory43.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory39.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray79);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray79);
        org.springframework.core.io.ResourceLoader resourceLoader86 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader86);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1800 + "'", int15 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorPageArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorPageSet36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(errorPageSet53);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection54);
        org.junit.Assert.assertNotNull(errorPageSet59);
        org.junit.Assert.assertNotNull(mimeMappings63);
        org.junit.Assert.assertNotNull(errorPageArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(errorPageArray79);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.io.File file5 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer11 = undertowEmbeddedServletContainerFactory7.getEmbeddedServletContainer(servletContextInitializerArray10);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory7.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer13 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer13 };
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer22 };
        undertowEmbeddedServletContainerFactory21.addBuilderCustomizers(undertowBuilderCustomizerArray23);
        undertowEmbeddedServletContainerFactory21.setIoThreads((java.lang.Integer) 1800);
        boolean boolean27 = undertowEmbeddedServletContainerFactory21.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory21.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        undertowEmbeddedServletContainerFactory31.setPort((int) (short) 10);
        java.io.File file34 = undertowEmbeddedServletContainerFactory31.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet38 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet38, errorPageArray37);
        undertowEmbeddedServletContainerFactory36.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet38);
        java.net.InetAddress inetAddress41 = undertowEmbeddedServletContainerFactory36.getAddress();
        java.net.InetAddress inetAddress42 = null;
        undertowEmbeddedServletContainerFactory36.setAddress(inetAddress42);
        int int44 = undertowEmbeddedServletContainerFactory36.getSessionTimeout();
        undertowEmbeddedServletContainerFactory36.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.ErrorPage errorPage47 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray48 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage47 };
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray48);
        undertowEmbeddedServletContainerFactory31.addErrorPages(errorPageArray48);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray48);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray48);
        org.springframework.boot.context.embedded.Ssl ssl53 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file54 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(embeddedServletContainer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(errorPageArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inetAddress41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1800 + "'", int44 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray48);
        org.junit.Assert.assertNull(ssl53);
        org.junit.Assert.assertNull(file54);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer5 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory7.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory7.setDocumentRoot(file10);
        undertowEmbeddedServletContainerFactory7.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory7.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        undertowEmbeddedServletContainerFactory20.setIoThreads((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory25.getAddress();
        java.net.InetAddress inetAddress31 = null;
        undertowEmbeddedServletContainerFactory25.setAddress(inetAddress31);
        boolean boolean33 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress34 = null;
        undertowEmbeddedServletContainerFactory25.setAddress(inetAddress34);
        org.springframework.boot.context.embedded.Ssl ssl36 = null;
        undertowEmbeddedServletContainerFactory25.setSsl(ssl36);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) '#');
        undertowEmbeddedServletContainerFactory25.setDirectBuffers((java.lang.Boolean) false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = undertowEmbeddedServletContainerFactory25.getErrorPages();
        undertowEmbeddedServletContainerFactory20.setErrorPages(errorPageSet42);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet42);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings47 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(embeddedServletContainer5);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertNotNull(mimeMappings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(errorPageSet21);
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inetAddress30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(errorPageSet42);
        org.junit.Assert.assertNotNull(mimeMappings47);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isRegisterDefaultServlet();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory9.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15, errorPageArray14);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15);
        undertowEmbeddedServletContainerFactory9.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings19 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray22 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet23, errorPageArray22);
        undertowEmbeddedServletContainerFactory21.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet23);
        java.net.InetAddress inetAddress26 = undertowEmbeddedServletContainerFactory21.getAddress();
        java.net.InetAddress inetAddress27 = null;
        undertowEmbeddedServletContainerFactory21.setAddress(inetAddress27);
        int int29 = undertowEmbeddedServletContainerFactory21.getSessionTimeout();
        undertowEmbeddedServletContainerFactory21.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory21.setResourceLoader(resourceLoader32);
        org.springframework.boot.context.embedded.ErrorPage errorPage34 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray35 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage34 };
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray35);
        java.net.InetAddress inetAddress37 = null;
        undertowEmbeddedServletContainerFactory21.setAddress(inetAddress37);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean41 = undertowEmbeddedServletContainerFactory40.isRegisterDefaultServlet();
        java.lang.String str42 = undertowEmbeddedServletContainerFactory40.getContextPath();
        java.net.InetAddress inetAddress43 = undertowEmbeddedServletContainerFactory40.getAddress();
        undertowEmbeddedServletContainerFactory40.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray48 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet49, errorPageArray48);
        undertowEmbeddedServletContainerFactory47.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet49);
        java.net.InetAddress inetAddress52 = undertowEmbeddedServletContainerFactory47.getAddress();
        java.net.InetAddress inetAddress53 = null;
        undertowEmbeddedServletContainerFactory47.setAddress(inetAddress53);
        org.springframework.boot.context.embedded.Ssl ssl55 = undertowEmbeddedServletContainerFactory47.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection56 = undertowEmbeddedServletContainerFactory47.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory58.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer61 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray62 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer61 };
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray62);
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray62);
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray62);
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray62);
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray62);
        undertowEmbeddedServletContainerFactory9.setPort((-1));
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet70 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet71 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet71);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mimeMappings19);
        org.junit.Assert.assertNotNull(errorPageArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inetAddress26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1800 + "'", int29 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(inetAddress43);
        org.junit.Assert.assertNotNull(errorPageArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inetAddress52);
        org.junit.Assert.assertNull(ssl55);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray62);
        org.junit.Assert.assertNotNull(errorPageSet70);
        org.junit.Assert.assertNotNull(errorPageSet71);
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 97);
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader21);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(ssl10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader16);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1), timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory15.setResourceLoader(resourceLoader16);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection21 = undertowEmbeddedServletContainerFactory19.getDeploymentInfoCustomizers();
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory19.setDocumentRoot(file22);
        undertowEmbeddedServletContainerFactory19.setJspServletClassName("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        undertowEmbeddedServletContainerFactory15.setErrorPages(errorPageSet26);
        undertowEmbeddedServletContainerFactory15.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings30 = undertowEmbeddedServletContainerFactory15.getMimeMappings();
        undertowEmbeddedServletContainerFactory15.setSessionTimeout(10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory33.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory33.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        undertowEmbeddedServletContainerFactory33.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        boolean boolean45 = undertowEmbeddedServletContainerFactory33.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray46 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory33.addErrorPages(errorPageArray46);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray46);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray46);
        java.net.InetAddress inetAddress50 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress50);
        boolean boolean52 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection53 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNotNull(errorPageSet20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection21);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNotNull(mimeMappings30);
        org.junit.Assert.assertNotNull(errorPageArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(errorPageArray46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection53);
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        int int17 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress18);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1800 + "'", int17 == 1800);
        org.junit.Assert.assertNull(file24);
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        int int13 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader21);
        undertowEmbeddedServletContainerFactory1.setPort(97);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1800 + "'", int13 == 1800);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file10 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl11);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.Ssl ssl15 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl15);
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress17);
        int int19 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.net.InetAddress inetAddress20 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection25 = undertowEmbeddedServletContainerFactory23.getDeploymentInfoCustomizers();
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory23.setDocumentRoot(file26);
        undertowEmbeddedServletContainerFactory23.setJspServletClassName("");
        java.net.InetAddress inetAddress30 = null;
        undertowEmbeddedServletContainerFactory23.setAddress(inetAddress30);
        boolean boolean32 = undertowEmbeddedServletContainerFactory23.isRegisterDefaultServlet();
        int int33 = undertowEmbeddedServletContainerFactory23.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader35 = null;
        undertowEmbeddedServletContainerFactory34.setResourceLoader(resourceLoader35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean39 = undertowEmbeddedServletContainerFactory38.isRegisterDefaultServlet();
        java.lang.String str40 = undertowEmbeddedServletContainerFactory38.getContextPath();
        undertowEmbeddedServletContainerFactory38.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory44.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer48 = undertowEmbeddedServletContainerFactory44.getEmbeddedServletContainer(servletContextInitializerArray47);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer49 = undertowEmbeddedServletContainerFactory38.getEmbeddedServletContainer(servletContextInitializerArray47);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray47);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray51 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings54 = undertowEmbeddedServletContainerFactory23.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet55 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory57.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory57.getEmbeddedServletContainer(servletContextInitializerArray60);
        java.lang.String str62 = undertowEmbeddedServletContainerFactory57.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer63 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray64 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer63 };
        undertowEmbeddedServletContainerFactory57.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory23.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray64);
        org.springframework.boot.context.embedded.Ssl ssl68 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl68);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection70 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1800 + "'", int19 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1800 + "'", int33 == 1800);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        org.junit.Assert.assertNotNull(embeddedServletContainer48);
        org.junit.Assert.assertNotNull(embeddedServletContainer49);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray51);
        org.junit.Assert.assertNotNull(mimeMappings54);
        org.junit.Assert.assertNotNull(errorPageSet55);
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray64);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection70);
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader7);
        java.lang.String str9 = undertowEmbeddedServletContainerFactory2.getContextPath();
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        boolean boolean12 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory2.getSsl();
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory2.setSessionTimeout(1800);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(ssl13);
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray4 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer5 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray4);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl11);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNotNull(servletContextInitializerArray4);
        org.junit.Assert.assertNotNull(embeddedServletContainer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(mimeMappings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNotNull(mimeMappings14);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory22.setIoThreads((java.lang.Integer) 1);
        java.io.File file29 = undertowEmbeddedServletContainerFactory22.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory22.setSsl(ssl31);
        org.springframework.core.io.ResourceLoader resourceLoader33 = null;
        undertowEmbeddedServletContainerFactory22.setResourceLoader(resourceLoader33);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory22.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet35);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        org.junit.Assert.assertNotNull(errorPageSet35);
        org.junit.Assert.assertNotNull(errorPageSet37);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress8);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory2.getSsl();
        undertowEmbeddedServletContainerFactory2.setContextPath("");
        undertowEmbeddedServletContainerFactory2.setBufferSize((java.lang.Integer) 8080);
        boolean boolean19 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory2.setPort((int) (short) -1);
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isRegisterDefaultServlet();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory6.getContextPath();
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory6.getAddress();
        undertowEmbeddedServletContainerFactory6.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15, errorPageArray14);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory13.getAddress();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory13.setAddress(inetAddress19);
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory13.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection22 = undertowEmbeddedServletContainerFactory13.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory24.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer27 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer27 };
        undertowEmbeddedServletContainerFactory24.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        undertowEmbeddedServletContainerFactory13.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        undertowEmbeddedServletContainerFactory6.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection38 = undertowEmbeddedServletContainerFactory36.getDeploymentInfoCustomizers();
        java.io.File file39 = null;
        undertowEmbeddedServletContainerFactory36.setDocumentRoot(file39);
        undertowEmbeddedServletContainerFactory36.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory36.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory36.setPort(1);
        org.springframework.boot.context.embedded.Ssl ssl47 = null;
        undertowEmbeddedServletContainerFactory36.setSsl(ssl47);
        org.springframework.boot.context.embedded.Ssl ssl49 = undertowEmbeddedServletContainerFactory36.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory50.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory50.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray57 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet58 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet58, errorPageArray57);
        undertowEmbeddedServletContainerFactory56.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet58);
        undertowEmbeddedServletContainerFactory50.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet58);
        boolean boolean62 = undertowEmbeddedServletContainerFactory50.isRegisterDefaultServlet();
        boolean boolean63 = undertowEmbeddedServletContainerFactory50.isRegisterJspServlet();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = undertowEmbeddedServletContainerFactory50.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setErrorPages(errorPageSet64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader67 = null;
        undertowEmbeddedServletContainerFactory66.setResourceLoader(resourceLoader67);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean71 = undertowEmbeddedServletContainerFactory70.isRegisterDefaultServlet();
        java.lang.String str72 = undertowEmbeddedServletContainerFactory70.getContextPath();
        undertowEmbeddedServletContainerFactory70.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory76.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray79 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer80 = undertowEmbeddedServletContainerFactory76.getEmbeddedServletContainer(servletContextInitializerArray79);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer81 = undertowEmbeddedServletContainerFactory70.getEmbeddedServletContainer(servletContextInitializerArray79);
        undertowEmbeddedServletContainerFactory66.addInitializers(servletContextInitializerArray79);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer83 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray79);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory34.getEmbeddedServletContainer(servletContextInitializerArray79);
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray79);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer86 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray79);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection87 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet88 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(inetAddress9);
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inetAddress18);
        org.junit.Assert.assertNull(ssl21);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection22);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray28);
        org.junit.Assert.assertNotNull(errorPageSet37);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection38);
        org.junit.Assert.assertNull(ssl49);
        org.junit.Assert.assertNotNull(errorPageArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(errorPageSet64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray79);
        org.junit.Assert.assertNotNull(embeddedServletContainer80);
        org.junit.Assert.assertNotNull(embeddedServletContainer81);
        org.junit.Assert.assertNotNull(embeddedServletContainer83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(embeddedServletContainer86);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection87);
        org.junit.Assert.assertNotNull(errorPageSet88);
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        undertowEmbeddedServletContainerFactory2.setPort(8080);
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory9.setWorkerThreads((java.lang.Integer) 8080);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isRegisterDefaultServlet();
        java.lang.String str15 = undertowEmbeddedServletContainerFactory13.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray18 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19, errorPageArray18);
        undertowEmbeddedServletContainerFactory17.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        int int24 = undertowEmbeddedServletContainerFactory13.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory13.getSsl();
        java.lang.String str26 = undertowEmbeddedServletContainerFactory13.getContextPath();
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) (byte) 0);
        undertowEmbeddedServletContainerFactory13.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress31 = undertowEmbeddedServletContainerFactory13.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings32);
        undertowEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings32);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorPageArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1800 + "'", int24 == 1800);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(inetAddress31);
        org.junit.Assert.assertNotNull(mimeMappings32);
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory8.getAddress();
        undertowEmbeddedServletContainerFactory8.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer16 };
        undertowEmbeddedServletContainerFactory8.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        boolean boolean22 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader25);
        java.io.File file27 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(file27);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory2.setDocumentRoot(file8);
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        boolean boolean12 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = undertowEmbeddedServletContainerFactory17.getDocumentRoot();
        boolean boolean19 = undertowEmbeddedServletContainerFactory17.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory17.setWorkerThreads((java.lang.Integer) 8080);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory17.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer24 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer24 };
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory2.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        java.net.InetAddress inetAddress29 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress29);
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(mimeMappings7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setPort(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(ssl12);
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20, errorPageArray19);
        undertowEmbeddedServletContainerFactory18.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        java.net.InetAddress inetAddress23 = undertowEmbeddedServletContainerFactory18.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory25.getAddress();
        undertowEmbeddedServletContainerFactory25.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer33 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray34 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer33 };
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray34);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection38 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader39 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader39);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.net.InetAddress inetAddress42 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress42);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setPort(97);
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inetAddress23);
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inetAddress30);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection38);
        org.junit.Assert.assertNotNull(mimeMappings41);
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader1 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader1);
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("");
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) (byte) 10);
        int int8 = undertowEmbeddedServletContainerFactory0.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean11 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory10.getSsl();
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory10.setAddress(inetAddress15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean19 = undertowEmbeddedServletContainerFactory18.isRegisterDefaultServlet();
        java.lang.String str20 = undertowEmbeddedServletContainerFactory18.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory18.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory18.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer34 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer34 };
        undertowEmbeddedServletContainerFactory31.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        org.springframework.boot.context.embedded.Ssl ssl39 = null;
        undertowEmbeddedServletContainerFactory10.setSsl(ssl39);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory10.getContextPath();
        undertowEmbeddedServletContainerFactory10.setSessionTimeout(0);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout(1800);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout(0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings48);
        org.junit.Assert.assertNull(ssl5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8080 + "'", int8 == 8080);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(mimeMappings48);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1));
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings15 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mimeMappings15);
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory20.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress25 = null;
        undertowEmbeddedServletContainerFactory20.setAddress(inetAddress25);
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory20.setDocumentRoot(file27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory31.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader34 = null;
        undertowEmbeddedServletContainerFactory31.setResourceLoader(resourceLoader34);
        org.springframework.core.io.ResourceLoader resourceLoader36 = null;
        undertowEmbeddedServletContainerFactory31.setResourceLoader(resourceLoader36);
        undertowEmbeddedServletContainerFactory31.setBufferSize((java.lang.Integer) 100);
        java.net.InetAddress inetAddress40 = undertowEmbeddedServletContainerFactory31.getAddress();
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory31.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory31.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings45);
        java.net.InetAddress inetAddress47 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Ssl ssl48 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 0);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
        org.junit.Assert.assertNull(inetAddress40);
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertNull(inetAddress47);
        org.junit.Assert.assertNull(ssl48);
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer9 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer9 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray10);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file14);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 35);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray10);
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings11 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15, errorPageArray14);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet15);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory13.getAddress();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory13.setAddress(inetAddress19);
        int int21 = undertowEmbeddedServletContainerFactory13.getSessionTimeout();
        undertowEmbeddedServletContainerFactory13.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.core.io.ResourceLoader resourceLoader24 = null;
        undertowEmbeddedServletContainerFactory13.setResourceLoader(resourceLoader24);
        org.springframework.boot.context.embedded.ErrorPage errorPage26 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray27 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage26 };
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray27);
        java.net.InetAddress inetAddress29 = null;
        undertowEmbeddedServletContainerFactory13.setAddress(inetAddress29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean33 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        java.lang.String str34 = undertowEmbeddedServletContainerFactory32.getContextPath();
        java.net.InetAddress inetAddress35 = undertowEmbeddedServletContainerFactory32.getAddress();
        undertowEmbeddedServletContainerFactory32.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        java.net.InetAddress inetAddress44 = undertowEmbeddedServletContainerFactory39.getAddress();
        java.net.InetAddress inetAddress45 = null;
        undertowEmbeddedServletContainerFactory39.setAddress(inetAddress45);
        org.springframework.boot.context.embedded.Ssl ssl47 = undertowEmbeddedServletContainerFactory39.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection48 = undertowEmbeddedServletContainerFactory39.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory50.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer53 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray54 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer53 };
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        undertowEmbeddedServletContainerFactory13.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray64 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet65 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet65, errorPageArray64);
        undertowEmbeddedServletContainerFactory63.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet65);
        undertowEmbeddedServletContainerFactory63.setContextPath("");
        undertowEmbeddedServletContainerFactory63.setIoThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory63.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet76 = undertowEmbeddedServletContainerFactory75.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection77 = undertowEmbeddedServletContainerFactory75.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl78 = undertowEmbeddedServletContainerFactory75.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings79 = undertowEmbeddedServletContainerFactory75.getMimeMappings();
        undertowEmbeddedServletContainerFactory63.setMimeMappings(mimeMappings79);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings79);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet82 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mimeMappings11);
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inetAddress18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1800 + "'", int21 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(inetAddress35);
        org.junit.Assert.assertNotNull(errorPageArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inetAddress44);
        org.junit.Assert.assertNull(ssl47);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection48);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray54);
        org.junit.Assert.assertNotNull(errorPageArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(errorPageSet76);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection77);
        org.junit.Assert.assertNull(ssl78);
        org.junit.Assert.assertNotNull(mimeMappings79);
        org.junit.Assert.assertNotNull(errorPageSet82);
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory8.getAddress();
        undertowEmbeddedServletContainerFactory8.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer16 };
        undertowEmbeddedServletContainerFactory8.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray17);
        java.net.InetAddress inetAddress20 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress20);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file22);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory26.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection28 = undertowEmbeddedServletContainerFactory26.getDeploymentInfoCustomizers();
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory26.setDocumentRoot(file29);
        undertowEmbeddedServletContainerFactory26.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory26.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory26.setPort(1);
        org.springframework.boot.context.embedded.Ssl ssl37 = null;
        undertowEmbeddedServletContainerFactory26.setSsl(ssl37);
        undertowEmbeddedServletContainerFactory26.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory26.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 100);
        int int45 = undertowEmbeddedServletContainerFactory26.getSessionTimeout();
        boolean boolean46 = undertowEmbeddedServletContainerFactory26.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory26.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet51 = undertowEmbeddedServletContainerFactory50.getErrorPages();
        undertowEmbeddedServletContainerFactory50.setIoThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory50.setSessionTimeout(32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray58 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet59 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet59, errorPageArray58);
        undertowEmbeddedServletContainerFactory57.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet59);
        undertowEmbeddedServletContainerFactory57.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory57.setRegisterDefaultServlet(true);
        java.io.File file66 = undertowEmbeddedServletContainerFactory57.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl67 = null;
        undertowEmbeddedServletContainerFactory57.setSsl(ssl67);
        int int69 = undertowEmbeddedServletContainerFactory57.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean72 = undertowEmbeddedServletContainerFactory71.isRegisterDefaultServlet();
        java.lang.String str73 = undertowEmbeddedServletContainerFactory71.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray76 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet77 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet77, errorPageArray76);
        undertowEmbeddedServletContainerFactory75.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet77);
        undertowEmbeddedServletContainerFactory71.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet77);
        undertowEmbeddedServletContainerFactory71.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory84 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory84.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray87 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer88 = undertowEmbeddedServletContainerFactory84.getEmbeddedServletContainer(servletContextInitializerArray87);
        undertowEmbeddedServletContainerFactory71.addInitializers(servletContextInitializerArray87);
        undertowEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray87);
        undertowEmbeddedServletContainerFactory50.addInitializers(servletContextInitializerArray87);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer92 = undertowEmbeddedServletContainerFactory26.getEmbeddedServletContainer(servletContextInitializerArray87);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer93 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray17);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        org.junit.Assert.assertNotNull(errorPageSet27);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection28);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1800 + "'", int45 == 1800);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(errorPageSet51);
        org.junit.Assert.assertNotNull(errorPageArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1800 + "'", int69 == 1800);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(errorPageArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray87);
        org.junit.Assert.assertNotNull(embeddedServletContainer88);
        org.junit.Assert.assertNotNull(embeddedServletContainer92);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.ErrorPage errorPage12 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage12 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean20 = undertowEmbeddedServletContainerFactory19.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory19.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl23 = undertowEmbeddedServletContainerFactory19.getSsl();
        java.net.InetAddress inetAddress24 = null;
        undertowEmbeddedServletContainerFactory19.setAddress(inetAddress24);
        org.springframework.core.io.ResourceLoader resourceLoader26 = null;
        undertowEmbeddedServletContainerFactory19.setResourceLoader(resourceLoader26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet33 = undertowEmbeddedServletContainerFactory32.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection34 = undertowEmbeddedServletContainerFactory32.getDeploymentInfoCustomizers();
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory32.setDocumentRoot(file35);
        undertowEmbeddedServletContainerFactory32.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory32.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage43 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray44 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage43 };
        undertowEmbeddedServletContainerFactory32.addErrorPages(errorPageArray44);
        undertowEmbeddedServletContainerFactory29.addErrorPages(errorPageArray44);
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray44);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray44);
        java.lang.String str49 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.net.InetAddress inetAddress52 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 8080);
        java.util.concurrent.TimeUnit timeUnit58 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(97, timeUnit58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(ssl23);
        org.junit.Assert.assertNotNull(errorPageSet30);
        org.junit.Assert.assertNotNull(errorPageSet33);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection34);
        org.junit.Assert.assertNotNull(errorPageArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(inetAddress52);
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 100);
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18, errorPageArray17);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        undertowEmbeddedServletContainerFactory12.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer29 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray28);
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray28);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer31 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray28);
        java.net.InetAddress inetAddress32 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress32);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file36 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        int int39 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(embeddedServletContainer29);
        org.junit.Assert.assertNotNull(embeddedServletContainer31);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory1.getAddress();
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.net.InetAddress inetAddress21 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNull(inetAddress17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(inetAddress21);
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings5 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file8);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 32);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNull(ssl4);
        org.junit.Assert.assertNotNull(mimeMappings5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(inetAddress12);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory1.getSsl();
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean17 = undertowEmbeddedServletContainerFactory16.isRegisterDefaultServlet();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory16.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray21 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet22, errorPageArray21);
        undertowEmbeddedServletContainerFactory20.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet22);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet22);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean29 = undertowEmbeddedServletContainerFactory28.isRegisterDefaultServlet();
        java.lang.String str30 = undertowEmbeddedServletContainerFactory28.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34, errorPageArray33);
        undertowEmbeddedServletContainerFactory32.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34);
        undertowEmbeddedServletContainerFactory28.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory41.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer45 = undertowEmbeddedServletContainerFactory41.getEmbeddedServletContainer(servletContextInitializerArray44);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray44);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer47 = undertowEmbeddedServletContainerFactory16.getEmbeddedServletContainer(servletContextInitializerArray44);
        java.net.InetAddress inetAddress48 = null;
        undertowEmbeddedServletContainerFactory16.setAddress(inetAddress48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet52 = undertowEmbeddedServletContainerFactory51.getErrorPages();
        undertowEmbeddedServletContainerFactory51.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory55.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory55.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray62 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet63 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet63, errorPageArray62);
        undertowEmbeddedServletContainerFactory61.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet63);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet63);
        boolean boolean67 = undertowEmbeddedServletContainerFactory55.isRegisterDefaultServlet();
        boolean boolean68 = undertowEmbeddedServletContainerFactory55.isRegisterJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray71 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet72 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet72, errorPageArray71);
        undertowEmbeddedServletContainerFactory70.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet72);
        java.net.InetAddress inetAddress75 = undertowEmbeddedServletContainerFactory70.getAddress();
        java.net.InetAddress inetAddress76 = null;
        undertowEmbeddedServletContainerFactory70.setAddress(inetAddress76);
        boolean boolean78 = undertowEmbeddedServletContainerFactory70.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl79 = undertowEmbeddedServletContainerFactory70.getSsl();
        int int80 = undertowEmbeddedServletContainerFactory70.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory82 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray83 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet84 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet84, errorPageArray83);
        undertowEmbeddedServletContainerFactory82.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet84);
        java.net.InetAddress inetAddress87 = undertowEmbeddedServletContainerFactory82.getAddress();
        undertowEmbeddedServletContainerFactory82.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer90 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray91 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer90 };
        undertowEmbeddedServletContainerFactory82.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        undertowEmbeddedServletContainerFactory70.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        undertowEmbeddedServletContainerFactory55.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        undertowEmbeddedServletContainerFactory51.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray91);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection98 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(ssl10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(errorPageArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        org.junit.Assert.assertNotNull(embeddedServletContainer45);
        org.junit.Assert.assertNotNull(embeddedServletContainer47);
        org.junit.Assert.assertNotNull(errorPageSet52);
        org.junit.Assert.assertNotNull(errorPageArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(errorPageArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(inetAddress75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(ssl79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertNotNull(errorPageArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(inetAddress87);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray91);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection98);
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        int int15 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray16 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer15 };
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray16);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray16);
        int int19 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '#');
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory24.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings30 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings31 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.lang.Class<?> wildcardClass32 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mimeMappings25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mimeMappings30);
        org.junit.Assert.assertNotNull(mimeMappings31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isRegisterDefaultServlet();
        java.lang.String str15 = undertowEmbeddedServletContainerFactory13.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray18 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19, errorPageArray18);
        undertowEmbeddedServletContainerFactory17.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet19);
        undertowEmbeddedServletContainerFactory13.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer30 = undertowEmbeddedServletContainerFactory26.getEmbeddedServletContainer(servletContextInitializerArray29);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer32 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings33 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.Ssl ssl36 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        int int39 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection40 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(errorPageArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNotNull(embeddedServletContainer30);
        org.junit.Assert.assertNotNull(embeddedServletContainer32);
        org.junit.Assert.assertNotNull(mimeMappings33);
        org.junit.Assert.assertNull(ssl36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection40);
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer17 };
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        boolean boolean22 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        boolean boolean10 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory15.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory15.getDeploymentInfoCustomizers();
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory15.setDocumentRoot(file18);
        undertowEmbeddedServletContainerFactory15.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory15.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory15.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage26 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray27 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage26 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray27);
        undertowEmbeddedServletContainerFactory15.setJspServletClassName("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory15.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray35 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36, errorPageArray35);
        undertowEmbeddedServletContainerFactory34.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36);
        java.net.InetAddress inetAddress39 = undertowEmbeddedServletContainerFactory34.getAddress();
        java.net.InetAddress inetAddress40 = null;
        undertowEmbeddedServletContainerFactory34.setAddress(inetAddress40);
        org.springframework.boot.context.embedded.Ssl ssl42 = undertowEmbeddedServletContainerFactory34.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection43 = undertowEmbeddedServletContainerFactory34.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory45.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer48 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray49 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer48 };
        undertowEmbeddedServletContainerFactory45.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray49);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray49);
        int int52 = undertowEmbeddedServletContainerFactory34.getPort();
        boolean boolean53 = undertowEmbeddedServletContainerFactory34.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory34.setPort((int) (short) 0);
        undertowEmbeddedServletContainerFactory34.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet60 = undertowEmbeddedServletContainerFactory59.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection61 = undertowEmbeddedServletContainerFactory59.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory59.setSessionTimeout(100);
        java.lang.String str64 = undertowEmbeddedServletContainerFactory59.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean67 = undertowEmbeddedServletContainerFactory66.isRegisterDefaultServlet();
        java.lang.String str68 = undertowEmbeddedServletContainerFactory66.getContextPath();
        java.net.InetAddress inetAddress69 = undertowEmbeddedServletContainerFactory66.getAddress();
        undertowEmbeddedServletContainerFactory66.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray74 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet75 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet75, errorPageArray74);
        undertowEmbeddedServletContainerFactory73.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet75);
        java.net.InetAddress inetAddress78 = undertowEmbeddedServletContainerFactory73.getAddress();
        java.net.InetAddress inetAddress79 = null;
        undertowEmbeddedServletContainerFactory73.setAddress(inetAddress79);
        org.springframework.boot.context.embedded.Ssl ssl81 = undertowEmbeddedServletContainerFactory73.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection82 = undertowEmbeddedServletContainerFactory73.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory84 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory84.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer87 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray88 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer87 };
        undertowEmbeddedServletContainerFactory84.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory73.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory66.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory59.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray88);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection95 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 32);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Undertow does not support JSPs");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertNotNull(errorPageArray27);
        org.junit.Assert.assertNotNull(errorPageSet31);
        org.junit.Assert.assertNotNull(errorPageArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(inetAddress39);
        org.junit.Assert.assertNull(ssl42);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection43);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(errorPageSet60);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(inetAddress69);
        org.junit.Assert.assertNotNull(errorPageArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(inetAddress78);
        org.junit.Assert.assertNull(ssl81);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection82);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray88);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection95);
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '4');
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1));
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer9 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer9 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray10);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean19 = undertowEmbeddedServletContainerFactory18.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl22 = undertowEmbeddedServletContainerFactory18.getSsl();
        java.net.InetAddress inetAddress23 = null;
        undertowEmbeddedServletContainerFactory18.setAddress(inetAddress23);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory18.setResourceLoader(resourceLoader25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = undertowEmbeddedServletContainerFactory28.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory31.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection33 = undertowEmbeddedServletContainerFactory31.getDeploymentInfoCustomizers();
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory31.setDocumentRoot(file34);
        undertowEmbeddedServletContainerFactory31.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory31.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory31.setSessionTimeout((int) (short) 10);
        org.springframework.boot.context.embedded.ErrorPage errorPage42 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray43 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage42 };
        undertowEmbeddedServletContainerFactory31.addErrorPages(errorPageArray43);
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray43);
        undertowEmbeddedServletContainerFactory18.addErrorPages(errorPageArray43);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray43);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray50 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet51 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet51, errorPageArray50);
        undertowEmbeddedServletContainerFactory49.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet51);
        java.net.InetAddress inetAddress54 = undertowEmbeddedServletContainerFactory49.getAddress();
        java.net.InetAddress inetAddress55 = null;
        undertowEmbeddedServletContainerFactory49.setAddress(inetAddress55);
        org.springframework.boot.context.embedded.Ssl ssl57 = undertowEmbeddedServletContainerFactory49.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection58 = undertowEmbeddedServletContainerFactory49.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory49.setWorkerThreads((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory49.setPort((int) '4');
        undertowEmbeddedServletContainerFactory49.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory49.setSessionTimeout(0);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet67 = undertowEmbeddedServletContainerFactory49.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet67);
        org.springframework.core.io.ResourceLoader resourceLoader69 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader69);
        int int71 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray10);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(errorPageSet14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(ssl22);
        org.junit.Assert.assertNotNull(errorPageSet29);
        org.junit.Assert.assertNotNull(errorPageSet32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection33);
        org.junit.Assert.assertNotNull(errorPageArray43);
        org.junit.Assert.assertNotNull(errorPageArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inetAddress54);
        org.junit.Assert.assertNull(ssl57);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection58);
        org.junit.Assert.assertNotNull(errorPageSet67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet2 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file4);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4');
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNotNull(errorPageSet2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inetAddress11);
        org.junit.Assert.assertNotNull(errorPageSet12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertNull(ssl14);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 8080);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file18);
        int int20 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file23);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet25 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Ssl ssl26 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(errorPageSet25);
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 0);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout(97);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory2.setDocumentRoot(file9);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(mimeMappings4);
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory8.getAddress();
        java.net.InetAddress inetAddress14 = null;
        undertowEmbeddedServletContainerFactory8.setAddress(inetAddress14);
        int int16 = undertowEmbeddedServletContainerFactory8.getSessionTimeout();
        undertowEmbeddedServletContainerFactory8.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str19 = undertowEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        undertowEmbeddedServletContainerFactory20.setResourceLoader(resourceLoader21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean25 = undertowEmbeddedServletContainerFactory24.isRegisterDefaultServlet();
        java.lang.String str26 = undertowEmbeddedServletContainerFactory24.getContextPath();
        undertowEmbeddedServletContainerFactory24.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer34 = undertowEmbeddedServletContainerFactory30.getEmbeddedServletContainer(servletContextInitializerArray33);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer35 = undertowEmbeddedServletContainerFactory24.getEmbeddedServletContainer(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray33);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer38 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray33);
        java.lang.Class<?> wildcardClass39 = embeddedServletContainer38.getClass();
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(errorPageArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1800 + "'", int16 == 1800);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        org.junit.Assert.assertNotNull(embeddedServletContainer34);
        org.junit.Assert.assertNotNull(embeddedServletContainer35);
        org.junit.Assert.assertNotNull(embeddedServletContainer38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        java.net.InetAddress inetAddress16 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress16);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file22);
        int int24 = undertowEmbeddedServletContainerFactory21.getSessionTimeout();
        int int25 = undertowEmbeddedServletContainerFactory21.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29, errorPageArray28);
        undertowEmbeddedServletContainerFactory27.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet29);
        java.net.InetAddress inetAddress32 = undertowEmbeddedServletContainerFactory27.getAddress();
        java.net.InetAddress inetAddress33 = null;
        undertowEmbeddedServletContainerFactory27.setAddress(inetAddress33);
        boolean boolean35 = undertowEmbeddedServletContainerFactory27.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory27.setSessionTimeout((int) (byte) 0);
        undertowEmbeddedServletContainerFactory27.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory27.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        java.net.InetAddress inetAddress44 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress44);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings46 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet47 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray52 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer53 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray52);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet56 = undertowEmbeddedServletContainerFactory55.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection57 = undertowEmbeddedServletContainerFactory55.getDeploymentInfoCustomizers();
        java.io.File file58 = null;
        undertowEmbeddedServletContainerFactory55.setDocumentRoot(file58);
        undertowEmbeddedServletContainerFactory55.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings62 = undertowEmbeddedServletContainerFactory55.getMimeMappings();
        undertowEmbeddedServletContainerFactory49.setMimeMappings(mimeMappings62);
        org.springframework.boot.context.embedded.Ssl ssl64 = undertowEmbeddedServletContainerFactory49.getSsl();
        undertowEmbeddedServletContainerFactory49.setJspServletClassName("hi!");
        int int67 = undertowEmbeddedServletContainerFactory49.getSessionTimeout();
        undertowEmbeddedServletContainerFactory49.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings70 = undertowEmbeddedServletContainerFactory49.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings70);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1800 + "'", int24 == 1800);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1800 + "'", int25 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inetAddress32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertNotNull(mimeMappings46);
        org.junit.Assert.assertNotNull(errorPageSet47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray52);
        org.junit.Assert.assertNotNull(embeddedServletContainer53);
        org.junit.Assert.assertNotNull(errorPageSet56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection57);
        org.junit.Assert.assertNotNull(mimeMappings62);
        org.junit.Assert.assertNull(ssl64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1800 + "'", int67 == 1800);
        org.junit.Assert.assertNotNull(mimeMappings70);
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14, errorPageArray13);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        int int19 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isRegisterDefaultServlet();
        java.lang.String str24 = undertowEmbeddedServletContainerFactory22.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray27 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet28, errorPageArray27);
        undertowEmbeddedServletContainerFactory26.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet28);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet28);
        undertowEmbeddedServletContainerFactory22.setContextPath("");
        undertowEmbeddedServletContainerFactory22.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory22.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory22.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43, errorPageArray42);
        undertowEmbeddedServletContainerFactory41.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43);
        java.net.InetAddress inetAddress46 = undertowEmbeddedServletContainerFactory41.getAddress();
        java.net.InetAddress inetAddress47 = null;
        undertowEmbeddedServletContainerFactory41.setAddress(inetAddress47);
        int int49 = undertowEmbeddedServletContainerFactory41.getSessionTimeout();
        undertowEmbeddedServletContainerFactory41.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.core.io.ResourceLoader resourceLoader52 = null;
        undertowEmbeddedServletContainerFactory41.setResourceLoader(resourceLoader52);
        org.springframework.boot.context.embedded.ErrorPage errorPage54 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage54 };
        undertowEmbeddedServletContainerFactory41.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray55);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(ssl10);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1800 + "'", int19 == 1800);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(errorPageArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(errorPageArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inetAddress46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1800 + "'", int49 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray55);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory10.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory10.getSsl();
        undertowEmbeddedServletContainerFactory10.setBuffersPerRegion((java.lang.Integer) 100);
        boolean boolean16 = undertowEmbeddedServletContainerFactory10.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 0);
        undertowEmbeddedServletContainerFactory18.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isRegisterDefaultServlet();
        int int24 = undertowEmbeddedServletContainerFactory22.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean27 = undertowEmbeddedServletContainerFactory26.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory26.getSsl();
        java.net.InetAddress inetAddress31 = null;
        undertowEmbeddedServletContainerFactory26.setAddress(inetAddress31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean35 = undertowEmbeddedServletContainerFactory34.isRegisterDefaultServlet();
        java.lang.String str36 = undertowEmbeddedServletContainerFactory34.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray39 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40, errorPageArray39);
        undertowEmbeddedServletContainerFactory38.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory34.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory34.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer50 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray51 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer50 };
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        boolean boolean57 = undertowEmbeddedServletContainerFactory18.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings58 = undertowEmbeddedServletContainerFactory18.getMimeMappings();
        undertowEmbeddedServletContainerFactory10.setMimeMappings(mimeMappings58);
        undertowEmbeddedServletContainerFactory10.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory63.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray68 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet69 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet69, errorPageArray68);
        undertowEmbeddedServletContainerFactory67.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet69);
        java.net.InetAddress inetAddress72 = undertowEmbeddedServletContainerFactory67.getAddress();
        undertowEmbeddedServletContainerFactory67.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer75 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray76 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer75 };
        undertowEmbeddedServletContainerFactory67.addBuilderCustomizers(undertowBuilderCustomizerArray76);
        undertowEmbeddedServletContainerFactory63.addBuilderCustomizers(undertowBuilderCustomizerArray76);
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray76);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray76);
        boolean boolean81 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setPort((int) 'a');
        org.springframework.boot.context.embedded.Ssl ssl84 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl84);
        java.io.File file86 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file86);
        org.junit.Assert.assertNotNull(errorPageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1800 + "'", int24 == 1800);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(ssl30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorPageArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(mimeMappings58);
        org.junit.Assert.assertNotNull(errorPageArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(inetAddress72);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 8080);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Undertow does not support JSPs");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(ssl7);
        org.junit.Assert.assertNotNull(mimeMappings8);
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        int int13 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isRegisterJspServlet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1800 + "'", int13 == 1800);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet9 = undertowEmbeddedServletContainerFactory8.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory8.getDeploymentInfoCustomizers();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer14 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap13);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer12, initParameterConfiguringServletContextInitializer14 };
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray15);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl18);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection20 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl22 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl22);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean25 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray30 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer31 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray30);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory33.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection35 = undertowEmbeddedServletContainerFactory33.getDeploymentInfoCustomizers();
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory33.setDocumentRoot(file36);
        undertowEmbeddedServletContainerFactory33.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings40 = undertowEmbeddedServletContainerFactory33.getMimeMappings();
        undertowEmbeddedServletContainerFactory27.setMimeMappings(mimeMappings40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray44 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet45 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45, errorPageArray44);
        undertowEmbeddedServletContainerFactory43.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet45);
        java.net.InetAddress inetAddress48 = undertowEmbeddedServletContainerFactory43.getAddress();
        java.net.InetAddress inetAddress49 = null;
        undertowEmbeddedServletContainerFactory43.setAddress(inetAddress49);
        int int51 = undertowEmbeddedServletContainerFactory43.getSessionTimeout();
        undertowEmbeddedServletContainerFactory43.setWorkerThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.ErrorPage errorPage54 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage54 };
        undertowEmbeddedServletContainerFactory43.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray55);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet59 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNotNull(errorPageSet9);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(servletContextInitializerArray30);
        org.junit.Assert.assertNotNull(embeddedServletContainer31);
        org.junit.Assert.assertNotNull(errorPageSet34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection35);
        org.junit.Assert.assertNotNull(mimeMappings40);
        org.junit.Assert.assertNotNull(errorPageArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inetAddress48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1800 + "'", int51 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray55);
        org.junit.Assert.assertNotNull(errorPageSet59);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress3 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress3);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        org.springframework.boot.context.embedded.MimeMappings mimeMappings2 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.net.InetAddress inetAddress5 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress5);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.io.File file14 = undertowEmbeddedServletContainerFactory13.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18, errorPageArray17);
        undertowEmbeddedServletContainerFactory16.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet18);
        undertowEmbeddedServletContainerFactory16.setContextPath("");
        undertowEmbeddedServletContainerFactory16.setBuffersPerRegion((java.lang.Integer) 1);
        java.net.InetAddress inetAddress25 = null;
        undertowEmbeddedServletContainerFactory16.setAddress(inetAddress25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean29 = undertowEmbeddedServletContainerFactory28.isRegisterDefaultServlet();
        java.lang.String str30 = undertowEmbeddedServletContainerFactory28.getContextPath();
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory28.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory36.setPort(0);
        java.net.InetAddress inetAddress42 = undertowEmbeddedServletContainerFactory36.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet45 = undertowEmbeddedServletContainerFactory44.getErrorPages();
        java.io.File file46 = undertowEmbeddedServletContainerFactory44.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet50, errorPageArray49);
        undertowEmbeddedServletContainerFactory48.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet50);
        java.net.InetAddress inetAddress53 = undertowEmbeddedServletContainerFactory48.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray56 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57, errorPageArray56);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet57);
        java.net.InetAddress inetAddress60 = undertowEmbeddedServletContainerFactory55.getAddress();
        java.net.InetAddress inetAddress61 = null;
        undertowEmbeddedServletContainerFactory55.setAddress(inetAddress61);
        int int63 = undertowEmbeddedServletContainerFactory55.getSessionTimeout();
        undertowEmbeddedServletContainerFactory55.setWorkerThreads((java.lang.Integer) 1800);
        java.lang.String str66 = undertowEmbeddedServletContainerFactory55.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.core.io.ResourceLoader resourceLoader68 = null;
        undertowEmbeddedServletContainerFactory67.setResourceLoader(resourceLoader68);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        boolean boolean72 = undertowEmbeddedServletContainerFactory71.isRegisterDefaultServlet();
        java.lang.String str73 = undertowEmbeddedServletContainerFactory71.getContextPath();
        undertowEmbeddedServletContainerFactory71.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory77 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory77.setPort((int) (short) -1);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray80 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer81 = undertowEmbeddedServletContainerFactory77.getEmbeddedServletContainer(servletContextInitializerArray80);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer82 = undertowEmbeddedServletContainerFactory71.getEmbeddedServletContainer(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory67.addInitializers(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory55.addInitializers(servletContextInitializerArray80);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory48.getEmbeddedServletContainer(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray80);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer87 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray80);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer91 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray80);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 35);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(52);
        java.io.File file98 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNotNull(mimeMappings2);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(errorPageSet37);
        org.junit.Assert.assertNull(inetAddress42);
        org.junit.Assert.assertNotNull(errorPageSet45);
        org.junit.Assert.assertNull(file46);
        org.junit.Assert.assertNotNull(errorPageArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inetAddress53);
        org.junit.Assert.assertNotNull(errorPageArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inetAddress60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1800 + "'", int63 == 1800);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray80);
        org.junit.Assert.assertNotNull(embeddedServletContainer81);
        org.junit.Assert.assertNotNull(embeddedServletContainer82);
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        org.junit.Assert.assertNotNull(embeddedServletContainer87);
        org.junit.Assert.assertNotNull(embeddedServletContainer91);
        org.junit.Assert.assertNull(file98);
    }
}

