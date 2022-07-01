import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Compression compression6 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression6);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 10);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory9.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory9.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory9.setPersistSession(true);
        undertowEmbeddedServletContainerFactory9.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory9.setBufferSize((java.lang.Integer) (-1));
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        undertowEmbeddedServletContainerFactory2.setErrorPages(errorPageSet22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.net.InetAddress inetAddress26 = null;
        undertowEmbeddedServletContainerFactory25.setAddress(inetAddress26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory29.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory29.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer38 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer40 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap39);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer36, initParameterConfiguringServletContextInitializer38, initParameterConfiguringServletContextInitializer40 };
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray41);
        undertowEmbeddedServletContainerFactory29.setBufferSize((java.lang.Integer) (-1));
        java.lang.String str45 = undertowEmbeddedServletContainerFactory29.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory47.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl52 = undertowEmbeddedServletContainerFactory47.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer54 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer56 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer58 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap57);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer54, initParameterConfiguringServletContextInitializer56, initParameterConfiguringServletContextInitializer58 };
        undertowEmbeddedServletContainerFactory47.addInitializers(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory47.setJspServletClassName("hi!");
        int int63 = undertowEmbeddedServletContainerFactory47.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = undertowEmbeddedServletContainerFactory47.getErrorPages();
        undertowEmbeddedServletContainerFactory29.setErrorPages(errorPageSet64);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file68 = null;
        undertowEmbeddedServletContainerFactory67.setAccessLogDirectory(file68);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray70 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory67.addErrorPages(errorPageArray70);
        undertowEmbeddedServletContainerFactory29.addErrorPages(errorPageArray70);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory74 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory74.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray79 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory78.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory82 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray83 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory82.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray83);
        undertowEmbeddedServletContainerFactory78.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray83);
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray83);
        java.lang.String str87 = undertowEmbeddedServletContainerFactory74.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory89 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory89.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory89.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray94 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer95 = undertowEmbeddedServletContainerFactory89.getEmbeddedServletContainer(servletContextInitializerArray94);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer96 = undertowEmbeddedServletContainerFactory74.getEmbeddedServletContainer(servletContextInitializerArray94);
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray94);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer98 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray94);
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(errorPageSet22);
        org.junit.Assert.assertNull(ssl34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(ssl52);
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet64);
        org.junit.Assert.assertNotNull(errorPageArray70);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray79);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray83);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(servletContextInitializerArray94);
        org.junit.Assert.assertNotNull(embeddedServletContainer95);
        org.junit.Assert.assertNotNull(embeddedServletContainer96);
        org.junit.Assert.assertNotNull(embeddedServletContainer98);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory9.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory9.getSsl();
        boolean boolean15 = undertowEmbeddedServletContainerFactory9.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory17.setPersistSession(false);
        boolean boolean22 = undertowEmbeddedServletContainerFactory17.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory24.setPort((int) (byte) -1);
        boolean boolean27 = undertowEmbeddedServletContainerFactory24.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory29.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl34 = null;
        undertowEmbeddedServletContainerFactory29.setSsl(ssl34);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray36 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory29.addErrorPages(errorPageArray36);
        undertowEmbeddedServletContainerFactory24.addErrorPages(errorPageArray36);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray36);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer40 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer40 };
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory9.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings49 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file50 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file50);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(errorPageArray36);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray41);
        org.junit.Assert.assertNotNull(mimeMappings49);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 97);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        int int4 = undertowEmbeddedServletContainerFactory2.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray7 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory6.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray7);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory6.setSsl(ssl9);
        undertowEmbeddedServletContainerFactory6.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory6.setResourceLoader(resourceLoader14);
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory6.setResourceLoader(resourceLoader16);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory6.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory20.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory20.setResourceLoader(resourceLoader25);
        org.springframework.boot.context.embedded.Compression compression27 = null;
        undertowEmbeddedServletContainerFactory20.setCompression(compression27);
        undertowEmbeddedServletContainerFactory20.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory32.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl37 = undertowEmbeddedServletContainerFactory32.getSsl();
        boolean boolean38 = undertowEmbeddedServletContainerFactory32.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet39 = null;
        undertowEmbeddedServletContainerFactory32.setJspServlet(jspServlet39);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = undertowEmbeddedServletContainerFactory32.getMimeMappings();
        undertowEmbeddedServletContainerFactory20.setMimeMappings(mimeMappings41);
        undertowEmbeddedServletContainerFactory20.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.core.io.ResourceLoader resourceLoader45 = null;
        undertowEmbeddedServletContainerFactory20.setResourceLoader(resourceLoader45);
        undertowEmbeddedServletContainerFactory20.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray51 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        org.springframework.boot.context.embedded.Ssl ssl53 = null;
        undertowEmbeddedServletContainerFactory50.setSsl(ssl53);
        undertowEmbeddedServletContainerFactory50.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory50.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.Compression compression59 = null;
        undertowEmbeddedServletContainerFactory50.setCompression(compression59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory62.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory62.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl67 = undertowEmbeddedServletContainerFactory62.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer69 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer71 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer73 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap72);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray74 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer69, initParameterConfiguringServletContextInitializer71, initParameterConfiguringServletContextInitializer73 };
        undertowEmbeddedServletContainerFactory62.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory62.setJspServletClassName("hi!");
        int int78 = undertowEmbeddedServletContainerFactory62.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet79 = undertowEmbeddedServletContainerFactory62.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet80 = undertowEmbeddedServletContainerFactory62.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray81 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory62.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory50.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory6.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory2.addBuilderCustomizers(undertowBuilderCustomizerArray81);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) true);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray7);
        org.junit.Assert.assertNotNull(errorPageSet13);
        org.junit.Assert.assertNull(inetAddress18);
        org.junit.Assert.assertNull(ssl37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mimeMappings41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray51);
        org.junit.Assert.assertNull(ssl67);
        org.junit.Assert.assertNotNull(servletContextInitializerArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet79);
        org.junit.Assert.assertNotNull(jspServlet80);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray81);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Compression compression6 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression6);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.boot.context.embedded.JspServlet jspServlet9 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        int int10 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(jspServlet8);
        org.junit.Assert.assertNotNull(jspServlet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1800 + "'", int10 == 1800);
        org.junit.Assert.assertNull(ssl15);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file17);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.net.InetAddress inetAddress21 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setPort((-1));
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inetAddress21);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        int int8 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory1.getAddress();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory16.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory16.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory16.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer27 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap26);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25, initParameterConfiguringServletContextInitializer27 };
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray28);
        undertowEmbeddedServletContainerFactory16.setJspServletClassName("hi!");
        int int32 = undertowEmbeddedServletContainerFactory16.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet33 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory35.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        java.lang.String str48 = undertowEmbeddedServletContainerFactory35.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory50.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory50.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory50.getEmbeddedServletContainer(servletContextInitializerArray55);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory35.getEmbeddedServletContainer(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray55);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer59 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file62 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file62);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1800 + "'", int8 == 1800);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(ssl21);
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet33);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        org.junit.Assert.assertNotNull(embeddedServletContainer59);
        org.junit.Assert.assertNotNull(errorPageSet64);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.springframework.boot.context.embedded.Compression compression10 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression10);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNull(ssl12);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet5 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory9.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory13.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory13.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory13.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings19 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings19);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings19);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file22);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        boolean boolean26 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNotNull(errorPageSet5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
        org.junit.Assert.assertNotNull(mimeMappings19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        boolean boolean14 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory12.setAccessLogDirectory(file15);
        undertowEmbeddedServletContainerFactory12.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray21);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory20.setSsl(ssl23);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory34.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        java.lang.String str47 = undertowEmbeddedServletContainerFactory34.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory49.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory34.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray54);
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray54);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray54);
        java.io.File file60 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression61 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression61);
        java.io.File file63 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file63);
        org.springframework.core.io.ResourceLoader resourceLoader65 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader65);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray21);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        org.junit.Assert.assertNull(file60);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        boolean boolean32 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 52);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection2 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression7 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection2);
        org.junit.Assert.assertNull(compression7);
        org.junit.Assert.assertNull(inetAddress8);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory13.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory13.setResourceLoader(resourceLoader18);
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory13.setCompression(compression20);
        java.lang.String str22 = undertowEmbeddedServletContainerFactory13.getContextPath();
        undertowEmbeddedServletContainerFactory13.setUseForwardHeaders(true);
        java.lang.String str25 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory27.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory27.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer34 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer38 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap37);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer34, initParameterConfiguringServletContextInitializer36, initParameterConfiguringServletContextInitializer38 };
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray39);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray39);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray39);
        java.io.File file43 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet44 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        boolean boolean45 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(ssl32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(errorPageSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(errorPageSet46);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(compression14);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory17.setPersistSession(false);
        boolean boolean22 = undertowEmbeddedServletContainerFactory17.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory17.getErrorPages();
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory17.setAccessLogDirectory(file24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file28 = undertowEmbeddedServletContainerFactory27.getSessionStoreDir();
        boolean boolean29 = undertowEmbeddedServletContainerFactory27.isAccessLogEnabled();
        java.io.File file30 = null;
        undertowEmbeddedServletContainerFactory27.setAccessLogDirectory(file30);
        undertowEmbeddedServletContainerFactory27.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray36 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        org.springframework.boot.context.embedded.Ssl ssl38 = null;
        undertowEmbeddedServletContainerFactory35.setSsl(ssl38);
        org.springframework.boot.context.embedded.Ssl ssl40 = undertowEmbeddedServletContainerFactory35.getSsl();
        undertowEmbeddedServletContainerFactory35.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory35.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory35.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory35.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory49.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray54 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory53.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray58 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory57.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        undertowEmbeddedServletContainerFactory53.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        undertowEmbeddedServletContainerFactory49.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray58);
        java.lang.String str62 = undertowEmbeddedServletContainerFactory49.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory64.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory64.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray69 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer70 = undertowEmbeddedServletContainerFactory64.getEmbeddedServletContainer(servletContextInitializerArray69);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer71 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray69);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer72 = undertowEmbeddedServletContainerFactory35.getEmbeddedServletContainer(servletContextInitializerArray69);
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray69);
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray69);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray69);
        org.springframework.boot.context.embedded.Ssl ssl76 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNull(compression13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray36);
        org.junit.Assert.assertNull(ssl40);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray54);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray58);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(servletContextInitializerArray69);
        org.junit.Assert.assertNotNull(embeddedServletContainer70);
        org.junit.Assert.assertNotNull(embeddedServletContainer71);
        org.junit.Assert.assertNotNull(embeddedServletContainer72);
        org.junit.Assert.assertNull(ssl76);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory5.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory5.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.Compression compression12 = null;
        undertowEmbeddedServletContainerFactory5.setCompression(compression12);
        undertowEmbeddedServletContainerFactory5.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory17.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl22 = undertowEmbeddedServletContainerFactory17.getSsl();
        boolean boolean23 = undertowEmbeddedServletContainerFactory17.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = null;
        undertowEmbeddedServletContainerFactory17.setJspServlet(jspServlet24);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory17.getMimeMappings();
        undertowEmbeddedServletContainerFactory5.setMimeMappings(mimeMappings26);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings26);
        boolean boolean29 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file34);
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file36);
        int int38 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet39 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet40 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet40);
        undertowEmbeddedServletContainerFactory1.setPort(100);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mimeMappings26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(errorPageSet39);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.core.io.ResourceLoader resourceLoader3 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader3);
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory10.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory10.getSsl();
        boolean boolean16 = undertowEmbeddedServletContainerFactory10.isAccessLogEnabled();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory10.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20, errorPageArray19);
        undertowEmbeddedServletContainerFactory10.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        undertowEmbeddedServletContainerFactory10.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet26);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file35);
        org.springframework.boot.context.embedded.Ssl ssl37 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mimeMappings25);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNull(inetAddress28);
        org.junit.Assert.assertNull(ssl37);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory11.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        org.springframework.boot.context.embedded.Ssl ssl17 = null;
        undertowEmbeddedServletContainerFactory9.setSsl(ssl17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory20.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        boolean boolean26 = undertowEmbeddedServletContainerFactory20.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet27 = null;
        undertowEmbeddedServletContainerFactory20.setJspServlet(jspServlet27);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings29);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory35.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory35.setSsl(ssl40);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file48 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int49 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray14);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mimeMappings29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNotNull(errorPageArray42);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(errorPageSet50);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection31 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.net.InetAddress inetAddress33 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress33);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection31);
        org.junit.Assert.assertNotNull(errorPageSet32);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file21);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl23);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection25 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setPort(97);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file8 = undertowEmbeddedServletContainerFactory7.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory7.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory12.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer19 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap18);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer19, initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23 };
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray24);
        undertowEmbeddedServletContainerFactory7.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory7.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory7.setPersistSession(false);
        org.springframework.boot.context.embedded.Compression compression33 = undertowEmbeddedServletContainerFactory7.getCompression();
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory7.setAccessLogDirectory(file34);
        undertowEmbeddedServletContainerFactory7.setDisplayName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings38 = undertowEmbeddedServletContainerFactory7.getMimeMappings();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection39 = undertowEmbeddedServletContainerFactory7.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory41.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        org.springframework.boot.context.embedded.Ssl ssl44 = null;
        undertowEmbeddedServletContainerFactory41.setSsl(ssl44);
        org.springframework.boot.context.embedded.Ssl ssl46 = undertowEmbeddedServletContainerFactory41.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray49 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory48.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray49);
        org.springframework.boot.context.embedded.Ssl ssl51 = null;
        undertowEmbeddedServletContainerFactory48.setSsl(ssl51);
        undertowEmbeddedServletContainerFactory48.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory56.setAccessLogDirectory(file57);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray59 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory56.addErrorPages(errorPageArray59);
        org.springframework.boot.context.embedded.Compression compression61 = undertowEmbeddedServletContainerFactory56.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet62 = undertowEmbeddedServletContainerFactory56.getJspServlet();
        undertowEmbeddedServletContainerFactory48.setJspServlet(jspServlet62);
        undertowEmbeddedServletContainerFactory41.setJspServlet(jspServlet62);
        undertowEmbeddedServletContainerFactory7.setJspServlet(jspServlet62);
        org.springframework.boot.context.embedded.Compression compression66 = undertowEmbeddedServletContainerFactory7.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray69 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray69);
        org.springframework.boot.context.embedded.Ssl ssl71 = null;
        undertowEmbeddedServletContainerFactory68.setSsl(ssl71);
        org.springframework.boot.context.embedded.Ssl ssl73 = undertowEmbeddedServletContainerFactory68.getSsl();
        undertowEmbeddedServletContainerFactory68.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory68.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory68.setJspServletClassName("");
        boolean boolean80 = undertowEmbeddedServletContainerFactory68.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory68.setSessionTimeout((int) (short) 10);
        boolean boolean83 = undertowEmbeddedServletContainerFactory68.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory68.setAccessLogEnabled(true);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet86 = undertowEmbeddedServletContainerFactory68.getErrorPages();
        undertowEmbeddedServletContainerFactory7.setErrorPages(errorPageSet86);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet86);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNull(compression33);
        org.junit.Assert.assertNotNull(mimeMappings38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection39);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
        org.junit.Assert.assertNull(ssl46);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray49);
        org.junit.Assert.assertNotNull(errorPageArray59);
        org.junit.Assert.assertNull(compression61);
        org.junit.Assert.assertNotNull(jspServlet62);
        org.junit.Assert.assertNull(compression66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray69);
        org.junit.Assert.assertNull(ssl73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(errorPageSet86);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int10 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        boolean boolean39 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        int int42 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = null;
        undertowEmbeddedServletContainerFactory4.setSsl(ssl7);
        undertowEmbeddedServletContainerFactory4.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory12.setAccessLogDirectory(file13);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray15);
        org.springframework.boot.context.embedded.Compression compression17 = undertowEmbeddedServletContainerFactory12.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet18 = undertowEmbeddedServletContainerFactory12.getJspServlet();
        undertowEmbeddedServletContainerFactory4.setJspServlet(jspServlet18);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet18);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Compression compression23 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        org.junit.Assert.assertNotNull(errorPageArray15);
        org.junit.Assert.assertNull(compression17);
        org.junit.Assert.assertNotNull(jspServlet18);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file2);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray4 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray4);
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(97);
        org.junit.Assert.assertNotNull(errorPageArray4);
        org.junit.Assert.assertNull(compression6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11, errorPageArray10);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file18);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file2);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray4 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray4);
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet7 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory14.setSessionStoreDir(file19);
        java.net.InetAddress inetAddress21 = undertowEmbeddedServletContainerFactory14.getAddress();
        undertowEmbeddedServletContainerFactory14.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings24 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings24);
        org.junit.Assert.assertNotNull(errorPageArray4);
        org.junit.Assert.assertNull(compression6);
        org.junit.Assert.assertNotNull(jspServlet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inetAddress21);
        org.junit.Assert.assertNotNull(mimeMappings24);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray20);
        undertowEmbeddedServletContainerFactory15.addBuilderCustomizers(undertowBuilderCustomizerArray20);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory25.setAccessLogDirectory(file26);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray28);
        org.springframework.boot.context.embedded.Compression compression30 = undertowEmbeddedServletContainerFactory25.getCompression();
        java.lang.String str31 = undertowEmbeddedServletContainerFactory25.getContextPath();
        org.springframework.boot.context.embedded.JspServlet jspServlet32 = undertowEmbeddedServletContainerFactory25.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet32);
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl35);
        java.net.InetAddress inetAddress37 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress37);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.junit.Assert.assertNull(ssl12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray20);
        org.junit.Assert.assertNotNull(errorPageArray28);
        org.junit.Assert.assertNull(compression30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(jspServlet32);
        org.junit.Assert.assertNull(ssl34);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file12 = undertowEmbeddedServletContainerFactory11.getSessionStoreDir();
        boolean boolean13 = undertowEmbeddedServletContainerFactory11.isAccessLogEnabled();
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory11.setAccessLogDirectory(file14);
        undertowEmbeddedServletContainerFactory11.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray20);
        org.springframework.boot.context.embedded.Ssl ssl22 = null;
        undertowEmbeddedServletContainerFactory19.setSsl(ssl22);
        org.springframework.boot.context.embedded.Ssl ssl24 = undertowEmbeddedServletContainerFactory19.getSsl();
        undertowEmbeddedServletContainerFactory19.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory19.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory19.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory33.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory41.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory33.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        java.lang.String str46 = undertowEmbeddedServletContainerFactory33.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory48.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory48.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray53 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer54 = undertowEmbeddedServletContainerFactory48.getEmbeddedServletContainer(servletContextInitializerArray53);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray53);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory19.getEmbeddedServletContainer(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray53);
        boolean boolean59 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.Compression compression60 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray20);
        org.junit.Assert.assertNull(ssl24);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray53);
        org.junit.Assert.assertNotNull(embeddedServletContainer54);
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(compression60);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        org.springframework.boot.context.embedded.Ssl ssl21 = null;
        undertowEmbeddedServletContainerFactory18.setSsl(ssl21);
        org.springframework.boot.context.embedded.Ssl ssl23 = undertowEmbeddedServletContainerFactory18.getSsl();
        org.springframework.boot.context.embedded.Compression compression24 = null;
        undertowEmbeddedServletContainerFactory18.setCompression(compression24);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory30.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory30.setSsl(ssl35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file39 = undertowEmbeddedServletContainerFactory38.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory38.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory43.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory43.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl48 = undertowEmbeddedServletContainerFactory43.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer50 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer52 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer54 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap53);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer50, initParameterConfiguringServletContextInitializer52, initParameterConfiguringServletContextInitializer54 };
        undertowEmbeddedServletContainerFactory43.addInitializers(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray55);
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray55);
        java.lang.String str59 = undertowEmbeddedServletContainerFactory30.getContextPath();
        undertowEmbeddedServletContainerFactory30.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory30.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.Ssl ssl64 = undertowEmbeddedServletContainerFactory30.getSsl();
        undertowEmbeddedServletContainerFactory30.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory68.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray73 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray73);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray77 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory76.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray77);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        org.junit.Assert.assertNull(ssl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertNull(ssl23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNull(ssl48);
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(ssl64);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray73);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray77);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file15);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory9.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings14);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory18.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl23 = undertowEmbeddedServletContainerFactory18.getSsl();
        boolean boolean24 = undertowEmbeddedServletContainerFactory18.isAccessLogEnabled();
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory18.setAccessLogDirectory(file25);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection27 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Compression compression28 = null;
        undertowEmbeddedServletContainerFactory18.setCompression(compression28);
        org.springframework.boot.context.embedded.Compression compression30 = undertowEmbeddedServletContainerFactory18.getCompression();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress34 = null;
        undertowEmbeddedServletContainerFactory33.setAddress(inetAddress34);
        java.net.InetAddress inetAddress36 = undertowEmbeddedServletContainerFactory33.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory38.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl43 = undertowEmbeddedServletContainerFactory38.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer45 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer47 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer49 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap48);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer45, initParameterConfiguringServletContextInitializer47, initParameterConfiguringServletContextInitializer49 };
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray50);
        undertowEmbeddedServletContainerFactory38.setJspServletClassName("hi!");
        int int54 = undertowEmbeddedServletContainerFactory38.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet55 = undertowEmbeddedServletContainerFactory38.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet56 = undertowEmbeddedServletContainerFactory38.getJspServlet();
        undertowEmbeddedServletContainerFactory33.setJspServlet(jspServlet56);
        java.lang.String str58 = undertowEmbeddedServletContainerFactory33.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray61 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory60.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray61);
        org.springframework.boot.context.embedded.Ssl ssl63 = null;
        undertowEmbeddedServletContainerFactory60.setSsl(ssl63);
        undertowEmbeddedServletContainerFactory60.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet67 = undertowEmbeddedServletContainerFactory60.getErrorPages();
        undertowEmbeddedServletContainerFactory60.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory74 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray75 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray79 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory78.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory60.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory33.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        java.lang.String str89 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(mimeMappings14);
        org.junit.Assert.assertNull(ssl23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection27);
        org.junit.Assert.assertNull(compression30);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNull(inetAddress36);
        org.junit.Assert.assertNull(ssl43);
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet55);
        org.junit.Assert.assertNotNull(jspServlet56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray61);
        org.junit.Assert.assertNotNull(errorPageSet67);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray75);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray79);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        int int6 = undertowEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress7 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        undertowEmbeddedServletContainerFactory9.setJspServletClassName("");
        java.io.File file15 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet16);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file23);
        java.lang.String str25 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl26 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(errorPageSet16);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory12.getSsl();
        boolean boolean18 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = null;
        undertowEmbeddedServletContainerFactory12.setJspServlet(jspServlet19);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings21);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory27.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl32 = null;
        undertowEmbeddedServletContainerFactory27.setSsl(ssl32);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray34 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray34);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray34);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        boolean boolean39 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression40 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression40);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        org.junit.Assert.assertNotNull(errorPageArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(32);
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory11.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory11.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress38 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress38);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        int int44 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray12);
        org.junit.Assert.assertNotNull(errorPageSet18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray30);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader4);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl11);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file14 = undertowEmbeddedServletContainerFactory13.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        undertowEmbeddedServletContainerFactory13.setJspServletClassName("");
        java.io.File file19 = undertowEmbeddedServletContainerFactory13.getSessionStoreDir();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        org.springframework.boot.context.embedded.Ssl ssl26 = null;
        undertowEmbeddedServletContainerFactory23.setSsl(ssl26);
        undertowEmbeddedServletContainerFactory23.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        undertowEmbeddedServletContainerFactory23.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory41.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.boot.context.embedded.Compression compression52 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression52);
        java.lang.String str54 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(errorPageSet20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertNotNull(errorPageSet30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
        org.junit.Assert.assertNotNull(errorPageSet49);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.lang.String str20 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file21);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(jspServlet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        boolean boolean19 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11, errorPageArray10);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file19 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.Compression compression20 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression20);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(ssl18);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1));
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setPort((int) (byte) -1);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory13.setSessionStoreDir(file16);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory13.setSessionStoreDir(file18);
        boolean boolean20 = undertowEmbeddedServletContainerFactory13.isAccessLogEnabled();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet21);
        org.springframework.core.io.ResourceLoader resourceLoader23 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageSet21);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet21 = null;
        undertowEmbeddedServletContainerFactory14.setJspServlet(jspServlet21);
        java.net.InetAddress inetAddress23 = undertowEmbeddedServletContainerFactory14.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings24 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        undertowEmbeddedServletContainerFactory14.setSessionTimeout(100);
        org.springframework.boot.context.embedded.Compression compression27 = undertowEmbeddedServletContainerFactory14.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory29.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader34 = null;
        undertowEmbeddedServletContainerFactory29.setResourceLoader(resourceLoader34);
        org.springframework.boot.context.embedded.Compression compression36 = null;
        undertowEmbeddedServletContainerFactory29.setCompression(compression36);
        undertowEmbeddedServletContainerFactory29.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Ssl ssl40 = undertowEmbeddedServletContainerFactory29.getSsl();
        java.io.File file41 = undertowEmbeddedServletContainerFactory29.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        org.springframework.boot.context.embedded.Ssl ssl46 = null;
        undertowEmbeddedServletContainerFactory43.setSsl(ssl46);
        org.springframework.boot.context.embedded.Ssl ssl48 = undertowEmbeddedServletContainerFactory43.getSsl();
        undertowEmbeddedServletContainerFactory43.setDisplayName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings51 = undertowEmbeddedServletContainerFactory43.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer52 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray53 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer52 };
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray53);
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray53);
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray53);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray53);
        java.io.File file58 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file58);
        int int60 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inetAddress23);
        org.junit.Assert.assertNotNull(mimeMappings24);
        org.junit.Assert.assertNull(compression27);
        org.junit.Assert.assertNull(ssl40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNull(ssl48);
        org.junit.Assert.assertNotNull(mimeMappings51);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1800 + "'", int60 == 1800);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(32);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory16.setSessionStoreDir(file19);
        undertowEmbeddedServletContainerFactory16.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray23);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory16.setResourceLoader(resourceLoader25);
        undertowEmbeddedServletContainerFactory16.setDisplayName("hi!");
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory16.setDocumentRoot(file29);
        org.springframework.boot.context.embedded.JspServlet jspServlet31 = undertowEmbeddedServletContainerFactory16.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        undertowEmbeddedServletContainerFactory33.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        boolean boolean43 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.Compression compression44 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.lang.String str45 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertNotNull(jspServlet31);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(compression44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(errorPageSet46);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory14.setAddress(inetAddress15);
        java.net.InetAddress inetAddress17 = undertowEmbeddedServletContainerFactory14.getAddress();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        int int19 = undertowEmbeddedServletContainerFactory14.getSessionTimeout();
        undertowEmbeddedServletContainerFactory14.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = undertowEmbeddedServletContainerFactory14.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet22);
        org.springframework.core.io.ResourceLoader resourceLoader24 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader24);
        org.springframework.boot.context.embedded.Compression compression26 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression26);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(inetAddress17);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1800 + "'", int19 == 1800);
        org.junit.Assert.assertNotNull(jspServlet22);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '#');
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader5);
        org.springframework.boot.context.embedded.Ssl ssl7 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl7);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file15 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("");
        java.io.File file20 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        java.lang.String str21 = undertowEmbeddedServletContainerFactory14.getDisplayName();
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory25.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory25.getSsl();
        boolean boolean31 = undertowEmbeddedServletContainerFactory25.isAccessLogEnabled();
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory25.setAccessLogDirectory(file32);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Compression compression35 = null;
        undertowEmbeddedServletContainerFactory25.setCompression(compression35);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings37 = undertowEmbeddedServletContainerFactory25.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory39.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl44 = undertowEmbeddedServletContainerFactory39.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer46 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer48 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap47);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer50 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap49);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray51 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer46, initParameterConfiguringServletContextInitializer48, initParameterConfiguringServletContextInitializer50 };
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray51);
        undertowEmbeddedServletContainerFactory39.setJspServletClassName("hi!");
        int int55 = undertowEmbeddedServletContainerFactory39.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet56 = undertowEmbeddedServletContainerFactory39.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory58.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray67 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory66.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        java.lang.String str71 = undertowEmbeddedServletContainerFactory58.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory73.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory73.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray78 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer79 = undertowEmbeddedServletContainerFactory73.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer80 = undertowEmbeddedServletContainerFactory58.getEmbeddedServletContainer(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer82 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer83 = undertowEmbeddedServletContainerFactory14.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(ssl30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        org.junit.Assert.assertNotNull(mimeMappings37);
        org.junit.Assert.assertNull(ssl44);
        org.junit.Assert.assertNotNull(servletContextInitializerArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray67);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(servletContextInitializerArray78);
        org.junit.Assert.assertNotNull(embeddedServletContainer79);
        org.junit.Assert.assertNotNull(embeddedServletContainer80);
        org.junit.Assert.assertNotNull(embeddedServletContainer82);
        org.junit.Assert.assertNotNull(embeddedServletContainer83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file15 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file16 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory18.setSessionStoreDir(file21);
        undertowEmbeddedServletContainerFactory18.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout(1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory18.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet27);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file29);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertNotNull(errorPageSet27);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        int int13 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1800 + "'", int13 == 1800);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress2 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress2);
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory6.setJspServletClassName("hi!");
        int int22 = undertowEmbeddedServletContainerFactory6.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = undertowEmbeddedServletContainerFactory6.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet24);
        java.lang.String str26 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.net.InetAddress inetAddress27 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress27);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str31 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean32 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings33 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertNotNull(jspServlet24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(mimeMappings33);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection20 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        boolean boolean23 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress24 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress24);
        boolean boolean26 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection27 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.Compression compression30 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory34.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader39 = null;
        undertowEmbeddedServletContainerFactory34.setResourceLoader(resourceLoader39);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory34.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        org.springframework.boot.context.embedded.Ssl ssl46 = null;
        undertowEmbeddedServletContainerFactory43.setSsl(ssl46);
        undertowEmbeddedServletContainerFactory43.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = undertowEmbeddedServletContainerFactory43.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader51 = null;
        undertowEmbeddedServletContainerFactory43.setResourceLoader(resourceLoader51);
        java.lang.String str53 = undertowEmbeddedServletContainerFactory43.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray56 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory55.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray56);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray60 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory59.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        undertowEmbeddedServletContainerFactory55.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        org.springframework.boot.context.embedded.Ssl ssl65 = undertowEmbeddedServletContainerFactory34.getSsl();
        undertowEmbeddedServletContainerFactory34.setDisplayName("");
        undertowEmbeddedServletContainerFactory34.setAccessLogPattern("");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet70 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory72.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory72.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader77 = null;
        undertowEmbeddedServletContainerFactory72.setResourceLoader(resourceLoader77);
        org.springframework.boot.context.embedded.Compression compression79 = null;
        undertowEmbeddedServletContainerFactory72.setCompression(compression79);
        java.lang.String str81 = undertowEmbeddedServletContainerFactory72.getContextPath();
        undertowEmbeddedServletContainerFactory72.setUseForwardHeaders(true);
        boolean boolean84 = undertowEmbeddedServletContainerFactory72.isAccessLogEnabled();
        int int85 = undertowEmbeddedServletContainerFactory72.getPort();
        boolean boolean86 = undertowEmbeddedServletContainerFactory72.isPersistSession();
        boolean boolean87 = undertowEmbeddedServletContainerFactory72.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings88 = undertowEmbeddedServletContainerFactory72.getMimeMappings();
        undertowEmbeddedServletContainerFactory34.setMimeMappings(mimeMappings88);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings88);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection27);
        org.junit.Assert.assertNull(compression30);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNotNull(errorPageSet50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray60);
        org.junit.Assert.assertNull(ssl65);
        org.junit.Assert.assertNotNull(errorPageSet70);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(mimeMappings88);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory12.setPersistSession(false);
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory12.setAddress(inetAddress17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory20.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer27 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer29 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer31 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap30);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer27, initParameterConfiguringServletContextInitializer29, initParameterConfiguringServletContextInitializer31 };
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray32);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("hi!");
        int int36 = undertowEmbeddedServletContainerFactory20.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory20.getErrorPages();
        undertowEmbeddedServletContainerFactory12.setErrorPages(errorPageSet37);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet37);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file44);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet37);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        int int14 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory18.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory18.setSsl(ssl23);
        undertowEmbeddedServletContainerFactory18.setPersistSession(true);
        undertowEmbeddedServletContainerFactory18.setRegisterDefaultServlet(true);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory18.setDocumentRoot(file29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray33);
        undertowEmbeddedServletContainerFactory32.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory32.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory40.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl45 = undertowEmbeddedServletContainerFactory40.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer47 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer49 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap48);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer51 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap50);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray52 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer47, initParameterConfiguringServletContextInitializer49, initParameterConfiguringServletContextInitializer51 };
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray52);
        undertowEmbeddedServletContainerFactory40.setJspServletClassName("hi!");
        int int56 = undertowEmbeddedServletContainerFactory40.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = undertowEmbeddedServletContainerFactory40.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet58 = undertowEmbeddedServletContainerFactory40.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray59 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory40.addBuilderCustomizers(undertowBuilderCustomizerArray59);
        undertowEmbeddedServletContainerFactory32.addBuilderCustomizers(undertowBuilderCustomizerArray59);
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray59);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray59);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray33);
        org.junit.Assert.assertNull(ssl45);
        org.junit.Assert.assertNotNull(servletContextInitializerArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet57);
        org.junit.Assert.assertNotNull(jspServlet58);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray59);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory6.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory6.setSsl(ssl11);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray13);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file17);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.Compression compression21 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression21);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorPageArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.lang.String str28 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean29 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        boolean boolean30 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer7 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray6);
        java.io.File file8 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer10 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray11 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer10 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(embeddedServletContainer7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Compression compression27 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file28);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Compression compression33 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression33);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNull(compression27);
        org.junit.Assert.assertNotNull(mimeMappings32);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory15.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader20 = null;
        undertowEmbeddedServletContainerFactory15.setResourceLoader(resourceLoader20);
        java.net.InetAddress inetAddress22 = null;
        undertowEmbeddedServletContainerFactory15.setAddress(inetAddress22);
        undertowEmbeddedServletContainerFactory15.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet26 = undertowEmbeddedServletContainerFactory15.getJspServlet();
        undertowEmbeddedServletContainerFactory15.setContextPath("");
        undertowEmbeddedServletContainerFactory15.setWorkerThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 1);
        undertowEmbeddedServletContainerFactory32.setBufferSize((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setBuffersPerRegion((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory42.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory42.setPersistSession(false);
        boolean boolean47 = undertowEmbeddedServletContainerFactory42.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setPort((int) (byte) -1);
        boolean boolean52 = undertowEmbeddedServletContainerFactory49.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory54.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory54.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl59 = null;
        undertowEmbeddedServletContainerFactory54.setSsl(ssl59);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray61 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory54.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory49.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory42.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory32.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray61);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray61);
        java.lang.Class<?> wildcardClass69 = errorPageArray61.getClass();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jspServlet26);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(errorPageArray61);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) '#');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory2.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory12.setPersistSession(false);
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("");
        java.io.File file18 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory12.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory12.setDisplayName("hi!");
        java.io.File file25 = undertowEmbeddedServletContainerFactory12.getDocumentRoot();
        org.springframework.boot.context.embedded.Ssl ssl26 = undertowEmbeddedServletContainerFactory12.getSsl();
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory12.setAccessLogDirectory(file27);
        undertowEmbeddedServletContainerFactory12.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet31 = undertowEmbeddedServletContainerFactory12.getJspServlet();
        undertowEmbeddedServletContainerFactory2.setJspServlet(jspServlet31);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(ssl26);
        org.junit.Assert.assertNotNull(jspServlet31);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory12.getSsl();
        boolean boolean18 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = null;
        undertowEmbeddedServletContainerFactory12.setJspServlet(jspServlet19);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings21);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        boolean boolean27 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1);
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPort((int) '#');
        int int17 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str20 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.net.InetAddress inetAddress21 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress21);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNull(compression11);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file7);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.net.InetAddress inetAddress15 = null;
        undertowEmbeddedServletContainerFactory14.setAddress(inetAddress15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory18.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl23 = undertowEmbeddedServletContainerFactory18.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer27 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer29 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap28);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray30 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer25, initParameterConfiguringServletContextInitializer27, initParameterConfiguringServletContextInitializer29 };
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray30);
        undertowEmbeddedServletContainerFactory18.setBufferSize((java.lang.Integer) (-1));
        java.lang.String str34 = undertowEmbeddedServletContainerFactory18.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory36.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer43 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer45 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer47 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap46);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer43, initParameterConfiguringServletContextInitializer45, initParameterConfiguringServletContextInitializer47 };
        undertowEmbeddedServletContainerFactory36.addInitializers(servletContextInitializerArray48);
        undertowEmbeddedServletContainerFactory36.setJspServletClassName("hi!");
        int int52 = undertowEmbeddedServletContainerFactory36.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet53 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        undertowEmbeddedServletContainerFactory18.setErrorPages(errorPageSet53);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory56.setAccessLogDirectory(file57);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray59 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory56.addErrorPages(errorPageArray59);
        undertowEmbeddedServletContainerFactory18.addErrorPages(errorPageArray59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory63.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray68 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory67.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray68);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory71.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory67.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory63.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        java.lang.String str76 = undertowEmbeddedServletContainerFactory63.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory78.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory78.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory78.getEmbeddedServletContainer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory63.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer87 = undertowEmbeddedServletContainerFactory14.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.JspServlet jspServlet90 = undertowEmbeddedServletContainerFactory14.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet90);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Compression compression94 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection95 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(compression6);
        org.junit.Assert.assertNull(ssl23);
        org.junit.Assert.assertNotNull(servletContextInitializerArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet53);
        org.junit.Assert.assertNotNull(errorPageArray59);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray68);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray72);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        org.junit.Assert.assertNotNull(embeddedServletContainer87);
        org.junit.Assert.assertNotNull(jspServlet90);
        org.junit.Assert.assertNull(compression94);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection95);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getContextPath();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory2.setPort(1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory6.setAddress(inetAddress7);
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory6.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory11.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl16 = undertowEmbeddedServletContainerFactory11.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer18 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer20 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer22 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap21);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer18, initParameterConfiguringServletContextInitializer20, initParameterConfiguringServletContextInitializer22 };
        undertowEmbeddedServletContainerFactory11.addInitializers(servletContextInitializerArray23);
        undertowEmbeddedServletContainerFactory11.setJspServletClassName("hi!");
        int int27 = undertowEmbeddedServletContainerFactory11.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = undertowEmbeddedServletContainerFactory11.getJspServlet();
        undertowEmbeddedServletContainerFactory6.setJspServlet(jspServlet29);
        undertowEmbeddedServletContainerFactory2.setJspServlet(jspServlet29);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection32 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory2.setContextPath("");
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory2.setSessionStoreDir(file35);
        org.junit.Assert.assertNull(inetAddress9);
        org.junit.Assert.assertNull(ssl16);
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet28);
        org.junit.Assert.assertNotNull(jspServlet29);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection32);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory9.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl14 = undertowEmbeddedServletContainerFactory9.getSsl();
        boolean boolean15 = undertowEmbeddedServletContainerFactory9.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = null;
        undertowEmbeddedServletContainerFactory9.setJspServlet(jspServlet16);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        org.springframework.boot.context.embedded.Compression compression19 = undertowEmbeddedServletContainerFactory9.getCompression();
        undertowEmbeddedServletContainerFactory9.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings22 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet23);
        org.springframework.boot.context.embedded.Ssl ssl25 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl25);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertNull(compression19);
        org.junit.Assert.assertNotNull(mimeMappings22);
        org.junit.Assert.assertNotNull(errorPageSet23);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11, errorPageArray10);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 1);
        undertowEmbeddedServletContainerFactory20.setBufferSize((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory20.setPort((int) 'a');
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory20.setAccessLogDirectory(file25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray29 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory28.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray29);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory28.setSsl(ssl31);
        undertowEmbeddedServletContainerFactory28.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory28.getErrorPages();
        undertowEmbeddedServletContainerFactory20.setErrorPages(errorPageSet35);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet35);
        java.lang.String str38 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection39 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray29);
        org.junit.Assert.assertNotNull(errorPageSet35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection39);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        int int13 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1800 + "'", int13 == 1800);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory1.getAddress();
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader12);
        org.junit.Assert.assertNull(inetAddress8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings6);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection8 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Compression compression9 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression9);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Compression compression27 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file28);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection33 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray36 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        org.springframework.boot.context.embedded.Ssl ssl38 = null;
        undertowEmbeddedServletContainerFactory35.setSsl(ssl38);
        org.springframework.boot.context.embedded.Ssl ssl40 = undertowEmbeddedServletContainerFactory35.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        org.springframework.boot.context.embedded.Ssl ssl45 = null;
        undertowEmbeddedServletContainerFactory42.setSsl(ssl45);
        undertowEmbeddedServletContainerFactory42.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory50.setAccessLogDirectory(file51);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray53 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory50.addErrorPages(errorPageArray53);
        org.springframework.boot.context.embedded.Compression compression55 = undertowEmbeddedServletContainerFactory50.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet56 = undertowEmbeddedServletContainerFactory50.getJspServlet();
        undertowEmbeddedServletContainerFactory42.setJspServlet(jspServlet56);
        undertowEmbeddedServletContainerFactory35.setJspServlet(jspServlet56);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet56);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet62 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNull(compression27);
        org.junit.Assert.assertNotNull(mimeMappings32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection33);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray36);
        org.junit.Assert.assertNull(ssl40);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray43);
        org.junit.Assert.assertNotNull(errorPageArray53);
        org.junit.Assert.assertNull(compression55);
        org.junit.Assert.assertNotNull(jspServlet56);
        org.junit.Assert.assertNotNull(errorPageSet62);
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file18 = undertowEmbeddedServletContainerFactory17.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory17.setPersistSession(false);
        undertowEmbeddedServletContainerFactory17.setJspServletClassName("");
        boolean boolean23 = undertowEmbeddedServletContainerFactory17.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader24 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader24);
        org.springframework.core.io.ResourceLoader resourceLoader26 = null;
        undertowEmbeddedServletContainerFactory17.setResourceLoader(resourceLoader26);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection28 = undertowEmbeddedServletContainerFactory17.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray31);
        org.springframework.boot.context.embedded.Ssl ssl33 = null;
        undertowEmbeddedServletContainerFactory30.setSsl(ssl33);
        org.springframework.boot.context.embedded.Ssl ssl35 = undertowEmbeddedServletContainerFactory30.getSsl();
        org.springframework.boot.context.embedded.Compression compression36 = null;
        undertowEmbeddedServletContainerFactory30.setCompression(compression36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory39.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader44 = null;
        undertowEmbeddedServletContainerFactory39.setResourceLoader(resourceLoader44);
        java.net.InetAddress inetAddress46 = null;
        undertowEmbeddedServletContainerFactory39.setAddress(inetAddress46);
        undertowEmbeddedServletContainerFactory39.setSessionTimeout((int) 'a');
        java.net.InetAddress inetAddress50 = undertowEmbeddedServletContainerFactory39.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray55 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory54.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray55);
        org.springframework.boot.context.embedded.Ssl ssl57 = null;
        undertowEmbeddedServletContainerFactory54.setSsl(ssl57);
        org.springframework.boot.context.embedded.Ssl ssl59 = undertowEmbeddedServletContainerFactory54.getSsl();
        undertowEmbeddedServletContainerFactory54.setDisplayName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings62 = undertowEmbeddedServletContainerFactory54.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer63 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray64 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer63 };
        undertowEmbeddedServletContainerFactory54.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        undertowEmbeddedServletContainerFactory52.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        undertowEmbeddedServletContainerFactory17.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        java.io.File file71 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file71);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(32);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compression11);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection28);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray31);
        org.junit.Assert.assertNull(ssl35);
        org.junit.Assert.assertNull(inetAddress50);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray55);
        org.junit.Assert.assertNull(ssl59);
        org.junit.Assert.assertNotNull(mimeMappings62);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray64);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.net.InetAddress inetAddress25 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress25);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory28.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl33 = null;
        undertowEmbeddedServletContainerFactory28.setSsl(ssl33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file37 = undertowEmbeddedServletContainerFactory36.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory36.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory41.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory41.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl46 = undertowEmbeddedServletContainerFactory41.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer48 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap47);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer50 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer52 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap51);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray53 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer48, initParameterConfiguringServletContextInitializer50, initParameterConfiguringServletContextInitializer52 };
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory36.addInitializers(servletContextInitializerArray53);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray53);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory58.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory58.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl63 = undertowEmbeddedServletContainerFactory58.getSsl();
        boolean boolean64 = undertowEmbeddedServletContainerFactory58.isAccessLogEnabled();
        java.io.File file65 = null;
        undertowEmbeddedServletContainerFactory58.setAccessLogDirectory(file65);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray67 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet68 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet68, errorPageArray67);
        undertowEmbeddedServletContainerFactory58.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet68);
        undertowEmbeddedServletContainerFactory58.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings73 = undertowEmbeddedServletContainerFactory58.getMimeMappings();
        undertowEmbeddedServletContainerFactory28.setMimeMappings(mimeMappings73);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings73);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader78 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader78);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 52);
        int int82 = undertowEmbeddedServletContainerFactory1.getPort();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(ssl46);
        org.junit.Assert.assertNotNull(servletContextInitializerArray53);
        org.junit.Assert.assertNull(ssl63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(errorPageArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(mimeMappings73);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory6.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory6.setSsl(ssl11);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory6.addErrorPages(errorPageArray13);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray13);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setContextPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorPageArray13);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory13.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory13.getSsl();
        boolean boolean19 = undertowEmbeddedServletContainerFactory13.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet20 = null;
        undertowEmbeddedServletContainerFactory13.setJspServlet(jspServlet20);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings22 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings22);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setPort((int) 'a');
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file32);
        org.junit.Assert.assertNull(ssl18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mimeMappings22);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory15.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl20 = undertowEmbeddedServletContainerFactory15.getSsl();
        boolean boolean21 = undertowEmbeddedServletContainerFactory15.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = null;
        undertowEmbeddedServletContainerFactory15.setJspServlet(jspServlet22);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings24 = undertowEmbeddedServletContainerFactory15.getMimeMappings();
        org.springframework.boot.context.embedded.Compression compression25 = undertowEmbeddedServletContainerFactory15.getCompression();
        undertowEmbeddedServletContainerFactory15.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings28 = undertowEmbeddedServletContainerFactory15.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings28);
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(compression10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(ssl20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mimeMappings24);
        org.junit.Assert.assertNull(compression25);
        org.junit.Assert.assertNotNull(mimeMappings28);
        org.junit.Assert.assertNull(inetAddress30);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        org.springframework.boot.context.embedded.ErrorPage errorPage6 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray7 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage6 };
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray7);
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNotNull(errorPageArray7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory10.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory10.getSsl();
        boolean boolean16 = undertowEmbeddedServletContainerFactory10.isAccessLogEnabled();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory10.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20, errorPageArray19);
        undertowEmbeddedServletContainerFactory10.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        int int31 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file32);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 100);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.JspServlet jspServlet38 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1800 + "'", int31 == 1800);
        org.junit.Assert.assertNotNull(jspServlet38);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1);
        java.lang.String str35 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.JspServlet jspServlet12 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader13);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 52);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(jspServlet12);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 97);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        boolean boolean4 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        boolean boolean5 = undertowEmbeddedServletContainerFactory2.isAccessLogEnabled();
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory2.getCompression();
        boolean boolean7 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings10 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray21);
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray21);
        java.lang.String str24 = undertowEmbeddedServletContainerFactory16.getContextPath();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet25 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        undertowEmbeddedServletContainerFactory9.setErrorPages(errorPageSet25);
        undertowEmbeddedServletContainerFactory2.setErrorPages(errorPageSet25);
        java.lang.Class<?> wildcardClass28 = errorPageSet25.getClass();
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(compression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mimeMappings10);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(errorPageSet25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file14);
        org.springframework.boot.context.embedded.Compression compression16 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression16);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file18);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader14);
        org.springframework.boot.context.embedded.Compression compression16 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNull(compression13);
        org.junit.Assert.assertNull(compression16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(inetAddress18);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setPort((int) (byte) -1);
        boolean boolean24 = undertowEmbeddedServletContainerFactory21.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory26.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory26.setSsl(ssl31);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray33);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer37 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer37 };
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        org.springframework.boot.context.embedded.Compression compression40 = undertowEmbeddedServletContainerFactory14.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet41 = undertowEmbeddedServletContainerFactory14.getJspServlet();
        undertowEmbeddedServletContainerFactory2.setJspServlet(jspServlet41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory44.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        org.springframework.boot.context.embedded.Ssl ssl47 = null;
        undertowEmbeddedServletContainerFactory44.setSsl(ssl47);
        undertowEmbeddedServletContainerFactory44.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory52.setAccessLogDirectory(file53);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory52.addErrorPages(errorPageArray55);
        org.springframework.boot.context.embedded.Compression compression57 = undertowEmbeddedServletContainerFactory52.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet58 = undertowEmbeddedServletContainerFactory52.getJspServlet();
        undertowEmbeddedServletContainerFactory44.setJspServlet(jspServlet58);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection60 = undertowEmbeddedServletContainerFactory44.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings61 = undertowEmbeddedServletContainerFactory44.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings61);
        int int63 = undertowEmbeddedServletContainerFactory2.getPort();
        java.io.File file64 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray38);
        org.junit.Assert.assertNull(compression40);
        org.junit.Assert.assertNotNull(jspServlet41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray45);
        org.junit.Assert.assertNotNull(errorPageArray55);
        org.junit.Assert.assertNull(compression57);
        org.junit.Assert.assertNotNull(jspServlet58);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection60);
        org.junit.Assert.assertNotNull(mimeMappings61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNull(file64);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        boolean boolean17 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl24 = null;
        undertowEmbeddedServletContainerFactory19.setSsl(ssl24);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet32 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet32);
        org.springframework.boot.context.embedded.Compression compression34 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(errorPageArray26);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '#');
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        boolean boolean37 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress38 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(inetAddress38);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Compression compression15 = undertowEmbeddedServletContainerFactory1.getCompression();
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory18.setSessionStoreDir(file21);
        undertowEmbeddedServletContainerFactory18.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout(1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory18.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet27);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(35);
        org.springframework.boot.context.embedded.Ssl ssl31 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean32 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection33 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNull(compression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertNotNull(errorPageSet27);
        org.junit.Assert.assertNull(ssl31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection33);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 0);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress17 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress17);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 52);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file10);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file15 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        boolean boolean16 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) (short) 100);
        java.io.File file19 = undertowEmbeddedServletContainerFactory14.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings20 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file24 = undertowEmbeddedServletContainerFactory23.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression25 = null;
        undertowEmbeddedServletContainerFactory23.setCompression(compression25);
        undertowEmbeddedServletContainerFactory23.setRegisterJspServlet(false);
        java.lang.String str29 = undertowEmbeddedServletContainerFactory23.getDisplayName();
        boolean boolean30 = undertowEmbeddedServletContainerFactory23.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory32.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl37 = undertowEmbeddedServletContainerFactory32.getSsl();
        boolean boolean38 = undertowEmbeddedServletContainerFactory32.isAccessLogEnabled();
        java.io.File file39 = null;
        undertowEmbeddedServletContainerFactory32.setAccessLogDirectory(file39);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray41 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42, errorPageArray41);
        undertowEmbeddedServletContainerFactory32.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42);
        undertowEmbeddedServletContainerFactory32.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings47 = undertowEmbeddedServletContainerFactory32.getMimeMappings();
        boolean boolean48 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray51 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray51);
        org.springframework.boot.context.embedded.Ssl ssl53 = null;
        undertowEmbeddedServletContainerFactory50.setSsl(ssl53);
        org.springframework.boot.context.embedded.Ssl ssl55 = undertowEmbeddedServletContainerFactory50.getSsl();
        undertowEmbeddedServletContainerFactory50.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory50.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection60 = undertowEmbeddedServletContainerFactory50.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory50.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory64.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray69 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray69);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray73 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray73);
        undertowEmbeddedServletContainerFactory68.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray73);
        undertowEmbeddedServletContainerFactory64.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray73);
        java.lang.String str77 = undertowEmbeddedServletContainerFactory64.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory79.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory79.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray84 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory79.getEmbeddedServletContainer(servletContextInitializerArray84);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer86 = undertowEmbeddedServletContainerFactory64.getEmbeddedServletContainer(servletContextInitializerArray84);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer87 = undertowEmbeddedServletContainerFactory50.getEmbeddedServletContainer(servletContextInitializerArray84);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer88 = null;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray89 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizer88 };
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray89);
        undertowEmbeddedServletContainerFactory32.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray89);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray89);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray89);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(mimeMappings20);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(ssl37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(errorPageArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(mimeMappings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray51);
        org.junit.Assert.assertNull(ssl55);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection60);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray69);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray73);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(servletContextInitializerArray84);
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        org.junit.Assert.assertNotNull(embeddedServletContainer86);
        org.junit.Assert.assertNotNull(embeddedServletContainer87);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray89);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file12);
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file15);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(errorPageSet19);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.Compression compression8 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        java.lang.String str14 = undertowEmbeddedServletContainerFactory12.getContextPath();
        undertowEmbeddedServletContainerFactory12.setRegisterDefaultServlet(false);
        java.io.File file17 = undertowEmbeddedServletContainerFactory12.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(10);
        java.net.InetAddress inetAddress20 = undertowEmbeddedServletContainerFactory19.getAddress();
        undertowEmbeddedServletContainerFactory19.setIoThreads((java.lang.Integer) 0);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory19.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression24 = null;
        undertowEmbeddedServletContainerFactory19.setCompression(compression24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory27.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        org.springframework.boot.context.embedded.Ssl ssl30 = null;
        undertowEmbeddedServletContainerFactory27.setSsl(ssl30);
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory27.getSsl();
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory27.setDisplayName("hi!");
        java.net.InetAddress inetAddress37 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.Compression compression38 = null;
        undertowEmbeddedServletContainerFactory27.setCompression(compression38);
        java.io.File file40 = null;
        undertowEmbeddedServletContainerFactory27.setAccessLogDirectory(file40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file44 = undertowEmbeddedServletContainerFactory43.getSessionStoreDir();
        boolean boolean45 = undertowEmbeddedServletContainerFactory43.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory43.setSessionTimeout((int) (byte) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray53 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory52.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray53);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory56.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory52.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory50.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory27.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory12.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.JspServlet jspServlet68 = undertowEmbeddedServletContainerFactory67.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet68);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 35);
        boolean boolean72 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection3);
        org.junit.Assert.assertNull(compression8);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(inetAddress20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray28);
        org.junit.Assert.assertNull(ssl32);
        org.junit.Assert.assertNull(inetAddress37);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray53);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray57);
        org.junit.Assert.assertNotNull(jspServlet68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory2.setAccessLogDirectory(file10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file15 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("");
        java.io.File file20 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory14.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory14.setBufferSize((java.lang.Integer) 0);
        int int25 = undertowEmbeddedServletContainerFactory14.getSessionTimeout();
        java.io.File file26 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file27);
        undertowEmbeddedServletContainerFactory14.setIoThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory14.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory34.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl39 = undertowEmbeddedServletContainerFactory34.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer41 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer43 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer45 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap44);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer41, initParameterConfiguringServletContextInitializer43, initParameterConfiguringServletContextInitializer45 };
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray46);
        undertowEmbeddedServletContainerFactory34.setBufferSize((java.lang.Integer) (-1));
        java.lang.String str50 = undertowEmbeddedServletContainerFactory34.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory52.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory52.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl57 = undertowEmbeddedServletContainerFactory52.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer59 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap58);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer61 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer63 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap62);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray64 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer59, initParameterConfiguringServletContextInitializer61, initParameterConfiguringServletContextInitializer63 };
        undertowEmbeddedServletContainerFactory52.addInitializers(servletContextInitializerArray64);
        undertowEmbeddedServletContainerFactory52.setJspServletClassName("hi!");
        int int68 = undertowEmbeddedServletContainerFactory52.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet69 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        undertowEmbeddedServletContainerFactory34.setErrorPages(errorPageSet69);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray73 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory72.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray73);
        org.springframework.boot.context.embedded.Ssl ssl75 = null;
        undertowEmbeddedServletContainerFactory72.setSsl(ssl75);
        undertowEmbeddedServletContainerFactory72.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet79 = undertowEmbeddedServletContainerFactory72.getErrorPages();
        undertowEmbeddedServletContainerFactory72.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory72.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file86 = null;
        undertowEmbeddedServletContainerFactory85.setAccessLogDirectory(file86);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray88 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory85.addErrorPages(errorPageArray88);
        undertowEmbeddedServletContainerFactory72.addErrorPages(errorPageArray88);
        undertowEmbeddedServletContainerFactory34.addErrorPages(errorPageArray88);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray88);
        undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray88);
        java.io.File file94 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1800 + "'", int25 == 1800);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(ssl39);
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(ssl57);
        org.junit.Assert.assertNotNull(servletContextInitializerArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet69);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray73);
        org.junit.Assert.assertNotNull(errorPageSet79);
        org.junit.Assert.assertNotNull(errorPageArray88);
        org.junit.Assert.assertNull(file94);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader12);
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 0);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.boot.context.embedded.Ssl ssl19 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl19);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNotNull(jspServlet14);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl23);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray31 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray31);
        org.springframework.boot.context.embedded.Ssl ssl33 = null;
        undertowEmbeddedServletContainerFactory30.setSsl(ssl33);
        undertowEmbeddedServletContainerFactory30.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet37 = undertowEmbeddedServletContainerFactory30.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet37);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray31);
        org.junit.Assert.assertNotNull(jspServlet37);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory15.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory15.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory30.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer36 = undertowEmbeddedServletContainerFactory30.getEmbeddedServletContainer(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory15.getEmbeddedServletContainer(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer38 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray41);
        org.springframework.boot.context.embedded.Ssl ssl43 = null;
        undertowEmbeddedServletContainerFactory40.setSsl(ssl43);
        org.springframework.boot.context.embedded.Ssl ssl45 = undertowEmbeddedServletContainerFactory40.getSsl();
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setDisplayName("hi!");
        java.net.InetAddress inetAddress50 = undertowEmbeddedServletContainerFactory40.getAddress();
        org.springframework.boot.context.embedded.Compression compression51 = null;
        undertowEmbeddedServletContainerFactory40.setCompression(compression51);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory40.setAccessLogDirectory(file53);
        java.lang.String str55 = undertowEmbeddedServletContainerFactory40.getDisplayName();
        boolean boolean56 = undertowEmbeddedServletContainerFactory40.isPersistSession();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings57 = undertowEmbeddedServletContainerFactory40.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings57);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file61 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file61);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(embeddedServletContainer36);
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        org.junit.Assert.assertNotNull(embeddedServletContainer38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray41);
        org.junit.Assert.assertNull(ssl45);
        org.junit.Assert.assertNull(inetAddress50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(mimeMappings57);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) '#');
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory2.setAccessLogPattern("hi!");
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.Compression compression16 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection10);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNull(compression16);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        int int14 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray20);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory17.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory17.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory30.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray35 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        undertowEmbeddedServletContainerFactory30.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        java.lang.String str43 = undertowEmbeddedServletContainerFactory30.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory45.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory45.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer51 = undertowEmbeddedServletContainerFactory45.getEmbeddedServletContainer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer52 = undertowEmbeddedServletContainerFactory30.getEmbeddedServletContainer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer53 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer54 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray50);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        int int61 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file66 = undertowEmbeddedServletContainerFactory65.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory65.setPersistSession(false);
        undertowEmbeddedServletContainerFactory65.setJspServletClassName("");
        java.io.File file71 = undertowEmbeddedServletContainerFactory65.getSessionStoreDir();
        java.lang.String str72 = undertowEmbeddedServletContainerFactory65.getDisplayName();
        undertowEmbeddedServletContainerFactory65.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression75 = undertowEmbeddedServletContainerFactory65.getCompression();
        boolean boolean76 = undertowEmbeddedServletContainerFactory65.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file79 = undertowEmbeddedServletContainerFactory78.getSessionStoreDir();
        boolean boolean80 = undertowEmbeddedServletContainerFactory78.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory78.setSessionTimeout((int) (short) 100);
        java.io.File file83 = undertowEmbeddedServletContainerFactory78.getDocumentRoot();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings84 = undertowEmbeddedServletContainerFactory78.getMimeMappings();
        undertowEmbeddedServletContainerFactory65.setMimeMappings(mimeMappings84);
        org.springframework.boot.context.embedded.Compression compression86 = undertowEmbeddedServletContainerFactory65.getCompression();
        undertowEmbeddedServletContainerFactory65.setSessionTimeout((int) (short) 0);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet89 = undertowEmbeddedServletContainerFactory65.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet89);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1800 + "'", int14 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray20);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertNotNull(embeddedServletContainer51);
        org.junit.Assert.assertNotNull(embeddedServletContainer52);
        org.junit.Assert.assertNotNull(embeddedServletContainer53);
        org.junit.Assert.assertNotNull(embeddedServletContainer54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(compression75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(file79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(file83);
        org.junit.Assert.assertNotNull(mimeMappings84);
        org.junit.Assert.assertNull(compression86);
        org.junit.Assert.assertNotNull(errorPageSet89);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.Ssl ssl2 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.junit.Assert.assertNull(ssl2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file6 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        undertowEmbeddedServletContainerFactory5.setJspServletClassName("");
        java.io.File file11 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory5.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file21);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        boolean boolean29 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file30 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int31 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.String str32 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl35);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1800 + "'", int31 == 1800);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 0);
        org.springframework.boot.context.embedded.Ssl ssl3 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl3);
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory2.getSsl();
        undertowEmbeddedServletContainerFactory2.setWorkerThreads((java.lang.Integer) 52);
        org.junit.Assert.assertNull(ssl5);
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int20 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.core.io.ResourceLoader resourceLoader22 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader22);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression16 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression16);
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory22.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl27 = undertowEmbeddedServletContainerFactory22.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet28 = undertowEmbeddedServletContainerFactory22.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = undertowEmbeddedServletContainerFactory22.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet29);
        java.lang.String str31 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(ssl27);
        org.junit.Assert.assertNotNull(errorPageSet28);
        org.junit.Assert.assertNotNull(jspServlet29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNull(inetAddress8);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray10);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory7.getContextPath();
        undertowEmbeddedServletContainerFactory7.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory7.setBufferSize((java.lang.Integer) 100);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory7.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file21 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("");
        java.io.File file26 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file31 = undertowEmbeddedServletContainerFactory30.getSessionStoreDir();
        boolean boolean32 = undertowEmbeddedServletContainerFactory30.isAccessLogEnabled();
        java.io.File file33 = null;
        undertowEmbeddedServletContainerFactory30.setAccessLogDirectory(file33);
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory30.setDocumentRoot(file35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file39 = null;
        undertowEmbeddedServletContainerFactory38.setAccessLogDirectory(file39);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray41 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray41);
        org.springframework.boot.context.embedded.Compression compression43 = undertowEmbeddedServletContainerFactory38.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet44 = undertowEmbeddedServletContainerFactory38.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory46.setAccessLogDirectory(file47);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory30.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory20.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray49);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorPageArray41);
        org.junit.Assert.assertNull(compression43);
        org.junit.Assert.assertNotNull(jspServlet44);
        org.junit.Assert.assertNotNull(errorPageArray49);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory16.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory16.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer22 = undertowEmbeddedServletContainerFactory16.getEmbeddedServletContainer(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer23 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray21);
        boolean boolean24 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory26.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory26.setSsl(ssl31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file35 = undertowEmbeddedServletContainerFactory34.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory34.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory39.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl44 = undertowEmbeddedServletContainerFactory39.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer46 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer48 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap47);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer50 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap49);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray51 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer46, initParameterConfiguringServletContextInitializer48, initParameterConfiguringServletContextInitializer50 };
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray51);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray51);
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray51);
        org.springframework.core.io.ResourceLoader resourceLoader55 = null;
        undertowEmbeddedServletContainerFactory26.setResourceLoader(resourceLoader55);
        undertowEmbeddedServletContainerFactory26.setAccessLogPattern("hi!");
        java.net.InetAddress inetAddress59 = undertowEmbeddedServletContainerFactory26.getAddress();
        boolean boolean60 = undertowEmbeddedServletContainerFactory26.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.JspServlet jspServlet61 = undertowEmbeddedServletContainerFactory26.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet61);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(embeddedServletContainer22);
        org.junit.Assert.assertNotNull(embeddedServletContainer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(ssl44);
        org.junit.Assert.assertNotNull(servletContextInitializerArray51);
        org.junit.Assert.assertNull(inetAddress59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jspServlet61);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        int int5 = undertowEmbeddedServletContainerFactory2.getPort();
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(true);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file16);
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11, errorPageArray10);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory32.setPersistSession(false);
        boolean boolean37 = undertowEmbeddedServletContainerFactory32.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        boolean boolean42 = undertowEmbeddedServletContainerFactory39.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory44.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory44.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl49 = null;
        undertowEmbeddedServletContainerFactory44.setSsl(ssl49);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray51 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory44.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory39.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory32.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray51);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray51);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(ssl18);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(errorPageArray51);
        org.junit.Assert.assertNotNull(errorPageSet57);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory19.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl24 = undertowEmbeddedServletContainerFactory19.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer26 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer28 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer30 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap29);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer26, initParameterConfiguringServletContextInitializer28, initParameterConfiguringServletContextInitializer30 };
        undertowEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray31);
        undertowEmbeddedServletContainerFactory19.setJspServletClassName("hi!");
        int int35 = undertowEmbeddedServletContainerFactory19.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        org.springframework.boot.context.embedded.Ssl ssl42 = null;
        undertowEmbeddedServletContainerFactory39.setSsl(ssl42);
        undertowEmbeddedServletContainerFactory39.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = undertowEmbeddedServletContainerFactory39.getErrorPages();
        undertowEmbeddedServletContainerFactory39.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory39.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory52.setAccessLogDirectory(file53);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory52.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory39.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray55);
        java.io.File file59 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.JspServlet jspServlet60 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.lang.String str61 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.core.io.ResourceLoader resourceLoader62 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader62);
        java.net.InetAddress inetAddress64 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress64);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(ssl24);
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet36);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertNotNull(errorPageSet46);
        org.junit.Assert.assertNotNull(errorPageArray55);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNotNull(jspServlet60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        org.springframework.boot.context.embedded.Compression compression15 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        org.junit.Assert.assertNull(compression15);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        java.net.InetAddress inetAddress14 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        org.junit.Assert.assertNull(inetAddress14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        java.io.File file7 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) '#');
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(errorPageSet11);
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        org.springframework.boot.context.embedded.Ssl ssl26 = null;
        undertowEmbeddedServletContainerFactory23.setSsl(ssl26);
        undertowEmbeddedServletContainerFactory23.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory23.setIoThreads((java.lang.Integer) 32);
        org.springframework.boot.context.embedded.Compression compression32 = null;
        undertowEmbeddedServletContainerFactory23.setCompression(compression32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray36 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray36);
        org.springframework.boot.context.embedded.Ssl ssl38 = null;
        undertowEmbeddedServletContainerFactory35.setSsl(ssl38);
        undertowEmbeddedServletContainerFactory35.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = undertowEmbeddedServletContainerFactory35.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader43 = null;
        undertowEmbeddedServletContainerFactory35.setResourceLoader(resourceLoader43);
        java.lang.String str45 = undertowEmbeddedServletContainerFactory35.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray48 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray52 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory51.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray52);
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray52);
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray52);
        boolean boolean56 = undertowEmbeddedServletContainerFactory35.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = undertowEmbeddedServletContainerFactory35.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file60 = undertowEmbeddedServletContainerFactory59.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory59.setPersistSession(false);
        undertowEmbeddedServletContainerFactory59.setJspServletClassName("");
        java.io.File file65 = undertowEmbeddedServletContainerFactory59.getSessionStoreDir();
        java.lang.String str66 = undertowEmbeddedServletContainerFactory59.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory68.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory68.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl73 = undertowEmbeddedServletContainerFactory68.getSsl();
        boolean boolean74 = undertowEmbeddedServletContainerFactory68.isAccessLogEnabled();
        java.io.File file75 = null;
        undertowEmbeddedServletContainerFactory68.setAccessLogDirectory(file75);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray77 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet78 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78, errorPageArray77);
        undertowEmbeddedServletContainerFactory68.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78);
        undertowEmbeddedServletContainerFactory59.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet78);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory83.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray86 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory83.addBuilderCustomizers(undertowBuilderCustomizerArray86);
        undertowEmbeddedServletContainerFactory59.addBuilderCustomizers(undertowBuilderCustomizerArray86);
        undertowEmbeddedServletContainerFactory35.addBuilderCustomizers(undertowBuilderCustomizerArray86);
        undertowEmbeddedServletContainerFactory23.addBuilderCustomizers(undertowBuilderCustomizerArray86);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray86);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray36);
        org.junit.Assert.assertNotNull(errorPageSet42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray48);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(errorPageSet57);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(ssl73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(errorPageArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray86);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray11 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray11);
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory10.setSsl(ssl13);
        undertowEmbeddedServletContainerFactory10.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        undertowEmbeddedServletContainerFactory10.setResourceLoader(resourceLoader18);
        java.lang.String str20 = undertowEmbeddedServletContainerFactory10.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray27 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray27);
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray27);
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray27);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray27);
        org.springframework.boot.context.embedded.JspServlet jspServlet32 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.net.InetAddress inetAddress33 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress33);
        java.io.File file35 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 52);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray11);
        org.junit.Assert.assertNotNull(errorPageSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray27);
        org.junit.Assert.assertNotNull(jspServlet32);
        org.junit.Assert.assertNull(file35);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file6 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        undertowEmbeddedServletContainerFactory5.setJspServletClassName("");
        java.io.File file11 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory5.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file21);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        boolean boolean29 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file30 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file31);
        java.lang.String str33 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings36 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(mimeMappings36);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 100);
        org.springframework.boot.context.embedded.Compression compression14 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNull(inetAddress11);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 10);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory2.setPort(1800);
        java.lang.String str5 = undertowEmbeddedServletContainerFactory2.getContextPath();
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory2.setDocumentRoot(file6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress8);
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory2.getAddress();
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        undertowEmbeddedServletContainerFactory2.setPersistSession(false);
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory2.setSessionTimeout(35, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inetAddress10);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection3 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory5.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory5.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.Compression compression12 = null;
        undertowEmbeddedServletContainerFactory5.setCompression(compression12);
        undertowEmbeddedServletContainerFactory5.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory17.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl22 = undertowEmbeddedServletContainerFactory17.getSsl();
        boolean boolean23 = undertowEmbeddedServletContainerFactory17.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = null;
        undertowEmbeddedServletContainerFactory17.setJspServlet(jspServlet24);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory17.getMimeMappings();
        undertowEmbeddedServletContainerFactory5.setMimeMappings(mimeMappings26);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings26);
        boolean boolean29 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) ' ');
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file34);
        java.lang.String str36 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray41);
        org.springframework.boot.context.embedded.Ssl ssl43 = null;
        undertowEmbeddedServletContainerFactory40.setSsl(ssl43);
        org.springframework.boot.context.embedded.Ssl ssl45 = undertowEmbeddedServletContainerFactory40.getSsl();
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setDisplayName("hi!");
        java.io.File file50 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        undertowEmbeddedServletContainerFactory40.setPersistSession(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection53 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        java.io.File file54 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        undertowEmbeddedServletContainerFactory40.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings57 = undertowEmbeddedServletContainerFactory40.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings57);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mimeMappings26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray41);
        org.junit.Assert.assertNull(ssl45);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNotNull(mimeMappings57);
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet12 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file15 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        boolean boolean16 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file17);
        undertowEmbeddedServletContainerFactory14.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.Ssl ssl25 = null;
        undertowEmbeddedServletContainerFactory22.setSsl(ssl25);
        org.springframework.boot.context.embedded.Ssl ssl27 = undertowEmbeddedServletContainerFactory22.getSsl();
        undertowEmbeddedServletContainerFactory22.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory22.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory22.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory22.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory44.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        undertowEmbeddedServletContainerFactory36.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        java.lang.String str49 = undertowEmbeddedServletContainerFactory36.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory51.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory51.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray56 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory51.getEmbeddedServletContainer(servletContextInitializerArray56);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer58 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray56);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer59 = undertowEmbeddedServletContainerFactory22.getEmbeddedServletContainer(servletContextInitializerArray56);
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray56);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray56);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 10);
        java.lang.String str64 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        org.junit.Assert.assertNotNull(jspServlet12);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        org.junit.Assert.assertNull(ssl27);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray56);
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        org.junit.Assert.assertNotNull(embeddedServletContainer58);
        org.junit.Assert.assertNotNull(embeddedServletContainer59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setPort((int) (byte) -1);
        boolean boolean24 = undertowEmbeddedServletContainerFactory21.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory26.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory26.setSsl(ssl31);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray33);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings38 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.net.InetAddress inetAddress39 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress39);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        int int42 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection43 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertNotNull(mimeMappings38);
        org.junit.Assert.assertNotNull(mimeMappings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1800 + "'", int42 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection43);
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setPort((int) (byte) -1);
        boolean boolean24 = undertowEmbeddedServletContainerFactory21.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory26.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl31 = null;
        undertowEmbeddedServletContainerFactory26.setSsl(ssl31);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray33);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer37 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer37 };
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray38);
        org.springframework.boot.context.embedded.Compression compression40 = undertowEmbeddedServletContainerFactory14.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet41 = undertowEmbeddedServletContainerFactory14.getJspServlet();
        undertowEmbeddedServletContainerFactory2.setJspServlet(jspServlet41);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory44.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        org.springframework.boot.context.embedded.Ssl ssl47 = null;
        undertowEmbeddedServletContainerFactory44.setSsl(ssl47);
        undertowEmbeddedServletContainerFactory44.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory52.setAccessLogDirectory(file53);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory52.addErrorPages(errorPageArray55);
        org.springframework.boot.context.embedded.Compression compression57 = undertowEmbeddedServletContainerFactory52.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet58 = undertowEmbeddedServletContainerFactory52.getJspServlet();
        undertowEmbeddedServletContainerFactory44.setJspServlet(jspServlet58);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection60 = undertowEmbeddedServletContainerFactory44.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings61 = undertowEmbeddedServletContainerFactory44.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings61);
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.Compression compression65 = undertowEmbeddedServletContainerFactory2.getCompression();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings66 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray38);
        org.junit.Assert.assertNull(compression40);
        org.junit.Assert.assertNotNull(jspServlet41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray45);
        org.junit.Assert.assertNotNull(errorPageArray55);
        org.junit.Assert.assertNull(compression57);
        org.junit.Assert.assertNotNull(jspServlet58);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection60);
        org.junit.Assert.assertNotNull(mimeMappings61);
        org.junit.Assert.assertNull(compression65);
        org.junit.Assert.assertNotNull(mimeMappings66);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        org.springframework.boot.context.embedded.Ssl ssl11 = null;
        undertowEmbeddedServletContainerFactory8.setSsl(ssl11);
        undertowEmbeddedServletContainerFactory8.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory16.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray19);
        org.springframework.boot.context.embedded.Compression compression21 = undertowEmbeddedServletContainerFactory16.getCompression();
        org.springframework.boot.context.embedded.JspServlet jspServlet22 = undertowEmbeddedServletContainerFactory16.getJspServlet();
        undertowEmbeddedServletContainerFactory8.setJspServlet(jspServlet22);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet22);
        int int25 = undertowEmbeddedServletContainerFactory1.getPort();
        int int26 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory28.setAccessLogDirectory(file29);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray31);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray31);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray9);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertNull(compression21);
        org.junit.Assert.assertNotNull(jspServlet22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1800 + "'", int26 == 1800);
        org.junit.Assert.assertNotNull(errorPageArray31);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer24 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer24 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        boolean boolean27 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress31 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        boolean boolean34 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(inetAddress28);
        org.junit.Assert.assertNull(inetAddress31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.Ssl ssl10 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl10);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings13 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(mimeMappings13);
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings15 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings15);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory27.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory34.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl39 = null;
        undertowEmbeddedServletContainerFactory34.setSsl(ssl39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file43 = undertowEmbeddedServletContainerFactory42.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory42.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory47.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl52 = undertowEmbeddedServletContainerFactory47.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer54 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer56 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer58 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap57);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer54, initParameterConfiguringServletContextInitializer56, initParameterConfiguringServletContextInitializer58 };
        undertowEmbeddedServletContainerFactory47.addInitializers(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory42.addInitializers(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray59);
        java.lang.String str63 = undertowEmbeddedServletContainerFactory34.getContextPath();
        undertowEmbeddedServletContainerFactory34.setAccessLogPattern("");
        org.springframework.boot.context.embedded.JspServlet jspServlet66 = undertowEmbeddedServletContainerFactory34.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet66);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 97);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertNotNull(mimeMappings15);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray28);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(ssl52);
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(jspServlet66);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.junit.Assert.assertNotNull(mimeMappings12);
        org.junit.Assert.assertNotNull(jspServlet19);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection25 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Compression compression26 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection25);
        org.junit.Assert.assertNull(compression26);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory2.getContextPath();
        undertowEmbeddedServletContainerFactory2.setDisplayName("");
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        boolean boolean24 = undertowEmbeddedServletContainerFactory19.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory19.setBufferSize((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory19.setWorkerThreads((java.lang.Integer) 100);
        java.net.InetAddress inetAddress29 = undertowEmbeddedServletContainerFactory19.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings30 = undertowEmbeddedServletContainerFactory19.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file33 = undertowEmbeddedServletContainerFactory32.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory32.setPersistSession(false);
        undertowEmbeddedServletContainerFactory32.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory32.setPersistSession(false);
        int int40 = undertowEmbeddedServletContainerFactory32.getSessionTimeout();
        undertowEmbeddedServletContainerFactory32.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file45 = undertowEmbeddedServletContainerFactory44.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory44.setPersistSession(false);
        undertowEmbeddedServletContainerFactory44.setJspServletClassName("");
        java.io.File file50 = undertowEmbeddedServletContainerFactory44.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory44.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory44.setBufferSize((java.lang.Integer) 0);
        int int55 = undertowEmbeddedServletContainerFactory44.getSessionTimeout();
        java.io.File file56 = undertowEmbeddedServletContainerFactory44.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory58.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray67 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory66.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        java.lang.String str71 = undertowEmbeddedServletContainerFactory58.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory73.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory73.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray78 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer79 = undertowEmbeddedServletContainerFactory73.getEmbeddedServletContainer(servletContextInitializerArray78);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer80 = undertowEmbeddedServletContainerFactory58.getEmbeddedServletContainer(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray78);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout(35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inetAddress29);
        org.junit.Assert.assertNotNull(mimeMappings30);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1800 + "'", int40 == 1800);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1800 + "'", int55 == 1800);
        org.junit.Assert.assertNull(file56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray67);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(servletContextInitializerArray78);
        org.junit.Assert.assertNotNull(embeddedServletContainer79);
        org.junit.Assert.assertNotNull(embeddedServletContainer80);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file18);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        int int22 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory28.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        org.springframework.boot.context.embedded.Ssl ssl36 = null;
        undertowEmbeddedServletContainerFactory28.setSsl(ssl36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory39.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl44 = undertowEmbeddedServletContainerFactory39.getSsl();
        boolean boolean45 = undertowEmbeddedServletContainerFactory39.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = null;
        undertowEmbeddedServletContainerFactory39.setJspServlet(jspServlet46);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory39.getMimeMappings();
        undertowEmbeddedServletContainerFactory28.setMimeMappings(mimeMappings48);
        undertowEmbeddedServletContainerFactory28.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.Ssl ssl52 = undertowEmbeddedServletContainerFactory28.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection53 = undertowEmbeddedServletContainerFactory28.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory55.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory55.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl60 = null;
        undertowEmbeddedServletContainerFactory55.setSsl(ssl60);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray62 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory55.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray62);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.Compression compression69 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression72 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1800 + "'", int22 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
        org.junit.Assert.assertNull(ssl44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mimeMappings48);
        org.junit.Assert.assertNull(ssl52);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection53);
        org.junit.Assert.assertNotNull(errorPageArray62);
        org.junit.Assert.assertNull(compression69);
        org.junit.Assert.assertNull(compression72);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory13.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray14);
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet16);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray21);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory20.setSsl(ssl23);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory34.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        java.lang.String str47 = undertowEmbeddedServletContainerFactory34.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory49.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory34.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer58 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray54);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int61 = undertowEmbeddedServletContainerFactory1.getPort();
        boolean boolean62 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        int int63 = undertowEmbeddedServletContainerFactory1.getPort();
        int int64 = undertowEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress65 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress65);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNull(inetAddress11);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray14);
        org.junit.Assert.assertNotNull(jspServlet16);
        org.junit.Assert.assertNull(inetAddress18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray21);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        org.junit.Assert.assertNotNull(embeddedServletContainer58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 10);
        org.springframework.boot.context.embedded.Ssl ssl2 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl2);
        org.springframework.boot.context.embedded.Compression compression4 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression4);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file14);
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl16);
        int int18 = undertowEmbeddedServletContainerFactory13.getPort();
        java.net.InetAddress inetAddress19 = undertowEmbeddedServletContainerFactory13.getAddress();
        undertowEmbeddedServletContainerFactory13.setSessionTimeout(1800);
        undertowEmbeddedServletContainerFactory13.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) 100);
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray33 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory28.addBuilderCustomizers(undertowBuilderCustomizerArray33);
        undertowEmbeddedServletContainerFactory28.setRegisterDefaultServlet(true);
        boolean boolean38 = undertowEmbeddedServletContainerFactory28.isAccessLogEnabled();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray39 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40, errorPageArray39);
        undertowEmbeddedServletContainerFactory28.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        undertowEmbeddedServletContainerFactory25.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet40);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory45.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory45.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl50 = undertowEmbeddedServletContainerFactory45.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer52 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer54 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer56 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap55);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer52, initParameterConfiguringServletContextInitializer54, initParameterConfiguringServletContextInitializer56 };
        undertowEmbeddedServletContainerFactory45.addInitializers(servletContextInitializerArray57);
        undertowEmbeddedServletContainerFactory45.setBufferSize((java.lang.Integer) (-1));
        java.lang.String str61 = undertowEmbeddedServletContainerFactory45.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory63.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory63.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl68 = undertowEmbeddedServletContainerFactory63.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer70 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap69);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer72 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer74 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap73);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray75 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer70, initParameterConfiguringServletContextInitializer72, initParameterConfiguringServletContextInitializer74 };
        undertowEmbeddedServletContainerFactory63.addInitializers(servletContextInitializerArray75);
        undertowEmbeddedServletContainerFactory63.setJspServletClassName("hi!");
        int int79 = undertowEmbeddedServletContainerFactory63.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet80 = undertowEmbeddedServletContainerFactory63.getErrorPages();
        undertowEmbeddedServletContainerFactory45.setErrorPages(errorPageSet80);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory83 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file84 = null;
        undertowEmbeddedServletContainerFactory83.setAccessLogDirectory(file84);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray86 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory83.addErrorPages(errorPageArray86);
        undertowEmbeddedServletContainerFactory45.addErrorPages(errorPageArray86);
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray86);
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray86);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray86);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(inetAddress19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(errorPageArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(ssl50);
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(ssl68);
        org.junit.Assert.assertNotNull(servletContextInitializerArray75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet80);
        org.junit.Assert.assertNotNull(errorPageArray86);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int7 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress12);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(32);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1800 + "'", int7 == 1800);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        int int17 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray20);
        boolean boolean22 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) '#');
        java.io.File file26 = undertowEmbeddedServletContainerFactory25.getDocumentRoot();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer28 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap27);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer28 };
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray29);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.io.File file33 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean34 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.Ssl ssl35 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl35);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setPort(1800);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet18);
        org.junit.Assert.assertNotNull(jspServlet19);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNull(ssl32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet5 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray8 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        undertowEmbeddedServletContainerFactory7.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        int int16 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.Ssl ssl17 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl17);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNotNull(errorPageSet5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray4 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray4);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory16.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory16.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl21 = null;
        undertowEmbeddedServletContainerFactory16.setSsl(ssl21);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file25 = undertowEmbeddedServletContainerFactory24.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory24.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory29.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory29.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer38 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer40 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap39);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer36, initParameterConfiguringServletContextInitializer38, initParameterConfiguringServletContextInitializer40 };
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray41);
        undertowEmbeddedServletContainerFactory24.addInitializers(servletContextInitializerArray41);
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray41);
        org.springframework.core.io.ResourceLoader resourceLoader45 = null;
        undertowEmbeddedServletContainerFactory16.setResourceLoader(resourceLoader45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory48.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory52.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory52.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl57 = undertowEmbeddedServletContainerFactory52.getSsl();
        boolean boolean58 = undertowEmbeddedServletContainerFactory52.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet59 = null;
        undertowEmbeddedServletContainerFactory52.setJspServlet(jspServlet59);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray61 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet62 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet62, errorPageArray61);
        undertowEmbeddedServletContainerFactory52.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet62);
        undertowEmbeddedServletContainerFactory48.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet62);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory48.getErrorPages();
        boolean boolean67 = undertowEmbeddedServletContainerFactory48.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory69.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory69.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray74 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer75 = undertowEmbeddedServletContainerFactory69.getEmbeddedServletContainer(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory48.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory16.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(mimeMappings9);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(ssl34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertNull(ssl57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorPageArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(errorPageSet66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray74);
        org.junit.Assert.assertNotNull(embeddedServletContainer75);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.core.io.ResourceLoader resourceLoader3 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader3);
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory10.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory10.getSsl();
        boolean boolean16 = undertowEmbeddedServletContainerFactory10.isAccessLogEnabled();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory10.setAccessLogDirectory(file17);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray19 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20, errorPageArray19);
        undertowEmbeddedServletContainerFactory10.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet20);
        undertowEmbeddedServletContainerFactory10.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = undertowEmbeddedServletContainerFactory10.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet26);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader29 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader29);
        java.lang.String str31 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet33 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory36.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) '4');
        undertowEmbeddedServletContainerFactory36.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory36.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory36.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings45);
        org.springframework.boot.context.embedded.Compression compression47 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression47);
        int int49 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.core.io.ResourceLoader resourceLoader50 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader50);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorPageArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mimeMappings25);
        org.junit.Assert.assertNotNull(errorPageSet26);
        org.junit.Assert.assertNull(inetAddress28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(errorPageSet32);
        org.junit.Assert.assertNotNull(jspServlet33);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file20);
        java.lang.String str22 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl23);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray15);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl8 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(ssl8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings6);
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file11);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.net.InetAddress inetAddress6 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory11.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory11.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory11.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression17 = undertowEmbeddedServletContainerFactory11.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection20 = undertowEmbeddedServletContainerFactory19.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = undertowEmbeddedServletContainerFactory19.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory23.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory23.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl28 = undertowEmbeddedServletContainerFactory23.getSsl();
        boolean boolean29 = undertowEmbeddedServletContainerFactory23.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory31.setPersistSession(false);
        boolean boolean36 = undertowEmbeddedServletContainerFactory31.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setPort((int) (byte) -1);
        boolean boolean41 = undertowEmbeddedServletContainerFactory38.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory43.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory43.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl48 = null;
        undertowEmbeddedServletContainerFactory43.setSsl(ssl48);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray50 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory43.addErrorPages(errorPageArray50);
        undertowEmbeddedServletContainerFactory38.addErrorPages(errorPageArray50);
        undertowEmbeddedServletContainerFactory31.addErrorPages(errorPageArray50);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer54 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray55 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer54 };
        undertowEmbeddedServletContainerFactory31.addBuilderCustomizers(undertowBuilderCustomizerArray55);
        undertowEmbeddedServletContainerFactory23.addBuilderCustomizers(undertowBuilderCustomizerArray55);
        undertowEmbeddedServletContainerFactory19.addBuilderCustomizers(undertowBuilderCustomizerArray55);
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray55);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray55);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 1);
        undertowEmbeddedServletContainerFactory62.setBufferSize((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory66.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory66.setBuffersPerRegion((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory72.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory72.setPersistSession(false);
        boolean boolean77 = undertowEmbeddedServletContainerFactory72.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory79.setPort((int) (byte) -1);
        boolean boolean82 = undertowEmbeddedServletContainerFactory79.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory84 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory84.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory84.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl89 = null;
        undertowEmbeddedServletContainerFactory84.setSsl(ssl89);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray91 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory84.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory79.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory72.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory66.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory62.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray91);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        org.junit.Assert.assertNull(compression17);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection20);
        org.junit.Assert.assertNotNull(errorPageSet21);
        org.junit.Assert.assertNull(ssl28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorPageArray50);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray55);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(errorPageArray91);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file15 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory14.setPersistSession(false);
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("");
        java.io.File file20 = undertowEmbeddedServletContainerFactory14.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory14.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory14.setBuffersPerRegion((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory14.setBufferSize((java.lang.Integer) 97);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet27);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(errorPageSet27);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file8);
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 1);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        java.net.InetAddress inetAddress18 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection24 = undertowEmbeddedServletContainerFactory22.getDeploymentInfoCustomizers();
        org.springframework.core.io.ResourceLoader resourceLoader25 = null;
        undertowEmbeddedServletContainerFactory22.setResourceLoader(resourceLoader25);
        undertowEmbeddedServletContainerFactory22.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory30.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Compression compression35 = null;
        undertowEmbeddedServletContainerFactory30.setCompression(compression35);
        org.springframework.core.io.ResourceLoader resourceLoader37 = null;
        undertowEmbeddedServletContainerFactory30.setResourceLoader(resourceLoader37);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray41);
        org.springframework.boot.context.embedded.Ssl ssl43 = null;
        undertowEmbeddedServletContainerFactory40.setSsl(ssl43);
        undertowEmbeddedServletContainerFactory40.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory40.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory40.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory40.setIoThreads((java.lang.Integer) 32);
        undertowEmbeddedServletContainerFactory40.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file57 = undertowEmbeddedServletContainerFactory56.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory56.setPersistSession(false);
        undertowEmbeddedServletContainerFactory56.setJspServletClassName("");
        java.io.File file62 = undertowEmbeddedServletContainerFactory56.getSessionStoreDir();
        java.lang.String str63 = undertowEmbeddedServletContainerFactory56.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory67.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray70 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory67.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory65.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory56.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory40.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory30.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory22.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray70);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(compression10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection24);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray41);
        org.junit.Assert.assertNull(file57);
        org.junit.Assert.assertNull(file62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray70);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression3 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression3);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file2);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray4 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray4);
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        int int7 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1));
        org.junit.Assert.assertNotNull(errorPageArray4);
        org.junit.Assert.assertNull(compression6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(errorPageSet8);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray9 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory4.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray9);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory2.getContextPath();
        undertowEmbeddedServletContainerFactory2.setDisplayName("");
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 32);
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory2.getSsl();
        java.lang.String str19 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory23.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory23.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl28 = null;
        undertowEmbeddedServletContainerFactory23.setSsl(ssl28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file32 = undertowEmbeddedServletContainerFactory31.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory31.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory36.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer43 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer45 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer47 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap46);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer43, initParameterConfiguringServletContextInitializer45, initParameterConfiguringServletContextInitializer47 };
        undertowEmbeddedServletContainerFactory36.addInitializers(servletContextInitializerArray48);
        undertowEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray48);
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory53.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory53.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl58 = undertowEmbeddedServletContainerFactory53.getSsl();
        boolean boolean59 = undertowEmbeddedServletContainerFactory53.isAccessLogEnabled();
        java.io.File file60 = null;
        undertowEmbeddedServletContainerFactory53.setAccessLogDirectory(file60);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray62 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet63 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet63, errorPageArray62);
        undertowEmbeddedServletContainerFactory53.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet63);
        undertowEmbeddedServletContainerFactory53.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings68 = undertowEmbeddedServletContainerFactory53.getMimeMappings();
        undertowEmbeddedServletContainerFactory23.setMimeMappings(mimeMappings68);
        undertowEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings68);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings71 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(ssl18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNull(ssl58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(errorPageArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(mimeMappings68);
        org.junit.Assert.assertNotNull(mimeMappings71);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader9);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        boolean boolean12 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression13);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file17);
        boolean boolean19 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory21.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory21.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        java.lang.String str34 = undertowEmbeddedServletContainerFactory21.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer42 = undertowEmbeddedServletContainerFactory36.getEmbeddedServletContainer(servletContextInitializerArray41);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer43 = undertowEmbeddedServletContainerFactory21.getEmbeddedServletContainer(servletContextInitializerArray41);
        org.springframework.boot.context.embedded.JspServlet jspServlet44 = undertowEmbeddedServletContainerFactory21.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet44);
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection51 = undertowEmbeddedServletContainerFactory50.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet52 = undertowEmbeddedServletContainerFactory50.getErrorPages();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings53 = undertowEmbeddedServletContainerFactory50.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        org.springframework.boot.context.embedded.JspServlet jspServlet56 = undertowEmbeddedServletContainerFactory55.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray59 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray59);
        undertowEmbeddedServletContainerFactory58.setBuffersPerRegion((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.Compression compression63 = undertowEmbeddedServletContainerFactory58.getCompression();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings64 = undertowEmbeddedServletContainerFactory58.getMimeMappings();
        undertowEmbeddedServletContainerFactory55.setMimeMappings(mimeMappings64);
        undertowEmbeddedServletContainerFactory50.setMimeMappings(mimeMappings64);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings64);
        java.lang.Class<?> wildcardClass68 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(errorPageSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertNotNull(embeddedServletContainer42);
        org.junit.Assert.assertNotNull(embeddedServletContainer43);
        org.junit.Assert.assertNotNull(jspServlet44);
        org.junit.Assert.assertNotNull(jspServlet46);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection51);
        org.junit.Assert.assertNotNull(errorPageSet52);
        org.junit.Assert.assertNotNull(mimeMappings53);
        org.junit.Assert.assertNotNull(jspServlet56);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray59);
        org.junit.Assert.assertNull(compression63);
        org.junit.Assert.assertNotNull(mimeMappings64);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file14);
        org.springframework.boot.context.embedded.Ssl ssl16 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file18);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertNull(ssl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression7);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file7 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file17);
        java.net.InetAddress inetAddress19 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory25.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory25.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory25.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory25.setResourceLoader(resourceLoader32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress36 = null;
        undertowEmbeddedServletContainerFactory35.setAddress(inetAddress36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray40);
        org.springframework.boot.context.embedded.Ssl ssl42 = null;
        undertowEmbeddedServletContainerFactory39.setSsl(ssl42);
        undertowEmbeddedServletContainerFactory39.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet46 = undertowEmbeddedServletContainerFactory39.getErrorPages();
        undertowEmbeddedServletContainerFactory39.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory39.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file53 = null;
        undertowEmbeddedServletContainerFactory52.setAccessLogDirectory(file53);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray55 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory52.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory39.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray55);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray55);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compression11);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(inetAddress19);
        org.junit.Assert.assertNull(ssl30);
        org.junit.Assert.assertNotNull(errorPageSet31);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray40);
        org.junit.Assert.assertNotNull(errorPageSet46);
        org.junit.Assert.assertNotNull(errorPageArray55);
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 97);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 100);
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str18 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.core.io.ResourceLoader resourceLoader19 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader19);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        org.junit.Assert.assertNull(file2);
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress2 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress2);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection8 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(ssl12);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        int int21 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory27.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        org.springframework.boot.context.embedded.Ssl ssl33 = null;
        undertowEmbeddedServletContainerFactory25.setSsl(ssl33);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory36.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl41 = undertowEmbeddedServletContainerFactory36.getSsl();
        boolean boolean42 = undertowEmbeddedServletContainerFactory36.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet43 = null;
        undertowEmbeddedServletContainerFactory36.setJspServlet(jspServlet43);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory36.getMimeMappings();
        undertowEmbeddedServletContainerFactory25.setMimeMappings(mimeMappings45);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection47 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory25.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory51.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory51.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl56 = null;
        undertowEmbeddedServletContainerFactory51.setSsl(ssl56);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray58 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory51.addErrorPages(errorPageArray58);
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray58);
        undertowEmbeddedServletContainerFactory25.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Compression compression63 = undertowEmbeddedServletContainerFactory25.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory65.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray70 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory69.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray70);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray74 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory73.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory69.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory65.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        java.lang.String str78 = undertowEmbeddedServletContainerFactory65.getContextPath();
        org.springframework.boot.context.embedded.JspServlet jspServlet79 = undertowEmbeddedServletContainerFactory65.getJspServlet();
        undertowEmbeddedServletContainerFactory25.setJspServlet(jspServlet79);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet79);
        org.springframework.boot.context.embedded.Compression compression82 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression82);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray30);
        org.junit.Assert.assertNull(ssl41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection47);
        org.junit.Assert.assertNotNull(errorPageArray58);
        org.junit.Assert.assertNull(compression63);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray70);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray74);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(jspServlet79);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        org.springframework.boot.context.embedded.Compression compression9 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression9);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file13 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        boolean boolean14 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory12.setAccessLogDirectory(file15);
        undertowEmbeddedServletContainerFactory12.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory20.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray21);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory20.setSsl(ssl23);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory34.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray39 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        undertowEmbeddedServletContainerFactory34.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray43);
        java.lang.String str47 = undertowEmbeddedServletContainerFactory34.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory49 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory49.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory49.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer55 = undertowEmbeddedServletContainerFactory49.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer56 = undertowEmbeddedServletContainerFactory34.getEmbeddedServletContainer(servletContextInitializerArray54);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer57 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray54);
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray54);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray54);
        java.io.File file60 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression61 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression61);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file65 = undertowEmbeddedServletContainerFactory64.getSessionStoreDir();
        boolean boolean66 = undertowEmbeddedServletContainerFactory64.isAccessLogEnabled();
        java.io.File file67 = null;
        undertowEmbeddedServletContainerFactory64.setAccessLogDirectory(file67);
        undertowEmbeddedServletContainerFactory64.setPersistSession(false);
        org.springframework.boot.context.embedded.JspServlet jspServlet71 = undertowEmbeddedServletContainerFactory64.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet71);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection73 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file76 = undertowEmbeddedServletContainerFactory75.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory75.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl79 = null;
        undertowEmbeddedServletContainerFactory75.setSsl(ssl79);
        java.lang.String str81 = undertowEmbeddedServletContainerFactory75.getContextPath();
        int int82 = undertowEmbeddedServletContainerFactory75.getSessionTimeout();
        java.net.InetAddress inetAddress83 = null;
        undertowEmbeddedServletContainerFactory75.setAddress(inetAddress83);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet85 = undertowEmbeddedServletContainerFactory75.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet85);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection89 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNotNull(errorPageSet10);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray21);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray39);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        org.junit.Assert.assertNotNull(embeddedServletContainer55);
        org.junit.Assert.assertNotNull(embeddedServletContainer56);
        org.junit.Assert.assertNotNull(embeddedServletContainer57);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jspServlet71);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection73);
        org.junit.Assert.assertNull(file76);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1800 + "'", int82 == 1800);
        org.junit.Assert.assertNotNull(errorPageSet85);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection89);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray12);
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory11.setSsl(ssl14);
        undertowEmbeddedServletContainerFactory11.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray26 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory25.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray30);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        boolean boolean42 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.net.InetAddress inetAddress43 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress43);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray12);
        org.junit.Assert.assertNotNull(errorPageSet18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        org.springframework.boot.context.embedded.Ssl ssl9 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl9);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory12.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl17 = undertowEmbeddedServletContainerFactory12.getSsl();
        boolean boolean18 = undertowEmbeddedServletContainerFactory12.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = null;
        undertowEmbeddedServletContainerFactory12.setJspServlet(jspServlet19);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory12.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings21);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory28.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl33 = null;
        undertowEmbeddedServletContainerFactory28.setSsl(ssl33);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray35 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory28.addErrorPages(errorPageArray35);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray35);
        java.net.InetAddress inetAddress38 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertNull(ssl17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        org.junit.Assert.assertNotNull(errorPageArray35);
        org.junit.Assert.assertNull(inetAddress38);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setPort(0);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory16.setSessionStoreDir(file19);
        undertowEmbeddedServletContainerFactory16.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.JspServlet jspServlet23 = undertowEmbeddedServletContainerFactory16.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet23);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection25 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        org.junit.Assert.assertNotNull(jspServlet23);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection25);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer7 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray6);
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(embeddedServletContainer7);
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        undertowEmbeddedServletContainerFactory1.setPort(100);
        java.lang.Class<?> wildcardClass4 = undertowEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file10);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file4 = undertowEmbeddedServletContainerFactory3.getSessionStoreDir();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory3.getContextPath();
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory3.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory3.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory13.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray14);
        undertowEmbeddedServletContainerFactory3.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray14);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory22.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory20.addBuilderCustomizers(undertowBuilderCustomizerArray25);
        undertowEmbeddedServletContainerFactory20.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress34 = null;
        undertowEmbeddedServletContainerFactory33.setAddress(inetAddress34);
        java.net.InetAddress inetAddress36 = undertowEmbeddedServletContainerFactory33.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file39 = undertowEmbeddedServletContainerFactory38.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory38.setPersistSession(false);
        java.lang.String str42 = undertowEmbeddedServletContainerFactory38.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory44.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory44.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl49 = undertowEmbeddedServletContainerFactory44.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer51 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap50);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer53 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer55 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap54);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray56 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer51, initParameterConfiguringServletContextInitializer53, initParameterConfiguringServletContextInitializer55 };
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray56);
        undertowEmbeddedServletContainerFactory44.setJspServletClassName("hi!");
        int int60 = undertowEmbeddedServletContainerFactory44.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = undertowEmbeddedServletContainerFactory44.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory63.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory67 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray68 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory67.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray68);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory71.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory67.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        undertowEmbeddedServletContainerFactory63.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray72);
        java.lang.String str76 = undertowEmbeddedServletContainerFactory63.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory78.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory78.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory78.getEmbeddedServletContainer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory63.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer87 = undertowEmbeddedServletContainerFactory38.getEmbeddedServletContainer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer88 = undertowEmbeddedServletContainerFactory33.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer90 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer91 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray83);
        java.lang.String str92 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file93 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray14);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray25);
        org.junit.Assert.assertNull(inetAddress36);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(ssl49);
        org.junit.Assert.assertNotNull(servletContextInitializerArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet61);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray68);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray72);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        org.junit.Assert.assertNotNull(embeddedServletContainer87);
        org.junit.Assert.assertNotNull(embeddedServletContainer88);
        org.junit.Assert.assertNotNull(embeddedServletContainer90);
        org.junit.Assert.assertNotNull(embeddedServletContainer91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNull(file93);
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.Compression compression12 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression12);
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        boolean boolean17 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl19 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory22.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl27 = undertowEmbeddedServletContainerFactory22.getSsl();
        boolean boolean28 = undertowEmbeddedServletContainerFactory22.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = null;
        undertowEmbeddedServletContainerFactory22.setJspServlet(jspServlet29);
        java.net.InetAddress inetAddress31 = undertowEmbeddedServletContainerFactory22.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        undertowEmbeddedServletContainerFactory22.setResourceLoader(resourceLoader32);
        undertowEmbeddedServletContainerFactory22.setIoThreads((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory37.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory37.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl42 = undertowEmbeddedServletContainerFactory37.getSsl();
        boolean boolean43 = undertowEmbeddedServletContainerFactory37.isAccessLogEnabled();
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory37.setAccessLogDirectory(file44);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray46 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet47 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet47, errorPageArray46);
        undertowEmbeddedServletContainerFactory37.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet47);
        undertowEmbeddedServletContainerFactory37.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings52 = undertowEmbeddedServletContainerFactory37.getMimeMappings();
        boolean boolean53 = undertowEmbeddedServletContainerFactory37.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory55.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory59.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory59.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl64 = undertowEmbeddedServletContainerFactory59.getSsl();
        boolean boolean65 = undertowEmbeddedServletContainerFactory59.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet66 = null;
        undertowEmbeddedServletContainerFactory59.setJspServlet(jspServlet66);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray68 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet69 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet69, errorPageArray68);
        undertowEmbeddedServletContainerFactory59.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet69);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet69);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet73 = undertowEmbeddedServletContainerFactory55.getErrorPages();
        boolean boolean74 = undertowEmbeddedServletContainerFactory55.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory76 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory76.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory76.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray81 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer82 = undertowEmbeddedServletContainerFactory76.getEmbeddedServletContainer(servletContextInitializerArray81);
        undertowEmbeddedServletContainerFactory55.addInitializers(servletContextInitializerArray81);
        undertowEmbeddedServletContainerFactory37.addInitializers(servletContextInitializerArray81);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory22.getEmbeddedServletContainer(servletContextInitializerArray81);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer86 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray81);
        java.lang.String str87 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings88 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNull(inetAddress11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertNull(ssl27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inetAddress31);
        org.junit.Assert.assertNull(ssl42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(errorPageArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(mimeMappings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(ssl64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(errorPageArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(errorPageSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray81);
        org.junit.Assert.assertNotNull(embeddedServletContainer82);
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        org.junit.Assert.assertNotNull(embeddedServletContainer86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNotNull(mimeMappings88);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Compression compression5 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(compression5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        boolean boolean8 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl9 = undertowEmbeddedServletContainerFactory1.getSsl();
        int int10 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(ssl9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1800 + "'", int10 == 1800);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
        org.junit.Assert.assertNotNull(mimeMappings12);
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11, errorPageArray10);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet11);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        java.net.InetAddress inetAddress21 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorPageArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(ssl18);
        org.junit.Assert.assertNull(inetAddress21);
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1800);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Compression compression18 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.junit.Assert.assertNull(compression18);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorPageSet14);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray6);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '4');
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file16 = undertowEmbeddedServletContainerFactory15.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory15.setPersistSession(false);
        undertowEmbeddedServletContainerFactory15.setJspServletClassName("");
        java.io.File file21 = undertowEmbeddedServletContainerFactory15.getSessionStoreDir();
        java.lang.String str22 = undertowEmbeddedServletContainerFactory15.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory24.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory24.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl29 = undertowEmbeddedServletContainerFactory24.getSsl();
        boolean boolean30 = undertowEmbeddedServletContainerFactory24.isAccessLogEnabled();
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory24.setAccessLogDirectory(file31);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34, errorPageArray33);
        undertowEmbeddedServletContainerFactory24.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34);
        undertowEmbeddedServletContainerFactory15.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet34);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory39.addBuilderCustomizers(undertowBuilderCustomizerArray42);
        undertowEmbeddedServletContainerFactory15.addBuilderCustomizers(undertowBuilderCustomizerArray42);
        undertowEmbeddedServletContainerFactory15.setPort(32);
        undertowEmbeddedServletContainerFactory15.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory15.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory15.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory56.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory56.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl61 = undertowEmbeddedServletContainerFactory56.getSsl();
        boolean boolean62 = undertowEmbeddedServletContainerFactory56.isAccessLogEnabled();
        java.io.File file63 = null;
        undertowEmbeddedServletContainerFactory56.setAccessLogDirectory(file63);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray65 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet66, errorPageArray65);
        undertowEmbeddedServletContainerFactory56.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet66);
        undertowEmbeddedServletContainerFactory56.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory56.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory56.setIoThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory56.setContextPath("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory78.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory78.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer84 = undertowEmbeddedServletContainerFactory78.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory56.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer86 = undertowEmbeddedServletContainerFactory15.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(ssl29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(errorPageArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray42);
        org.junit.Assert.assertNull(ssl61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(errorPageArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        org.junit.Assert.assertNotNull(embeddedServletContainer84);
        org.junit.Assert.assertNotNull(embeddedServletContainer86);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 10);
        boolean boolean16 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file21 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("");
        java.io.File file26 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        java.io.File file27 = undertowEmbeddedServletContainerFactory20.getDocumentRoot();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory29.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl34 = undertowEmbeddedServletContainerFactory29.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer38 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer40 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap39);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer36, initParameterConfiguringServletContextInitializer38, initParameterConfiguringServletContextInitializer40 };
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray41);
        undertowEmbeddedServletContainerFactory29.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory29.setBuffersPerRegion((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file49 = undertowEmbeddedServletContainerFactory48.getSessionStoreDir();
        boolean boolean50 = undertowEmbeddedServletContainerFactory48.isAccessLogEnabled();
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory48.setAccessLogDirectory(file51);
        undertowEmbeddedServletContainerFactory48.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory56.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray57);
        org.springframework.boot.context.embedded.Ssl ssl59 = null;
        undertowEmbeddedServletContainerFactory56.setSsl(ssl59);
        org.springframework.boot.context.embedded.Ssl ssl61 = undertowEmbeddedServletContainerFactory56.getSsl();
        undertowEmbeddedServletContainerFactory56.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory56.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection66 = undertowEmbeddedServletContainerFactory56.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory56.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory70.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory74 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray75 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray75);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory78 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray79 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory78.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory74.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        undertowEmbeddedServletContainerFactory70.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray79);
        java.lang.String str83 = undertowEmbeddedServletContainerFactory70.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory85 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory85.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory85.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray90 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer91 = undertowEmbeddedServletContainerFactory85.getEmbeddedServletContainer(servletContextInitializerArray90);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer92 = undertowEmbeddedServletContainerFactory70.getEmbeddedServletContainer(servletContextInitializerArray90);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer93 = undertowEmbeddedServletContainerFactory56.getEmbeddedServletContainer(servletContextInitializerArray90);
        undertowEmbeddedServletContainerFactory48.addInitializers(servletContextInitializerArray90);
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray90);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray90);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer97 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray90);
        boolean boolean98 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(ssl34);
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray57);
        org.junit.Assert.assertNull(ssl61);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection66);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray75);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray79);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(servletContextInitializerArray90);
        org.junit.Assert.assertNotNull(embeddedServletContainer91);
        org.junit.Assert.assertNotNull(embeddedServletContainer92);
        org.junit.Assert.assertNotNull(embeddedServletContainer93);
        org.junit.Assert.assertNotNull(embeddedServletContainer97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file6 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        undertowEmbeddedServletContainerFactory5.setJspServletClassName("");
        java.io.File file11 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory5.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file21);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        java.io.File file29 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file31 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        boolean boolean34 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        int int10 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory12.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl17 = null;
        undertowEmbeddedServletContainerFactory12.setSsl(ssl17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file21 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory25.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory25.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer32 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer34 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap33);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer36 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap35);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer32, initParameterConfiguringServletContextInitializer34, initParameterConfiguringServletContextInitializer36 };
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray37);
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray37);
        undertowEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray37);
        java.lang.String str41 = undertowEmbeddedServletContainerFactory12.getContextPath();
        undertowEmbeddedServletContainerFactory12.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory12.setBuffersPerRegion((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.Ssl ssl46 = undertowEmbeddedServletContainerFactory12.getSsl();
        undertowEmbeddedServletContainerFactory12.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory12.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory54.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory54.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory52.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(errorPageSet7);
        org.junit.Assert.assertNotNull(jspServlet8);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1800 + "'", int10 == 1800);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(ssl30);
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(ssl46);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray57);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        java.net.InetAddress inetAddress8 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress8);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.Compression compression19 = undertowEmbeddedServletContainerFactory1.getCompression();
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Compression compression21 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(compression19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.net.InetAddress inetAddress2 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress2);
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory6.setJspServletClassName("hi!");
        int int22 = undertowEmbeddedServletContainerFactory6.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory6.getErrorPages();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = undertowEmbeddedServletContainerFactory6.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet24);
        java.lang.String str26 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection33 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(errorPageSet23);
        org.junit.Assert.assertNotNull(jspServlet24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection33);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 0);
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int11 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file21 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setPersistSession(false);
        undertowEmbeddedServletContainerFactory20.setJspServletClassName("");
        java.io.File file26 = undertowEmbeddedServletContainerFactory20.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory20.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory20.setBufferSize((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory20.setDisplayName("hi!");
        org.springframework.core.io.ResourceLoader resourceLoader33 = null;
        undertowEmbeddedServletContainerFactory20.setResourceLoader(resourceLoader33);
        org.springframework.boot.context.embedded.Compression compression35 = undertowEmbeddedServletContainerFactory20.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory37.setSsl(ssl40);
        undertowEmbeddedServletContainerFactory37.setPort(0);
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory37.setSessionStoreDir(file44);
        org.springframework.boot.context.embedded.Compression compression46 = null;
        undertowEmbeddedServletContainerFactory37.setCompression(compression46);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray48 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory37.addErrorPages(errorPageArray48);
        undertowEmbeddedServletContainerFactory20.addErrorPages(errorPageArray48);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray48);
        int int52 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.core.io.ResourceLoader resourceLoader53 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader53);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(compression35);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertNotNull(errorPageArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory11.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray14 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory11.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        undertowEmbeddedServletContainerFactory9.addBuilderCustomizers(undertowBuilderCustomizerArray14);
        org.springframework.boot.context.embedded.Ssl ssl17 = null;
        undertowEmbeddedServletContainerFactory9.setSsl(ssl17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory20.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory20.getSsl();
        boolean boolean26 = undertowEmbeddedServletContainerFactory20.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet27 = null;
        undertowEmbeddedServletContainerFactory20.setJspServlet(jspServlet27);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings29);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory9.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory9.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory35.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl40 = null;
        undertowEmbeddedServletContainerFactory35.setSsl(ssl40);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory35.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray42);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file47 = undertowEmbeddedServletContainerFactory46.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory46.setPersistSession(false);
        undertowEmbeddedServletContainerFactory46.setJspServletClassName("");
        java.io.File file52 = undertowEmbeddedServletContainerFactory46.getSessionStoreDir();
        java.lang.String str53 = undertowEmbeddedServletContainerFactory46.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory55.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory55.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl60 = undertowEmbeddedServletContainerFactory55.getSsl();
        boolean boolean61 = undertowEmbeddedServletContainerFactory55.isAccessLogEnabled();
        java.io.File file62 = null;
        undertowEmbeddedServletContainerFactory55.setAccessLogDirectory(file62);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray64 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet65 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet65, errorPageArray64);
        undertowEmbeddedServletContainerFactory55.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet65);
        undertowEmbeddedServletContainerFactory46.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet65);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory70.setPort((int) (byte) -1);
        boolean boolean73 = undertowEmbeddedServletContainerFactory70.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory75.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory75.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl80 = null;
        undertowEmbeddedServletContainerFactory75.setSsl(ssl80);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray82 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory75.addErrorPages(errorPageArray82);
        undertowEmbeddedServletContainerFactory70.addErrorPages(errorPageArray82);
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray82);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray82);
        undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray82);
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray14);
        org.junit.Assert.assertNull(ssl25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mimeMappings29);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        org.junit.Assert.assertNotNull(errorPageArray42);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(ssl60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(errorPageArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(errorPageArray82);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file2);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file6 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        undertowEmbeddedServletContainerFactory5.setJspServletClassName("");
        java.io.File file11 = undertowEmbeddedServletContainerFactory5.getSessionStoreDir();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory5.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        boolean boolean20 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory14.setAccessLogDirectory(file21);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory5.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        java.io.File file29 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(file29);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection4 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection5 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings6 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl7 = null;
        undertowEmbeddedServletContainerFactory2.setSsl(ssl7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        boolean boolean10 = undertowEmbeddedServletContainerFactory2.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory2.setPort((int) '#');
        undertowEmbeddedServletContainerFactory2.setBufferSize((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection4);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection5);
        org.junit.Assert.assertNotNull(mimeMappings6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        boolean boolean21 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        org.springframework.boot.context.embedded.Ssl ssl26 = null;
        undertowEmbeddedServletContainerFactory23.setSsl(ssl26);
        undertowEmbeddedServletContainerFactory23.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = undertowEmbeddedServletContainerFactory23.getErrorPages();
        undertowEmbeddedServletContainerFactory23.setUseForwardHeaders(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray42 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory41.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory37.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory23.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray42);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        java.io.File file52 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file52);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
        org.junit.Assert.assertNotNull(errorPageSet30);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray42);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory7.setPersistSession(false);
        boolean boolean12 = undertowEmbeddedServletContainerFactory7.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        boolean boolean17 = undertowEmbeddedServletContainerFactory14.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory19.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl24 = null;
        undertowEmbeddedServletContainerFactory19.setSsl(ssl24);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory7.addErrorPages(errorPageArray26);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray26);
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 97);
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray20 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory17.addBuilderCustomizers(undertowBuilderCustomizerArray20);
        java.lang.String str22 = undertowEmbeddedServletContainerFactory17.getContextPath();
        undertowEmbeddedServletContainerFactory17.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray27 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray27);
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory26.setSessionStoreDir(file29);
        undertowEmbeddedServletContainerFactory26.setPort(0);
        int int33 = undertowEmbeddedServletContainerFactory26.getSessionTimeout();
        int int34 = undertowEmbeddedServletContainerFactory26.getPort();
        undertowEmbeddedServletContainerFactory26.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 97);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory40.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl45 = undertowEmbeddedServletContainerFactory40.getSsl();
        boolean boolean46 = undertowEmbeddedServletContainerFactory40.isAccessLogEnabled();
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory40.setAccessLogDirectory(file47);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet50, errorPageArray49);
        undertowEmbeddedServletContainerFactory40.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet50);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) (byte) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection55 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        org.springframework.boot.context.embedded.JspServlet jspServlet56 = undertowEmbeddedServletContainerFactory40.getJspServlet();
        org.springframework.boot.context.embedded.Ssl ssl57 = undertowEmbeddedServletContainerFactory40.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray60 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory59.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray60);
        org.springframework.boot.context.embedded.Ssl ssl62 = null;
        undertowEmbeddedServletContainerFactory59.setSsl(ssl62);
        undertowEmbeddedServletContainerFactory59.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet66 = undertowEmbeddedServletContainerFactory59.getErrorPages();
        undertowEmbeddedServletContainerFactory59.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory59.setIoThreads((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory72 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file73 = null;
        undertowEmbeddedServletContainerFactory72.setAccessLogDirectory(file73);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray75 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory72.addErrorPages(errorPageArray75);
        undertowEmbeddedServletContainerFactory59.addErrorPages(errorPageArray75);
        undertowEmbeddedServletContainerFactory40.addErrorPages(errorPageArray75);
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray75);
        undertowEmbeddedServletContainerFactory17.addErrorPages(errorPageArray75);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray75);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1800 + "'", int33 == 1800);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(ssl45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(errorPageArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection55);
        org.junit.Assert.assertNotNull(jspServlet56);
        org.junit.Assert.assertNull(ssl57);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray60);
        org.junit.Assert.assertNotNull(errorPageSet66);
        org.junit.Assert.assertNotNull(errorPageArray75);
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 100);
        java.net.InetAddress inetAddress27 = undertowEmbeddedServletContainerFactory1.getAddress();
        java.io.File file28 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(inetAddress27);
        org.junit.Assert.assertNull(file28);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file4);
        java.io.File file6 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file6);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file16);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory7.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory7.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory7.getSsl();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet13 = undertowEmbeddedServletContainerFactory7.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet13);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        java.lang.String str17 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.Compression compression18 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression18);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.junit.Assert.assertNull(ssl12);
        org.junit.Assert.assertNotNull(errorPageSet13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        java.lang.String str10 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory31.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl36 = undertowEmbeddedServletContainerFactory31.getSsl();
        boolean boolean37 = undertowEmbeddedServletContainerFactory31.isAccessLogEnabled();
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory31.setAccessLogDirectory(file38);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        undertowEmbeddedServletContainerFactory31.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        undertowEmbeddedServletContainerFactory31.setAccessLogPattern("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings46 = undertowEmbeddedServletContainerFactory31.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings46);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file49 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file49);
        java.lang.String str51 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 32);
        boolean boolean54 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        boolean boolean55 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertNull(ssl36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(errorPageArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mimeMappings46);
        org.junit.Assert.assertNotNull(mimeMappings48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean7 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file15);
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection14);
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file25);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection27 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file28);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection27);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.Compression compression8 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file11);
        org.springframework.boot.context.embedded.JspServlet jspServlet13 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(compression8);
        org.junit.Assert.assertNotNull(jspServlet13);
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file5);
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression7);
        org.springframework.boot.context.embedded.Compression compression9 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(compression9);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory2.setPort(1800);
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 97);
        undertowEmbeddedServletContainerFactory2.setPort((int) (byte) 100);
        undertowEmbeddedServletContainerFactory2.setAccessLogPattern("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        boolean boolean12 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(errorPageSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        int int5 = undertowEmbeddedServletContainerFactory2.getPort();
        java.io.File file6 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory9.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory9.setBuffersPerRegion((java.lang.Integer) 32);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory9.getDisplayName();
        int int15 = undertowEmbeddedServletContainerFactory9.getSessionTimeout();
        undertowEmbeddedServletContainerFactory9.setWorkerThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file20 = undertowEmbeddedServletContainerFactory19.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory24.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory24.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl29 = undertowEmbeddedServletContainerFactory24.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer31 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer33 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer35 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap34);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer31, initParameterConfiguringServletContextInitializer33, initParameterConfiguringServletContextInitializer35 };
        undertowEmbeddedServletContainerFactory24.addInitializers(servletContextInitializerArray36);
        undertowEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray36);
        java.io.File file39 = null;
        undertowEmbeddedServletContainerFactory19.setDocumentRoot(file39);
        org.springframework.boot.context.embedded.Ssl ssl41 = null;
        undertowEmbeddedServletContainerFactory19.setSsl(ssl41);
        undertowEmbeddedServletContainerFactory19.setDirectBuffers((java.lang.Boolean) true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file47 = undertowEmbeddedServletContainerFactory46.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory46.setPersistSession(false);
        undertowEmbeddedServletContainerFactory46.setJspServletClassName("");
        java.io.File file52 = undertowEmbeddedServletContainerFactory46.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory46.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory46.setBufferSize((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory46.setDisplayName("hi!");
        org.springframework.core.io.ResourceLoader resourceLoader59 = null;
        undertowEmbeddedServletContainerFactory46.setResourceLoader(resourceLoader59);
        org.springframework.boot.context.embedded.Compression compression61 = undertowEmbeddedServletContainerFactory46.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray64 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory63.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray64);
        org.springframework.boot.context.embedded.Ssl ssl66 = null;
        undertowEmbeddedServletContainerFactory63.setSsl(ssl66);
        undertowEmbeddedServletContainerFactory63.setPort(0);
        java.io.File file70 = null;
        undertowEmbeddedServletContainerFactory63.setSessionStoreDir(file70);
        org.springframework.boot.context.embedded.Compression compression72 = null;
        undertowEmbeddedServletContainerFactory63.setCompression(compression72);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray74 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory63.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory46.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory9.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray74);
        java.io.File file80 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1800 + "'", int15 == 1800);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(ssl29);
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNull(compression61);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray64);
        org.junit.Assert.assertNotNull(errorPageArray74);
        org.junit.Assert.assertNull(file80);
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file10);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray21 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addBuilderCustomizers(undertowBuilderCustomizerArray21);
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray21);
        org.springframework.boot.context.embedded.Ssl ssl24 = null;
        undertowEmbeddedServletContainerFactory16.setSsl(ssl24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory27.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory27.getSsl();
        boolean boolean33 = undertowEmbeddedServletContainerFactory27.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet34 = null;
        undertowEmbeddedServletContainerFactory27.setJspServlet(jspServlet34);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings36 = undertowEmbeddedServletContainerFactory27.getMimeMappings();
        undertowEmbeddedServletContainerFactory16.setMimeMappings(mimeMappings36);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory16.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory42.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory42.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl47 = null;
        undertowEmbeddedServletContainerFactory42.setSsl(ssl47);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory42.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory16.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray21);
        org.junit.Assert.assertNull(ssl32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mimeMappings36);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        org.junit.Assert.assertNotNull(errorPageArray49);
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory1.setPort(0);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader10);
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPort((int) '#');
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        boolean boolean19 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        java.io.File file20 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(file20);
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl23);
        org.springframework.boot.context.embedded.Compression compression25 = undertowEmbeddedServletContainerFactory1.getCompression();
        int int26 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file29 = undertowEmbeddedServletContainerFactory28.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory28.setPersistSession(false);
        undertowEmbeddedServletContainerFactory28.setJspServletClassName("");
        undertowEmbeddedServletContainerFactory28.setPersistSession(false);
        int int36 = undertowEmbeddedServletContainerFactory28.getSessionTimeout();
        undertowEmbeddedServletContainerFactory28.setAccessLogEnabled(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file41 = undertowEmbeddedServletContainerFactory40.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory40.setPersistSession(false);
        undertowEmbeddedServletContainerFactory40.setJspServletClassName("");
        java.io.File file46 = undertowEmbeddedServletContainerFactory40.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory40.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory40.setBufferSize((java.lang.Integer) 0);
        int int51 = undertowEmbeddedServletContainerFactory40.getSessionTimeout();
        java.io.File file52 = undertowEmbeddedServletContainerFactory40.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory54.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray59 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray63 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory62.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory58.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        undertowEmbeddedServletContainerFactory54.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray63);
        java.lang.String str67 = undertowEmbeddedServletContainerFactory54.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory69.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory69.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray74 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer75 = undertowEmbeddedServletContainerFactory69.getEmbeddedServletContainer(servletContextInitializerArray74);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer76 = undertowEmbeddedServletContainerFactory54.getEmbeddedServletContainer(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        org.springframework.core.io.ResourceLoader resourceLoader82 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader82);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray84 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray84);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNull(compression25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1800 + "'", int36 == 1800);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNull(file46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1800 + "'", int51 == 1800);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray59);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray63);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(servletContextInitializerArray74);
        org.junit.Assert.assertNotNull(embeddedServletContainer75);
        org.junit.Assert.assertNotNull(embeddedServletContainer76);
        org.junit.Assert.assertNotNull(errorPageArray84);
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean3 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 100);
        java.io.File file6 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.JspServlet jspServlet7 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(jspServlet7);
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 97);
        java.io.File file3 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        int int4 = undertowEmbeddedServletContainerFactory2.getPort();
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray15 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory12.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory10.addBuilderCustomizers(undertowBuilderCustomizerArray15);
        undertowEmbeddedServletContainerFactory10.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory10.setIoThreads((java.lang.Integer) 10);
        java.lang.String str22 = undertowEmbeddedServletContainerFactory10.getDisplayName();
        undertowEmbeddedServletContainerFactory10.setIoThreads((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings25);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(mimeMappings25);
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.lang.String str3 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress13 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.Ssl ssl15 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(inetAddress4);
        org.junit.Assert.assertNull(ssl15);
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory9.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory9.setRegisterDefaultServlet(false);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory9.setResourceLoader(resourceLoader14);
        org.springframework.boot.context.embedded.Compression compression16 = null;
        undertowEmbeddedServletContainerFactory9.setCompression(compression16);
        undertowEmbeddedServletContainerFactory9.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory21.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl26 = undertowEmbeddedServletContainerFactory21.getSsl();
        boolean boolean27 = undertowEmbeddedServletContainerFactory21.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet28 = null;
        undertowEmbeddedServletContainerFactory21.setJspServlet(jspServlet28);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings30 = undertowEmbeddedServletContainerFactory21.getMimeMappings();
        undertowEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings30);
        undertowEmbeddedServletContainerFactory9.setWorkerThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory9.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory9.setDirectBuffers((java.lang.Boolean) false);
        boolean boolean38 = undertowEmbeddedServletContainerFactory9.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory9.setAccessLogPattern("");
        org.springframework.boot.context.embedded.JspServlet jspServlet41 = undertowEmbeddedServletContainerFactory9.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet41);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mimeMappings30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jspServlet41);
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray2 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray2);
        org.springframework.boot.context.embedded.Ssl ssl4 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl4);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file14 = undertowEmbeddedServletContainerFactory13.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        undertowEmbeddedServletContainerFactory13.setJspServletClassName("");
        java.io.File file19 = undertowEmbeddedServletContainerFactory13.getSessionStoreDir();
        java.lang.String str20 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory22.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl27 = undertowEmbeddedServletContainerFactory22.getSsl();
        boolean boolean28 = undertowEmbeddedServletContainerFactory22.isAccessLogEnabled();
        java.io.File file29 = null;
        undertowEmbeddedServletContainerFactory22.setAccessLogDirectory(file29);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32, errorPageArray31);
        undertowEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        undertowEmbeddedServletContainerFactory13.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory38.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl43 = undertowEmbeddedServletContainerFactory38.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer45 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer47 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer49 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap48);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer45, initParameterConfiguringServletContextInitializer47, initParameterConfiguringServletContextInitializer49 };
        undertowEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray50);
        undertowEmbeddedServletContainerFactory38.setBufferSize((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection54 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory38.setAccessLogDirectory(file55);
        undertowEmbeddedServletContainerFactory38.setAccessLogEnabled(true);
        boolean boolean59 = undertowEmbeddedServletContainerFactory38.isPersistSession();
        java.io.File file60 = null;
        undertowEmbeddedServletContainerFactory38.setDocumentRoot(file60);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet62 = undertowEmbeddedServletContainerFactory38.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet62);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray2);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(ssl27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(ssl43);
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(errorPageSet62);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory3.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        java.lang.String str8 = undertowEmbeddedServletContainerFactory3.getContextPath();
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 100);
        undertowEmbeddedServletContainerFactory13.setPort(1800);
        java.lang.String str16 = undertowEmbeddedServletContainerFactory13.getContextPath();
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file17);
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory13.setAddress(inetAddress19);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setPort((int) (byte) -1);
        boolean boolean25 = undertowEmbeddedServletContainerFactory22.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory27.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl32 = null;
        undertowEmbeddedServletContainerFactory27.setSsl(ssl32);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray34 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray34);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray34);
        java.lang.String str37 = undertowEmbeddedServletContainerFactory22.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        undertowEmbeddedServletContainerFactory39.setAccessLogPattern("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray44 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray48 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory47.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        undertowEmbeddedServletContainerFactory43.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        undertowEmbeddedServletContainerFactory39.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        java.lang.String str52 = undertowEmbeddedServletContainerFactory39.getContextPath();
        java.lang.String str53 = undertowEmbeddedServletContainerFactory39.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory55.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory55.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory55.getEmbeddedServletContainer(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer62 = undertowEmbeddedServletContainerFactory39.getEmbeddedServletContainer(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory3.addInitializers(servletContextInitializerArray60);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray60);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet69 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorPageArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray44);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        org.junit.Assert.assertNotNull(embeddedServletContainer62);
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
        org.junit.Assert.assertNotNull(jspServlet69);
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        boolean boolean6 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setPort((int) (byte) -1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory13.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory13.setSsl(ssl18);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray20 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray20);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray20);
        java.io.File file24 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file34);
        boolean boolean36 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(errorPageArray20);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory6.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl11 = undertowEmbeddedServletContainerFactory6.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer13 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer15 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer17 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap16);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer13, initParameterConfiguringServletContextInitializer15, initParameterConfiguringServletContextInitializer17 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray18);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) 'a');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection29 = undertowEmbeddedServletContainerFactory28.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory28.setAccessLogEnabled(false);
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.Compression compression34 = undertowEmbeddedServletContainerFactory28.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection37 = undertowEmbeddedServletContainerFactory36.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet38 = undertowEmbeddedServletContainerFactory36.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory40.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl45 = undertowEmbeddedServletContainerFactory40.getSsl();
        boolean boolean46 = undertowEmbeddedServletContainerFactory40.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory48.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory48.setPersistSession(false);
        boolean boolean53 = undertowEmbeddedServletContainerFactory48.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory55.setPort((int) (byte) -1);
        boolean boolean58 = undertowEmbeddedServletContainerFactory55.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory60.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory60.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl65 = null;
        undertowEmbeddedServletContainerFactory60.setSsl(ssl65);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray67 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory60.addErrorPages(errorPageArray67);
        undertowEmbeddedServletContainerFactory55.addErrorPages(errorPageArray67);
        undertowEmbeddedServletContainerFactory48.addErrorPages(errorPageArray67);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer71 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray72 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer71 };
        undertowEmbeddedServletContainerFactory48.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory40.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory36.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory28.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray72);
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file80 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file80);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection82 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean83 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(ssl11);
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection29);
        org.junit.Assert.assertNull(compression34);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection37);
        org.junit.Assert.assertNotNull(errorPageSet38);
        org.junit.Assert.assertNull(ssl45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorPageArray67);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray72);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl6);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory14.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory14.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer21 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer23 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer25 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap24);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer21, initParameterConfiguringServletContextInitializer23, initParameterConfiguringServletContextInitializer25 };
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory9.addInitializers(servletContextInitializerArray26);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray26);
        java.lang.String str30 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.Ssl ssl35 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Ssl ssl36 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl36);
        org.springframework.boot.context.embedded.Ssl ssl38 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(ssl19);
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(ssl35);
        org.junit.Assert.assertNull(ssl38);
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        org.springframework.boot.context.embedded.Compression compression21 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression21);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 100);
        java.io.File file27 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int28 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1800 + "'", int28 == 1800);
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 0);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        java.lang.String str4 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        java.lang.String str7 = undertowEmbeddedServletContainerFactory2.getDisplayName();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory2.getErrorPages();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(errorPageSet8);
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (short) 10);
        undertowEmbeddedServletContainerFactory2.setPort((int) (short) 0);
        org.springframework.boot.context.embedded.Compression compression5 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression5);
        org.springframework.boot.context.embedded.Compression compression7 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression7);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory10.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray15 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer16 = undertowEmbeddedServletContainerFactory10.getEmbeddedServletContainer(servletContextInitializerArray15);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        org.springframework.boot.context.embedded.JspServlet jspServlet21 = undertowEmbeddedServletContainerFactory18.getJspServlet();
        undertowEmbeddedServletContainerFactory10.setJspServlet(jspServlet21);
        undertowEmbeddedServletContainerFactory2.setJspServlet(jspServlet21);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(servletContextInitializerArray15);
        org.junit.Assert.assertNotNull(embeddedServletContainer16);
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        org.junit.Assert.assertNotNull(jspServlet21);
        org.junit.Assert.assertNotNull(mimeMappings26);
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        org.springframework.boot.context.embedded.Ssl ssl6 = undertowEmbeddedServletContainerFactory1.getSsl();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer8 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer10 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer initParameterConfiguringServletContextInitializer12 = new org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer(strMap11);
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray13 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { initParameterConfiguringServletContextInitializer8, initParameterConfiguringServletContextInitializer10, initParameterConfiguringServletContextInitializer12 };
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray13);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file18);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        int int22 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str23 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.String str26 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPort((int) 'a');
        java.net.InetAddress inetAddress29 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress29);
        org.springframework.boot.context.embedded.Ssl ssl31 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        org.junit.Assert.assertNull(ssl6);
        org.junit.Assert.assertNotNull(servletContextInitializerArray13);
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(ssl31);
    }
}

