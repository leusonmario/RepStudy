import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
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
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.lang.String str17 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.getstartUpHook();
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.supportSession = true;
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.framework;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext18 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
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
        boolean boolean15 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        int int11 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        boolean boolean10 = atmosphereConfig8.throwExceptionOnCloned;
        atmosphereConfig8.destroy();
        atmosphereConfig8.initComplete();
        atmosphereConfig8.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig8.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig8.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig8.getframework();
        java.lang.String str20 = atmosphereConfig8.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList21 = atmosphereConfig8.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory23 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig0.getshutdownHooks();
        boolean boolean20 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig0.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig22.getshutdownHooks();
        boolean boolean27 = atmosphereConfig22.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig28 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList29 = atmosphereConfig28.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList30 = atmosphereConfig28.getshutdownHooks();
        atmosphereConfig28.setThrowExceptionOnCloned(false);
        java.lang.String str34 = atmosphereConfig28.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig28.properties;
        atmosphereConfig22.setproperties(strMap35);
        atmosphereConfig0.properties = strMap35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig38 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        org.atmosphere.util.UUIDProvider uUIDProvider16 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        boolean boolean13 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        atmosphereConfig4.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster26 = atmosphereConfig4.metaBroadcaster();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList16 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList19 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap20 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        boolean boolean20 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig0.properties();
        int int8 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.getshutdownHooks();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory10 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig10.startUpHook;
        boolean boolean12 = atmosphereConfig10.supportSession;
        org.slf4j.Logger logger13 = atmosphereConfig10.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig14.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList16 = atmosphereConfig14.getshutdownHooks();
        atmosphereConfig14.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig19.getshutdownHooks();
        atmosphereConfig14.setshutdownHooks(shutdownHookList21);
        boolean boolean23 = atmosphereConfig14.isSessionTimeoutRemovalAllowed();
        atmosphereConfig14.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig14.supportSession = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig28 = atmosphereConfig10.populate(atmosphereConfig14);
        org.slf4j.Logger logger29 = atmosphereConfig10.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig30 = atmosphereConfig0.populate(atmosphereConfig10);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
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
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory44 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
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
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        boolean boolean15 = atmosphereConfig13.throwExceptionOnCloned;
        atmosphereConfig13.destroy();
        atmosphereConfig13.initComplete();
        atmosphereConfig13.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig13.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig13.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig13.getframework();
        boolean boolean23 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        java.lang.String str25 = atmosphereConfig13.getInitParameter("hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList26 = atmosphereConfig13.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList26);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap29 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig21.getAtmosphereHandlerConfig();
        boolean boolean23 = atmosphereConfig21.throwExceptionOnCloned;
        atmosphereConfig21.destroy();
        atmosphereConfig21.initComplete();
        java.lang.String str28 = atmosphereConfig21.getInitParameter("hi!", "");
        boolean boolean29 = atmosphereConfig21.isSessionTimeoutRemovalAllowed();
        boolean boolean32 = atmosphereConfig21.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig33 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig33.getAtmosphereHandlerConfig();
        atmosphereConfig33.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig37 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList38 = atmosphereConfig37.getAtmosphereHandlerConfig();
        int int41 = atmosphereConfig37.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework42 = atmosphereConfig37.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray43 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList44 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList44, startupHookArray43);
        atmosphereConfig37.startUpHook = startupHookList44;
        atmosphereConfig33.startUpHook = startupHookList44;
        atmosphereConfig21.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList44);
        atmosphereConfig0.startUpHook = startupHookList44;
        boolean boolean50 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
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
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig24 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider3 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
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
        boolean boolean15 = atmosphereConfig0.supportSession;
        boolean boolean16 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig23.uuidProvider();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = atmosphereConfig0.getproperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.getproperties();
        int int6 = atmosphereConfig0.getInitParameter("", 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        boolean boolean40 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration43 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory20 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        int int12 = atmosphereConfig0.getInitParameter("", 97);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig14.startUpHook;
        org.slf4j.Logger logger16 = atmosphereConfig14.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        int int21 = atmosphereConfig17.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig17.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray23 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList24, startupHookArray23);
        atmosphereConfig17.startUpHook = startupHookList24;
        org.slf4j.Logger logger27 = atmosphereConfig17.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList28 = atmosphereConfig17.getshutdownHooks();
        atmosphereConfig17.destroy();
        atmosphereConfig17.supportSession = true;
        atmosphereConfig17.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig33 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList34 = atmosphereConfig33.getAtmosphereHandlerConfig();
        boolean boolean35 = atmosphereConfig33.throwExceptionOnCloned;
        atmosphereConfig33.destroy();
        atmosphereConfig33.initComplete();
        atmosphereConfig33.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework40 = atmosphereConfig33.framework();
        atmosphereConfig33.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig43 = atmosphereConfig17.populate(atmosphereConfig33);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList44 = atmosphereConfig33.getshutdownHooks();
        atmosphereConfig14.setshutdownHooks(shutdownHookList44);
        atmosphereConfig0.setshutdownHooks(shutdownHookList44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider47 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
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
        boolean boolean45 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext46 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setSupportSession(true);
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.supportSession;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean10 = atmosphereConfig0.supportSession;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider12 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig0.framework;
        boolean boolean15 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration20 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        atmosphereConfig13.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider26 = atmosphereConfig13.uuidProvider();
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        boolean boolean20 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList21 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext8 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        boolean boolean12 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.getframework();
        int int18 = atmosphereConfig0.getInitParameter("hi!", 35);
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext20 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig19 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList13 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework24 = atmosphereConfig21.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig21.uuidProvider();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.properties();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig22 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        org.slf4j.Logger logger9 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.getstartUpHook();
        boolean boolean11 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.framework;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        java.lang.String str9 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration23 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.properties;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean11 = atmosphereConfig0.supportSession;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig26.getBroadcasterFactory();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.lang.String str11 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.framework();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
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
        org.slf4j.Logger logger36 = atmosphereConfig0.getlogger();
        atmosphereConfig0.setSupportSession(false);
        boolean boolean39 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger40 = atmosphereConfig0.getlogger();
        int int43 = atmosphereConfig0.getInitParameter("", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext44 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
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
        boolean boolean13 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList4 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext20 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean16 = atmosphereConfig0.getInitParameter("hi!", true);
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig20 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray6 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList7, startupHookArray6);
        atmosphereConfig0.startUpHook = startupHookList7;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.framework();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        atmosphereConfig0.setSupportSession(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        int int12 = atmosphereConfig0.getInitParameter("", 100);
        boolean boolean13 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        int int26 = atmosphereConfig22.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework27 = atmosphereConfig22.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray28 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList29 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList29, startupHookArray28);
        atmosphereConfig22.startUpHook = startupHookList29;
        org.slf4j.Logger logger32 = atmosphereConfig22.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList33 = atmosphereConfig22.getshutdownHooks();
        atmosphereConfig22.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig22.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList36;
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList39 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList40 = atmosphereConfig0.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration42 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        atmosphereConfig0.initComplete();
        boolean boolean14 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster15 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
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
        boolean boolean21 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.config.AtmosphereHandlerConfig[] atmosphereHandlerConfigArray7 = new org.atmosphere.config.AtmosphereHandlerConfig[] {};
        java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = new java.util.ArrayList<org.atmosphere.config.AtmosphereHandlerConfig>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.config.AtmosphereHandlerConfig>) atmosphereHandlerConfigList8, atmosphereHandlerConfigArray7);
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList8;
        boolean boolean11 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean12 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        int int17 = atmosphereConfig13.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig13.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig13.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig13.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig13.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList21;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig0.properties;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger26 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider27 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework26 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList27 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider28 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setSupportSession(true);
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
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
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration23 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.shutdownHooks;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        atmosphereConfig5.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext15 = atmosphereConfig5.getServletContext();
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration19 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        boolean boolean14 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean7 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        boolean boolean13 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean14 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        java.lang.String str3 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean8 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList15 = atmosphereConfig13.getshutdownHooks();
        boolean boolean16 = atmosphereConfig13.isSupportSession();
        boolean boolean17 = atmosphereConfig13.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig18 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig18.getAtmosphereHandlerConfig();
        atmosphereConfig18.throwExceptionOnCloned = true;
        boolean boolean22 = atmosphereConfig18.isSupportSession();
        boolean boolean23 = atmosphereConfig18.isSessionTimeoutRemovalAllowed();
        boolean boolean24 = atmosphereConfig18.sessionTimeoutRemovalAllowed;
        boolean boolean25 = atmosphereConfig18.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList26 = atmosphereConfig18.shutdownHooks;
        atmosphereConfig13.setshutdownHooks(shutdownHookList26);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework28 = atmosphereConfig13.framework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList29 = atmosphereConfig13.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext31 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList26 = atmosphereConfig0.getshutdownHooks();
        boolean boolean27 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean28 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory29 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.initComplete();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
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
        boolean boolean14 = atmosphereConfig12.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig12.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig12.getInitParameterNames();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        org.slf4j.Logger logger9 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.getstartUpHook();
        boolean boolean11 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        boolean boolean14 = atmosphereConfig0.getInitParameter("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.framework;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList6 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }
}

