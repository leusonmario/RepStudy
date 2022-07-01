import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration3 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext5 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration5 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap1 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory4 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext5 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory3 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap2 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory3 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        boolean boolean14 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        atmosphereConfig12.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        int int20 = atmosphereConfig16.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig16.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray22 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList23 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList23, startupHookArray22);
        atmosphereConfig16.startUpHook = startupHookList23;
        atmosphereConfig12.startUpHook = startupHookList23;
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory28 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig12.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.getproperties();
        atmosphereConfig0.setproperties(strMap15);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext18 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration6 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration15 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig10.getshutdownHooks();
        atmosphereConfig10.setThrowExceptionOnCloned(false);
        java.lang.String str16 = atmosphereConfig10.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig10.properties;
        atmosphereConfig0.setproperties(strMap17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap19 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration2 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory5 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster3 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration3 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory22 = atmosphereConfig9.sessionFactory();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        boolean boolean18 = atmosphereConfig16.throwExceptionOnCloned;
        atmosphereConfig16.destroy();
        atmosphereConfig16.initComplete();
        atmosphereConfig16.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig16.framework();
        atmosphereConfig16.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig0.populate(atmosphereConfig16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster27 = atmosphereConfig26.metaBroadcaster();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory2 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory4 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        atmosphereConfig0.destroy();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        boolean boolean18 = atmosphereConfig16.throwExceptionOnCloned;
        atmosphereConfig16.destroy();
        atmosphereConfig16.initComplete();
        atmosphereConfig16.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig16.framework();
        atmosphereConfig16.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig0.populate(atmosphereConfig16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        boolean boolean13 = atmosphereConfig11.throwExceptionOnCloned;
        atmosphereConfig11.setThrowExceptionOnCloned(false);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.getproperties();
        atmosphereConfig0.setproperties(strMap17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster22 = atmosphereConfig9.metaBroadcaster();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig6.getshutdownHooks();
        atmosphereConfig6.setThrowExceptionOnCloned(false);
        java.lang.String str12 = atmosphereConfig6.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig6.properties;
        atmosphereConfig0.setproperties(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster4 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        boolean boolean14 = atmosphereConfig0.getInitParameter("hi!", true);
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster17 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory16 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap3 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        org.slf4j.Logger logger19 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap20 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        org.slf4j.Logger logger19 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        boolean boolean13 = atmosphereConfig11.throwExceptionOnCloned;
        atmosphereConfig11.setThrowExceptionOnCloned(false);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.getproperties();
        atmosphereConfig0.setproperties(strMap17);
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration21 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap3 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        atmosphereConfig0.destroy();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory36 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        boolean boolean21 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap22 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig6.getshutdownHooks();
        atmosphereConfig6.setThrowExceptionOnCloned(false);
        java.lang.String str12 = atmosphereConfig6.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig6.properties;
        atmosphereConfig0.setproperties(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig3 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap8 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory4 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.sessionTimeoutRemovalAllowed;
        boolean boolean12 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig5.shutdownHooks;
        atmosphereConfig0.setshutdownHooks(shutdownHookList13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        boolean boolean13 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = atmosphereConfig0.populate(atmosphereConfig8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig12.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.getproperties();
        atmosphereConfig0.setproperties(strMap15);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig12.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.properties();
        atmosphereConfig0.properties = strMap15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap17 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig6.getshutdownHooks();
        atmosphereConfig6.setThrowExceptionOnCloned(false);
        java.lang.String str12 = atmosphereConfig6.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig6.properties;
        atmosphereConfig0.setproperties(strMap13);
        java.lang.String str17 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory18 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        java.lang.String str31 = atmosphereConfig24.getInitParameter("hi!", "");
        boolean boolean32 = atmosphereConfig24.isSupportSession();
        atmosphereConfig24.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig24.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap38 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.shutdownHooks;
        java.lang.String str14 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext3 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig2 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig2.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig2.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig2.getproperties();
        atmosphereConfig0.setproperties(strMap5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig19 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration36 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        org.slf4j.Logger logger19 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider20 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster17 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig12.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig12.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList14);
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig12.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.properties();
        atmosphereConfig0.properties = strMap15;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList17 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory5 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str18 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration19 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        int int17 = atmosphereConfig0.getInitParameter("", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory4 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.getstartUpHook();
        boolean boolean16 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory17 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        java.lang.String str9 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        atmosphereConfig10.throwExceptionOnCloned = true;
        boolean boolean14 = atmosphereConfig10.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory17 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        boolean boolean15 = atmosphereConfig0.supportSession;
        int int18 = atmosphereConfig0.getInitParameter("", 1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory20 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        int int7 = atmosphereConfig3.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig3.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig3.framework();
        atmosphereConfig3.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        boolean boolean14 = atmosphereConfig12.throwExceptionOnCloned;
        atmosphereConfig12.setThrowExceptionOnCloned(false);
        boolean boolean17 = atmosphereConfig12.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig12.getproperties();
        atmosphereConfig3.setproperties(strMap18);
        atmosphereConfig3.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig3.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory23 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSupportSession(false);
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.lang.String str24 = atmosphereConfig21.getInitParameter("hi!", "");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig25.getshutdownHooks();
        boolean boolean28 = atmosphereConfig25.isSupportSession();
        boolean boolean29 = atmosphereConfig25.supportSession;
        atmosphereConfig25.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig25.getshutdownHooks();
        atmosphereConfig21.setshutdownHooks(shutdownHookList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig34 = atmosphereConfig21.getServletConfig();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory5 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList15 = atmosphereConfig13.getshutdownHooks();
        boolean boolean18 = atmosphereConfig13.getInitParameter("", true);
        boolean boolean19 = atmosphereConfig13.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig13.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList23 = atmosphereConfig21.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory10 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        org.slf4j.Logger logger13 = atmosphereConfig12.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig12.metaBroadcaster();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        boolean boolean18 = atmosphereConfig16.throwExceptionOnCloned;
        atmosphereConfig16.destroy();
        atmosphereConfig16.initComplete();
        atmosphereConfig16.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig16.framework();
        atmosphereConfig16.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig0.populate(atmosphereConfig16);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap29 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        atmosphereConfig0.setSupportSession(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList23 = atmosphereConfig21.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap25 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.slf4j.Logger logger2 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig15 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig15.getAtmosphereHandlerConfig();
        boolean boolean17 = atmosphereConfig15.throwExceptionOnCloned;
        atmosphereConfig15.destroy();
        atmosphereConfig15.initComplete();
        java.lang.String str22 = atmosphereConfig15.getInitParameter("hi!", "");
        boolean boolean23 = atmosphereConfig15.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig15.shutdownHooks;
        atmosphereConfig0.shutdownHooks = shutdownHookList24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory26 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext14 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig6.getServletConfig();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.lang.String str24 = atmosphereConfig21.getInitParameter("hi!", "");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig25.getshutdownHooks();
        boolean boolean28 = atmosphereConfig25.isSupportSession();
        boolean boolean29 = atmosphereConfig25.supportSession;
        atmosphereConfig25.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig25.getshutdownHooks();
        atmosphereConfig21.setshutdownHooks(shutdownHookList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = atmosphereConfig21.getWebServerName();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.lang.String str24 = atmosphereConfig21.getInitParameter("hi!", "");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig25.getshutdownHooks();
        boolean boolean28 = atmosphereConfig25.isSupportSession();
        boolean boolean29 = atmosphereConfig25.supportSession;
        atmosphereConfig25.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig25.getshutdownHooks();
        atmosphereConfig21.setshutdownHooks(shutdownHookList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap34 = atmosphereConfig21.handlers();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        boolean boolean10 = atmosphereConfig8.throwExceptionOnCloned;
        atmosphereConfig8.destroy();
        atmosphereConfig8.initComplete();
        java.lang.String str15 = atmosphereConfig8.getInitParameter("hi!", "");
        boolean boolean16 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("hi!");
        boolean boolean19 = atmosphereConfig8.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig8.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        atmosphereConfig0.setshutdownHooks(shutdownHookList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext20 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        boolean boolean8 = atmosphereConfig6.throwExceptionOnCloned;
        atmosphereConfig6.destroy();
        atmosphereConfig6.initComplete();
        java.lang.String str13 = atmosphereConfig6.getInitParameter("hi!", "");
        boolean boolean14 = atmosphereConfig6.isSupportSession();
        atmosphereConfig6.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig6.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig6.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = atmosphereConfig0.populate(atmosphereConfig6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory20 = atmosphereConfig19.resourcesFactory();
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.setSupportSession(true);
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        boolean boolean24 = atmosphereConfig22.throwExceptionOnCloned;
        atmosphereConfig22.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig22.getAtmosphereHandlerConfig();
        atmosphereConfig22.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig29 = atmosphereConfig21.populate(atmosphereConfig22);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList30 = atmosphereConfig21.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration31 = atmosphereConfig21.getInitParameterNames();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        int int17 = atmosphereConfig0.getInitParameter("", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig18 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig13.throwExceptionOnCloned = false;
        atmosphereConfig13.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig13.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig13.initComplete();
        atmosphereConfig13.throwExceptionOnCloned = true;
        boolean boolean23 = atmosphereConfig13.isThrowExceptionOnCloned();
        int int26 = atmosphereConfig13.getInitParameter("", 10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig27 = atmosphereConfig0.populate(atmosphereConfig13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration28 = atmosphereConfig13.getInitParameterNames();
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        java.lang.String str9 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        atmosphereConfig10.throwExceptionOnCloned = true;
        boolean boolean14 = atmosphereConfig10.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider17 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        java.lang.String str3 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext6 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        boolean boolean9 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        int int11 = atmosphereConfig7.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig7.supportSession = false;
        atmosphereConfig7.setSupportSession(false);
        java.lang.String str17 = atmosphereConfig7.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig7.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList21);
        java.lang.String str24 = atmosphereConfig0.getInitParameter("");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig26 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.shutdownHooks;
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory14 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        java.lang.String str20 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory21 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = false;
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        boolean boolean13 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        boolean boolean21 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean7 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext20 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        boolean boolean13 = atmosphereConfig5.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig5.sessionFactory();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        boolean boolean8 = atmosphereConfig6.throwExceptionOnCloned;
        atmosphereConfig6.destroy();
        atmosphereConfig6.initComplete();
        java.lang.String str13 = atmosphereConfig6.getInitParameter("hi!", "");
        boolean boolean14 = atmosphereConfig6.isSupportSession();
        atmosphereConfig6.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig6.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig6.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = atmosphereConfig0.populate(atmosphereConfig6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext20 = atmosphereConfig6.getServletContext();
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        boolean boolean14 = atmosphereConfig9.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig9.getproperties();
        atmosphereConfig0.setproperties(strMap15);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap18 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig12.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig12.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList14);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider17 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        boolean boolean13 = atmosphereConfig11.throwExceptionOnCloned;
        atmosphereConfig11.setThrowExceptionOnCloned(false);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.getproperties();
        atmosphereConfig0.setproperties(strMap17);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration21 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        boolean boolean13 = atmosphereConfig11.throwExceptionOnCloned;
        atmosphereConfig11.setThrowExceptionOnCloned(false);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.getproperties();
        atmosphereConfig0.setproperties(strMap17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig0.getproperties();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration19 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig11.getshutdownHooks();
        boolean boolean16 = atmosphereConfig11.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig17.getshutdownHooks();
        atmosphereConfig17.setThrowExceptionOnCloned(false);
        java.lang.String str23 = atmosphereConfig17.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig17.properties;
        atmosphereConfig11.setproperties(strMap24);
        atmosphereConfig10.properties = strMap24;
        atmosphereConfig0.setproperties(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory28 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.setSupportSession(true);
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        atmosphereConfig9.throwExceptionOnCloned = true;
        boolean boolean13 = atmosphereConfig9.isSupportSession();
        boolean boolean14 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        boolean boolean15 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        boolean boolean16 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig9.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig20 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig18.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster20 = atmosphereConfig18.metaBroadcaster();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean8 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        org.slf4j.Logger logger13 = atmosphereConfig12.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory14 = atmosphereConfig12.resourcesFactory();
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider15 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        int int15 = atmosphereConfig11.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig11.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig11.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig19.properties;
        atmosphereConfig11.setproperties(strMap21);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig23.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = atmosphereConfig23.startUpHook;
        atmosphereConfig11.setstartUpHook(startupHookList25);
        atmosphereConfig11.supportSession = false;
        atmosphereConfig11.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList31 = atmosphereConfig11.getstartUpHook();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig32 = atmosphereConfig10.populate(atmosphereConfig11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration33 = atmosphereConfig32.getInitParameterNames();
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig7.properties;
        atmosphereConfig0.properties = strMap9;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        java.lang.String str38 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean41 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster42 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory2 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        int int7 = atmosphereConfig3.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig3.supportSession = false;
        boolean boolean10 = atmosphereConfig3.isSessionTimeoutRemovalAllowed();
        atmosphereConfig3.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        boolean boolean14 = atmosphereConfig12.throwExceptionOnCloned;
        atmosphereConfig12.destroy();
        atmosphereConfig12.initComplete();
        java.lang.String str19 = atmosphereConfig12.getInitParameter("hi!", "");
        boolean boolean20 = atmosphereConfig12.isSessionTimeoutRemovalAllowed();
        boolean boolean23 = atmosphereConfig12.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig24.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig28 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList29 = atmosphereConfig28.getAtmosphereHandlerConfig();
        int int32 = atmosphereConfig28.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework33 = atmosphereConfig28.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray34 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList35 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList35, startupHookArray34);
        atmosphereConfig28.startUpHook = startupHookList35;
        atmosphereConfig24.startUpHook = startupHookList35;
        atmosphereConfig12.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList35);
        atmosphereConfig3.startUpHook = startupHookList35;
        atmosphereConfig0.startUpHook = startupHookList35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap42 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster16 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig12.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.properties();
        atmosphereConfig0.properties = strMap15;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList17 = atmosphereConfig0.getstartUpHook();
        java.lang.String str19 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.initComplete();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider23 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig14.getAtmosphereHandlerConfig();
        atmosphereConfig14.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig18.getAtmosphereHandlerConfig();
        int int22 = atmosphereConfig18.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig18.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray24 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList25, startupHookArray24);
        atmosphereConfig18.startUpHook = startupHookList25;
        atmosphereConfig14.startUpHook = startupHookList25;
        atmosphereConfig9.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList25);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory31 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        java.lang.String str31 = atmosphereConfig24.getInitParameter("hi!", "");
        boolean boolean32 = atmosphereConfig24.isSupportSession();
        atmosphereConfig24.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig24.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList36;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory40 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        boolean boolean12 = atmosphereConfig10.throwExceptionOnCloned;
        atmosphereConfig10.destroy();
        atmosphereConfig10.initComplete();
        atmosphereConfig10.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig10.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig10.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig10.getframework();
        boolean boolean20 = atmosphereConfig10.isSessionTimeoutRemovalAllowed();
        boolean boolean21 = atmosphereConfig10.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig10.framework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = atmosphereConfig0.populate(atmosphereConfig10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider24 = atmosphereConfig10.uuidProvider();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean8 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig11.getshutdownHooks();
        boolean boolean16 = atmosphereConfig11.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig17.getshutdownHooks();
        atmosphereConfig17.setThrowExceptionOnCloned(false);
        java.lang.String str23 = atmosphereConfig17.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig17.properties;
        atmosphereConfig11.setproperties(strMap24);
        atmosphereConfig10.properties = strMap24;
        atmosphereConfig0.setproperties(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap28 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig4.throwExceptionOnCloned = false;
        atmosphereConfig4.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration3 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.supportSession = true;
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        boolean boolean24 = atmosphereConfig22.throwExceptionOnCloned;
        atmosphereConfig22.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig22.getAtmosphereHandlerConfig();
        atmosphereConfig22.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig29 = atmosphereConfig21.populate(atmosphereConfig22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory30 = atmosphereConfig21.sessionFactory();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        int int13 = atmosphereConfig9.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig9.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray15 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList16 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16, startupHookArray15);
        atmosphereConfig9.startUpHook = startupHookList16;
        atmosphereConfig5.startUpHook = startupHookList16;
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig23 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory14 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig12.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig12.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList14);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.supportSession = false;
        boolean boolean20 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean21 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean17 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig17.getproperties();
        atmosphereConfig0.setproperties(strMap18);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        java.lang.String str15 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider16 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig0.getshutdownHooks();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        int int10 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 10);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        int int5 = atmosphereConfig0.getInitParameter("", (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        int int13 = atmosphereConfig9.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig9.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray15 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList16 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16, startupHookArray15);
        atmosphereConfig9.startUpHook = startupHookList16;
        atmosphereConfig5.startUpHook = startupHookList16;
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig7.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig7.properties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig7.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList11;
        boolean boolean13 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.destroy();
        atmosphereConfig13.initComplete();
        java.lang.String str20 = atmosphereConfig13.getInitParameter("hi!", "");
        boolean boolean21 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        atmosphereConfig13.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = atmosphereConfig0.populate(atmosphereConfig13);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster26 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean17 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig18 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig7.properties;
        atmosphereConfig0.properties = strMap9;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        int int17 = atmosphereConfig0.getInitParameter("", (int) (short) -1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig18.startUpHook;
        boolean boolean20 = atmosphereConfig18.supportSession;
        org.slf4j.Logger logger21 = atmosphereConfig18.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig22.getshutdownHooks();
        atmosphereConfig22.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig27 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList28 = atmosphereConfig27.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList29 = atmosphereConfig27.getshutdownHooks();
        atmosphereConfig22.setshutdownHooks(shutdownHookList29);
        boolean boolean31 = atmosphereConfig22.isSessionTimeoutRemovalAllowed();
        atmosphereConfig22.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig22.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig36 = atmosphereConfig18.populate(atmosphereConfig22);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = atmosphereConfig36.getproperties();
        atmosphereConfig0.properties = strMap37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig8.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.setstartUpHook(startupHookList10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig17.getproperties();
        atmosphereConfig0.setproperties(strMap18);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext21 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory20 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        int int29 = atmosphereConfig25.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework30 = atmosphereConfig25.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = atmosphereConfig25.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = atmosphereConfig25.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig33 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig33.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig33.properties;
        atmosphereConfig25.setproperties(strMap35);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig37 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList38 = atmosphereConfig37.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList39 = atmosphereConfig37.startUpHook;
        atmosphereConfig25.setstartUpHook(startupHookList39);
        atmosphereConfig25.supportSession = false;
        atmosphereConfig25.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig45 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList46 = atmosphereConfig45.getAtmosphereHandlerConfig();
        int int49 = atmosphereConfig45.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig45.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = atmosphereConfig45.properties();
        atmosphereConfig25.setproperties(strMap52);
        atmosphereConfig0.properties = strMap52;
        boolean boolean55 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig56 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster18 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig8.properties();
        atmosphereConfig0.setproperties(strMap15);
        atmosphereConfig0.supportSession = false;
        java.lang.String str20 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean21 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory22 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        int int11 = atmosphereConfig7.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig7.supportSession = false;
        atmosphereConfig7.setSupportSession(false);
        java.lang.String str17 = atmosphereConfig7.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig7.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList21);
        java.lang.String str24 = atmosphereConfig0.getInitParameter("");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration27 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig12.getshutdownHooks();
        atmosphereConfig12.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig17.getshutdownHooks();
        atmosphereConfig12.setshutdownHooks(shutdownHookList19);
        boolean boolean21 = atmosphereConfig12.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig12.getstartUpHook();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = atmosphereConfig0.populate(atmosphereConfig12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory24 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        atmosphereConfig0.destroy();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster22 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean9 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean12 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext13 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        java.lang.String str38 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory39 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.sessionTimeoutRemovalAllowed;
        boolean boolean12 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig5.shutdownHooks;
        atmosphereConfig0.setshutdownHooks(shutdownHookList13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        boolean boolean20 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap21 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.destroy();
        atmosphereConfig13.initComplete();
        java.lang.String str20 = atmosphereConfig13.getInitParameter("hi!", "");
        boolean boolean21 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        atmosphereConfig13.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = atmosphereConfig0.populate(atmosphereConfig13);
        boolean boolean27 = atmosphereConfig13.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig13.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig29 = atmosphereConfig13.getServletConfig();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig2 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig2.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig2.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig2.getproperties();
        atmosphereConfig0.setproperties(strMap5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig15 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        atmosphereConfig4.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig8.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray14 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList15, startupHookArray14);
        atmosphereConfig8.startUpHook = startupHookList15;
        atmosphereConfig4.startUpHook = startupHookList15;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig4.getAtmosphereHandlerConfig();
        boolean boolean20 = atmosphereConfig4.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig4.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig4.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = atmosphereConfig0.populate(atmosphereConfig4);
        boolean boolean24 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory25 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig7.properties;
        atmosphereConfig0.properties = strMap9;
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.getshutdownHooks();
        java.lang.String str15 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.supportSession = true;
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        java.lang.String str16 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap17 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        boolean boolean15 = atmosphereConfig0.supportSession;
        int int18 = atmosphereConfig0.getInitParameter("", 1);
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory21 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        java.lang.String str31 = atmosphereConfig24.getInitParameter("hi!", "");
        boolean boolean32 = atmosphereConfig24.isSupportSession();
        atmosphereConfig24.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig24.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList36;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework41 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig42 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.getproperties();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig14.getAtmosphereHandlerConfig();
        int int18 = atmosphereConfig14.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig14.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig14.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig14.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig22.properties;
        atmosphereConfig14.setproperties(strMap24);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList27 = atmosphereConfig26.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList28 = atmosphereConfig26.startUpHook;
        atmosphereConfig14.setstartUpHook(startupHookList28);
        atmosphereConfig0.startUpHook = startupHookList28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration31 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig21.handlers();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig7.properties;
        atmosphereConfig0.properties = strMap9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        atmosphereConfig10.throwExceptionOnCloned = true;
        boolean boolean14 = atmosphereConfig10.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig18 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean4 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.supportSession = true;
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        java.lang.String str31 = atmosphereConfig24.getInitParameter("hi!", "");
        boolean boolean32 = atmosphereConfig24.isSupportSession();
        atmosphereConfig24.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig24.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList36;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration23 = atmosphereConfig21.getInitParameterNames();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.getproperties();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig14.getAtmosphereHandlerConfig();
        int int18 = atmosphereConfig14.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig14.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig14.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig14.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig22.properties;
        atmosphereConfig14.setproperties(strMap24);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList27 = atmosphereConfig26.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList28 = atmosphereConfig26.startUpHook;
        atmosphereConfig14.setstartUpHook(startupHookList28);
        atmosphereConfig0.startUpHook = startupHookList28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory31 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        boolean boolean12 = atmosphereConfig10.throwExceptionOnCloned;
        atmosphereConfig10.destroy();
        atmosphereConfig10.initComplete();
        atmosphereConfig10.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig10.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig10.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig10.getframework();
        boolean boolean20 = atmosphereConfig10.isSessionTimeoutRemovalAllowed();
        boolean boolean21 = atmosphereConfig10.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig10.framework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = atmosphereConfig0.populate(atmosphereConfig10);
        boolean boolean24 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory26 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        atmosphereConfig9.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig9.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList18 = atmosphereConfig9.getstartUpHook();
        atmosphereConfig0.setstartUpHook(startupHookList18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory20 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        boolean boolean18 = atmosphereConfig16.throwExceptionOnCloned;
        atmosphereConfig16.destroy();
        atmosphereConfig16.initComplete();
        atmosphereConfig16.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig16.framework();
        atmosphereConfig16.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig0.populate(atmosphereConfig16);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig16.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory28 = atmosphereConfig16.getBroadcasterFactory();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList4 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        atmosphereConfig0.destroy();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        atmosphereConfig9.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig9.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig9.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        java.lang.String str20 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean21 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap22 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        boolean boolean10 = atmosphereConfig8.throwExceptionOnCloned;
        atmosphereConfig8.destroy();
        atmosphereConfig8.initComplete();
        java.lang.String str15 = atmosphereConfig8.getInitParameter("hi!", "");
        boolean boolean16 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("hi!");
        boolean boolean19 = atmosphereConfig8.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig8.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        atmosphereConfig0.setshutdownHooks(shutdownHookList21);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList23 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory24 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster4 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        atmosphereConfig7.throwExceptionOnCloned = true;
        boolean boolean11 = atmosphereConfig7.isSupportSession();
        boolean boolean12 = atmosphereConfig7.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig7.sessionTimeoutRemovalAllowed;
        boolean boolean14 = atmosphereConfig7.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList15 = atmosphereConfig7.shutdownHooks;
        atmosphereConfig7.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig7.properties();
        atmosphereConfig0.setproperties(strMap18);
        boolean boolean22 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory23 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.properties;
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig12.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig12.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList14);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider21 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        int int13 = atmosphereConfig9.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig9.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray15 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList16 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16, startupHookArray15);
        atmosphereConfig9.startUpHook = startupHookList16;
        atmosphereConfig5.startUpHook = startupHookList16;
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig21 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str13 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap16 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        int int29 = atmosphereConfig25.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework30 = atmosphereConfig25.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = atmosphereConfig25.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = atmosphereConfig25.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig33 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig33.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig33.properties;
        atmosphereConfig25.setproperties(strMap35);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig37 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList38 = atmosphereConfig37.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList39 = atmosphereConfig37.startUpHook;
        atmosphereConfig25.setstartUpHook(startupHookList39);
        atmosphereConfig25.supportSession = false;
        atmosphereConfig25.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig45 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList46 = atmosphereConfig45.getAtmosphereHandlerConfig();
        int int49 = atmosphereConfig45.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig45.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = atmosphereConfig45.properties();
        atmosphereConfig25.setproperties(strMap52);
        atmosphereConfig0.properties = strMap52;
        boolean boolean55 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory56 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.supportSession = false;
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        boolean boolean14 = atmosphereConfig0.isSupportSession();
        java.lang.String str16 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster17 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        boolean boolean15 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean18 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig19 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        boolean boolean15 = atmosphereConfig0.supportSession;
        int int18 = atmosphereConfig0.getInitParameter("", 1);
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext21 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig4.throwExceptionOnCloned = false;
        atmosphereConfig4.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList9;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        boolean boolean12 = atmosphereConfig0.isSupportSession();
        java.lang.String str14 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig15 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.properties();
        int int8 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("");
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.setThrowExceptionOnCloned(false);
        boolean boolean18 = atmosphereConfig13.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig13.properties();
        atmosphereConfig0.properties = strMap19;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig12.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.getproperties();
        atmosphereConfig0.setproperties(strMap15);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext19 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig18.getstartUpHook();
        atmosphereConfig18.supportSession = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig18.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext23 = atmosphereConfig18.getServletContext();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig12.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.getproperties();
        atmosphereConfig0.setproperties(strMap15);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        int int10 = atmosphereConfig0.getInitParameter("hi!", 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray10 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList11, startupHookArray10);
        atmosphereConfig4.startUpHook = startupHookList11;
        atmosphereConfig0.startUpHook = startupHookList11;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig17.getproperties();
        atmosphereConfig0.setproperties(strMap18);
        boolean boolean20 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str23 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster24 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.getframework();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory5 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        boolean boolean8 = atmosphereConfig6.throwExceptionOnCloned;
        atmosphereConfig6.destroy();
        atmosphereConfig6.initComplete();
        java.lang.String str13 = atmosphereConfig6.getInitParameter("hi!", "");
        boolean boolean14 = atmosphereConfig6.isSupportSession();
        atmosphereConfig6.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig6.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig6.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = atmosphereConfig0.populate(atmosphereConfig6);
        boolean boolean20 = atmosphereConfig19.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext21 = atmosphereConfig19.getServletContext();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        boolean boolean13 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        int int14 = atmosphereConfig10.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig10.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig10.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig10.getproperties();
        atmosphereConfig10.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        boolean boolean21 = atmosphereConfig19.throwExceptionOnCloned;
        atmosphereConfig19.destroy();
        atmosphereConfig19.initComplete();
        java.lang.String str26 = atmosphereConfig19.getInitParameter("hi!", "");
        boolean boolean27 = atmosphereConfig19.isSessionTimeoutRemovalAllowed();
        java.lang.String str29 = atmosphereConfig19.getInitParameter("hi!");
        boolean boolean30 = atmosphereConfig19.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig31 = atmosphereConfig10.populate(atmosphereConfig19);
        atmosphereConfig31.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig34 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean35 = atmosphereConfig34.isThrowExceptionOnCloned();
        boolean boolean36 = atmosphereConfig34.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList37 = atmosphereConfig34.getstartUpHook();
        atmosphereConfig31.startUpHook = startupHookList37;
        atmosphereConfig0.startUpHook = startupHookList37;
        boolean boolean40 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap41 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str9 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory10 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean9 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        atmosphereConfig5.throwExceptionOnCloned = true;
        boolean boolean9 = atmosphereConfig5.isSupportSession();
        boolean boolean10 = atmosphereConfig5.isSessionTimeoutRemovalAllowed();
        boolean boolean11 = atmosphereConfig5.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = atmosphereConfig0.populate(atmosphereConfig5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        boolean boolean13 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = atmosphereConfig0.populate(atmosphereConfig8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = atmosphereConfig14.getWebServerName();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.destroy();
        atmosphereConfig13.initComplete();
        java.lang.String str20 = atmosphereConfig13.getInitParameter("hi!", "");
        boolean boolean21 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        atmosphereConfig13.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = atmosphereConfig0.populate(atmosphereConfig13);
        boolean boolean27 = atmosphereConfig13.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = atmosphereConfig13.getWebServerName();
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger6 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        boolean boolean18 = atmosphereConfig16.throwExceptionOnCloned;
        atmosphereConfig16.destroy();
        atmosphereConfig16.initComplete();
        atmosphereConfig16.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig16.framework();
        atmosphereConfig16.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig0.populate(atmosphereConfig16);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig16.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig28 = atmosphereConfig16.getServletConfig();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        boolean boolean36 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig1.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList3 = atmosphereConfig1.getshutdownHooks();
        boolean boolean6 = atmosphereConfig1.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig7 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig7.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig7.getshutdownHooks();
        atmosphereConfig7.setThrowExceptionOnCloned(false);
        java.lang.String str13 = atmosphereConfig7.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig7.properties;
        atmosphereConfig1.setproperties(strMap14);
        atmosphereConfig0.properties = strMap14;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList23 = atmosphereConfig21.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext25 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.destroy();
        atmosphereConfig13.initComplete();
        java.lang.String str20 = atmosphereConfig13.getInitParameter("hi!", "");
        boolean boolean21 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        atmosphereConfig13.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = atmosphereConfig0.populate(atmosphereConfig13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        org.slf4j.Logger logger9 = atmosphereConfig0.getlogger();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        int int10 = atmosphereConfig0.getInitParameter("hi!", 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        boolean boolean15 = atmosphereConfig0.supportSession;
        int int18 = atmosphereConfig0.getInitParameter("", 1);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory22 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        boolean boolean3 = atmosphereConfig0.supportSession;
        atmosphereConfig0.supportSession = false;
        boolean boolean6 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.setThrowExceptionOnCloned(false);
        java.lang.String str15 = atmosphereConfig9.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.properties;
        atmosphereConfig0.setproperties(strMap16);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig19.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        int int27 = atmosphereConfig23.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig23.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray29 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList30 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList30, startupHookArray29);
        atmosphereConfig23.startUpHook = startupHookList30;
        atmosphereConfig19.startUpHook = startupHookList30;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig19.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList34;
        java.lang.String str38 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean41 = atmosphereConfig0.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList42 = atmosphereConfig0.getshutdownHooks();
        int int45 = atmosphereConfig0.getInitParameter("hi!", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext46 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig8.properties;
        atmosphereConfig0.setproperties(strMap10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig12.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig12.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList14);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.supportSession = false;
        boolean boolean20 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList22 = atmosphereConfig9.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory23 = atmosphereConfig9.resourcesFactory();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        int int12 = atmosphereConfig0.getInitParameter("", 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig13 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        boolean boolean14 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.framework();
        boolean boolean16 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory17 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory3 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean17 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig4.getshutdownHooks();
        atmosphereConfig4.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig4.setshutdownHooks(shutdownHookList11);
        boolean boolean13 = atmosphereConfig4.isSessionTimeoutRemovalAllowed();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = atmosphereConfig0.populate(atmosphereConfig4);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig4.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap20 = atmosphereConfig4.handlers();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig15 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig15.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig15.getshutdownHooks();
        boolean boolean18 = atmosphereConfig15.isSupportSession();
        boolean boolean19 = atmosphereConfig15.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig15.properties();
        atmosphereConfig0.properties = strMap20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory22 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.atmosphereHandlerConfig;
        int int19 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster20 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        atmosphereConfig21.setSupportSession(false);
        boolean boolean24 = atmosphereConfig21.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig21.uuidProvider();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig0.setshutdownHooks((java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig15 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig15.getAtmosphereHandlerConfig();
        boolean boolean17 = atmosphereConfig15.throwExceptionOnCloned;
        atmosphereConfig15.destroy();
        atmosphereConfig15.initComplete();
        java.lang.String str22 = atmosphereConfig15.getInitParameter("hi!", "");
        boolean boolean23 = atmosphereConfig15.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig15.shutdownHooks;
        atmosphereConfig0.shutdownHooks = shutdownHookList24;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = atmosphereConfig0.properties;
        boolean boolean29 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider4 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        int int7 = atmosphereConfig3.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig3.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig3.framework();
        atmosphereConfig3.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        boolean boolean14 = atmosphereConfig12.throwExceptionOnCloned;
        atmosphereConfig12.setThrowExceptionOnCloned(false);
        boolean boolean17 = atmosphereConfig12.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig12.getproperties();
        atmosphereConfig3.setproperties(strMap18);
        atmosphereConfig3.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig3.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList21;
        boolean boolean23 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster24 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig12.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.properties();
        atmosphereConfig0.properties = strMap15;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList17 = atmosphereConfig0.getstartUpHook();
        java.lang.String str19 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        java.lang.String str19 = atmosphereConfig9.getInitParameter("hi!");
        boolean boolean20 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = atmosphereConfig0.populate(atmosphereConfig9);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext23 = atmosphereConfig21.getServletContext();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig13.throwExceptionOnCloned = false;
        atmosphereConfig13.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig13.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig13.initComplete();
        atmosphereConfig13.throwExceptionOnCloned = true;
        boolean boolean23 = atmosphereConfig13.isThrowExceptionOnCloned();
        int int26 = atmosphereConfig13.getInitParameter("", 10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig27 = atmosphereConfig0.populate(atmosphereConfig13);
        org.slf4j.Logger logger28 = atmosphereConfig27.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = atmosphereConfig27.getWebServerName();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList3 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.getframework();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean9 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.getshutdownHooks();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        boolean boolean13 = atmosphereConfig11.throwExceptionOnCloned;
        atmosphereConfig11.setThrowExceptionOnCloned(false);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig11.getproperties();
        atmosphereConfig0.setproperties(strMap17);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList21 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig11.getshutdownHooks();
        boolean boolean16 = atmosphereConfig11.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig17.getshutdownHooks();
        atmosphereConfig17.setThrowExceptionOnCloned(false);
        java.lang.String str23 = atmosphereConfig17.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig17.properties;
        atmosphereConfig11.setproperties(strMap24);
        atmosphereConfig10.properties = strMap24;
        atmosphereConfig0.setproperties(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig9.throwExceptionOnCloned;
        atmosphereConfig9.destroy();
        atmosphereConfig9.initComplete();
        java.lang.String str16 = atmosphereConfig9.getInitParameter("hi!", "");
        boolean boolean17 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        boolean boolean20 = atmosphereConfig9.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.getAtmosphereHandlerConfig();
        atmosphereConfig21.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        int int29 = atmosphereConfig25.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework30 = atmosphereConfig25.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray31 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList32 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList32, startupHookArray31);
        atmosphereConfig25.startUpHook = startupHookList32;
        atmosphereConfig21.startUpHook = startupHookList32;
        atmosphereConfig9.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList32);
        atmosphereConfig0.startUpHook = startupHookList32;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList38 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration40 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.getshutdownHooks();
        boolean boolean12 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext13 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean13 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        boolean boolean11 = atmosphereConfig0.throwExceptionOnCloned;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig8.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList22;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        int int29 = atmosphereConfig25.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework30 = atmosphereConfig25.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = atmosphereConfig25.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = atmosphereConfig25.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig33 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig33.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig33.properties;
        atmosphereConfig25.setproperties(strMap35);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig37 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList38 = atmosphereConfig37.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList39 = atmosphereConfig37.startUpHook;
        atmosphereConfig25.setstartUpHook(startupHookList39);
        atmosphereConfig25.supportSession = false;
        atmosphereConfig25.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig45 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList46 = atmosphereConfig45.getAtmosphereHandlerConfig();
        int int49 = atmosphereConfig45.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig45.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = atmosphereConfig45.properties();
        atmosphereConfig25.setproperties(strMap52);
        atmosphereConfig0.properties = strMap52;
        boolean boolean55 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap58 = atmosphereConfig0.handlers();
    }
}

