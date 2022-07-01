import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
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
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        boolean boolean16 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        int int19 = atmosphereConfig0.getInitParameter("", (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory18 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
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
        boolean boolean16 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster19 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.getshutdownHooks();
        boolean boolean14 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory23 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
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
        boolean boolean14 = atmosphereConfig0.isSupportSession();
        java.lang.String str16 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory20 = atmosphereConfig4.getBroadcasterFactory();
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory16 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig6.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig6.handlers();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig6 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
        atmosphereConfig0.supportSession = true;
        int int18 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap19 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
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
        atmosphereConfig14.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig14.getWebServerName();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
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
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap20 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
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
        java.lang.String str25 = atmosphereConfig23.getWebServerName();
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory7 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory12 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig20.getAtmosphereHandlerConfig();
        atmosphereConfig20.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig20.initComplete();
        atmosphereConfig20.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig30 = atmosphereConfig0.populate(atmosphereConfig20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider31 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        atmosphereConfig19.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider21 = atmosphereConfig19.uuidProvider();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        java.lang.String str13 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.lang.String str15 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
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
        javax.servlet.ServletConfig servletConfig25 = atmosphereConfig21.getServletConfig();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory19 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory20 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
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
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory22 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
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
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory10 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
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
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory18 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap6 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig5.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider14 = atmosphereConfig5.uuidProvider();
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster24 = atmosphereConfig23.metaBroadcaster();
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.getshutdownHooks();
        boolean boolean9 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
        atmosphereConfig19.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster22 = atmosphereConfig19.metaBroadcaster();
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
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
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
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
        boolean boolean20 = atmosphereConfig6.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider21 = atmosphereConfig6.uuidProvider();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.properties;
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory19 = atmosphereConfig18.resourcesFactory();
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory24 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
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
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory17 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory30 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        boolean boolean25 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory26 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        int int7 = atmosphereConfig3.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig3.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray9 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList10, startupHookArray9);
        atmosphereConfig3.startUpHook = startupHookList10;
        org.slf4j.Logger logger13 = atmosphereConfig3.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig3.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider19 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        boolean boolean3 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean4 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        int int24 = atmosphereConfig20.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig20.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = atmosphereConfig20.properties();
        atmosphereConfig0.setproperties(strMap27);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework29 = atmosphereConfig0.getframework();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration32 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap4 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster31 = atmosphereConfig21.metaBroadcaster();
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        java.lang.String str13 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory14 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList15 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig6.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig6.getWebServerName();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider9 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
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
        boolean boolean18 = atmosphereConfig0.getInitParameter("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext19 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory11 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework39 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework40 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework42 = atmosphereConfig0.getframework();
        boolean boolean43 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster44 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
        boolean boolean13 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory3 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory6 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext26 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration15 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig20.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList25;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory27 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework39 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider40 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
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
        boolean boolean24 = atmosphereConfig21.sessionTimeoutRemovalAllowed;
        atmosphereConfig21.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig21.getBroadcasterFactory();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext18 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
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
        org.slf4j.Logger logger23 = atmosphereConfig9.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig24 = atmosphereConfig9.getServletConfig();
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
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
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList42 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider45 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
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
        javax.servlet.ServletConfig servletConfig24 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = true;
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.slf4j.Logger logger12 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        boolean boolean9 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.destroy();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig20.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList25;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap28 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig10.getshutdownHooks();
        boolean boolean15 = atmosphereConfig10.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList18 = atmosphereConfig16.getshutdownHooks();
        atmosphereConfig16.setThrowExceptionOnCloned(false);
        java.lang.String str22 = atmosphereConfig16.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig16.properties;
        atmosphereConfig10.setproperties(strMap23);
        atmosphereConfig9.properties = strMap23;
        atmosphereConfig9.setSupportSession(false);
        atmosphereConfig9.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig30 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList31 = atmosphereConfig30.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig30.getshutdownHooks();
        atmosphereConfig9.shutdownHooks = shutdownHookList32;
        atmosphereConfig0.setshutdownHooks(shutdownHookList32);
        boolean boolean35 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory36 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
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
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
        boolean boolean16 = atmosphereConfig0.supportSession;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory18 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap5 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster24 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory39 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
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
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig20.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList25;
        boolean boolean27 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory33 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        boolean boolean7 = atmosphereConfig0.getInitParameter("hi!", true);
        boolean boolean8 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean9 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
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
        boolean boolean31 = atmosphereConfig10.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext32 = atmosphereConfig10.getServletContext();
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig8.getshutdownHooks();
        boolean boolean13 = atmosphereConfig8.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig14 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig14.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList16 = atmosphereConfig14.getshutdownHooks();
        atmosphereConfig14.setThrowExceptionOnCloned(false);
        java.lang.String str20 = atmosphereConfig14.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig14.properties;
        atmosphereConfig8.setproperties(strMap21);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig8.properties;
        atmosphereConfig0.properties = strMap23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap25 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("", "hi!");
        java.lang.String str15 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration17 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory4 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.getstartUpHook();
        boolean boolean6 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
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
        boolean boolean18 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean19 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean22 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext23 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        int int15 = atmosphereConfig11.getInitParameter("hi!", (int) (short) 0);
        boolean boolean16 = atmosphereConfig11.isSupportSession();
        atmosphereConfig11.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig19.getshutdownHooks();
        boolean boolean24 = atmosphereConfig19.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig25 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList26 = atmosphereConfig25.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList27 = atmosphereConfig25.getshutdownHooks();
        atmosphereConfig25.setThrowExceptionOnCloned(false);
        java.lang.String str31 = atmosphereConfig25.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = atmosphereConfig25.properties;
        atmosphereConfig19.setproperties(strMap32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = atmosphereConfig19.properties;
        atmosphereConfig11.properties = strMap34;
        atmosphereConfig0.properties = strMap34;
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration38 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
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
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig0.atmosphereHandlerConfig;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration19 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory10 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory9 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        javax.servlet.ServletContext servletContext36 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap40 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig20.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList25;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider29 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList28 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList31 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration32 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider7 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster30 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
        atmosphereConfig14.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig14.framework();
        atmosphereConfig14.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig14.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory20 = atmosphereConfig14.resourcesFactory();
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
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
        javax.servlet.ServletConfig servletConfig22 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
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
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext9 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean4 = atmosphereConfig3.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig3.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        boolean boolean8 = atmosphereConfig6.throwExceptionOnCloned;
        atmosphereConfig6.destroy();
        atmosphereConfig6.initComplete();
        java.lang.String str13 = atmosphereConfig6.getInitParameter("hi!", "");
        boolean boolean14 = atmosphereConfig6.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig15 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList16 = atmosphereConfig15.getAtmosphereHandlerConfig();
        boolean boolean17 = atmosphereConfig15.throwExceptionOnCloned;
        atmosphereConfig15.destroy();
        atmosphereConfig15.initComplete();
        atmosphereConfig15.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig15.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig15.atmosphereHandlerConfig;
        atmosphereConfig6.atmosphereHandlerConfig = atmosphereHandlerConfigList23;
        atmosphereConfig3.atmosphereHandlerConfig = atmosphereHandlerConfigList23;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig26 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList27 = atmosphereConfig26.getAtmosphereHandlerConfig();
        boolean boolean28 = atmosphereConfig26.throwExceptionOnCloned;
        atmosphereConfig26.destroy();
        atmosphereConfig26.initComplete();
        java.lang.String str33 = atmosphereConfig26.getInitParameter("hi!", "");
        boolean boolean34 = atmosphereConfig26.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig35 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList36 = atmosphereConfig35.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList37 = atmosphereConfig35.getshutdownHooks();
        atmosphereConfig35.setThrowExceptionOnCloned(false);
        java.lang.String str41 = atmosphereConfig35.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = atmosphereConfig35.properties;
        atmosphereConfig26.setproperties(strMap42);
        atmosphereConfig3.setproperties(strMap42);
        atmosphereConfig0.properties = strMap42;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory46 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration25 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
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
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider16 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        boolean boolean5 = atmosphereConfig3.throwExceptionOnCloned;
        atmosphereConfig3.destroy();
        atmosphereConfig3.initComplete();
        java.lang.String str10 = atmosphereConfig3.getInitParameter("hi!", "");
        boolean boolean11 = atmosphereConfig3.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        boolean boolean14 = atmosphereConfig12.throwExceptionOnCloned;
        atmosphereConfig12.destroy();
        atmosphereConfig12.initComplete();
        atmosphereConfig12.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig12.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig12.atmosphereHandlerConfig;
        atmosphereConfig3.atmosphereHandlerConfig = atmosphereHandlerConfigList20;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList20;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        boolean boolean25 = atmosphereConfig23.throwExceptionOnCloned;
        atmosphereConfig23.destroy();
        atmosphereConfig23.initComplete();
        java.lang.String str30 = atmosphereConfig23.getInitParameter("hi!", "");
        boolean boolean31 = atmosphereConfig23.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig32 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList33 = atmosphereConfig32.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList34 = atmosphereConfig32.getshutdownHooks();
        atmosphereConfig32.setThrowExceptionOnCloned(false);
        java.lang.String str38 = atmosphereConfig32.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = atmosphereConfig32.properties;
        atmosphereConfig23.setproperties(strMap39);
        atmosphereConfig0.setproperties(strMap39);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig42 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList43 = atmosphereConfig42.getAtmosphereHandlerConfig();
        int int46 = atmosphereConfig42.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig42.supportSession = false;
        boolean boolean49 = atmosphereConfig42.isSessionTimeoutRemovalAllowed();
        atmosphereConfig42.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig51 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList52 = atmosphereConfig51.getAtmosphereHandlerConfig();
        boolean boolean53 = atmosphereConfig51.throwExceptionOnCloned;
        atmosphereConfig51.destroy();
        atmosphereConfig51.initComplete();
        java.lang.String str58 = atmosphereConfig51.getInitParameter("hi!", "");
        boolean boolean59 = atmosphereConfig51.isSessionTimeoutRemovalAllowed();
        boolean boolean62 = atmosphereConfig51.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig63 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList64 = atmosphereConfig63.getAtmosphereHandlerConfig();
        atmosphereConfig63.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig67 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList68 = atmosphereConfig67.getAtmosphereHandlerConfig();
        int int71 = atmosphereConfig67.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework72 = atmosphereConfig67.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray73 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList74 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList74, startupHookArray73);
        atmosphereConfig67.startUpHook = startupHookList74;
        atmosphereConfig63.startUpHook = startupHookList74;
        atmosphereConfig51.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList74);
        atmosphereConfig42.startUpHook = startupHookList74;
        atmosphereConfig0.startUpHook = startupHookList74;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext81 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory23 = atmosphereConfig21.sessionFactory();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory31 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory55 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster26 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList42 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList45 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean13 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory14 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
        java.lang.String str23 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap24 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig10.getshutdownHooks();
        boolean boolean15 = atmosphereConfig10.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig16.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList18 = atmosphereConfig16.getshutdownHooks();
        atmosphereConfig16.setThrowExceptionOnCloned(false);
        java.lang.String str22 = atmosphereConfig16.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig16.properties;
        atmosphereConfig10.setproperties(strMap23);
        atmosphereConfig9.properties = strMap23;
        atmosphereConfig9.setSupportSession(false);
        atmosphereConfig9.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig30 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList31 = atmosphereConfig30.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig30.getshutdownHooks();
        atmosphereConfig9.shutdownHooks = shutdownHookList32;
        atmosphereConfig0.setshutdownHooks(shutdownHookList32);
        boolean boolean35 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster37 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
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
        boolean boolean31 = atmosphereConfig10.throwExceptionOnCloned;
        atmosphereConfig10.throwExceptionOnCloned = true;
        java.lang.String str35 = atmosphereConfig10.getInitParameter("");
        boolean boolean36 = atmosphereConfig10.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider37 = atmosphereConfig10.uuidProvider();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
        boolean boolean15 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
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
        org.atmosphere.util.UUIDProvider uUIDProvider20 = atmosphereConfig6.uuidProvider();
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig38 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList39 = atmosphereConfig38.getAtmosphereHandlerConfig();
        atmosphereConfig38.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig42 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList43 = atmosphereConfig42.getAtmosphereHandlerConfig();
        int int46 = atmosphereConfig42.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework47 = atmosphereConfig42.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray48 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList49 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList49, startupHookArray48);
        atmosphereConfig42.startUpHook = startupHookList49;
        atmosphereConfig38.startUpHook = startupHookList49;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList53 = atmosphereConfig38.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList54 = atmosphereConfig38.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig55 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = atmosphereConfig55.getproperties();
        atmosphereConfig38.setproperties(strMap56);
        atmosphereConfig0.properties = strMap56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster59 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList21 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory22 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
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
        java.lang.String str19 = atmosphereConfig0.getInitParameter("");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig0.framework;
        boolean boolean21 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig5 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList6 = atmosphereConfig5.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig5.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList7);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider5 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
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
        boolean boolean14 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster14 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        org.slf4j.Logger logger2 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        int int7 = atmosphereConfig3.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig3.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray9 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList10, startupHookArray9);
        atmosphereConfig3.startUpHook = startupHookList10;
        org.slf4j.Logger logger13 = atmosphereConfig3.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig3.getshutdownHooks();
        atmosphereConfig3.destroy();
        atmosphereConfig3.supportSession = true;
        atmosphereConfig3.initComplete();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig19 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig19.getAtmosphereHandlerConfig();
        boolean boolean21 = atmosphereConfig19.throwExceptionOnCloned;
        atmosphereConfig19.destroy();
        atmosphereConfig19.initComplete();
        atmosphereConfig19.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework26 = atmosphereConfig19.framework();
        atmosphereConfig19.setSupportSession(true);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig29 = atmosphereConfig3.populate(atmosphereConfig19);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList30 = atmosphereConfig19.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider33 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
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
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster29 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
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
        javax.servlet.ServletConfig servletConfig20 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
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
        atmosphereConfig4.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext21 = atmosphereConfig4.getServletContext();
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig18 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig10.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig10.properties();
        atmosphereConfig0.setproperties(strMap13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig15 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList22 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster23 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig13 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
        boolean boolean22 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster23 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster19 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration23 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap21 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext19 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
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
        org.slf4j.Logger logger18 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext19 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory11 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        boolean boolean7 = atmosphereConfig0.getInitParameter("hi!", true);
        java.lang.String str9 = atmosphereConfig0.getInitParameter("");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
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
        boolean boolean16 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        int int19 = atmosphereConfig0.getInitParameter("", (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory20 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
        boolean boolean18 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean19 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean22 = atmosphereConfig0.getInitParameter("hi!", true);
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider25 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        boolean boolean16 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory17 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        boolean boolean12 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
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
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig24 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        atmosphereConfig10.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig10.getBroadcasterFactory();
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster7 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.getproperties();
        boolean boolean4 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider5 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
        org.slf4j.Logger logger25 = atmosphereConfig21.getlogger();
        boolean boolean26 = atmosphereConfig21.throwExceptionOnCloned;
        atmosphereConfig21.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory29 = atmosphereConfig21.resourcesFactory();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList2 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig3 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig3.getAtmosphereHandlerConfig();
        boolean boolean5 = atmosphereConfig3.throwExceptionOnCloned;
        atmosphereConfig3.destroy();
        atmosphereConfig3.initComplete();
        java.lang.String str10 = atmosphereConfig3.getInitParameter("hi!", "");
        boolean boolean11 = atmosphereConfig3.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        boolean boolean14 = atmosphereConfig12.throwExceptionOnCloned;
        atmosphereConfig12.destroy();
        atmosphereConfig12.initComplete();
        atmosphereConfig12.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig12.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig12.atmosphereHandlerConfig;
        atmosphereConfig3.atmosphereHandlerConfig = atmosphereHandlerConfigList20;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList20;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        boolean boolean25 = atmosphereConfig23.throwExceptionOnCloned;
        atmosphereConfig23.destroy();
        atmosphereConfig23.initComplete();
        java.lang.String str30 = atmosphereConfig23.getInitParameter("hi!", "");
        boolean boolean31 = atmosphereConfig23.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig32 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList33 = atmosphereConfig32.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList34 = atmosphereConfig32.getshutdownHooks();
        atmosphereConfig32.setThrowExceptionOnCloned(false);
        java.lang.String str38 = atmosphereConfig32.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = atmosphereConfig32.properties;
        atmosphereConfig23.setproperties(strMap39);
        atmosphereConfig0.setproperties(strMap39);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig42 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList43 = atmosphereConfig42.getAtmosphereHandlerConfig();
        int int46 = atmosphereConfig42.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig42.supportSession = false;
        boolean boolean49 = atmosphereConfig42.isSessionTimeoutRemovalAllowed();
        atmosphereConfig42.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig51 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList52 = atmosphereConfig51.getAtmosphereHandlerConfig();
        boolean boolean53 = atmosphereConfig51.throwExceptionOnCloned;
        atmosphereConfig51.destroy();
        atmosphereConfig51.initComplete();
        java.lang.String str58 = atmosphereConfig51.getInitParameter("hi!", "");
        boolean boolean59 = atmosphereConfig51.isSessionTimeoutRemovalAllowed();
        boolean boolean62 = atmosphereConfig51.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig63 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList64 = atmosphereConfig63.getAtmosphereHandlerConfig();
        atmosphereConfig63.throwExceptionOnCloned = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig67 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList68 = atmosphereConfig67.getAtmosphereHandlerConfig();
        int int71 = atmosphereConfig67.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework72 = atmosphereConfig67.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray73 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList74 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList74, startupHookArray73);
        atmosphereConfig67.startUpHook = startupHookList74;
        atmosphereConfig63.startUpHook = startupHookList74;
        atmosphereConfig51.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList74);
        atmosphereConfig42.startUpHook = startupHookList74;
        atmosphereConfig0.startUpHook = startupHookList74;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap81 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList33 = atmosphereConfig10.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory34 = atmosphereConfig10.resourcesFactory();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
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
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory22 = atmosphereConfig21.getBroadcasterFactory();
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory25 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
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
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int21 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 10);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig22.getshutdownHooks();
        boolean boolean27 = atmosphereConfig22.getInitParameter("", true);
        boolean boolean28 = atmosphereConfig22.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig29 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList30 = atmosphereConfig29.getAtmosphereHandlerConfig();
        atmosphereConfig29.throwExceptionOnCloned = true;
        boolean boolean33 = atmosphereConfig29.isSupportSession();
        boolean boolean34 = atmosphereConfig29.isSessionTimeoutRemovalAllowed();
        boolean boolean35 = atmosphereConfig29.sessionTimeoutRemovalAllowed;
        boolean boolean36 = atmosphereConfig29.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList37 = atmosphereConfig29.shutdownHooks;
        atmosphereConfig29.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = atmosphereConfig29.properties();
        atmosphereConfig22.setproperties(strMap40);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList42 = atmosphereConfig22.startUpHook;
        atmosphereConfig0.setstartUpHook(startupHookList42);
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory45 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("");
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean8 = atmosphereConfig0.getInitParameter("hi!", false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList20 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration22 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory10 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
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
        boolean boolean14 = atmosphereConfig0.supportSession;
        java.lang.String str17 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory18 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework15 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSupportSession(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        int int12 = atmosphereConfig8.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig8.supportSession = false;
        boolean boolean15 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        atmosphereConfig8.destroy();
        java.lang.String str18 = atmosphereConfig8.getInitParameter("");
        atmosphereConfig8.supportSession = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig8.shutdownHooks;
        boolean boolean22 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework23 = atmosphereConfig8.framework();
        boolean boolean24 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig8.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList25;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory27 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
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
        boolean boolean23 = atmosphereConfig11.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        atmosphereConfig24.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework31 = atmosphereConfig24.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList32 = atmosphereConfig24.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework33 = atmosphereConfig24.getframework();
        boolean boolean34 = atmosphereConfig24.isSessionTimeoutRemovalAllowed();
        java.lang.String str36 = atmosphereConfig24.getInitParameter("hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList37 = atmosphereConfig24.startUpHook;
        atmosphereConfig11.setstartUpHook(startupHookList37);
        atmosphereConfig0.startUpHook = startupHookList37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider40 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList20 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider21 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster8 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        atmosphereConfig0.setSupportSession(true);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.getproperties();
        boolean boolean9 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties();
        boolean boolean15 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext16 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext14 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory20 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster22 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
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
        atmosphereConfig0.supportSession = true;
        int int18 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 1);
        boolean boolean19 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap21 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig19 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean11 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
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
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
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
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig0.properties;
        boolean boolean17 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory18 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework();
        boolean boolean12 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig13 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster3 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.destroy();
        java.lang.String str9 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
        boolean boolean22 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig23 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework21 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
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
        java.util.Enumeration<java.lang.String> strEnumeration46 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
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
        atmosphereConfig0.setstartUpHook(startupHookList28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider31 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.framework;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        int int9 = atmosphereConfig0.getInitParameter("", (int) (byte) 0);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory20 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.startUpHook;
        java.lang.String str12 = atmosphereConfig0.getInitParameter("hi!");
        int int15 = atmosphereConfig0.getInitParameter("", 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig8 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
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
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList5 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider6 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
        boolean boolean21 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework22 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration23 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
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
        java.lang.String str22 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
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
        org.slf4j.Logger logger30 = atmosphereConfig21.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig31 = atmosphereConfig21.getServletConfig();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        int int17 = atmosphereConfig13.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig13.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig13.framework();
        boolean boolean21 = atmosphereConfig13.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList22 = atmosphereConfig13.atmosphereHandlerConfig;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig13.getproperties();
        atmosphereConfig0.setproperties(strMap23);
        boolean boolean25 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration26 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
        java.lang.String str15 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig16 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig11 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig11.getAtmosphereHandlerConfig();
        int int15 = atmosphereConfig11.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig11.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig11.framework();
        atmosphereConfig11.initComplete();
        atmosphereConfig11.destroy();
        atmosphereConfig11.sessionTimeoutRemovalAllowed = false;
        boolean boolean23 = atmosphereConfig11.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig11.properties();
        atmosphereConfig0.setproperties(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster26 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
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
        int int23 = atmosphereConfig0.getInitParameter("", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory24 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
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
        boolean boolean19 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory20 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig23 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig56 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList57 = atmosphereConfig56.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList58 = atmosphereConfig56.getshutdownHooks();
        boolean boolean59 = atmosphereConfig56.isSupportSession();
        boolean boolean60 = atmosphereConfig56.supportSession;
        atmosphereConfig56.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList63 = atmosphereConfig56.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList64 = atmosphereConfig56.getshutdownHooks();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList65 = atmosphereConfig56.startUpHook;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList66 = atmosphereConfig56.getAtmosphereHandlerConfig();
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList66;
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig70 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory30 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        boolean boolean7 = atmosphereConfig0.getInitParameter("hi!", true);
        java.lang.String str9 = atmosphereConfig0.getInitParameter("");
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider13 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.framework;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory7 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext18 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory26 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig22 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster4 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
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
        boolean boolean19 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider20 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList28 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext31 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.initComplete();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
        int int21 = atmosphereConfig0.getInitParameter("hi!", 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory22 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig9 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig9.getAtmosphereHandlerConfig();
        int int13 = atmosphereConfig9.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework14 = atmosphereConfig9.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig9.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = atmosphereConfig9.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig17 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList18 = atmosphereConfig17.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = atmosphereConfig17.properties;
        atmosphereConfig9.setproperties(strMap19);
        atmosphereConfig0.setproperties(strMap19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider22 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
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
        boolean boolean18 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean19 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean22 = atmosphereConfig0.getInitParameter("hi!", true);
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory25 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean2 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList3 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory6 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        java.lang.String str9 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration10 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap10 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList19 = atmosphereConfig4.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList20 = atmosphereConfig4.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory21 = atmosphereConfig4.resourcesFactory();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        boolean boolean12 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration13 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig12.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig12.properties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList16 = atmosphereConfig12.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig12.properties();
        atmosphereConfig0.properties = strMap17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration19 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
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
        javax.servlet.ServletConfig servletConfig31 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        int int13 = atmosphereConfig0.getInitParameter("hi!", 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
        javax.servlet.ServletContext servletContext21 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = atmosphereConfig16.properties;
        atmosphereConfig16.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory31 = atmosphereConfig16.sessionFactory();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap7 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster19 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.properties;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean11 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap26 = atmosphereConfig4.handlers();
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
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
        java.util.Enumeration<java.lang.String> strEnumeration25 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
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
        javax.servlet.ServletContext servletContext33 = atmosphereConfig32.getServletContext();
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.throwExceptionOnCloned = true;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig12 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory8 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList7 = atmosphereConfig0.getstartUpHook();
        int int10 = atmosphereConfig0.getInitParameter("hi!", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster12 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
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
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap25 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        boolean boolean12 = atmosphereConfig0.supportSession;
        int int15 = atmosphereConfig0.getInitParameter("", (-1));
        boolean boolean16 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider17 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        java.lang.String str3 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory4 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        int int24 = atmosphereConfig20.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig20.supportSession = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = atmosphereConfig20.properties();
        atmosphereConfig0.setproperties(strMap27);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework29 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext30 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory16 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList6 = atmosphereConfig0.getshutdownHooks();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        boolean boolean10 = atmosphereConfig8.throwExceptionOnCloned;
        atmosphereConfig8.destroy();
        atmosphereConfig8.initComplete();
        java.lang.String str15 = atmosphereConfig8.getInitParameter("hi!", "");
        boolean boolean16 = atmosphereConfig8.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList17 = atmosphereConfig8.shutdownHooks;
        atmosphereConfig0.shutdownHooks = shutdownHookList17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext19 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory5 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
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
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory26 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory27 = atmosphereConfig26.resourcesFactory();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(false);
        atmosphereConfig0.setSupportSession(false);
        boolean boolean24 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory25 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory15 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig0.startUpHook;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        boolean boolean16 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory17 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider40 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
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
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap16 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework19 = atmosphereConfig0.getframework();
        atmosphereConfig0.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig22.getshutdownHooks();
        atmosphereConfig22.setThrowExceptionOnCloned(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig27 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList28 = atmosphereConfig27.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList29 = atmosphereConfig27.getshutdownHooks();
        atmosphereConfig22.setshutdownHooks(shutdownHookList29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = atmosphereConfig22.properties;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig32 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList33 = atmosphereConfig32.getAtmosphereHandlerConfig();
        int int36 = atmosphereConfig32.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework37 = atmosphereConfig32.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = atmosphereConfig32.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = atmosphereConfig32.getproperties();
        atmosphereConfig32.destroy();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig41 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList42 = atmosphereConfig41.getAtmosphereHandlerConfig();
        boolean boolean43 = atmosphereConfig41.throwExceptionOnCloned;
        atmosphereConfig41.destroy();
        atmosphereConfig41.initComplete();
        java.lang.String str48 = atmosphereConfig41.getInitParameter("hi!", "");
        boolean boolean49 = atmosphereConfig41.isSessionTimeoutRemovalAllowed();
        java.lang.String str51 = atmosphereConfig41.getInitParameter("hi!");
        boolean boolean52 = atmosphereConfig41.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig53 = atmosphereConfig32.populate(atmosphereConfig41);
        atmosphereConfig53.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig56 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean57 = atmosphereConfig56.isThrowExceptionOnCloned();
        boolean boolean58 = atmosphereConfig56.isSupportSession();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList59 = atmosphereConfig56.getstartUpHook();
        atmosphereConfig53.startUpHook = startupHookList59;
        atmosphereConfig22.startUpHook = startupHookList59;
        atmosphereConfig0.setstartUpHook(startupHookList59);
        boolean boolean63 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory64 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        int int17 = atmosphereConfig13.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig13.supportSession = false;
        atmosphereConfig13.setSupportSession(false);
        boolean boolean22 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig13.properties;
        atmosphereConfig0.properties = strMap23;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider27 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster11 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory5 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        int int12 = atmosphereConfig0.getInitParameter("", 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList11 = atmosphereConfig10.getAtmosphereHandlerConfig();
        int int14 = atmosphereConfig10.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig10.supportSession = false;
        atmosphereConfig10.setSupportSession(false);
        java.lang.String str20 = atmosphereConfig10.getInitParameter("hi!");
        boolean boolean23 = atmosphereConfig10.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig10.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory26 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
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
        atmosphereConfig0.supportSession = true;
        org.slf4j.Logger logger19 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig0.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig22 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig22.getAtmosphereHandlerConfig();
        int int26 = atmosphereConfig22.getInitParameter("hi!", (int) (short) 0);
        org.slf4j.Logger logger27 = atmosphereConfig22.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList28 = atmosphereConfig22.shutdownHooks;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig29 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList30 = atmosphereConfig29.getAtmosphereHandlerConfig();
        int int33 = atmosphereConfig29.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig29.supportSession = false;
        atmosphereConfig29.setSupportSession(false);
        java.lang.String str39 = atmosphereConfig29.getInitParameter("hi!");
        boolean boolean42 = atmosphereConfig29.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList43 = atmosphereConfig29.getshutdownHooks();
        atmosphereConfig22.setshutdownHooks(shutdownHookList43);
        atmosphereConfig0.shutdownHooks = shutdownHookList43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap46 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList15 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory15 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap23 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
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
        javax.servlet.ServletConfig servletConfig22 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.destroy();
        int int25 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider26 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory24 = atmosphereConfig10.sessionFactory();
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap17 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        boolean boolean14 = atmosphereConfig0.supportSession;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider17 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        atmosphereConfig10.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig10.metaBroadcaster();
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.supportSession;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.getframework();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext5 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        boolean boolean1 = atmosphereConfig0.isThrowExceptionOnCloned();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework2 = atmosphereConfig0.framework;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
        int int25 = atmosphereConfig21.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework26 = atmosphereConfig21.getframework();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray27 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList28 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList28, startupHookArray27);
        atmosphereConfig21.startUpHook = startupHookList28;
        org.slf4j.Logger logger31 = atmosphereConfig21.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList32 = atmosphereConfig21.getshutdownHooks();
        atmosphereConfig21.setSessionTimeoutRemovalAllowed(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = atmosphereConfig21.properties();
        atmosphereConfig0.setproperties(strMap35);
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList38 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration39 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory16 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.lang.String str6 = atmosphereConfig0.getInitParameter("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        org.slf4j.Logger logger12 = atmosphereConfig0.getlogger();
        org.slf4j.Logger logger13 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        atmosphereConfig0.initComplete();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework8 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory19 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean13 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory15 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
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
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
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
        atmosphereConfig0.destroy();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework39 = atmosphereConfig0.framework();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework40 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster41 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory24 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList24 = atmosphereConfig12.getstartUpHook();
        boolean boolean25 = atmosphereConfig12.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory26 = atmosphereConfig12.getBroadcasterFactory();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory11 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework27 = atmosphereConfig16.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory28 = atmosphereConfig16.getBroadcasterFactory();
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList25 = atmosphereConfig20.getshutdownHooks();
        atmosphereConfig0.shutdownHooks = shutdownHookList25;
        boolean boolean27 = atmosphereConfig0.supportSession;
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster10 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig39 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList40 = atmosphereConfig39.getAtmosphereHandlerConfig();
        boolean boolean41 = atmosphereConfig39.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework42 = atmosphereConfig39.getframework();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig43 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig43.throwExceptionOnCloned = false;
        atmosphereConfig43.sessionTimeoutRemovalAllowed = true;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList48 = atmosphereConfig43.getshutdownHooks();
        atmosphereConfig39.shutdownHooks = shutdownHookList48;
        atmosphereConfig0.shutdownHooks = shutdownHookList48;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList51 = atmosphereConfig0.getshutdownHooks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap52 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        atmosphereConfig0.supportSession = true;
        int int12 = atmosphereConfig0.getInitParameter("", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext10 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList11 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        int int12 = atmosphereConfig0.getInitParameter("", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory9 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = atmosphereConfig0.properties;
        atmosphereConfig0.supportSession = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider33 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        boolean boolean9 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties;
        org.slf4j.Logger logger11 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
        org.slf4j.Logger logger21 = atmosphereConfig0.getlogger();
        boolean boolean22 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        boolean boolean25 = atmosphereConfig23.throwExceptionOnCloned;
        atmosphereConfig23.destroy();
        atmosphereConfig23.initComplete();
        java.lang.String str30 = atmosphereConfig23.getInitParameter("hi!", "");
        atmosphereConfig23.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList33 = atmosphereConfig23.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList34 = atmosphereConfig23.getshutdownHooks();
        atmosphereConfig0.setshutdownHooks(shutdownHookList34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap36 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig20.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = atmosphereConfig20.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray24 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList25 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList25, startupHookArray24);
        atmosphereConfig20.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList25);
        atmosphereConfig20.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList29 = atmosphereConfig20.atmosphereHandlerConfig;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList29;
        java.lang.String str33 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        boolean boolean34 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext35 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean13 = atmosphereConfig0.getInitParameter("", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        boolean boolean15 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        boolean boolean7 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList8 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.destroy();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory9 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        java.lang.String str12 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList12 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
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
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory22 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
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
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = atmosphereConfig0.getproperties();
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        boolean boolean7 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory8 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework10 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig4 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig4.getAtmosphereHandlerConfig();
        int int8 = atmosphereConfig4.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig4.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig4.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig4.getproperties();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig12 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList13 = atmosphereConfig12.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = atmosphereConfig12.properties;
        atmosphereConfig4.setproperties(strMap14);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig16 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList17 = atmosphereConfig16.startUpHook;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList18 = atmosphereConfig16.startUpHook;
        atmosphereConfig4.setstartUpHook(startupHookList18);
        atmosphereConfig4.supportSession = false;
        atmosphereConfig4.sessionTimeoutRemovalAllowed = false;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList28 = atmosphereConfig24.getAtmosphereHandlerConfig();
        atmosphereConfig24.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig24.initComplete();
        atmosphereConfig24.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig34 = atmosphereConfig4.populate(atmosphereConfig24);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig35 = atmosphereConfig0.populate(atmosphereConfig34);
        java.lang.String str37 = atmosphereConfig34.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext38 = atmosphereConfig34.getServletContext();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory6 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger6 = atmosphereConfig0.getlogger();
        boolean boolean7 = atmosphereConfig0.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory8 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework9 = atmosphereConfig0.getframework();
        boolean boolean10 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory7 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.atmosphereHandlerConfig;
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
        boolean boolean23 = atmosphereConfig11.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig24.getAtmosphereHandlerConfig();
        boolean boolean26 = atmosphereConfig24.throwExceptionOnCloned;
        atmosphereConfig24.destroy();
        atmosphereConfig24.initComplete();
        atmosphereConfig24.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework31 = atmosphereConfig24.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList32 = atmosphereConfig24.atmosphereHandlerConfig;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework33 = atmosphereConfig24.getframework();
        boolean boolean34 = atmosphereConfig24.isSessionTimeoutRemovalAllowed();
        java.lang.String str36 = atmosphereConfig24.getInitParameter("hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList37 = atmosphereConfig24.startUpHook;
        atmosphereConfig11.setstartUpHook(startupHookList37);
        atmosphereConfig0.startUpHook = startupHookList37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration40 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
        org.slf4j.Logger logger14 = atmosphereConfig0.getlogger();
        boolean boolean15 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster16 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig0.getframework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory14 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig0.startUpHook;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory13 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
        boolean boolean19 = atmosphereConfig0.getInitParameter("hi!", true);
        boolean boolean20 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean21 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory23 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        atmosphereConfig0.throwExceptionOnCloned = true;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap9 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory26 = atmosphereConfig13.getBroadcasterFactory();
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        java.lang.String str5 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration8 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
        javax.servlet.ServletConfig servletConfig28 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
        boolean boolean18 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig21 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        java.lang.String str11 = atmosphereConfig0.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList12 = atmosphereConfig0.startUpHook;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
        org.atmosphere.util.UUIDProvider uUIDProvider20 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
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
        boolean boolean16 = atmosphereConfig14.throwExceptionOnCloned;
        atmosphereConfig14.destroy();
        atmosphereConfig14.initComplete();
        java.lang.String str21 = atmosphereConfig14.getInitParameter("hi!", "");
        boolean boolean22 = atmosphereConfig14.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig23 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig23.getAtmosphereHandlerConfig();
        boolean boolean25 = atmosphereConfig23.throwExceptionOnCloned;
        atmosphereConfig23.destroy();
        atmosphereConfig23.initComplete();
        atmosphereConfig23.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework30 = atmosphereConfig23.framework();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList31 = atmosphereConfig23.atmosphereHandlerConfig;
        atmosphereConfig14.atmosphereHandlerConfig = atmosphereHandlerConfigList31;
        atmosphereConfig0.atmosphereHandlerConfig = atmosphereHandlerConfigList31;
        boolean boolean34 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig35 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration14 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList10 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.getframework();
        boolean boolean9 = atmosphereConfig0.getInitParameter("hi!", false);
        boolean boolean10 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap28 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
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
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory13 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
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
        atmosphereConfig18.setSessionTimeoutRemovalAllowed(true);
        boolean boolean21 = atmosphereConfig18.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig18.getServletContext();
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList1 = atmosphereConfig0.startUpHook;
        boolean boolean2 = atmosphereConfig0.supportSession;
        org.slf4j.Logger logger3 = atmosphereConfig0.getlogger();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList4 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext6 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
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
        java.lang.String str21 = atmosphereConfig0.getInitParameter("hi!");
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory24 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        boolean boolean4 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        boolean boolean7 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework11 = atmosphereConfig0.framework;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap12 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig10 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
        atmosphereConfig13.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig13.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory29 = atmosphereConfig13.getBroadcasterFactory();
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig2 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList3 = atmosphereConfig2.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList4 = atmosphereConfig2.getshutdownHooks();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = atmosphereConfig2.getproperties();
        atmosphereConfig0.setproperties(strMap5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory12 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
        int int35 = atmosphereConfig32.getInitParameter("", (int) (byte) -1);
        atmosphereConfig32.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider38 = atmosphereConfig32.uuidProvider();
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        int int10 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 10);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.properties();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger16 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster17 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration7 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int17 = atmosphereConfig0.getInitParameter("hi!", (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
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
        atmosphereConfig0.supportSession = true;
        java.lang.String str54 = atmosphereConfig0.getInitParameter("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig55 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
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
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory21 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster13 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        atmosphereConfig0.supportSession = true;
        atmosphereConfig0.setSupportSession(true);
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig9 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
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
        boolean boolean38 = atmosphereConfig0.getInitParameter("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory39 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
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
        boolean boolean16 = atmosphereConfig0.supportSession;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = atmosphereConfig0.properties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList18 = atmosphereConfig0.startUpHook;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory19 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.initComplete();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration12 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
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
        atmosphereConfig0.throwExceptionOnCloned = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster26 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList2 = atmosphereConfig0.getstartUpHook();
        atmosphereConfig0.setSupportSession(true);
        org.slf4j.Logger logger5 = atmosphereConfig0.getlogger();
        java.lang.String str8 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext12 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        boolean boolean8 = atmosphereConfig0.isThrowExceptionOnCloned();
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext11 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        boolean boolean14 = atmosphereConfig0.supportSession;
        java.lang.String str17 = atmosphereConfig0.getInitParameter("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration18 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
        atmosphereConfig13.setSessionTimeoutRemovalAllowed(false);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList27 = atmosphereConfig13.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory28 = atmosphereConfig13.resourcesFactory();
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean6 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.slf4j.Logger logger7 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider8 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework20 = atmosphereConfig0.framework();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList21 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext22 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = atmosphereConfig0.properties();
        org.atmosphere.cpr.AtmosphereConfig.StartupHook[] startupHookArray4 = new org.atmosphere.cpr.AtmosphereConfig.StartupHook[] {};
        java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = new java.util.ArrayList<org.atmosphere.cpr.AtmosphereConfig.StartupHook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5, startupHookArray4);
        atmosphereConfig0.setstartUpHook((java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook>) startupHookList5);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean11 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean12 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory13 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext17 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework16 = atmosphereConfig0.framework;
        boolean boolean17 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework18 = atmosphereConfig0.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider19 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList9 = atmosphereConfig0.getstartUpHook();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = atmosphereConfig0.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList12 = atmosphereConfig0.shutdownHooks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap13 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
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
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster23 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster21 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        boolean boolean8 = atmosphereConfig0.isSupportSession();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        boolean boolean11 = atmosphereConfig0.isSupportSession();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext14 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework6 = atmosphereConfig0.framework;
        boolean boolean7 = atmosphereConfig0.isSupportSession();
        boolean boolean8 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        atmosphereConfig0.supportSession = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig11 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
        atmosphereConfig0.setSupportSession(true);
        boolean boolean19 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration20 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
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
        java.lang.String str22 = atmosphereConfig0.getInitParameter("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext23 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
        java.lang.String str19 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = atmosphereConfig0.properties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig40 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean5 = atmosphereConfig0.isSupportSession();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
        java.lang.String str28 = atmosphereConfig0.getInitParameter("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceFactory atmosphereResourceFactory29 = atmosphereConfig0.resourcesFactory();
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
        javax.servlet.ServletContext servletContext15 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster9 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList5 = atmosphereConfig0.startUpHook;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig6 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList7 = atmosphereConfig6.getAtmosphereHandlerConfig();
        atmosphereConfig6.setSessionTimeoutRemovalAllowed(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig10 = atmosphereConfig0.populate(atmosphereConfig6);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = atmosphereConfig10.properties();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig10.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework13 = atmosphereConfig10.framework();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig10.getServletConfig();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        boolean boolean12 = atmosphereConfig0.getInitParameter("hi!", false);
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap14 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.initComplete();
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        org.slf4j.Logger logger10 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration11 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList8 = atmosphereConfig0.startUpHook;
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap11 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        boolean boolean25 = atmosphereConfig21.supportSession;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider26 = atmosphereConfig21.uuidProvider();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setThrowExceptionOnCloned(false);
        boolean boolean7 = atmosphereConfig0.getInitParameter("", true);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = true;
        boolean boolean10 = atmosphereConfig0.isThrowExceptionOnCloned();
        boolean boolean13 = atmosphereConfig0.getInitParameter("hi!", false);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList14 = atmosphereConfig0.startUpHook;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList15 = atmosphereConfig0.atmosphereHandlerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap16 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
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
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList40 = atmosphereConfig0.getstartUpHook();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList41 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory42 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        java.util.Enumeration<java.lang.String> strEnumeration24 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean24 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig25 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig20.getAtmosphereHandlerConfig();
        boolean boolean22 = atmosphereConfig20.throwExceptionOnCloned;
        atmosphereConfig20.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList24 = atmosphereConfig20.getAtmosphereHandlerConfig();
        atmosphereConfig20.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig20.initComplete();
        atmosphereConfig20.sessionTimeoutRemovalAllowed = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig30 = atmosphereConfig0.populate(atmosphereConfig20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration31 = atmosphereConfig30.getInitParameterNames();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList17 = atmosphereConfig0.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        atmosphereConfig0.initComplete();
        atmosphereConfig0.destroy();
        boolean boolean12 = atmosphereConfig0.getInitParameter("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext13 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap15 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.supportSession = false;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList11 = atmosphereConfig0.startUpHook;
        boolean boolean12 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        boolean boolean13 = atmosphereConfig0.isSupportSession();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletConfig servletConfig14 = atmosphereConfig0.getServletConfig();
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        atmosphereConfig0.supportSession = true;
        org.slf4j.Logger logger19 = atmosphereConfig0.getlogger();
        atmosphereConfig0.initComplete();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = atmosphereConfig0.getproperties();
        boolean boolean22 = atmosphereConfig0.throwExceptionOnCloned;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList23 = atmosphereConfig0.atmosphereHandlerConfig;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList24 = atmosphereConfig0.shutdownHooks;
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, org.atmosphere.cpr.AtmosphereFramework.AtmosphereHandlerWrapper> strMap26 = atmosphereConfig0.handlers();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
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
        java.lang.String str15 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig21 = new org.atmosphere.cpr.AtmosphereConfig();
        atmosphereConfig21.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = atmosphereConfig21.properties();
        java.lang.String str27 = atmosphereConfig21.getInitParameter("hi!", "hi!");
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList28 = atmosphereConfig21.startUpHook;
        atmosphereConfig0.startUpHook = startupHookList28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster30 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.StartupHook> startupHookList10 = atmosphereConfig0.getstartUpHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider11 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean3 = atmosphereConfig0.isSupportSession();
        boolean boolean4 = atmosphereConfig0.supportSession;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList7 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.initComplete();
        boolean boolean9 = atmosphereConfig0.isThrowExceptionOnCloned();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.util.UUIDProvider uUIDProvider10 = atmosphereConfig0.uuidProvider();
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = atmosphereConfig0.properties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework3 = atmosphereConfig0.getframework();
        boolean boolean4 = atmosphereConfig0.supportSession;
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList5 = atmosphereConfig0.atmosphereHandlerConfig;
        org.slf4j.Logger logger6 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.servlet.ServletContext servletContext7 = atmosphereConfig0.getServletContext();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList2 = atmosphereConfig0.getshutdownHooks();
        boolean boolean5 = atmosphereConfig0.getInitParameter("", true);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework7 = atmosphereConfig0.framework();
        int int10 = atmosphereConfig0.getInitParameter("hi!", (int) (byte) 10);
        atmosphereConfig0.setThrowExceptionOnCloned(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = atmosphereConfig0.getproperties();
        boolean boolean14 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(true);
        atmosphereConfig0.setSupportSession(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.AtmosphereResourceSessionFactory atmosphereResourceSessionFactory19 = atmosphereConfig0.sessionFactory();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework5 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = atmosphereConfig0.properties;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = atmosphereConfig0.getproperties();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList8 = atmosphereConfig0.atmosphereHandlerConfig;
        boolean boolean9 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = atmosphereConfig0.properties();
        boolean boolean15 = atmosphereConfig0.getInitParameter("hi!", false);
        atmosphereConfig0.sessionTimeoutRemovalAllowed = false;
        org.slf4j.Logger logger18 = atmosphereConfig0.getlogger();
        atmosphereConfig0.throwExceptionOnCloned = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.MetaBroadcaster metaBroadcaster21 = atmosphereConfig0.metaBroadcaster();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.throwExceptionOnCloned = true;
        boolean boolean4 = atmosphereConfig0.isSupportSession();
        boolean boolean5 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig8 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList9 = atmosphereConfig8.getAtmosphereHandlerConfig();
        boolean boolean10 = atmosphereConfig8.throwExceptionOnCloned;
        atmosphereConfig8.supportSession = true;
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig13 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList14 = atmosphereConfig13.getAtmosphereHandlerConfig();
        atmosphereConfig13.throwExceptionOnCloned = true;
        boolean boolean17 = atmosphereConfig13.isSupportSession();
        boolean boolean18 = atmosphereConfig13.isSessionTimeoutRemovalAllowed();
        boolean boolean19 = atmosphereConfig13.isSupportSession();
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig20 = atmosphereConfig8.populate(atmosphereConfig13);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList21 = atmosphereConfig13.atmosphereHandlerConfig;
        atmosphereConfig13.setSupportSession(false);
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig24 = atmosphereConfig0.populate(atmosphereConfig13);
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList25 = atmosphereConfig13.getAtmosphereHandlerConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory26 = atmosphereConfig13.getBroadcasterFactory();
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework17 = atmosphereConfig0.getframework();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = atmosphereConfig0.getproperties();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = atmosphereConfig0.getWebServerName();
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        atmosphereConfig0.initComplete();
        java.lang.String str7 = atmosphereConfig0.getInitParameter("hi!", "");
        boolean boolean8 = atmosphereConfig0.isSessionTimeoutRemovalAllowed();
        java.lang.String str10 = atmosphereConfig0.getInitParameter("hi!");
        boolean boolean11 = atmosphereConfig0.sessionTimeoutRemovalAllowed;
        org.atmosphere.cpr.AtmosphereFramework atmosphereFramework12 = atmosphereConfig0.framework;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList13 = atmosphereConfig0.shutdownHooks;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList14 = atmosphereConfig0.getshutdownHooks();
        boolean boolean15 = atmosphereConfig0.throwExceptionOnCloned;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration16 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        boolean boolean2 = atmosphereConfig0.throwExceptionOnCloned;
        atmosphereConfig0.destroy();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList4 = atmosphereConfig0.getAtmosphereHandlerConfig();
        atmosphereConfig0.setSessionTimeoutRemovalAllowed(false);
        atmosphereConfig0.destroy();
        org.slf4j.Logger logger8 = atmosphereConfig0.getlogger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Enumeration<java.lang.String> strEnumeration9 = atmosphereConfig0.getInitParameterNames();
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.atmosphere.cpr.AtmosphereConfig atmosphereConfig0 = new org.atmosphere.cpr.AtmosphereConfig();
        java.util.List<org.atmosphere.config.AtmosphereHandlerConfig> atmosphereHandlerConfigList1 = atmosphereConfig0.getAtmosphereHandlerConfig();
        int int4 = atmosphereConfig0.getInitParameter("hi!", (int) (short) 0);
        atmosphereConfig0.supportSession = false;
        atmosphereConfig0.setSupportSession(false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = atmosphereConfig0.properties;
        java.util.List<org.atmosphere.cpr.AtmosphereConfig.ShutdownHook> shutdownHookList10 = atmosphereConfig0.getshutdownHooks();
        atmosphereConfig0.throwExceptionOnCloned = false;
        java.lang.String str14 = atmosphereConfig0.getInitParameter("");
        java.lang.String str16 = atmosphereConfig0.getInitParameter("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory17 = atmosphereConfig0.getBroadcasterFactory();
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
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
        atmosphereConfig0.setSupportSession(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = atmosphereConfig0.getWebServerName();
    }
}

