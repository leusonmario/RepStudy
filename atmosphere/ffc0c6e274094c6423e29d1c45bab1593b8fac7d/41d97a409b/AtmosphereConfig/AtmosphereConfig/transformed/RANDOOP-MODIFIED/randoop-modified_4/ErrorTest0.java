import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext4 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap2 = atmosphereConfig0.handlers();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster2 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig9.sessionFactory();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig1.uuidProvider();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory5 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext2 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster4 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig9.handlers();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration4 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig9.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig9.metaBroadcaster();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext6 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration4 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig1.getServletContext();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext3 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory3 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig2 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.useServletContextParameters = false;
        boolean boolean10 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider2 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.useServletContextParameters = false;
        boolean boolean8 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap5 = atmosphereConfig0.handlers();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig1.getInitParameterNames();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.lang.String str10 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster4 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory5 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        atmosphereConfig0.setuseServletContextParameters(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.supportSession;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap8 = atmosphereConfig0.handlers();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        int int6 = atmosphereConfig0.getInitParameter("", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig9.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig9.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig9.framework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig9.uuidProvider();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setuseServletContextParameters(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        org.slf4j.Logger logger4 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory5 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory23 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig9.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig9.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig9.framework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider4 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        atmosphereConfig0.setuseServletContextParameters(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration3 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory21 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider3 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        int int13 = atmosphereConfig9.getInitParameter("", 1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig14.startUpHook;
        java.lang.String str18 = atmosphereConfig14.getInitParameter("", "");
        boolean boolean19 = atmosphereConfig14.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig14.getstartUpHook();
        atmosphereConfig9.startUpHook = startupHookList20;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig9.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig9.handlers();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory4 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        atmosphereConfig0.setuseServletContextParameters(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework();
        boolean boolean4 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap5 = atmosphereConfig0.handlers();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        atmosphereConfig9.useServletContextParameters = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider2 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory5 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap8 = atmosphereConfig0.handlers();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        int int6 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        java.lang.String str9 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext2 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str13 = atmosphereConfig0.getInitParameter("", "hi!");
        java.lang.String str15 = atmosphereConfig0.getInitParameter("hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList16 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration17 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.useServletContextParameters = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap19 = atmosphereConfig0.handlers();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.getstartUpHook();
        boolean boolean7 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        java.lang.String str18 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory21 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig1.properties();
        boolean boolean16 = atmosphereConfig1.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig1.getServletContext();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext4 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        boolean boolean17 = atmosphereConfig0.getInitParameter("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider18 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        int int7 = atmosphereConfig0.getInitParameter("", (int) (byte) 1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig8.startUpHook;
        boolean boolean10 = atmosphereConfig8.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig8.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig8.startUpHook;
        atmosphereConfig0.startUpHook = startupHookList12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        boolean boolean13 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        atmosphereConfig9.useServletContextParameters = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig9.getServletContext();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap3 = atmosphereConfig0.handlers();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster3 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory5 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        int int6 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        java.lang.String str9 = atmosphereConfig0.getInitParameter("", "hi!");
        boolean boolean10 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig1.properties();
        org.slf4j.Logger logger16 = atmosphereConfig1.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap17 = atmosphereConfig1.handlers();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        boolean boolean13 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        atmosphereConfig9.throwExceptionOnCloned = true;
        org.slf4j.Logger logger16 = atmosphereConfig9.getlogger();
        atmosphereConfig9.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory19 = atmosphereConfig9.resourcesFactory();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig1.getBroadcasterFactory();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.slf4j.Logger logger6 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig1.properties();
        boolean boolean16 = atmosphereConfig1.isSupportSession();
        boolean boolean17 = atmosphereConfig1.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap18 = atmosphereConfig1.handlers();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.getstartUpHook();
        boolean boolean7 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray2 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList3, atmosphereHandlerConfigArray2);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration15 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider19 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        boolean boolean7 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap8 = atmosphereConfig0.handlers();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework();
        atmosphereConfig0.setuseServletContextParameters(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap5 = atmosphereConfig0.handlers();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        org.slf4j.Logger logger9 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = true;
        org.slf4j.Logger logger4 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig5 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider4 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        boolean boolean13 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        boolean boolean17 = atmosphereConfig0.getInitParameter("", false);
        boolean boolean20 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        boolean boolean13 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        atmosphereConfig9.throwExceptionOnCloned = true;
        org.slf4j.Logger logger16 = atmosphereConfig9.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider17 = atmosphereConfig9.uuidProvider();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster3 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        boolean boolean8 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig4 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig18.startUpHook;
        atmosphereConfig18.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray22 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList23, atmosphereHandlerConfigArray22);
        atmosphereConfig18.atmosphereHandlerConfig = atmosphereHandlerConfigList23;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig17.populate(atmosphereConfig18);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList27 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.lang.String str30 = atmosphereConfig17.getInitParameter("", "hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig31 = atmosphereConfig0.populate(atmosphereConfig17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig32 = atmosphereConfig17.getServletConfig();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        org.slf4j.Logger logger4 = atmosphereConfig0.getlogger();
        boolean boolean5 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.useServletContextParameters;
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList15 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider16 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        boolean boolean13 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        atmosphereConfig9.throwExceptionOnCloned = true;
        atmosphereConfig9.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig9.getInitParameterNames();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider5 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        int int9 = atmosphereConfig0.getInitParameter("", 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.destroy();
        int int8 = atmosphereConfig0.getInitParameter("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig1.properties();
        boolean boolean16 = atmosphereConfig1.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig1.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap18 = atmosphereConfig1.handlers();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory4 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration3 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.setSupportSession(true);
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig14.startUpHook;
        atmosphereConfig14.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray18 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList19, atmosphereHandlerConfigArray18);
        atmosphereConfig14.atmosphereHandlerConfig = atmosphereHandlerConfigList19;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = atmosphereConfig13.populate(atmosphereConfig14);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig22.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig22.atmosphereHandlerConfig;
        atmosphereConfig9.atmosphereHandlerConfig = atmosphereHandlerConfigList24;
        boolean boolean26 = atmosphereConfig9.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        int int7 = atmosphereConfig0.getInitParameter("", (int) (byte) 1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig8.startUpHook;
        boolean boolean10 = atmosphereConfig8.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig8.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig8.startUpHook;
        atmosphereConfig0.startUpHook = startupHookList12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        boolean boolean13 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig9.getServletConfig();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory4 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        boolean boolean4 = atmosphereConfig0.getuseServletContextParameters();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        boolean boolean12 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean13 = atmosphereConfig0.getuseServletContextParameters();
        boolean boolean14 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework();
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.destroy();
        boolean boolean16 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory18 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig9.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig13.startUpHook;
        boolean boolean15 = atmosphereConfig13.sessionTimeoutRemovalAllowed;
        boolean boolean16 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig13.getAtmosphereHandlerConfig();
        atmosphereConfig9.atmosphereHandlerConfig = atmosphereHandlerConfigList17;
        boolean boolean19 = atmosphereConfig9.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig20 = atmosphereConfig9.getServletConfig();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.useServletContextParameters = false;
        boolean boolean10 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str3 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.setuseServletContextParameters(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory5 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.getproperties();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        boolean boolean4 = atmosphereConfig0.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster16 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig9.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig9.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig9.framework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = atmosphereConfig0.populate(atmosphereConfig9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory14 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap8 = atmosphereConfig0.handlers();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration5 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        java.lang.String str13 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        boolean boolean12 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean13 = atmosphereConfig0.getuseServletContextParameters();
        boolean boolean14 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider15 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        int int3 = atmosphereConfig0.getInitParameter("", (int) 'a');
        boolean boolean4 = atmosphereConfig0.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig1.sessionFactory();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean9 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean10 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        boolean boolean13 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig4 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig0.framework;
        boolean boolean22 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext23 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext6 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.useServletContextParameters;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 35);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster16 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        boolean boolean11 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        boolean boolean12 = atmosphereConfig9.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig9.handlers();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.destroy();
        boolean boolean16 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap18 = atmosphereConfig0.handlers();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        boolean boolean5 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig14.startUpHook;
        boolean boolean16 = atmosphereConfig14.sessionTimeoutRemovalAllowed;
        java.lang.String str18 = atmosphereConfig14.getInitParameter("");
        atmosphereConfig14.throwExceptionOnCloned = false;
        atmosphereConfig14.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig14.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList23;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory26 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean5 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.useServletContextParameters;
        boolean boolean8 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        boolean boolean8 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig1.properties();
        boolean boolean16 = atmosphereConfig1.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig1.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory18 = atmosphereConfig1.sessionFactory();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        atmosphereConfig0.throwExceptionOnCloned = true;
        atmosphereConfig0.destroy();
        boolean boolean8 = atmosphereConfig0.getuseServletContextParameters();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig9.startUpHook;
        boolean boolean11 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig9.framework;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig9.getproperties();
        atmosphereConfig0.properties = strMap13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setuseServletContextParameters(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig9.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        java.lang.String str13 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.setuseServletContextParameters(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.useServletContextParameters = true;
        boolean boolean9 = atmosphereConfig0.getuseServletContextParameters();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig11.startUpHook;
        atmosphereConfig11.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray15 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList16, atmosphereHandlerConfigArray15);
        atmosphereConfig11.atmosphereHandlerConfig = atmosphereHandlerConfigList16;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = atmosphereConfig10.populate(atmosphereConfig11);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig10.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider22 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        boolean boolean3 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean9 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setuseServletContextParameters(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean6 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.supportSession;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str15 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        int int7 = atmosphereConfig0.getInitParameter("", (int) (short) 10);
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig4 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.getuseServletContextParameters();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean7 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        boolean boolean4 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider5 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        int int6 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        int int6 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        int int11 = atmosphereConfig0.getInitParameter("", (int) (short) -1);
        boolean boolean14 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig0.properties();
        atmosphereConfig0.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.lang.String str10 = atmosphereConfig0.getInitParameter("", "hi!");
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList3 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList3 = atmosphereConfig0.getstartUpHook();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.getframework();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.getproperties();
        boolean boolean10 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster16 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.useServletContextParameters = false;
        boolean boolean10 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig9.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig9.metaBroadcaster();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        boolean boolean3 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.destroy();
        boolean boolean16 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster17 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig7 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.supportSession = false;
        int int14 = atmosphereConfig0.getInitParameter("hi!", 0);
        atmosphereConfig0.useServletContextParameters = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext18 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = false;
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.useServletContextParameters = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        atmosphereConfig0.setuseServletContextParameters(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.useServletContextParameters = false;
        atmosphereConfig0.initComplete();
        boolean boolean14 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration15 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        boolean boolean10 = atmosphereConfig1.useServletContextParameters;
        org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] shutdownHookArray11 = new org.atmosphere.cpr.AtmosphereConfig.ShutdownHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook>) shutdownHookList12, shutdownHookArray11);
        atmosphereConfig1.shutdownHooks = shutdownHookList12;
        boolean boolean15 = atmosphereConfig1.isSessionTimeoutRemovalAllowed();
        boolean boolean16 = atmosphereConfig1.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration17 = atmosphereConfig1.getInitParameterNames();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.useServletContextParameters = false;
        boolean boolean8 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.setuseServletContextParameters(true);
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        int int6 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray2 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList3, atmosphereHandlerConfigArray2);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList3;
        boolean boolean6 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory19 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.throwExceptionOnCloned = false;
        boolean boolean10 = atmosphereConfig0.getInitParameter("", false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.lang.String str10 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.initComplete();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        int int7 = atmosphereConfig0.getInitParameter("", (int) (byte) 1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig8.startUpHook;
        boolean boolean10 = atmosphereConfig8.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig8.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig8.startUpHook;
        atmosphereConfig0.startUpHook = startupHookList12;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.getstartUpHook();
        int int9 = atmosphereConfig0.getInitParameter("hi!", 0);
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        boolean boolean13 = atmosphereConfig0.getuseServletContextParameters();
        int int16 = atmosphereConfig0.getInitParameter("hi!", (int) (short) -1);
        boolean boolean19 = atmosphereConfig0.getInitParameter("hi!", false);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        boolean boolean11 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        boolean boolean12 = atmosphereConfig9.isThrowExceptionOnCloned();
        atmosphereConfig9.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory3 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList3 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.shutdownHooks;
        boolean boolean8 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.getproperties();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.startUpHook;
        boolean boolean16 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        boolean boolean11 = atmosphereConfig9.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory12 = atmosphereConfig9.resourcesFactory();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig10.sessionTimeoutRemovalAllowed = false;
        java.lang.String str20 = atmosphereConfig10.getInitParameter("", "");
        java.lang.String str23 = atmosphereConfig10.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig10.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = atmosphereConfig0.populate(atmosphereConfig10);
        boolean boolean26 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig9.getframework();
        boolean boolean11 = atmosphereConfig9.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig9.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig9.resourcesFactory();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        boolean boolean5 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean3 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        org.slf4j.Logger logger4 = atmosphereConfig0.getlogger();
        boolean boolean5 = atmosphereConfig0.throwExceptionOnCloned;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        int int5 = atmosphereConfig0.getInitParameter("hi!", 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        boolean boolean8 = atmosphereConfig0.getuseServletContextParameters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster6 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster5 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        int int9 = atmosphereConfig0.getInitParameter("", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList9 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.lang.String str10 = atmosphereConfig0.getInitParameter("", "hi!");
        int int13 = atmosphereConfig0.getInitParameter("", 32);
        boolean boolean14 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        boolean boolean8 = atmosphereConfig0.supportSession;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig4.startUpHook;
        boolean boolean6 = atmosphereConfig4.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig4.properties();
        atmosphereConfig4.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig4.useServletContextParameters = false;
        boolean boolean12 = atmosphereConfig4.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig4.properties();
        atmosphereConfig0.properties = strMap13;
        boolean boolean17 = atmosphereConfig0.getInitParameter("", false);
        boolean boolean18 = atmosphereConfig0.useServletContextParameters;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory19 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.getuseServletContextParameters();
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray4 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList5, atmosphereHandlerConfigArray4);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList5;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        int int17 = atmosphereConfig14.getInitParameter("", (int) 'a');
        boolean boolean18 = atmosphereConfig14.getuseServletContextParameters();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig14.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList19);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap22 = atmosphereConfig0.handlers();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList19 = atmosphereConfig18.startUpHook;
        atmosphereConfig18.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray22 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList23, atmosphereHandlerConfigArray22);
        atmosphereConfig18.atmosphereHandlerConfig = atmosphereHandlerConfigList23;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = atmosphereConfig17.populate(atmosphereConfig18);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList27 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.lang.String str30 = atmosphereConfig17.getInitParameter("", "hi!");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig31 = atmosphereConfig0.populate(atmosphereConfig17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = atmosphereConfig31.getWebServerName();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework4 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        java.lang.String str14 = atmosphereConfig10.getInitParameter("", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig10.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList15;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig0.properties();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap20 = atmosphereConfig0.handlers();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext6 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        atmosphereConfig0.setuseServletContextParameters(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.useServletContextParameters = true;
        boolean boolean9 = atmosphereConfig0.getuseServletContextParameters();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig11.startUpHook;
        atmosphereConfig11.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray15 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList16, atmosphereHandlerConfigArray15);
        atmosphereConfig11.atmosphereHandlerConfig = atmosphereHandlerConfigList16;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = atmosphereConfig10.populate(atmosphereConfig11);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig10.getstartUpHook();
        atmosphereConfig0.startUpHook = startupHookList20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        atmosphereConfig0.supportSession = false;
        boolean boolean10 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean9 = atmosphereConfig0.useServletContextParameters;
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig1 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig1.startUpHook;
        atmosphereConfig1.throwExceptionOnCloned = true;
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray5 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList6, atmosphereHandlerConfigArray5);
        atmosphereConfig1.atmosphereHandlerConfig = atmosphereHandlerConfigList6;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = atmosphereConfig0.populate(atmosphereConfig1);
        org.slf4j.Logger logger10 = atmosphereConfig9.getlogger();
        boolean boolean11 = atmosphereConfig9.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig9.getshutdownHooks();
        atmosphereConfig9.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig9.properties;
        java.lang.String str17 = atmosphereConfig9.getInitParameter("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory18 = atmosphereConfig9.getBroadcasterFactory();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.getuseServletContextParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.lang.String str4 = atmosphereConfig0.getInitParameter("", "");
        boolean boolean5 = atmosphereConfig0.useServletContextParameters;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster2 = atmosphereConfig0.metaBroadcaster();
    }
}

