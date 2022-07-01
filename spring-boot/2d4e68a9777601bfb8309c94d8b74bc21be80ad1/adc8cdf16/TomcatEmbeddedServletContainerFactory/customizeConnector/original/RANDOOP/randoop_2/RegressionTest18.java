import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        tomcatEmbeddedServletContainerFactory2.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection10 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.List<org.apache.catalina.connector.Connector> connectorList11 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.util.Collection<org.apache.catalina.Valve> valveCollection12 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.net.InetAddress inetAddress13 = tomcatEmbeddedServletContainerFactory2.getAddress();
        java.io.File file14 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file14);
        int int16 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        boolean boolean17 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        java.util.Collection<org.apache.catalina.Valve> valveCollection18 = tomcatEmbeddedServletContainerFactory2.getValves();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory21.setTldSkip("");
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray24 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        tomcatEmbeddedServletContainerFactory21.addConnectorCustomizers(tomcatConnectorCustomizerArray24);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory28.setTldSkip("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file34 = null;
        tomcatEmbeddedServletContainerFactory33.setDocumentRoot(file34);
        org.apache.catalina.Valve valve36 = null;
        org.apache.catalina.Valve[] valveArray37 = new org.apache.catalina.Valve[] { valve36 };
        tomcatEmbeddedServletContainerFactory33.addContextValves(valveArray37);
        tomcatEmbeddedServletContainerFactory28.addContextValves(valveArray37);
        tomcatEmbeddedServletContainerFactory21.addContextValves(valveArray37);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray37);
        tomcatEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        tomcatEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection10);
        org.junit.Assert.assertNotNull(connectorList11);
        org.junit.Assert.assertNotNull(valveCollection12);
        org.junit.Assert.assertNull(inetAddress13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(valveCollection18);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray24);
        org.junit.Assert.assertNotNull(valveArray37);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        boolean boolean5 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection11 = tomcatEmbeddedServletContainerFactory8.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file15 = null;
        tomcatEmbeddedServletContainerFactory14.setDocumentRoot(file15);
        java.lang.String str17 = tomcatEmbeddedServletContainerFactory14.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray18 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray18);
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray18);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray18);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file25 = null;
        tomcatEmbeddedServletContainerFactory24.setDocumentRoot(file25);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection27 = tomcatEmbeddedServletContainerFactory24.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file31 = null;
        tomcatEmbeddedServletContainerFactory30.setDocumentRoot(file31);
        org.apache.catalina.Valve valve33 = null;
        org.apache.catalina.Valve[] valveArray34 = new org.apache.catalina.Valve[] { valve33 };
        tomcatEmbeddedServletContainerFactory30.addContextValves(valveArray34);
        tomcatEmbeddedServletContainerFactory24.addContextValves(valveArray34);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray34);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file41 = null;
        tomcatEmbeddedServletContainerFactory40.setDocumentRoot(file41);
        java.lang.String str43 = tomcatEmbeddedServletContainerFactory40.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray44);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings46 = tomcatEmbeddedServletContainerFactory40.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener47 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray48 = new org.apache.catalina.LifecycleListener[] { lifecycleListener47 };
        tomcatEmbeddedServletContainerFactory40.addContextLifecycleListeners(lifecycleListenerArray48);
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray50 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerList51 = new java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList51, tomcatConnectorCustomizerArray50);
        tomcatEmbeddedServletContainerFactory40.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList51);
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList51);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage58 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray59 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage58 };
        tomcatEmbeddedServletContainerFactory57.addErrorPages(errorPageArray59);
        tomcatEmbeddedServletContainerFactory2.addErrorPages(errorPageArray59);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection62 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection63 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.net.InetAddress inetAddress64 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray18);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection27);
        org.junit.Assert.assertNotNull(valveArray34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        org.junit.Assert.assertNotNull(mimeMappings46);
        org.junit.Assert.assertNotNull(lifecycleListenerArray48);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(errorPageArray59);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection62);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection63);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.List<org.apache.catalina.connector.Connector> connectorList5 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection6 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        java.net.InetAddress inetAddress7 = tomcatEmbeddedServletContainerFactory2.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file11 = null;
        tomcatEmbeddedServletContainerFactory10.setDocumentRoot(file11);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection13 = tomcatEmbeddedServletContainerFactory10.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory10.setSessionTimeout((-1));
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = tomcatEmbeddedServletContainerFactory10.getMimeMappings();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) -1);
        java.net.InetAddress inetAddress20 = tomcatEmbeddedServletContainerFactory19.getAddress();
        tomcatEmbeddedServletContainerFactory19.setRegisterDefaultServlet(false);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory25.setTldSkip("");
        tomcatEmbeddedServletContainerFactory25.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress30 = tomcatEmbeddedServletContainerFactory25.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file34 = null;
        tomcatEmbeddedServletContainerFactory33.setDocumentRoot(file34);
        java.lang.String str36 = tomcatEmbeddedServletContainerFactory33.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory33.addInitializers(servletContextInitializerArray37);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings39 = tomcatEmbeddedServletContainerFactory33.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener40 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray41 = new org.apache.catalina.LifecycleListener[] { lifecycleListener40 };
        tomcatEmbeddedServletContainerFactory33.addContextLifecycleListeners(lifecycleListenerArray41);
        java.net.InetAddress inetAddress43 = tomcatEmbeddedServletContainerFactory33.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file47 = null;
        tomcatEmbeddedServletContainerFactory46.setDocumentRoot(file47);
        java.lang.String str49 = tomcatEmbeddedServletContainerFactory46.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray50);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings52 = tomcatEmbeddedServletContainerFactory46.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener53 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray54 = new org.apache.catalina.LifecycleListener[] { lifecycleListener53 };
        tomcatEmbeddedServletContainerFactory46.addContextLifecycleListeners(lifecycleListenerArray54);
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray56 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerList57 = new java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57, tomcatConnectorCustomizerArray56);
        tomcatEmbeddedServletContainerFactory46.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        tomcatEmbeddedServletContainerFactory33.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        tomcatEmbeddedServletContainerFactory25.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        tomcatEmbeddedServletContainerFactory19.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        tomcatEmbeddedServletContainerFactory10.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList57);
        boolean boolean65 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.junit.Assert.assertNotNull(connectorList5);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection6);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection13);
        org.junit.Assert.assertNotNull(mimeMappings16);
        org.junit.Assert.assertNull(inetAddress20);
        org.junit.Assert.assertNull(inetAddress30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        org.junit.Assert.assertNotNull(mimeMappings39);
        org.junit.Assert.assertNotNull(lifecycleListenerArray41);
        org.junit.Assert.assertNull(inetAddress43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertNotNull(mimeMappings52);
        org.junit.Assert.assertNotNull(lifecycleListenerArray54);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        int int15 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection16 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file20 = null;
        tomcatEmbeddedServletContainerFactory19.setDocumentRoot(file20);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection22 = tomcatEmbeddedServletContainerFactory19.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        tomcatEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection27 = tomcatEmbeddedServletContainerFactory19.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection28 = tomcatEmbeddedServletContainerFactory19.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer tomcatConnectorCustomizer29 = null;
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray30 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] { tomcatConnectorCustomizer29 };
        tomcatEmbeddedServletContainerFactory19.addConnectorCustomizers(tomcatConnectorCustomizerArray30);
        tomcatEmbeddedServletContainerFactory2.addConnectorCustomizers(tomcatConnectorCustomizerArray30);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory35.setTldSkip("");
        tomcatEmbeddedServletContainerFactory35.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress40 = tomcatEmbeddedServletContainerFactory35.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = tomcatEmbeddedServletContainerFactory35.getMimeMappings();
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings41);
        org.springframework.core.io.ResourceLoader resourceLoader43 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader43);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file48 = null;
        tomcatEmbeddedServletContainerFactory47.setDocumentRoot(file48);
        boolean boolean50 = tomcatEmbeddedServletContainerFactory47.isRegisterJspServlet();
        tomcatEmbeddedServletContainerFactory47.setPort((int) (byte) 1);
        java.net.InetAddress inetAddress53 = null;
        tomcatEmbeddedServletContainerFactory47.setAddress(inetAddress53);
        org.apache.catalina.Valve valve55 = null;
        org.apache.catalina.Valve[] valveArray56 = new org.apache.catalina.Valve[] { valve55 };
        tomcatEmbeddedServletContainerFactory47.addContextValves(valveArray56);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        org.apache.catalina.Valve valve59 = null;
        org.apache.catalina.Valve[] valveArray60 = new org.apache.catalina.Valve[] { valve59 };
        tomcatEmbeddedServletContainerFactory58.addContextValves(valveArray60);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file65 = null;
        tomcatEmbeddedServletContainerFactory64.setDocumentRoot(file65);
        java.lang.String str67 = tomcatEmbeddedServletContainerFactory64.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray68 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory64.addInitializers(servletContextInitializerArray68);
        org.apache.catalina.connector.Connector connector70 = null;
        org.apache.catalina.connector.Connector[] connectorArray71 = new org.apache.catalina.connector.Connector[] { connector70 };
        tomcatEmbeddedServletContainerFactory64.addAdditionalTomcatConnectors(connectorArray71);
        tomcatEmbeddedServletContainerFactory64.setProtocol("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory77 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file78 = null;
        tomcatEmbeddedServletContainerFactory77.setDocumentRoot(file78);
        java.lang.String str80 = tomcatEmbeddedServletContainerFactory77.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory83 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file84 = null;
        tomcatEmbeddedServletContainerFactory83.setDocumentRoot(file84);
        java.lang.String str86 = tomcatEmbeddedServletContainerFactory83.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray87 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory83.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory77.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory64.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory58.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory47.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray87);
        tomcatEmbeddedServletContainerFactory2.setContextPath("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection16);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection22);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection27);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection28);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray30);
        org.junit.Assert.assertNull(inetAddress40);
        org.junit.Assert.assertNotNull(mimeMappings41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(valveArray56);
        org.junit.Assert.assertNotNull(valveArray60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray68);
        org.junit.Assert.assertNotNull(connectorArray71);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray87);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = tomcatEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file12 = null;
        tomcatEmbeddedServletContainerFactory11.setDocumentRoot(file12);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection14 = tomcatEmbeddedServletContainerFactory11.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file18);
        org.apache.catalina.Valve valve20 = null;
        org.apache.catalina.Valve[] valveArray21 = new org.apache.catalina.Valve[] { valve20 };
        tomcatEmbeddedServletContainerFactory17.addContextValves(valveArray21);
        tomcatEmbeddedServletContainerFactory11.addContextValves(valveArray21);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection24 = tomcatEmbeddedServletContainerFactory11.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory11.setTldSkip("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage30 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage30 };
        tomcatEmbeddedServletContainerFactory29.addErrorPages(errorPageArray31);
        tomcatEmbeddedServletContainerFactory11.addErrorPages(errorPageArray31);
        tomcatEmbeddedServletContainerFactory2.addErrorPages(errorPageArray31);
        java.util.List<org.apache.catalina.connector.Connector> connectorList35 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file41 = null;
        tomcatEmbeddedServletContainerFactory40.setDocumentRoot(file41);
        java.lang.String str43 = tomcatEmbeddedServletContainerFactory40.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file47 = null;
        tomcatEmbeddedServletContainerFactory46.setDocumentRoot(file47);
        java.lang.String str49 = tomcatEmbeddedServletContainerFactory46.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray50 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray50);
        tomcatEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray50);
        tomcatEmbeddedServletContainerFactory40.setSessionTimeout((int) ' ');
        java.lang.String str55 = tomcatEmbeddedServletContainerFactory40.getUriEncoding();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file59 = null;
        tomcatEmbeddedServletContainerFactory58.setDocumentRoot(file59);
        java.lang.String str61 = tomcatEmbeddedServletContainerFactory58.getContextPath();
        java.net.InetAddress inetAddress62 = tomcatEmbeddedServletContainerFactory58.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet63 = tomcatEmbeddedServletContainerFactory58.getErrorPages();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet64 = tomcatEmbeddedServletContainerFactory58.getErrorPages();
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer65 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray66 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer65 };
        tomcatEmbeddedServletContainerFactory58.addInitializers(servletContextInitializerArray66);
        tomcatEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray66);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray66);
        java.util.List<org.apache.catalina.connector.Connector> connectorList70 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.net.InetAddress inetAddress71 = tomcatEmbeddedServletContainerFactory2.getAddress();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(mimeMappings8);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection14);
        org.junit.Assert.assertNotNull(valveArray21);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection24);
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertNotNull(connectorList35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTF-8" + "'", str55, "UTF-8");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(inetAddress62);
        org.junit.Assert.assertNotNull(errorPageSet63);
        org.junit.Assert.assertNotNull(errorPageSet64);
        org.junit.Assert.assertNotNull(servletContextInitializerArray66);
        org.junit.Assert.assertNotNull(connectorList70);
        org.junit.Assert.assertNull(inetAddress71);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.apache.catalina.connector.Connector connector8 = null;
        org.apache.catalina.connector.Connector[] connectorArray9 = new org.apache.catalina.connector.Connector[] { connector8 };
        tomcatEmbeddedServletContainerFactory2.addAdditionalTomcatConnectors(connectorArray9);
        tomcatEmbeddedServletContainerFactory2.setProtocol("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        tomcatEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        tomcatEmbeddedServletContainerFactory2.addErrorPages(errorPageArray17);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory23.setTldSkip("");
        java.io.File file26 = tomcatEmbeddedServletContainerFactory23.getDocumentRoot();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file30 = null;
        tomcatEmbeddedServletContainerFactory29.setDocumentRoot(file30);
        java.lang.String str32 = tomcatEmbeddedServletContainerFactory29.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file36 = null;
        tomcatEmbeddedServletContainerFactory35.setDocumentRoot(file36);
        java.lang.String str38 = tomcatEmbeddedServletContainerFactory35.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory35.addInitializers(servletContextInitializerArray39);
        tomcatEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray39);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = tomcatEmbeddedServletContainerFactory29.getErrorPages();
        tomcatEmbeddedServletContainerFactory23.setErrorPages(errorPageSet42);
        org.springframework.core.io.ResourceLoader resourceLoader44 = null;
        tomcatEmbeddedServletContainerFactory23.setResourceLoader(resourceLoader44);
        tomcatEmbeddedServletContainerFactory23.setTldSkip("UTF-8");
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection48 = tomcatEmbeddedServletContainerFactory23.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file52 = null;
        tomcatEmbeddedServletContainerFactory51.setDocumentRoot(file52);
        java.lang.String str54 = tomcatEmbeddedServletContainerFactory51.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray55);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings57 = tomcatEmbeddedServletContainerFactory51.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener58 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray59 = new org.apache.catalina.LifecycleListener[] { lifecycleListener58 };
        tomcatEmbeddedServletContainerFactory51.addContextLifecycleListeners(lifecycleListenerArray59);
        tomcatEmbeddedServletContainerFactory23.addContextLifecycleListeners(lifecycleListenerArray59);
        tomcatEmbeddedServletContainerFactory2.addContextLifecycleListeners(lifecycleListenerArray59);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file66 = null;
        tomcatEmbeddedServletContainerFactory65.setDocumentRoot(file66);
        java.lang.String str68 = tomcatEmbeddedServletContainerFactory65.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray69 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory65.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray69);
        java.util.Collection<org.apache.catalina.Valve> valveCollection72 = tomcatEmbeddedServletContainerFactory2.getValves();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(connectorArray9);
        org.junit.Assert.assertNotNull(errorPageArray17);
        org.junit.Assert.assertNotNull(errorPageSet20);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        org.junit.Assert.assertNotNull(errorPageSet42);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(mimeMappings57);
        org.junit.Assert.assertNotNull(lifecycleListenerArray59);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray69);
        org.junit.Assert.assertNotNull(valveCollection72);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        org.apache.catalina.Valve valve1 = null;
        org.apache.catalina.Valve[] valveArray2 = new org.apache.catalina.Valve[] { valve1 };
        tomcatEmbeddedServletContainerFactory0.addContextValves(valveArray2);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = tomcatEmbeddedServletContainerFactory0.getErrorPages();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet5 = tomcatEmbeddedServletContainerFactory0.getErrorPages();
        tomcatEmbeddedServletContainerFactory0.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((int) ' ');
        java.net.InetAddress inetAddress10 = tomcatEmbeddedServletContainerFactory9.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = tomcatEmbeddedServletContainerFactory9.getErrorPages();
        tomcatEmbeddedServletContainerFactory0.setErrorPages(errorPageSet11);
        org.junit.Assert.assertNotNull(valveArray2);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertNotNull(errorPageSet5);
        org.junit.Assert.assertNull(inetAddress10);
        org.junit.Assert.assertNotNull(errorPageSet11);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        org.apache.catalina.Valve valve5 = null;
        org.apache.catalina.Valve[] valveArray6 = new org.apache.catalina.Valve[] { valve5 };
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray6);
        int int8 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("");
        tomcatEmbeddedServletContainerFactory2.setProtocol("UTF-8");
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("UTF-8");
        boolean boolean15 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        int int16 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.lang.String str17 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        tomcatEmbeddedServletContainerFactory2.setContextPath("");
        org.junit.Assert.assertNotNull(valveArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorPageSet18);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.io.File file5 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file5);
        int int7 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.io.File file8 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection9 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        boolean boolean10 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        tomcatEmbeddedServletContainerFactory2.setPort(100);
        java.net.InetAddress inetAddress13 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file18);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection20 = tomcatEmbeddedServletContainerFactory17.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file24 = null;
        tomcatEmbeddedServletContainerFactory23.setDocumentRoot(file24);
        org.apache.catalina.Valve valve26 = null;
        org.apache.catalina.Valve[] valveArray27 = new org.apache.catalina.Valve[] { valve26 };
        tomcatEmbeddedServletContainerFactory23.addContextValves(valveArray27);
        tomcatEmbeddedServletContainerFactory17.addContextValves(valveArray27);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file33 = null;
        tomcatEmbeddedServletContainerFactory32.setDocumentRoot(file33);
        java.lang.String str35 = tomcatEmbeddedServletContainerFactory32.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray36);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings38 = tomcatEmbeddedServletContainerFactory32.getMimeMappings();
        tomcatEmbeddedServletContainerFactory17.setMimeMappings(mimeMappings38);
        java.util.List<org.apache.catalina.connector.Connector> connectorList40 = tomcatEmbeddedServletContainerFactory17.getAdditionalTomcatConnectors();
        java.lang.String str41 = tomcatEmbeddedServletContainerFactory17.getUriEncoding();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file45 = null;
        tomcatEmbeddedServletContainerFactory44.setDocumentRoot(file45);
        java.lang.String str47 = tomcatEmbeddedServletContainerFactory44.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray48);
        org.apache.catalina.connector.Connector connector50 = null;
        org.apache.catalina.connector.Connector[] connectorArray51 = new org.apache.catalina.connector.Connector[] { connector50 };
        tomcatEmbeddedServletContainerFactory44.addAdditionalTomcatConnectors(connectorArray51);
        tomcatEmbeddedServletContainerFactory17.addAdditionalTomcatConnectors(connectorArray51);
        tomcatEmbeddedServletContainerFactory2.addAdditionalTomcatConnectors(connectorArray51);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection55 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.List<org.apache.catalina.connector.Connector> connectorList56 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection20);
        org.junit.Assert.assertNotNull(valveArray27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        org.junit.Assert.assertNotNull(mimeMappings38);
        org.junit.Assert.assertNotNull(connectorList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-8" + "'", str41, "UTF-8");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(connectorArray51);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection55);
        org.junit.Assert.assertNotNull(connectorList56);
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection3 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setPort((int) (byte) 0);
        boolean boolean6 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress7 = tomcatEmbeddedServletContainerFactory2.getAddress();
        tomcatEmbeddedServletContainerFactory2.setPort(0);
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("UTF-8");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file15 = null;
        tomcatEmbeddedServletContainerFactory14.setDocumentRoot(file15);
        boolean boolean17 = tomcatEmbeddedServletContainerFactory14.isRegisterJspServlet();
        tomcatEmbeddedServletContainerFactory14.setPort((int) (byte) 1);
        boolean boolean20 = tomcatEmbeddedServletContainerFactory14.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file24 = null;
        tomcatEmbeddedServletContainerFactory23.setDocumentRoot(file24);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection26 = tomcatEmbeddedServletContainerFactory23.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file30 = null;
        tomcatEmbeddedServletContainerFactory29.setDocumentRoot(file30);
        org.apache.catalina.Valve valve32 = null;
        org.apache.catalina.Valve[] valveArray33 = new org.apache.catalina.Valve[] { valve32 };
        tomcatEmbeddedServletContainerFactory29.addContextValves(valveArray33);
        tomcatEmbeddedServletContainerFactory23.addContextValves(valveArray33);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection36 = tomcatEmbeddedServletContainerFactory23.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory23.setTldSkip("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage42 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray43 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage42 };
        tomcatEmbeddedServletContainerFactory41.addErrorPages(errorPageArray43);
        tomcatEmbeddedServletContainerFactory23.addErrorPages(errorPageArray43);
        tomcatEmbeddedServletContainerFactory14.addErrorPages(errorPageArray43);
        tomcatEmbeddedServletContainerFactory2.addErrorPages(errorPageArray43);
        java.net.InetAddress inetAddress48 = tomcatEmbeddedServletContainerFactory2.getAddress();
        java.lang.String str49 = tomcatEmbeddedServletContainerFactory2.getUriEncoding();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file53 = tomcatEmbeddedServletContainerFactory52.getDocumentRoot();
        int int54 = tomcatEmbeddedServletContainerFactory52.getSessionTimeout();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet55 = tomcatEmbeddedServletContainerFactory52.getErrorPages();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings56 = tomcatEmbeddedServletContainerFactory52.getMimeMappings();
        tomcatEmbeddedServletContainerFactory52.setPort((int) '4');
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory61 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory61.setTldSkip("");
        java.io.File file64 = tomcatEmbeddedServletContainerFactory61.getDocumentRoot();
        boolean boolean65 = tomcatEmbeddedServletContainerFactory61.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray66 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory61.addContextCustomizers(tomcatContextCustomizerArray66);
        tomcatEmbeddedServletContainerFactory52.addContextCustomizers(tomcatContextCustomizerArray66);
        tomcatEmbeddedServletContainerFactory2.addContextCustomizers(tomcatContextCustomizerArray66);
        int int70 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        org.junit.Assert.assertNotNull(lifecycleListenerCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection26);
        org.junit.Assert.assertNotNull(valveArray33);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection36);
        org.junit.Assert.assertNotNull(errorPageArray43);
        org.junit.Assert.assertNull(inetAddress48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-8" + "'", str49, "UTF-8");
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(errorPageSet55);
        org.junit.Assert.assertNotNull(mimeMappings56);
        org.junit.Assert.assertNull(file64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection6 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress9 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress9);
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout(32);
        boolean boolean13 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        // The following exception was thrown during execution in test generation
        try {
            tomcatEmbeddedServletContainerFactory2.setContextPath("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lifecycleListenerCollection6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection5 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setContextPath("");
        tomcatEmbeddedServletContainerFactory2.setProtocol("hi!");
        tomcatEmbeddedServletContainerFactory2.setTldSkip("hi!");
        java.net.InetAddress inetAddress12 = tomcatEmbeddedServletContainerFactory2.getAddress();
        java.util.Collection<org.apache.catalina.Valve> valveCollection13 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.util.List<org.apache.catalina.connector.Connector> connectorList14 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection15 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.Collection<org.apache.catalina.Valve> valveCollection16 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.util.List<org.apache.catalina.connector.Connector> connectorList17 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file18);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection5);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertNotNull(valveCollection13);
        org.junit.Assert.assertNotNull(connectorList14);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection15);
        org.junit.Assert.assertNotNull(valveCollection16);
        org.junit.Assert.assertNotNull(connectorList17);
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        org.apache.catalina.Valve valve11 = null;
        org.apache.catalina.Valve[] valveArray12 = new org.apache.catalina.Valve[] { valve11 };
        tomcatEmbeddedServletContainerFactory8.addContextValves(valveArray12);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray12);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file18);
        java.lang.String str20 = tomcatEmbeddedServletContainerFactory17.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings23 = tomcatEmbeddedServletContainerFactory17.getMimeMappings();
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings23);
        boolean boolean25 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        java.util.Collection<org.apache.catalina.Valve> valveCollection26 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.util.Collection<org.apache.catalina.Valve> valveCollection27 = tomcatEmbeddedServletContainerFactory2.getValves();
        tomcatEmbeddedServletContainerFactory2.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file33 = null;
        tomcatEmbeddedServletContainerFactory32.setDocumentRoot(file33);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection35 = tomcatEmbeddedServletContainerFactory32.getContextLifecycleListeners();
        int int36 = tomcatEmbeddedServletContainerFactory32.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection37 = tomcatEmbeddedServletContainerFactory32.getTomcatContextCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet38 = tomcatEmbeddedServletContainerFactory32.getErrorPages();
        tomcatEmbeddedServletContainerFactory32.setRegisterDefaultServlet(true);
        tomcatEmbeddedServletContainerFactory32.setUriEncoding("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file46 = null;
        tomcatEmbeddedServletContainerFactory45.setDocumentRoot(file46);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection48 = tomcatEmbeddedServletContainerFactory45.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file52 = null;
        tomcatEmbeddedServletContainerFactory51.setDocumentRoot(file52);
        org.apache.catalina.Valve valve54 = null;
        org.apache.catalina.Valve[] valveArray55 = new org.apache.catalina.Valve[] { valve54 };
        tomcatEmbeddedServletContainerFactory51.addContextValves(valveArray55);
        tomcatEmbeddedServletContainerFactory45.addContextValves(valveArray55);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection58 = tomcatEmbeddedServletContainerFactory45.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory45.setProtocol("UTF-8");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file64 = null;
        tomcatEmbeddedServletContainerFactory63.setDocumentRoot(file64);
        org.apache.catalina.Valve valve66 = null;
        org.apache.catalina.Valve[] valveArray67 = new org.apache.catalina.Valve[] { valve66 };
        tomcatEmbeddedServletContainerFactory63.addContextValves(valveArray67);
        int int69 = tomcatEmbeddedServletContainerFactory63.getSessionTimeout();
        tomcatEmbeddedServletContainerFactory63.setJspServletClassName("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory74 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file75 = tomcatEmbeddedServletContainerFactory74.getDocumentRoot();
        tomcatEmbeddedServletContainerFactory74.setTldSkip("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory80 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) -1);
        org.apache.catalina.Valve valve81 = null;
        org.apache.catalina.Valve[] valveArray82 = new org.apache.catalina.Valve[] { valve81 };
        tomcatEmbeddedServletContainerFactory80.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory74.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory63.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory45.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory32.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray82);
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("");
        java.lang.String str91 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(valveArray12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(mimeMappings23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(valveCollection26);
        org.junit.Assert.assertNotNull(valveCollection27);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection37);
        org.junit.Assert.assertNotNull(errorPageSet38);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection48);
        org.junit.Assert.assertNotNull(valveArray55);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection58);
        org.junit.Assert.assertNotNull(valveArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(file75);
        org.junit.Assert.assertNotNull(valveArray82);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((int) (short) 100);
        int int2 = tomcatEmbeddedServletContainerFactory1.getSessionTimeout();
        java.net.InetAddress inetAddress3 = null;
        tomcatEmbeddedServletContainerFactory1.setAddress(inetAddress3);
        tomcatEmbeddedServletContainerFactory1.setPort((int) ' ');
        java.net.InetAddress inetAddress7 = null;
        tomcatEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        int int15 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.io.File file16 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file16);
        tomcatEmbeddedServletContainerFactory2.setPort((int) (short) 10);
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("");
        java.util.List<org.apache.catalina.connector.Connector> connectorList22 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.lang.String str23 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.util.Collection<org.apache.catalina.Valve> valveCollection24 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection25 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        // The following exception was thrown during execution in test generation
        try {
            tomcatEmbeddedServletContainerFactory2.setContextPath("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(connectorList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(valveCollection24);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection25);
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory2.setTldSkip("");
        java.io.File file5 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        boolean boolean6 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        java.util.List<org.apache.catalina.connector.Connector> connectorList7 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.net.InetAddress inetAddress8 = tomcatEmbeddedServletContainerFactory2.getAddress();
        java.net.InetAddress inetAddress9 = tomcatEmbeddedServletContainerFactory2.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory12.setTldSkip("");
        tomcatEmbeddedServletContainerFactory12.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress17 = tomcatEmbeddedServletContainerFactory12.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = tomcatEmbeddedServletContainerFactory12.getMimeMappings();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file22 = null;
        tomcatEmbeddedServletContainerFactory21.setDocumentRoot(file22);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection24 = tomcatEmbeddedServletContainerFactory21.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray25 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet26 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet26, errorPageArray25);
        tomcatEmbeddedServletContainerFactory21.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet26);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection29 = tomcatEmbeddedServletContainerFactory21.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection30 = tomcatEmbeddedServletContainerFactory21.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer tomcatConnectorCustomizer31 = null;
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray32 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] { tomcatConnectorCustomizer31 };
        tomcatEmbeddedServletContainerFactory21.addConnectorCustomizers(tomcatConnectorCustomizerArray32);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file37 = null;
        tomcatEmbeddedServletContainerFactory36.setDocumentRoot(file37);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection39 = tomcatEmbeddedServletContainerFactory36.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray40 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet41 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41, errorPageArray40);
        tomcatEmbeddedServletContainerFactory36.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        tomcatEmbeddedServletContainerFactory21.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        tomcatEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet41);
        tomcatEmbeddedServletContainerFactory12.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = tomcatEmbeddedServletContainerFactory12.getMimeMappings();
        java.lang.String str49 = tomcatEmbeddedServletContainerFactory12.getUriEncoding();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection50 = tomcatEmbeddedServletContainerFactory12.getTomcatContextCustomizers();
        java.io.File file51 = null;
        tomcatEmbeddedServletContainerFactory12.setDocumentRoot(file51);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection53 = tomcatEmbeddedServletContainerFactory12.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection53);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file58 = null;
        tomcatEmbeddedServletContainerFactory57.setDocumentRoot(file58);
        java.lang.String str60 = tomcatEmbeddedServletContainerFactory57.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray61 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray61);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings63 = tomcatEmbeddedServletContainerFactory57.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener64 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray65 = new org.apache.catalina.LifecycleListener[] { lifecycleListener64 };
        tomcatEmbeddedServletContainerFactory57.addContextLifecycleListeners(lifecycleListenerArray65);
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray67 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerList68 = new java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList68, tomcatConnectorCustomizerArray67);
        tomcatEmbeddedServletContainerFactory57.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList68);
        org.springframework.core.io.ResourceLoader resourceLoader71 = null;
        tomcatEmbeddedServletContainerFactory57.setResourceLoader(resourceLoader71);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet73 = tomcatEmbeddedServletContainerFactory57.getErrorPages();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet74 = tomcatEmbeddedServletContainerFactory57.getErrorPages();
        java.net.InetAddress inetAddress75 = tomcatEmbeddedServletContainerFactory57.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory77 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory(10);
        tomcatEmbeddedServletContainerFactory77.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings80 = tomcatEmbeddedServletContainerFactory77.getMimeMappings();
        tomcatEmbeddedServletContainerFactory57.setMimeMappings(mimeMappings80);
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings80);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(connectorList7);
        org.junit.Assert.assertNull(inetAddress8);
        org.junit.Assert.assertNull(inetAddress9);
        org.junit.Assert.assertNull(inetAddress17);
        org.junit.Assert.assertNotNull(mimeMappings18);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection24);
        org.junit.Assert.assertNotNull(errorPageArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection29);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection30);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray32);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection39);
        org.junit.Assert.assertNotNull(errorPageArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(mimeMappings48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-8" + "'", str49, "UTF-8");
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection50);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray61);
        org.junit.Assert.assertNotNull(mimeMappings63);
        org.junit.Assert.assertNotNull(lifecycleListenerArray65);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(errorPageSet73);
        org.junit.Assert.assertNotNull(errorPageSet74);
        org.junit.Assert.assertNull(inetAddress75);
        org.junit.Assert.assertNotNull(mimeMappings80);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = tomcatEmbeddedServletContainerFactory2.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener9 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray10 = new org.apache.catalina.LifecycleListener[] { lifecycleListener9 };
        tomcatEmbeddedServletContainerFactory2.addContextLifecycleListeners(lifecycleListenerArray10);
        java.net.InetAddress inetAddress12 = tomcatEmbeddedServletContainerFactory2.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file16 = null;
        tomcatEmbeddedServletContainerFactory15.setDocumentRoot(file16);
        java.lang.String str18 = tomcatEmbeddedServletContainerFactory15.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray19);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = tomcatEmbeddedServletContainerFactory15.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener22 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray23 = new org.apache.catalina.LifecycleListener[] { lifecycleListener22 };
        tomcatEmbeddedServletContainerFactory15.addContextLifecycleListeners(lifecycleListenerArray23);
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray25 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerList26 = new java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList26, tomcatConnectorCustomizerArray25);
        tomcatEmbeddedServletContainerFactory15.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList26);
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList26);
        java.util.List<org.apache.catalina.connector.Connector> connectorList30 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings31 = tomcatEmbeddedServletContainerFactory2.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader32 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader32);
        java.io.File file34 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        tomcatEmbeddedServletContainerFactory2.setProtocol("UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(mimeMappings8);
        org.junit.Assert.assertNotNull(lifecycleListenerArray10);
        org.junit.Assert.assertNull(inetAddress12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNotNull(lifecycleListenerArray23);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(connectorList30);
        org.junit.Assert.assertNotNull(mimeMappings31);
        org.junit.Assert.assertNull(file34);
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray16 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory2.addContextCustomizers(tomcatContextCustomizerArray16);
        java.io.File file18 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        java.net.InetAddress inetAddress19 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress19);
        java.util.Collection<org.apache.catalina.Valve> valveCollection21 = tomcatEmbeddedServletContainerFactory2.getValves();
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        java.io.File file25 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file25);
        java.lang.String str27 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("");
        tomcatEmbeddedServletContainerFactory2.setPort(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(valveCollection21);
        org.junit.Assert.assertNotNull(errorPageSet24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        org.apache.catalina.Valve valve1 = null;
        org.apache.catalina.Valve[] valveArray2 = new org.apache.catalina.Valve[] { valve1 };
        tomcatEmbeddedServletContainerFactory0.addContextValves(valveArray2);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file7 = null;
        tomcatEmbeddedServletContainerFactory6.setDocumentRoot(file7);
        java.lang.String str9 = tomcatEmbeddedServletContainerFactory6.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray10 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray10);
        org.apache.catalina.connector.Connector connector12 = null;
        org.apache.catalina.connector.Connector[] connectorArray13 = new org.apache.catalina.connector.Connector[] { connector12 };
        tomcatEmbeddedServletContainerFactory6.addAdditionalTomcatConnectors(connectorArray13);
        tomcatEmbeddedServletContainerFactory6.setProtocol("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file20 = null;
        tomcatEmbeddedServletContainerFactory19.setDocumentRoot(file20);
        java.lang.String str22 = tomcatEmbeddedServletContainerFactory19.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file26 = null;
        tomcatEmbeddedServletContainerFactory25.setDocumentRoot(file26);
        java.lang.String str28 = tomcatEmbeddedServletContainerFactory25.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray29);
        tomcatEmbeddedServletContainerFactory19.addInitializers(servletContextInitializerArray29);
        tomcatEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray29);
        tomcatEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray29);
        tomcatEmbeddedServletContainerFactory0.setSessionTimeout((int) (byte) 1);
        java.io.File file36 = tomcatEmbeddedServletContainerFactory0.getDocumentRoot();
        tomcatEmbeddedServletContainerFactory0.setTldSkip("");
        int int39 = tomcatEmbeddedServletContainerFactory0.getPort();
        tomcatEmbeddedServletContainerFactory0.setUriEncoding("hi!");
        int int42 = tomcatEmbeddedServletContainerFactory0.getPort();
        org.junit.Assert.assertNotNull(valveArray2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray10);
        org.junit.Assert.assertNotNull(connectorArray13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8080 + "'", int39 == 8080);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8080 + "'", int42 == 8080);
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file5 = null;
        tomcatEmbeddedServletContainerFactory4.setDocumentRoot(file5);
        org.apache.catalina.Valve valve7 = null;
        org.apache.catalina.Valve[] valveArray8 = new org.apache.catalina.Valve[] { valve7 };
        tomcatEmbeddedServletContainerFactory4.addContextValves(valveArray8);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file13 = null;
        tomcatEmbeddedServletContainerFactory12.setDocumentRoot(file13);
        boolean boolean15 = tomcatEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file19 = null;
        tomcatEmbeddedServletContainerFactory18.setDocumentRoot(file19);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection21 = tomcatEmbeddedServletContainerFactory18.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file25 = null;
        tomcatEmbeddedServletContainerFactory24.setDocumentRoot(file25);
        java.lang.String str27 = tomcatEmbeddedServletContainerFactory24.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory24.addInitializers(servletContextInitializerArray28);
        tomcatEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray28);
        tomcatEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray28);
        java.io.File file32 = null;
        tomcatEmbeddedServletContainerFactory12.setDocumentRoot(file32);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection34 = tomcatEmbeddedServletContainerFactory12.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file38 = null;
        tomcatEmbeddedServletContainerFactory37.setDocumentRoot(file38);
        java.lang.String str40 = tomcatEmbeddedServletContainerFactory37.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory37.addInitializers(servletContextInitializerArray41);
        org.apache.catalina.connector.Connector connector43 = null;
        org.apache.catalina.connector.Connector[] connectorArray44 = new org.apache.catalina.connector.Connector[] { connector43 };
        tomcatEmbeddedServletContainerFactory37.addAdditionalTomcatConnectors(connectorArray44);
        tomcatEmbeddedServletContainerFactory12.addAdditionalTomcatConnectors(connectorArray44);
        tomcatEmbeddedServletContainerFactory4.addAdditionalTomcatConnectors(connectorArray44);
        tomcatEmbeddedServletContainerFactory1.addAdditionalTomcatConnectors(connectorArray44);
        java.net.InetAddress inetAddress49 = null;
        tomcatEmbeddedServletContainerFactory1.setAddress(inetAddress49);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file54 = null;
        tomcatEmbeddedServletContainerFactory53.setDocumentRoot(file54);
        java.lang.String str56 = tomcatEmbeddedServletContainerFactory53.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory53.addInitializers(servletContextInitializerArray57);
        org.apache.catalina.connector.Connector connector59 = null;
        org.apache.catalina.connector.Connector[] connectorArray60 = new org.apache.catalina.connector.Connector[] { connector59 };
        tomcatEmbeddedServletContainerFactory53.addAdditionalTomcatConnectors(connectorArray60);
        java.util.List<org.apache.catalina.connector.Connector> connectorList62 = tomcatEmbeddedServletContainerFactory53.getAdditionalTomcatConnectors();
        java.io.File file63 = null;
        tomcatEmbeddedServletContainerFactory53.setDocumentRoot(file63);
        tomcatEmbeddedServletContainerFactory53.setJspServletClassName("hi!");
        boolean boolean67 = tomcatEmbeddedServletContainerFactory53.isRegisterJspServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings68 = tomcatEmbeddedServletContainerFactory53.getMimeMappings();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection69 = tomcatEmbeddedServletContainerFactory53.getContextLifecycleListeners();
        java.lang.String str70 = tomcatEmbeddedServletContainerFactory53.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) -1);
        org.apache.catalina.Valve valve74 = null;
        org.apache.catalina.Valve[] valveArray75 = new org.apache.catalina.Valve[] { valve74 };
        tomcatEmbeddedServletContainerFactory73.addContextValves(valveArray75);
        tomcatEmbeddedServletContainerFactory53.addContextValves(valveArray75);
        tomcatEmbeddedServletContainerFactory1.addContextValves(valveArray75);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection79 = tomcatEmbeddedServletContainerFactory1.getTomcatContextCustomizers();
        java.lang.String str80 = tomcatEmbeddedServletContainerFactory1.getUriEncoding();
        tomcatEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.junit.Assert.assertNotNull(valveArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        org.junit.Assert.assertNotNull(connectorArray44);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
        org.junit.Assert.assertNotNull(connectorArray60);
        org.junit.Assert.assertNotNull(connectorList62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(mimeMappings68);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(valveArray75);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "UTF-8" + "'", str80, "UTF-8");
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) 10);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = tomcatEmbeddedServletContainerFactory2.getMimeMappings();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection4 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) ' ');
        java.io.File file7 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        java.io.File file8 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection9 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        java.lang.Class<?> wildcardClass10 = tomcatEmbeddedServletContainerFactory2.getClass();
        org.junit.Assert.assertNotNull(mimeMappings3);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        tomcatEmbeddedServletContainerFactory2.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection10 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection11 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        boolean boolean12 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader13);
        java.lang.String str15 = tomcatEmbeddedServletContainerFactory2.getUriEncoding();
        tomcatEmbeddedServletContainerFactory2.setPort((int) (short) 0);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection10);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory2.setTldSkip("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file8 = null;
        tomcatEmbeddedServletContainerFactory7.setDocumentRoot(file8);
        org.apache.catalina.Valve valve10 = null;
        org.apache.catalina.Valve[] valveArray11 = new org.apache.catalina.Valve[] { valve10 };
        tomcatEmbeddedServletContainerFactory7.addContextValves(valveArray11);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray11);
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader16);
        tomcatEmbeddedServletContainerFactory2.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file23 = null;
        tomcatEmbeddedServletContainerFactory22.setDocumentRoot(file23);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection25 = tomcatEmbeddedServletContainerFactory22.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray26 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27, errorPageArray26);
        tomcatEmbeddedServletContainerFactory22.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet27);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection30 = tomcatEmbeddedServletContainerFactory22.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file34 = tomcatEmbeddedServletContainerFactory33.getDocumentRoot();
        tomcatEmbeddedServletContainerFactory33.setTldSkip("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) -1);
        org.apache.catalina.Valve valve40 = null;
        org.apache.catalina.Valve[] valveArray41 = new org.apache.catalina.Valve[] { valve40 };
        tomcatEmbeddedServletContainerFactory39.addContextValves(valveArray41);
        tomcatEmbeddedServletContainerFactory33.addContextValves(valveArray41);
        tomcatEmbeddedServletContainerFactory22.addContextValves(valveArray41);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file48 = null;
        tomcatEmbeddedServletContainerFactory47.setDocumentRoot(file48);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection50 = tomcatEmbeddedServletContainerFactory47.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file54 = null;
        tomcatEmbeddedServletContainerFactory53.setDocumentRoot(file54);
        org.apache.catalina.Valve valve56 = null;
        org.apache.catalina.Valve[] valveArray57 = new org.apache.catalina.Valve[] { valve56 };
        tomcatEmbeddedServletContainerFactory53.addContextValves(valveArray57);
        tomcatEmbeddedServletContainerFactory47.addContextValves(valveArray57);
        tomcatEmbeddedServletContainerFactory22.addContextValves(valveArray57);
        org.springframework.core.io.ResourceLoader resourceLoader61 = null;
        tomcatEmbeddedServletContainerFactory22.setResourceLoader(resourceLoader61);
        java.util.List<org.apache.catalina.connector.Connector> connectorList63 = tomcatEmbeddedServletContainerFactory22.getAdditionalTomcatConnectors();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection64 = tomcatEmbeddedServletContainerFactory22.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection64);
        org.junit.Assert.assertNotNull(valveArray11);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection25);
        org.junit.Assert.assertNotNull(errorPageArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection30);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(valveArray41);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection50);
        org.junit.Assert.assertNotNull(valveArray57);
        org.junit.Assert.assertNotNull(connectorList63);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection64);
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory(10);
        tomcatEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file7 = null;
        tomcatEmbeddedServletContainerFactory6.setDocumentRoot(file7);
        java.lang.String str9 = tomcatEmbeddedServletContainerFactory6.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file13 = null;
        tomcatEmbeddedServletContainerFactory12.setDocumentRoot(file13);
        java.lang.String str15 = tomcatEmbeddedServletContainerFactory12.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory12.addInitializers(servletContextInitializerArray16);
        tomcatEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray16);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet19 = tomcatEmbeddedServletContainerFactory6.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray20 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory6.addContextCustomizers(tomcatContextCustomizerArray20);
        java.io.File file22 = tomcatEmbeddedServletContainerFactory6.getDocumentRoot();
        java.net.InetAddress inetAddress23 = null;
        tomcatEmbeddedServletContainerFactory6.setAddress(inetAddress23);
        java.util.Collection<org.apache.catalina.Valve> valveCollection25 = tomcatEmbeddedServletContainerFactory6.getValves();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file29 = null;
        tomcatEmbeddedServletContainerFactory28.setDocumentRoot(file29);
        java.lang.String str31 = tomcatEmbeddedServletContainerFactory28.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings34 = tomcatEmbeddedServletContainerFactory28.getMimeMappings();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file38 = null;
        tomcatEmbeddedServletContainerFactory37.setDocumentRoot(file38);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection40 = tomcatEmbeddedServletContainerFactory37.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file44 = null;
        tomcatEmbeddedServletContainerFactory43.setDocumentRoot(file44);
        org.apache.catalina.Valve valve46 = null;
        org.apache.catalina.Valve[] valveArray47 = new org.apache.catalina.Valve[] { valve46 };
        tomcatEmbeddedServletContainerFactory43.addContextValves(valveArray47);
        tomcatEmbeddedServletContainerFactory37.addContextValves(valveArray47);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection50 = tomcatEmbeddedServletContainerFactory37.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory37.setTldSkip("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage56 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray57 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage56 };
        tomcatEmbeddedServletContainerFactory55.addErrorPages(errorPageArray57);
        tomcatEmbeddedServletContainerFactory37.addErrorPages(errorPageArray57);
        tomcatEmbeddedServletContainerFactory28.addErrorPages(errorPageArray57);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = tomcatEmbeddedServletContainerFactory28.getErrorPages();
        tomcatEmbeddedServletContainerFactory6.setErrorPages(errorPageSet61);
        tomcatEmbeddedServletContainerFactory1.setErrorPages(errorPageSet61);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file67 = null;
        tomcatEmbeddedServletContainerFactory66.setDocumentRoot(file67);
        java.io.File file69 = null;
        tomcatEmbeddedServletContainerFactory66.setBaseDirectory(file69);
        int int71 = tomcatEmbeddedServletContainerFactory66.getPort();
        java.io.File file72 = tomcatEmbeddedServletContainerFactory66.getDocumentRoot();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection73 = tomcatEmbeddedServletContainerFactory66.getContextLifecycleListeners();
        boolean boolean74 = tomcatEmbeddedServletContainerFactory66.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        org.apache.catalina.Valve valve76 = null;
        org.apache.catalina.Valve[] valveArray77 = new org.apache.catalina.Valve[] { valve76 };
        tomcatEmbeddedServletContainerFactory75.addContextValves(valveArray77);
        org.springframework.core.io.ResourceLoader resourceLoader79 = null;
        tomcatEmbeddedServletContainerFactory75.setResourceLoader(resourceLoader79);
        org.apache.catalina.Valve[] valveArray81 = new org.apache.catalina.Valve[] {};
        tomcatEmbeddedServletContainerFactory75.addContextValves(valveArray81);
        tomcatEmbeddedServletContainerFactory66.addContextValves(valveArray81);
        tomcatEmbeddedServletContainerFactory1.addContextValves(valveArray81);
        int int85 = tomcatEmbeddedServletContainerFactory1.getPort();
        java.net.InetAddress inetAddress86 = null;
        tomcatEmbeddedServletContainerFactory1.setAddress(inetAddress86);
        java.io.File file88 = null;
        tomcatEmbeddedServletContainerFactory1.setBaseDirectory(file88);
        tomcatEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        org.junit.Assert.assertNotNull(errorPageSet19);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray20);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(valveCollection25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        org.junit.Assert.assertNotNull(mimeMappings34);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection40);
        org.junit.Assert.assertNotNull(valveArray47);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection50);
        org.junit.Assert.assertNotNull(errorPageArray57);
        org.junit.Assert.assertNotNull(errorPageSet61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertNull(file72);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(valveArray77);
        org.junit.Assert.assertNotNull(valveArray81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory2.setTldSkip("");
        tomcatEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress7 = tomcatEmbeddedServletContainerFactory2.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file11 = null;
        tomcatEmbeddedServletContainerFactory10.setDocumentRoot(file11);
        java.lang.String str13 = tomcatEmbeddedServletContainerFactory10.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray14 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray14);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = tomcatEmbeddedServletContainerFactory10.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener17 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray18 = new org.apache.catalina.LifecycleListener[] { lifecycleListener17 };
        tomcatEmbeddedServletContainerFactory10.addContextLifecycleListeners(lifecycleListenerArray18);
        java.net.InetAddress inetAddress20 = tomcatEmbeddedServletContainerFactory10.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file24 = null;
        tomcatEmbeddedServletContainerFactory23.setDocumentRoot(file24);
        java.lang.String str26 = tomcatEmbeddedServletContainerFactory23.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray27 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray27);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = tomcatEmbeddedServletContainerFactory23.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener30 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray31 = new org.apache.catalina.LifecycleListener[] { lifecycleListener30 };
        tomcatEmbeddedServletContainerFactory23.addContextLifecycleListeners(lifecycleListenerArray31);
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray33 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerList34 = new java.util.ArrayList<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList34, tomcatConnectorCustomizerArray33);
        tomcatEmbeddedServletContainerFactory23.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList34);
        tomcatEmbeddedServletContainerFactory10.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList34);
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers((java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer>) tomcatConnectorCustomizerList34);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection42 = tomcatEmbeddedServletContainerFactory41.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file46 = null;
        tomcatEmbeddedServletContainerFactory45.setDocumentRoot(file46);
        java.lang.String str48 = tomcatEmbeddedServletContainerFactory45.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file52 = null;
        tomcatEmbeddedServletContainerFactory51.setDocumentRoot(file52);
        java.lang.String str54 = tomcatEmbeddedServletContainerFactory51.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray55 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray55);
        tomcatEmbeddedServletContainerFactory45.addInitializers(servletContextInitializerArray55);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet58 = tomcatEmbeddedServletContainerFactory45.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray59 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory45.addContextCustomizers(tomcatContextCustomizerArray59);
        tomcatEmbeddedServletContainerFactory41.addContextCustomizers(tomcatContextCustomizerArray59);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file65 = null;
        tomcatEmbeddedServletContainerFactory64.setDocumentRoot(file65);
        java.lang.String str67 = tomcatEmbeddedServletContainerFactory64.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory70 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file71 = null;
        tomcatEmbeddedServletContainerFactory70.setDocumentRoot(file71);
        java.lang.String str73 = tomcatEmbeddedServletContainerFactory70.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray74 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory70.addInitializers(servletContextInitializerArray74);
        tomcatEmbeddedServletContainerFactory64.addInitializers(servletContextInitializerArray74);
        tomcatEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray74);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray74);
        java.io.File file79 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file79);
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("");
        tomcatEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray14);
        org.junit.Assert.assertNotNull(mimeMappings16);
        org.junit.Assert.assertNotNull(lifecycleListenerArray18);
        org.junit.Assert.assertNull(inetAddress20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray27);
        org.junit.Assert.assertNotNull(mimeMappings29);
        org.junit.Assert.assertNotNull(lifecycleListenerArray31);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray55);
        org.junit.Assert.assertNotNull(errorPageSet58);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray74);
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        org.apache.catalina.Valve valve11 = null;
        org.apache.catalina.Valve[] valveArray12 = new org.apache.catalina.Valve[] { valve11 };
        tomcatEmbeddedServletContainerFactory8.addContextValves(valveArray12);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray12);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file18);
        java.lang.String str20 = tomcatEmbeddedServletContainerFactory17.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings23 = tomcatEmbeddedServletContainerFactory17.getMimeMappings();
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings23);
        java.util.List<org.apache.catalina.connector.Connector> connectorList25 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file29 = null;
        tomcatEmbeddedServletContainerFactory28.setDocumentRoot(file29);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection31 = tomcatEmbeddedServletContainerFactory28.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file35 = null;
        tomcatEmbeddedServletContainerFactory34.setDocumentRoot(file35);
        org.apache.catalina.Valve valve37 = null;
        org.apache.catalina.Valve[] valveArray38 = new org.apache.catalina.Valve[] { valve37 };
        tomcatEmbeddedServletContainerFactory34.addContextValves(valveArray38);
        tomcatEmbeddedServletContainerFactory28.addContextValves(valveArray38);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection41 = tomcatEmbeddedServletContainerFactory28.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file45 = null;
        tomcatEmbeddedServletContainerFactory44.setDocumentRoot(file45);
        java.lang.String str47 = tomcatEmbeddedServletContainerFactory44.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file51 = null;
        tomcatEmbeddedServletContainerFactory50.setDocumentRoot(file51);
        java.lang.String str53 = tomcatEmbeddedServletContainerFactory50.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory50.addInitializers(servletContextInitializerArray54);
        tomcatEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray54);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet57 = tomcatEmbeddedServletContainerFactory44.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray58 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory44.addContextCustomizers(tomcatContextCustomizerArray58);
        tomcatEmbeddedServletContainerFactory28.addContextCustomizers(tomcatContextCustomizerArray58);
        tomcatEmbeddedServletContainerFactory2.addContextCustomizers(tomcatContextCustomizerArray58);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection62 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        // The following exception was thrown during execution in test generation
        try {
            tomcatEmbeddedServletContainerFactory2.setContextPath("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/ and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(valveArray12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(mimeMappings23);
        org.junit.Assert.assertNotNull(connectorList25);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection31);
        org.junit.Assert.assertNotNull(valveArray38);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        org.junit.Assert.assertNotNull(errorPageSet57);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray58);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection62);
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.net.InetAddress inetAddress6 = tomcatEmbeddedServletContainerFactory2.getAddress();
        boolean boolean7 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        tomcatEmbeddedServletContainerFactory2.setProtocol("hi!");
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) '4');
        tomcatEmbeddedServletContainerFactory2.setTldSkip("hi!");
        java.net.InetAddress inetAddress14 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.io.File file5 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file5);
        int int7 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.io.File file8 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection9 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        boolean boolean10 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        tomcatEmbeddedServletContainerFactory2.setPort(100);
        java.net.InetAddress inetAddress13 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file18 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file18);
        java.lang.String str20 = tomcatEmbeddedServletContainerFactory17.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray21);
        org.apache.catalina.connector.Connector connector23 = null;
        org.apache.catalina.connector.Connector[] connectorArray24 = new org.apache.catalina.connector.Connector[] { connector23 };
        tomcatEmbeddedServletContainerFactory17.addAdditionalTomcatConnectors(connectorArray24);
        java.util.List<org.apache.catalina.connector.Connector> connectorList26 = tomcatEmbeddedServletContainerFactory17.getAdditionalTomcatConnectors();
        java.io.File file27 = null;
        tomcatEmbeddedServletContainerFactory17.setDocumentRoot(file27);
        tomcatEmbeddedServletContainerFactory17.setJspServletClassName("hi!");
        java.io.File file31 = tomcatEmbeddedServletContainerFactory17.getDocumentRoot();
        tomcatEmbeddedServletContainerFactory17.setContextPath("");
        tomcatEmbeddedServletContainerFactory17.setUriEncoding("hi!");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file39 = null;
        tomcatEmbeddedServletContainerFactory38.setDocumentRoot(file39);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection41 = tomcatEmbeddedServletContainerFactory38.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43, errorPageArray42);
        tomcatEmbeddedServletContainerFactory38.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43);
        tomcatEmbeddedServletContainerFactory38.setSessionTimeout((int) 'a');
        java.lang.String str48 = tomcatEmbeddedServletContainerFactory38.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file52 = null;
        tomcatEmbeddedServletContainerFactory51.setDocumentRoot(file52);
        java.lang.String str54 = tomcatEmbeddedServletContainerFactory51.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file58 = null;
        tomcatEmbeddedServletContainerFactory57.setDocumentRoot(file58);
        java.lang.String str60 = tomcatEmbeddedServletContainerFactory57.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray61 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory57.addInitializers(servletContextInitializerArray61);
        tomcatEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray61);
        tomcatEmbeddedServletContainerFactory38.addInitializers(servletContextInitializerArray61);
        tomcatEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray61);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray61);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        org.junit.Assert.assertNotNull(connectorArray24);
        org.junit.Assert.assertNotNull(connectorList26);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection41);
        org.junit.Assert.assertNotNull(errorPageArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray61);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        org.apache.catalina.Valve valve11 = null;
        org.apache.catalina.Valve[] valveArray12 = new org.apache.catalina.Valve[] { valve11 };
        tomcatEmbeddedServletContainerFactory8.addContextValves(valveArray12);
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray12);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection15 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection16 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory19.setTldSkip("");
        java.io.File file22 = tomcatEmbeddedServletContainerFactory19.getDocumentRoot();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file26 = null;
        tomcatEmbeddedServletContainerFactory25.setDocumentRoot(file26);
        java.lang.String str28 = tomcatEmbeddedServletContainerFactory25.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file32 = null;
        tomcatEmbeddedServletContainerFactory31.setDocumentRoot(file32);
        java.lang.String str34 = tomcatEmbeddedServletContainerFactory31.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray35);
        tomcatEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray35);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet38 = tomcatEmbeddedServletContainerFactory25.getErrorPages();
        tomcatEmbeddedServletContainerFactory19.setErrorPages(errorPageSet38);
        tomcatEmbeddedServletContainerFactory2.setErrorPages(errorPageSet38);
        java.util.List<org.apache.catalina.connector.Connector> connectorList41 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        int int42 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) (short) 0);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(valveArray12);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection15);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection16);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(errorPageSet38);
        org.junit.Assert.assertNotNull(connectorList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection5 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setContextPath("");
        java.lang.String str8 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.util.Collection<org.apache.catalina.Valve> valveCollection9 = tomcatEmbeddedServletContainerFactory2.getValves();
        java.net.InetAddress inetAddress10 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress10);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file15 = null;
        tomcatEmbeddedServletContainerFactory14.setDocumentRoot(file15);
        java.lang.String str17 = tomcatEmbeddedServletContainerFactory14.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file21 = null;
        tomcatEmbeddedServletContainerFactory20.setDocumentRoot(file21);
        java.lang.String str23 = tomcatEmbeddedServletContainerFactory20.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray24);
        tomcatEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray24);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet27 = tomcatEmbeddedServletContainerFactory14.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray28 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory14.addContextCustomizers(tomcatContextCustomizerArray28);
        java.io.File file30 = tomcatEmbeddedServletContainerFactory14.getDocumentRoot();
        java.net.InetAddress inetAddress31 = null;
        tomcatEmbeddedServletContainerFactory14.setAddress(inetAddress31);
        java.util.Collection<org.apache.catalina.Valve> valveCollection33 = tomcatEmbeddedServletContainerFactory14.getValves();
        boolean boolean34 = tomcatEmbeddedServletContainerFactory14.isRegisterJspServlet();
        java.io.File file35 = null;
        tomcatEmbeddedServletContainerFactory14.setBaseDirectory(file35);
        tomcatEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        java.net.InetAddress inetAddress40 = tomcatEmbeddedServletContainerFactory39.getAddress();
        org.apache.catalina.LifecycleListener lifecycleListener41 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray42 = new org.apache.catalina.LifecycleListener[] { lifecycleListener41 };
        tomcatEmbeddedServletContainerFactory39.addContextLifecycleListeners(lifecycleListenerArray42);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file47 = null;
        tomcatEmbeddedServletContainerFactory46.setDocumentRoot(file47);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection49 = tomcatEmbeddedServletContainerFactory46.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray50 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet51 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet51, errorPageArray50);
        tomcatEmbeddedServletContainerFactory46.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet51);
        tomcatEmbeddedServletContainerFactory46.setSessionTimeout((int) 'a');
        java.lang.String str56 = tomcatEmbeddedServletContainerFactory46.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file60 = null;
        tomcatEmbeddedServletContainerFactory59.setDocumentRoot(file60);
        java.lang.String str62 = tomcatEmbeddedServletContainerFactory59.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory65 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file66 = null;
        tomcatEmbeddedServletContainerFactory65.setDocumentRoot(file66);
        java.lang.String str68 = tomcatEmbeddedServletContainerFactory65.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray69 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory65.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory59.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray69);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray69);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(valveCollection9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        org.junit.Assert.assertNotNull(errorPageSet27);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray28);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(valveCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(inetAddress40);
        org.junit.Assert.assertNotNull(lifecycleListenerArray42);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection49);
        org.junit.Assert.assertNotNull(errorPageArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray69);
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file20 = null;
        tomcatEmbeddedServletContainerFactory19.setDocumentRoot(file20);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection22 = tomcatEmbeddedServletContainerFactory19.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        tomcatEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection27 = tomcatEmbeddedServletContainerFactory19.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection28 = tomcatEmbeddedServletContainerFactory19.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file32 = null;
        tomcatEmbeddedServletContainerFactory31.setDocumentRoot(file32);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection34 = tomcatEmbeddedServletContainerFactory31.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory19.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection34);
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection34);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory39.setTldSkip("");
        tomcatEmbeddedServletContainerFactory39.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress44 = tomcatEmbeddedServletContainerFactory39.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = tomcatEmbeddedServletContainerFactory39.getMimeMappings();
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings45);
        boolean boolean47 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader48 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader48);
        boolean boolean50 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection22);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection27);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection28);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection34);
        org.junit.Assert.assertNull(inetAddress44);
        org.junit.Assert.assertNotNull(mimeMappings45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getUriEncoding();
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) (byte) 10);
        tomcatEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        tomcatEmbeddedServletContainerFactory2.setPort(97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.apache.catalina.connector.Connector connector8 = null;
        org.apache.catalina.connector.Connector[] connectorArray9 = new org.apache.catalina.connector.Connector[] { connector8 };
        tomcatEmbeddedServletContainerFactory2.addAdditionalTomcatConnectors(connectorArray9);
        java.util.List<org.apache.catalina.connector.Connector> connectorList11 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.io.File file12 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file12);
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        boolean boolean16 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = tomcatEmbeddedServletContainerFactory2.getMimeMappings();
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection18 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.net.InetAddress inetAddress19 = null;
        tomcatEmbeddedServletContainerFactory2.setAddress(inetAddress19);
        tomcatEmbeddedServletContainerFactory2.setProtocol("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(connectorArray9);
        org.junit.Assert.assertNotNull(connectorList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(mimeMappings17);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection18);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection3 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setPort((int) (byte) 0);
        boolean boolean6 = tomcatEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress7 = tomcatEmbeddedServletContainerFactory2.getAddress();
        tomcatEmbeddedServletContainerFactory2.setPort(0);
        java.io.File file10 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file10);
        tomcatEmbeddedServletContainerFactory2.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection17 = tomcatEmbeddedServletContainerFactory16.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory16.setPort((int) (byte) 0);
        boolean boolean20 = tomcatEmbeddedServletContainerFactory16.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress21 = null;
        tomcatEmbeddedServletContainerFactory16.setAddress(inetAddress21);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection23 = tomcatEmbeddedServletContainerFactory16.getTomcatConnectorCustomizers();
        java.net.InetAddress inetAddress24 = tomcatEmbeddedServletContainerFactory16.getAddress();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file28 = null;
        tomcatEmbeddedServletContainerFactory27.setDocumentRoot(file28);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection30 = tomcatEmbeddedServletContainerFactory27.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray31 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet32 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32, errorPageArray31);
        tomcatEmbeddedServletContainerFactory27.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet32);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection35 = tomcatEmbeddedServletContainerFactory27.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection36 = tomcatEmbeddedServletContainerFactory27.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer tomcatConnectorCustomizer37 = null;
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray38 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] { tomcatConnectorCustomizer37 };
        tomcatEmbeddedServletContainerFactory27.addConnectorCustomizers(tomcatConnectorCustomizerArray38);
        tomcatEmbeddedServletContainerFactory16.addConnectorCustomizers(tomcatConnectorCustomizerArray38);
        tomcatEmbeddedServletContainerFactory2.addConnectorCustomizers(tomcatConnectorCustomizerArray38);
        tomcatEmbeddedServletContainerFactory2.setRegisterJspServlet(true);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection44 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        org.junit.Assert.assertNotNull(lifecycleListenerCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inetAddress7);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection23);
        org.junit.Assert.assertNull(inetAddress24);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection30);
        org.junit.Assert.assertNotNull(errorPageArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection35);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection36);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray38);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection44);
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] tomcatContextCustomizerArray16 = new org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer[] {};
        tomcatEmbeddedServletContainerFactory2.addContextCustomizers(tomcatContextCustomizerArray16);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file21 = null;
        tomcatEmbeddedServletContainerFactory20.setDocumentRoot(file21);
        org.apache.catalina.Valve valve23 = null;
        org.apache.catalina.Valve[] valveArray24 = new org.apache.catalina.Valve[] { valve23 };
        tomcatEmbeddedServletContainerFactory20.addContextValves(valveArray24);
        boolean boolean26 = tomcatEmbeddedServletContainerFactory20.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file30 = null;
        tomcatEmbeddedServletContainerFactory29.setDocumentRoot(file30);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection32 = tomcatEmbeddedServletContainerFactory29.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file36 = null;
        tomcatEmbeddedServletContainerFactory35.setDocumentRoot(file36);
        org.apache.catalina.Valve valve38 = null;
        org.apache.catalina.Valve[] valveArray39 = new org.apache.catalina.Valve[] { valve38 };
        tomcatEmbeddedServletContainerFactory35.addContextValves(valveArray39);
        tomcatEmbeddedServletContainerFactory29.addContextValves(valveArray39);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file45 = null;
        tomcatEmbeddedServletContainerFactory44.setDocumentRoot(file45);
        java.lang.String str47 = tomcatEmbeddedServletContainerFactory44.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray48 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray48);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings50 = tomcatEmbeddedServletContainerFactory44.getMimeMappings();
        tomcatEmbeddedServletContainerFactory29.setMimeMappings(mimeMappings50);
        tomcatEmbeddedServletContainerFactory20.setMimeMappings(mimeMappings50);
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings50);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file57 = null;
        tomcatEmbeddedServletContainerFactory56.setDocumentRoot(file57);
        java.lang.String str59 = tomcatEmbeddedServletContainerFactory56.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file63 = null;
        tomcatEmbeddedServletContainerFactory62.setDocumentRoot(file63);
        java.lang.String str65 = tomcatEmbeddedServletContainerFactory62.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray66 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory62.addInitializers(servletContextInitializerArray66);
        tomcatEmbeddedServletContainerFactory56.addInitializers(servletContextInitializerArray66);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray66);
        boolean boolean70 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        java.lang.String str71 = tomcatEmbeddedServletContainerFactory2.getUriEncoding();
        int int72 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        int int73 = tomcatEmbeddedServletContainerFactory2.getPort();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertNotNull(errorPageSet15);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerArray16);
        org.junit.Assert.assertNotNull(valveArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection32);
        org.junit.Assert.assertNotNull(valveArray39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray48);
        org.junit.Assert.assertNotNull(mimeMappings50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTF-8" + "'", str71, "UTF-8");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection3 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        int int4 = tomcatEmbeddedServletContainerFactory2.getPort();
        int int5 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        java.io.File file6 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        tomcatEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader7);
        java.lang.String str9 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        java.io.File file10 = tomcatEmbeddedServletContainerFactory2.getDocumentRoot();
        org.junit.Assert.assertNotNull(lifecycleListenerCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.apache.catalina.connector.Connector connector8 = null;
        org.apache.catalina.connector.Connector[] connectorArray9 = new org.apache.catalina.connector.Connector[] { connector8 };
        tomcatEmbeddedServletContainerFactory2.addAdditionalTomcatConnectors(connectorArray9);
        java.util.List<org.apache.catalina.connector.Connector> connectorList11 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.io.File file12 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file12);
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("hi!");
        boolean boolean16 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        boolean boolean17 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        java.lang.String str18 = tomcatEmbeddedServletContainerFactory2.getUriEncoding();
        java.lang.String str19 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(connectorArray9);
        org.junit.Assert.assertNotNull(connectorList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.io.File file5 = null;
        tomcatEmbeddedServletContainerFactory2.setBaseDirectory(file5);
        int int7 = tomcatEmbeddedServletContainerFactory2.getPort();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((int) ' ');
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        org.springframework.boot.context.embedded.ErrorPage errorPage13 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray14 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage13 };
        tomcatEmbeddedServletContainerFactory12.addErrorPages(errorPageArray14);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = tomcatEmbeddedServletContainerFactory12.getMimeMappings();
        tomcatEmbeddedServletContainerFactory9.setMimeMappings(mimeMappings16);
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings16);
        java.util.List<org.apache.catalina.connector.Connector> connectorList19 = tomcatEmbeddedServletContainerFactory2.getAdditionalTomcatConnectors();
        java.util.Collection<org.apache.catalina.Valve> valveCollection20 = tomcatEmbeddedServletContainerFactory2.getValves();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(errorPageArray14);
        org.junit.Assert.assertNotNull(mimeMappings16);
        org.junit.Assert.assertNotNull(connectorList19);
        org.junit.Assert.assertNotNull(valveCollection20);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) '#');
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection3 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.lang.String str4 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file8 = null;
        tomcatEmbeddedServletContainerFactory7.setDocumentRoot(file8);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection10 = tomcatEmbeddedServletContainerFactory7.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file14 = null;
        tomcatEmbeddedServletContainerFactory13.setDocumentRoot(file14);
        org.apache.catalina.Valve valve16 = null;
        org.apache.catalina.Valve[] valveArray17 = new org.apache.catalina.Valve[] { valve16 };
        tomcatEmbeddedServletContainerFactory13.addContextValves(valveArray17);
        tomcatEmbeddedServletContainerFactory7.addContextValves(valveArray17);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection20 = tomcatEmbeddedServletContainerFactory7.getContextLifecycleListeners();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = tomcatEmbeddedServletContainerFactory7.getMimeMappings();
        java.net.InetAddress inetAddress22 = null;
        tomcatEmbeddedServletContainerFactory7.setAddress(inetAddress22);
        java.io.File file24 = tomcatEmbeddedServletContainerFactory7.getDocumentRoot();
        java.io.File file25 = null;
        tomcatEmbeddedServletContainerFactory7.setDocumentRoot(file25);
        tomcatEmbeddedServletContainerFactory7.setProtocol("UTF-8");
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet29 = tomcatEmbeddedServletContainerFactory7.getErrorPages();
        org.springframework.core.io.ResourceLoader resourceLoader30 = null;
        tomcatEmbeddedServletContainerFactory7.setResourceLoader(resourceLoader30);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        java.net.InetAddress inetAddress33 = tomcatEmbeddedServletContainerFactory32.getAddress();
        org.apache.catalina.LifecycleListener lifecycleListener34 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray35 = new org.apache.catalina.LifecycleListener[] { lifecycleListener34 };
        tomcatEmbeddedServletContainerFactory32.addContextLifecycleListeners(lifecycleListenerArray35);
        tomcatEmbeddedServletContainerFactory7.addContextLifecycleListeners(lifecycleListenerArray35);
        tomcatEmbeddedServletContainerFactory2.addContextLifecycleListeners(lifecycleListenerArray35);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection10);
        org.junit.Assert.assertNotNull(valveArray17);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection20);
        org.junit.Assert.assertNotNull(mimeMappings21);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(errorPageSet29);
        org.junit.Assert.assertNull(inetAddress33);
        org.junit.Assert.assertNotNull(lifecycleListenerArray35);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file9 = null;
        tomcatEmbeddedServletContainerFactory8.setDocumentRoot(file9);
        java.lang.String str11 = tomcatEmbeddedServletContainerFactory8.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray12 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray12);
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray12);
        int int15 = tomcatEmbeddedServletContainerFactory2.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection16 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file20 = null;
        tomcatEmbeddedServletContainerFactory19.setDocumentRoot(file20);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection22 = tomcatEmbeddedServletContainerFactory19.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet24 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24, errorPageArray23);
        tomcatEmbeddedServletContainerFactory19.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet24);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection27 = tomcatEmbeddedServletContainerFactory19.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection28 = tomcatEmbeddedServletContainerFactory19.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer tomcatConnectorCustomizer29 = null;
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray30 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] { tomcatConnectorCustomizer29 };
        tomcatEmbeddedServletContainerFactory19.addConnectorCustomizers(tomcatConnectorCustomizerArray30);
        tomcatEmbeddedServletContainerFactory2.addConnectorCustomizers(tomcatConnectorCustomizerArray30);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory35.setTldSkip("");
        tomcatEmbeddedServletContainerFactory35.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress40 = tomcatEmbeddedServletContainerFactory35.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings41 = tomcatEmbeddedServletContainerFactory35.getMimeMappings();
        tomcatEmbeddedServletContainerFactory2.setMimeMappings(mimeMappings41);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((-1));
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection45 = tomcatEmbeddedServletContainerFactory44.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory2.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection45);
        int int47 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection16);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection22);
        org.junit.Assert.assertNotNull(errorPageArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection27);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection28);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray30);
        org.junit.Assert.assertNull(inetAddress40);
        org.junit.Assert.assertNotNull(mimeMappings41);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory((-1));
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection2 = tomcatEmbeddedServletContainerFactory1.getTomcatConnectorCustomizers();
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory1.setDocumentRoot(file3);
        java.lang.Class<?> wildcardClass5 = tomcatEmbeddedServletContainerFactory1.getClass();
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.lang.String str5 = tomcatEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray6 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray6);
        org.apache.catalina.connector.Connector connector8 = null;
        org.apache.catalina.connector.Connector[] connectorArray9 = new org.apache.catalina.connector.Connector[] { connector8 };
        tomcatEmbeddedServletContainerFactory2.addAdditionalTomcatConnectors(connectorArray9);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection11 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setSessionTimeout((int) (short) 100);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection14 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory2.setContextPath("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray6);
        org.junit.Assert.assertNotNull(connectorArray9);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection11);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection14);
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection5 = tomcatEmbeddedServletContainerFactory2.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet7 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7, errorPageArray6);
        tomcatEmbeddedServletContainerFactory2.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet7);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection10 = tomcatEmbeddedServletContainerFactory2.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection11 = tomcatEmbeddedServletContainerFactory2.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer tomcatConnectorCustomizer12 = null;
        org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray13 = new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer[] { tomcatConnectorCustomizer12 };
        tomcatEmbeddedServletContainerFactory2.addConnectorCustomizers(tomcatConnectorCustomizerArray13);
        boolean boolean15 = tomcatEmbeddedServletContainerFactory2.isRegisterJspServlet();
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("UTF-8");
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection5);
        org.junit.Assert.assertNotNull(errorPageArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection10);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection11);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file3 = null;
        tomcatEmbeddedServletContainerFactory2.setDocumentRoot(file3);
        org.apache.catalina.Valve valve5 = null;
        org.apache.catalina.Valve[] valveArray6 = new org.apache.catalina.Valve[] { valve5 };
        tomcatEmbeddedServletContainerFactory2.addContextValves(valveArray6);
        int int8 = tomcatEmbeddedServletContainerFactory2.getSessionTimeout();
        tomcatEmbeddedServletContainerFactory2.setJspServletClassName("");
        tomcatEmbeddedServletContainerFactory2.setProtocol("UTF-8");
        tomcatEmbeddedServletContainerFactory2.setUriEncoding("UTF-8");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory();
        org.apache.catalina.Valve valve16 = null;
        org.apache.catalina.Valve[] valveArray17 = new org.apache.catalina.Valve[] { valve16 };
        tomcatEmbeddedServletContainerFactory15.addContextValves(valveArray17);
        org.springframework.core.io.ResourceLoader resourceLoader19 = null;
        tomcatEmbeddedServletContainerFactory15.setResourceLoader(resourceLoader19);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file24 = null;
        tomcatEmbeddedServletContainerFactory23.setDocumentRoot(file24);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection26 = tomcatEmbeddedServletContainerFactory23.getContextLifecycleListeners();
        tomcatEmbeddedServletContainerFactory23.setContextPath("");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file32 = null;
        tomcatEmbeddedServletContainerFactory31.setDocumentRoot(file32);
        java.lang.String str34 = tomcatEmbeddedServletContainerFactory31.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray35);
        tomcatEmbeddedServletContainerFactory31.setSessionTimeout((int) (short) 0);
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray39 = new org.apache.catalina.LifecycleListener[] {};
        tomcatEmbeddedServletContainerFactory31.addContextLifecycleListeners(lifecycleListenerArray39);
        tomcatEmbeddedServletContainerFactory23.addContextLifecycleListeners(lifecycleListenerArray39);
        tomcatEmbeddedServletContainerFactory15.addContextLifecycleListeners(lifecycleListenerArray39);
        tomcatEmbeddedServletContainerFactory2.addContextLifecycleListeners(lifecycleListenerArray39);
        int int44 = tomcatEmbeddedServletContainerFactory2.getPort();
        org.junit.Assert.assertNotNull(valveArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(valveArray17);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        org.junit.Assert.assertNotNull(lifecycleListenerArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) (short) 100);
        java.net.InetAddress inetAddress3 = tomcatEmbeddedServletContainerFactory2.getAddress();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = tomcatEmbeddedServletContainerFactory2.getErrorPages();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file8 = null;
        tomcatEmbeddedServletContainerFactory7.setDocumentRoot(file8);
        boolean boolean10 = tomcatEmbeddedServletContainerFactory7.isRegisterJspServlet();
        tomcatEmbeddedServletContainerFactory7.setPort((int) (byte) 1);
        java.net.InetAddress inetAddress13 = null;
        tomcatEmbeddedServletContainerFactory7.setAddress(inetAddress13);
        java.util.List<org.apache.catalina.connector.Connector> connectorList15 = tomcatEmbeddedServletContainerFactory7.getAdditionalTomcatConnectors();
        java.util.List<org.apache.catalina.connector.Connector> connectorList16 = tomcatEmbeddedServletContainerFactory7.getAdditionalTomcatConnectors();
        java.util.Collection<org.apache.catalina.Valve> valveCollection17 = tomcatEmbeddedServletContainerFactory7.getValves();
        java.util.Collection<org.apache.catalina.Valve> valveCollection18 = tomcatEmbeddedServletContainerFactory7.getValves();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file22 = null;
        tomcatEmbeddedServletContainerFactory21.setDocumentRoot(file22);
        java.lang.String str24 = tomcatEmbeddedServletContainerFactory21.getContextPath();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file28 = null;
        tomcatEmbeddedServletContainerFactory27.setDocumentRoot(file28);
        java.lang.String str30 = tomcatEmbeddedServletContainerFactory27.getContextPath();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        tomcatEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray31);
        tomcatEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray31);
        tomcatEmbeddedServletContainerFactory21.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file39 = null;
        tomcatEmbeddedServletContainerFactory38.setDocumentRoot(file39);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection41 = tomcatEmbeddedServletContainerFactory38.getTomcatConnectorCustomizers();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43, errorPageArray42);
        tomcatEmbeddedServletContainerFactory38.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43);
        java.util.Collection<org.apache.catalina.LifecycleListener> lifecycleListenerCollection46 = tomcatEmbeddedServletContainerFactory38.getContextLifecycleListeners();
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer> tomcatContextCustomizerCollection47 = tomcatEmbeddedServletContainerFactory38.getTomcatContextCustomizers();
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file51 = null;
        tomcatEmbeddedServletContainerFactory50.setDocumentRoot(file51);
        java.util.Collection<org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer> tomcatConnectorCustomizerCollection53 = tomcatEmbeddedServletContainerFactory50.getTomcatConnectorCustomizers();
        tomcatEmbeddedServletContainerFactory38.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection53);
        tomcatEmbeddedServletContainerFactory21.setTomcatConnectorCustomizers(tomcatConnectorCustomizerCollection53);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory58 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        tomcatEmbeddedServletContainerFactory58.setTldSkip("");
        tomcatEmbeddedServletContainerFactory58.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress63 = tomcatEmbeddedServletContainerFactory58.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings64 = tomcatEmbeddedServletContainerFactory58.getMimeMappings();
        tomcatEmbeddedServletContainerFactory21.setMimeMappings(mimeMappings64);
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory("", (int) 'a');
        java.io.File file69 = null;
        tomcatEmbeddedServletContainerFactory68.setDocumentRoot(file69);
        boolean boolean71 = tomcatEmbeddedServletContainerFactory68.isRegisterJspServlet();
        tomcatEmbeddedServletContainerFactory68.setPort((int) (byte) 1);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet74 = tomcatEmbeddedServletContainerFactory68.getErrorPages();
        tomcatEmbeddedServletContainerFactory21.setErrorPages(errorPageSet74);
        tomcatEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings78 = tomcatEmbeddedServletContainerFactory21.getMimeMappings();
        org.apache.catalina.LifecycleListener lifecycleListener79 = null;
        org.apache.catalina.LifecycleListener[] lifecycleListenerArray80 = new org.apache.catalina.LifecycleListener[] { lifecycleListener79 };
        tomcatEmbeddedServletContainerFactory21.addContextLifecycleListeners(lifecycleListenerArray80);
        tomcatEmbeddedServletContainerFactory7.addContextLifecycleListeners(lifecycleListenerArray80);
        tomcatEmbeddedServletContainerFactory2.addContextLifecycleListeners(lifecycleListenerArray80);
        org.junit.Assert.assertNull(inetAddress3);
        org.junit.Assert.assertNotNull(errorPageSet4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(connectorList15);
        org.junit.Assert.assertNotNull(connectorList16);
        org.junit.Assert.assertNotNull(valveCollection17);
        org.junit.Assert.assertNotNull(valveCollection18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection41);
        org.junit.Assert.assertNotNull(errorPageArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lifecycleListenerCollection46);
        org.junit.Assert.assertNotNull(tomcatContextCustomizerCollection47);
        org.junit.Assert.assertNotNull(tomcatConnectorCustomizerCollection53);
        org.junit.Assert.assertNull(inetAddress63);
        org.junit.Assert.assertNotNull(mimeMappings64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(errorPageSet74);
        org.junit.Assert.assertNotNull(mimeMappings78);
        org.junit.Assert.assertNotNull(lifecycleListenerArray80);
    }
}

