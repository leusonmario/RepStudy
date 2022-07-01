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
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHomePageUrl("", "172.20.26.3");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setStatusPageUrl("hi!", "/Status");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("/healthcheck", "unknown");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3", "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHealthCheckUrls("hi!", "unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrl("", "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("/", "/");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHomePageUrl("eureka.", "hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setStatusPageUrl("unknown", "/Status");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setStatusPageUrl("172.20.26.3", "na");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("172.20.26.3", "eureka.");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.enablePort(portType5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("172.20.26.3", "unknown");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHomePageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setStatusPageUrl("", "/Status");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatusPageUrlForDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("unknown", "inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setNamespace("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "unknown");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("hi!", "na", "na");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("/healthcheck", "/healthcheck");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setStatusPageUrl("unknown", "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHealthCheckUrls("", "172.20.26.3", "/Status");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setNamespace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("/Status", "hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setStatusPageUrl("na", "unknown");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setHomePageUrl("172.20.26.3", "unknown");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.add("unknown", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrls("UNKNOWN", "hi!", "unknown");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setHealthCheckUrls("/Status", "na", "/healthcheck");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setPort(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setStatusPageUrl("unknown", "/healthcheck");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray4 = new java.lang.String[] { "na", "/", "eureka.", "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = builder5.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo6);
        com.netflix.appinfo.InstanceInfo instanceInfo8 = new com.netflix.appinfo.InstanceInfo(instanceInfo6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(443);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("na", "eureka.");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrls("/", "/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "eureka.", "/Status");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setCountryId((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("na", "eureka.");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setAppName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setStatusPageUrl("eureka.", "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setStatusPageUrl("na", "/");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("/Status", "/healthcheck");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("", "UNKNOWN");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus27 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder24.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType33 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.enablePort(portType33, false);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType45 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder44.enablePort(portType45, false);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder35.enablePort(portType45, false);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder23.enablePort(portType45, true);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder11.enablePort(portType45, true);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder2.enablePort(portType45, false);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setHomePageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder57.setHealthCheckUrls("unknown", "UNKNOWN", "172.20.26.3");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("172.20.26.3", "172.20.26.3");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHomePageUrl("na", "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("/Status", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHomePageUrl("", "/Status");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("eureka.", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "UNKNOWN", "/healthcheck");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "eureka.", "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setOverriddenStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setStatus(instanceStatus21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType27 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.enablePort(portType27, false);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType39 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.enablePort(portType39, false);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder29.enablePort(portType39, false);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder17.enablePort(portType39, true);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder5.enablePort(portType39, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder47.setStatusPageUrl("/healthcheck", "/healthcheck");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = builder2.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setStatusPageUrl("eureka.", "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setSecurePort((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder23.setStatusPageUrl("UNKNOWN", "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHomePageUrl("eureka.", "na");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecurePort(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("hi!", "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("unknown", "/healthcheck");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("eureka.", "unknown");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("", "172.20.26.3");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setNamespace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHomePageUrl("/", "unknown");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("172.20.26.3");
        boolean boolean11 = builder8.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setSecureVIPAddressDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setHomePageUrl("/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("/healthcheck", "172.20.26.3", "/");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("", "/");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) 7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str13 = myDataCenterInstanceConfig12.getSecureHealthCheckUrl();
        java.lang.String str14 = myDataCenterInstanceConfig12.getStatusPageUrl();
        boolean boolean15 = myDataCenterInstanceConfig12.isNonSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = myDataCenterInstanceConfig12.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setStatus(instanceStatus20);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        long long27 = instanceInfo26.getLastUpdatedTimestamp();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig12, instanceInfo26);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo26.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder8.setOverriddenStatus(instanceStatus29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder8.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder8.setNamespace("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder8.setHealthCheckUrls("/", "eureka.", "unknown");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.enablePort(portType5, true);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "na");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("", "eureka.");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder4.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("hi!", "/Status");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("eureka.");
        boolean boolean9 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setLastDirtyTimestamp(1636101146624L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setStatusPageUrl("UNKNOWN", "na");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3", "172.20.26.3");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatusPageUrl("UNKNOWN", "na");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType31 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.enablePort(portType31, false);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder21.enablePort(portType31, false);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder9.enablePort(portType31, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder37.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "na", "unknown");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setAppName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("unknown", "na");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.add("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setSecurePort((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setHomePageUrl("/healthcheck", "/");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setLastDirtyTimestamp(1636101153167L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHomePageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrl("/Status", "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecurePort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setStatusPageUrl("", "/Status");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHomePageUrl("", "UNKNOWN");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType2 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.enablePort(portType2, true);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = builder5.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus8 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("");
        instanceInfo6.setOverriddenStatus(instanceStatus8);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatus(instanceStatus8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.setSID("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppName("/Status");
        boolean boolean16 = builder15.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setHealthCheckUrls("/", "unknown", "na");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("/healthcheck", "172.20.26.3");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHealthCheckUrls("eureka.", "inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("", "/Status");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("hi!", "eureka.");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHomePageUrl("/healthcheck", "unknown");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setStatusPageUrl("/HEALTHCHECK", "/HEALTHCHECK");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setSecurePort((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("UNKNOWN", "na", "/healthcheck");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setASGName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "172.20.26.3");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setOverriddenStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setStatus(instanceStatus21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType27 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.enablePort(portType27, false);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType39 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.enablePort(portType39, false);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder29.enablePort(portType39, false);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder17.enablePort(portType39, true);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder5.enablePort(portType39, true);
        boolean boolean48 = builder5.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder5.setHealthCheckUrls("172.20.26.3", "inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        boolean boolean5 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setPort((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setStatusPageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setStatusPageUrl("na", "eureka.");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType31 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.enablePort(portType31, false);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder21.enablePort(portType31, false);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder9.enablePort(portType31, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder9.setHomePageUrl("eureka.", "/");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setVIPAddress("/");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setStatusPageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setVIPAddress("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder15.setHealthCheckUrls("/", "HI!", "172.20.26.3");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setVIPAddress("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHomePageUrl("/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1636101106857L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setAppGroupName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("/healthcheck", "unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("na", "172.20.26.3");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setCountryId((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecurePort((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("", "eureka.");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        boolean boolean5 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/Status");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("", "default");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatusPageUrlForDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "", "unknown");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder4.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrls("", "na", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(443);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setLastDirtyTimestamp(1636101192075L);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setHostName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus27 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setOverriddenStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setStatus(instanceStatus29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder26.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder26.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setAppGroupName("172.20.26.3");
        boolean boolean37 = builder34.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder34.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = builder40.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType42 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.enablePort(portType42, true);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder39.enablePort(portType42, false);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder25.enablePort(portType42, false);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder22.enablePort(portType42, true);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder13.enablePort(portType42, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder13.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/HEALTHCHECK");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.add("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setHealthCheckUrls("HI!", "/", "172.20.26.3");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setStatusPageUrl("hi!", "/");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setLastDirtyTimestamp(1636101090016L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setStatusPageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str13 = myDataCenterInstanceConfig12.getSecureHealthCheckUrl();
        java.lang.String str14 = myDataCenterInstanceConfig12.getStatusPageUrl();
        boolean boolean15 = myDataCenterInstanceConfig12.isNonSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = myDataCenterInstanceConfig12.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setStatus(instanceStatus20);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        long long27 = instanceInfo26.getLastUpdatedTimestamp();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig12, instanceInfo26);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo26.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder8.setOverriddenStatus(instanceStatus29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder8.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder8.setNamespace("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder8.setAppGroupName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder8.setHomePageUrl("na", "HI!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("172.20.26.3");
        boolean boolean11 = builder8.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "default", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setCountryId((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setHealthCheckUrls("/HEALTHCHECK", "unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "unknown", "/");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(1636101094876L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setStatusPageUrl("", "/HEALTHCHECK");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setSecurePort((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setStatusPageUrl("default", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setOverriddenStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder4.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrl("/healthcheck", "unknown");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.add("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setSecurePort((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder20.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder8.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setNamespace("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder25.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setPort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status", "/HEALTHCHECK");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setPort(90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrls("eureka.", "HI!", "UNKNOWN");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType2 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.enablePort(portType2, true);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSID("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecureVIPAddressDeser("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("HI!", "default", "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.add("na", "");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.setSecurePort((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder0.setHomePageUrl("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSID("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecureVIPAddressDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("/Status", "na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType2 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.enablePort(portType2, true);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = builder5.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus8 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("");
        instanceInfo6.setOverriddenStatus(instanceStatus8);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatus(instanceStatus8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHealthCheckUrls("eureka.", "na", "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp(1636101088530L);
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setStatusPageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("/Status", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("/HEALTHCHECK", "/healthcheck", "/");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.PortType portType6 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.enablePort(portType6, true);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("NA", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("172.20.26.3", "na", "/");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecurePort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "na");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHomePageUrl("/healthcheck", "HI!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder8.setHealthCheckUrls("UNKNOWN", "default", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder8.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setSID("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setStatusPageUrl("172.20.26.3", "HI!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setPort(90);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setPort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setLastDirtyTimestamp(1636101140170L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setHealthCheckUrls("/Status", "/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.add("/healthcheck", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("hi!", "172.20.26.3");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddressDeser("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHomePageUrl("", "unknown");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.add("na", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder0.setHomePageUrl("hi!", "/Status");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "NA");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("NA", "NA", "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        boolean boolean7 = builder0.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrl("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.setHealthCheckUrls("default", "inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("na", "172.20.26.3");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus4 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setOverriddenStatus(instanceStatus4);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus6 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setStatus(instanceStatus6);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder3.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder3.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppGroupName("172.20.26.3");
        boolean boolean14 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder17.getRawInstance();
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setAppGroupName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setStatusPageUrl("/", "NA");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        boolean boolean15 = myDataCenterInstanceConfig14.getSecurePortEnabled();
        int int16 = myDataCenterInstanceConfig14.getNonSecurePort();
        int int17 = myDataCenterInstanceConfig14.getSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = myDataCenterInstanceConfig14.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setMetadata(strMap18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("/HEALTHCHECK", "/");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("default", "eureka.");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setLastDirtyTimestamp(1636101127556L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("/HEALTHCHECK", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSID("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("default", "eureka.");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.String[] strArray4 = new java.lang.String[] { "na", "NA", "inesserver2.windows.cin.ufpe.br:80", "eureka." };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder7.getRawInstance();
        java.lang.String str11 = instanceInfo10.getHomePageUrl();
        java.lang.String str12 = instanceInfo10.getHomePageUrl();
        java.lang.String str13 = instanceInfo10.getAppGroupName();
        java.lang.String str14 = instanceInfo10.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.add("", "NA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setStatusPageUrl("unknown", "na");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(80);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder8.setSecurePort((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setStatusPageUrl("/Status", "/HEALTHCHECK");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus8 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setOverriddenStatus(instanceStatus8);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) (short) -1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setOverriddenStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder2.setOverriddenStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setHealthCheckUrls("", "", "HI!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus8 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatus(instanceStatus8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setStatusPageUrl("/healthcheck", "/");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("/healthcheck", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("", "unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("inesserver2.windows.cin.ufpe.br:80");
        boolean boolean11 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setSecureVIPAddressDeser("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("HI!", "NA", "HI!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.add("/healthcheck", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.add("172.20.26.3", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setHomePageUrl("UNKNOWN", "NA");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSID("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("na", "UNKNOWN", "unknown");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatus(instanceStatus3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.enablePort(portType9, false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setASGName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("NA", "eureka.", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo1);
        java.lang.String str3 = instanceInfo1.getStatusPageUrl();
        java.lang.String str4 = instanceInfo1.getHomePageUrl();
        java.lang.String str5 = instanceInfo1.getHomePageUrl();
        java.lang.String str6 = instanceInfo1.getId();
        boolean boolean7 = instanceInfo1.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo1);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setHomePageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHealthCheckUrls("UNKNOWN", "", "/");
    }
}

