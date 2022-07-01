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
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setStatusPageUrl("hi!", "");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setStatusPageUrl("", "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("/Status", "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("hi!", "/Status");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setOverriddenStatus(instanceStatus9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHealthCheckUrls("172.20.26.3", "/Status", "unknown");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrls("/healthcheck", "/Status", "/");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setLastDirtyTimestamp((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("na", "eureka.", "/Status");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("/Status", "hi!", "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setStatusPageUrl("unknown", "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.add("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3", "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHealthCheckUrls("hi!", "inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setCountryId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "na");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHomePageUrl("/Status", "unknown");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("na", "na");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("/Status", "eureka.", "/healthcheck");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "eureka.", "/healthcheck");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setStatusPageUrl("hi!", "/healthcheck");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHomePageUrl("eureka.", "/healthcheck");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("/Status", "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setASGName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("na", "/");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("hi!", "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("172.20.26.3", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("172.20.26.3", "na", "172.20.26.3");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setActionType(actionType17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "unknown", "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrlsForDeser("172.20.26.3", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.add("unknown", "eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("eureka.", "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setStatusPageUrl("", "na");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("/healthcheck", "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "na", "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("unknown", "eureka.", "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddressDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("/Status", "/Status");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddress("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHomePageUrl("hi!", "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setHealthCheckUrlsForDeser("", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setHomePageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("eureka.", "inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder4.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.setHealthCheckUrls("na", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrls("", "/", "/healthcheck");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatusPageUrl("172.20.26.3", "/healthcheck");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "eureka.", "HI!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("/", "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("hi!", "/healthcheck");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setAppName("/Status");
        boolean boolean16 = builder15.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("172.20.26.3", "/", "eureka.");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrlsForDeser("172.20.26.3", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "na");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder25.setHealthCheckUrls("/", "/Status", "/Status");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp(1636098565555L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("eureka.", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("172.20.26.3", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSID("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setASGName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.add("inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("172.20.26.3", "/");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder2.setSecureVIPAddressDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/", "eureka.");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("hi!", "eureka.");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("eureka.", "172.20.26.3");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setStatusPageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setStatusPageUrl("HI!", "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setLastDirtyTimestamp((long) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType16 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.enablePort(portType16, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("hi!", "unknown");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setLastDirtyTimestamp(1636098565070L);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setPort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setAppName("/");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setOverriddenStatus(instanceStatus14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("172.20.26.3", "/Status", "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setStatusPageUrl("/healthcheck", "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("/", "unknown");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setStatusPageUrl("eureka.", "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("/", "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("172.20.26.3", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("/", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("/", "", "/");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("eureka.", "/healthcheck", "/");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setStatusPageUrl("HI!", "172.20.26.3");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("172.20.26.3", "172.20.26.3", "/Status");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str8 = myDataCenterInstanceConfig7.getStatusPageUrl();
        java.lang.String str9 = myDataCenterInstanceConfig7.getSecureVirtualHostName();
        java.lang.String str10 = myDataCenterInstanceConfig7.getSecureHealthCheckUrl();
        boolean boolean11 = myDataCenterInstanceConfig7.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder15.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("na", "http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("unknown", "http://inesserver2.windows.cin.ufpe.br:80/", "unknown");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str8 = myDataCenterInstanceConfig7.getStatusPageUrl();
        java.lang.String str9 = myDataCenterInstanceConfig7.getSecureVirtualHostName();
        java.lang.String str10 = myDataCenterInstanceConfig7.getSecureHealthCheckUrl();
        boolean boolean11 = myDataCenterInstanceConfig7.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder4.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder4.setStatusPageUrl("172.20.26.3", "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "unknown");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("HI!", "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setLastDirtyTimestamp((long) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType16 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.enablePort(portType16, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setStatusPageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        boolean boolean8 = builder5.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder5.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        com.netflix.appinfo.LeaseInfo leaseInfo15 = instanceInfo14.getLeaseInfo();
        java.lang.String str16 = instanceInfo14.getIPAddr();
        boolean boolean17 = instanceInfo14.isDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.add("HI!", "na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder26.setStatusPageUrl("unknown", "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str8 = myDataCenterInstanceConfig7.getStatusPageUrl();
        java.lang.String str9 = myDataCenterInstanceConfig7.getSecureVirtualHostName();
        java.lang.String str10 = myDataCenterInstanceConfig7.getSecureHealthCheckUrl();
        boolean boolean11 = myDataCenterInstanceConfig7.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder4.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setASGName("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder4.setHomePageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setAppName("/");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setOverriddenStatus(instanceStatus14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/Status", "na");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder11.setStatusPageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder11.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder11.setSID("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder11.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType27 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setActionType(actionType27);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder24.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType39 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setActionType(actionType39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder31.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder45.getRawInstance();
        instanceInfo46.setIsCoordinatingDiscoveryServer();
        java.lang.String str48 = instanceInfo46.getVersion();
        java.lang.String str49 = instanceInfo46.getSecureVipAddress();
        instanceInfo46.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder52.enablePort(portType55, false);
        boolean boolean58 = instanceInfo46.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder21.enablePort(portType55, true);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder21.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder21.setVIPAddressDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder21.setHomePageUrl("unknown", "/Status");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSID("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setStatusPageUrl("/", "/healthcheck");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastDirtyTimestamp(1636098569202L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setHomePageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setPort((int) (short) -1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str31 = myDataCenterInstanceConfig30.getStatusPageUrl();
        int int32 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig30.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder26.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder26.setSecurePort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder39.setHomePageUrl("na", "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSID("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHealthCheckUrls("eureka.", "/", "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatusPageUrl("eureka.", "HI!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("", "na");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setLastDirtyTimestamp((long) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddressDeser("hi!");
        boolean boolean13 = builder12.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setStatusPageUrl("na", "/Status");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType27 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setActionType(actionType27);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder24.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType39 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setActionType(actionType39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder31.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder45.getRawInstance();
        instanceInfo46.setIsCoordinatingDiscoveryServer();
        java.lang.String str48 = instanceInfo46.getVersion();
        java.lang.String str49 = instanceInfo46.getSecureVipAddress();
        instanceInfo46.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder52.enablePort(portType55, false);
        boolean boolean58 = instanceInfo46.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder21.enablePort(portType55, true);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder21.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder21.setVIPAddressDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder64.setStatusPageUrl("eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setLastDirtyTimestamp(1636098562203L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig33 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str34 = myDataCenterInstanceConfig33.getStatusPageUrl();
        int int35 = myDataCenterInstanceConfig33.getLeaseExpirationDurationInSeconds();
        int int36 = myDataCenterInstanceConfig33.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = myDataCenterInstanceConfig33.getMetadataMap();
        java.lang.String str38 = myDataCenterInstanceConfig33.getIpAddress();
        boolean boolean39 = myDataCenterInstanceConfig33.getSecurePortEnabled();
        java.lang.String str40 = myDataCenterInstanceConfig33.getHealthCheckUrlPath();
        java.lang.String str41 = myDataCenterInstanceConfig33.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo42 = myDataCenterInstanceConfig33.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder28.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder18.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder9.setDataCenterInfo(dataCenterInfo42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder45.setStatusPageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setCountryId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3", "eureka.");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrlForDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("eureka.", "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp(1636098573551L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("172.20.26.3", "/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHealthCheckUrls("UNKNOWN", "hi!", "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(0L);
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("172.20.26.3", "/", "/healthcheck");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("na", "na");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setStatusPageUrl("172.20.26.3", "/Status");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.add("na", "eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("UNKNOWN", "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setPort((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder13.setHomePageUrl("eureka.", "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("", "172.20.26.3");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "UNKNOWN");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("eureka.");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setSID("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.setHomePageUrl("UNKNOWN", "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setNamespace("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder7.setStatusPageUrl("/", "172.20.26.3");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setHealthCheckUrls("HI!", "inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str31 = myDataCenterInstanceConfig30.getStatusPageUrl();
        int int32 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int33 = myDataCenterInstanceConfig30.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = myDataCenterInstanceConfig30.getMetadataMap();
        int int35 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int36 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        boolean boolean37 = myDataCenterInstanceConfig30.isInstanceEnabledOnit();
        java.lang.String str38 = myDataCenterInstanceConfig30.getSecureHealthCheckUrl();
        java.lang.String str39 = myDataCenterInstanceConfig30.getVirtualHostName();
        int int40 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = myDataCenterInstanceConfig30.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder29.setMetadata(strMap41);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder42.getRawInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig46 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str47 = myDataCenterInstanceConfig46.getStatusPageUrl();
        int int48 = myDataCenterInstanceConfig46.getLeaseExpirationDurationInSeconds();
        int int49 = myDataCenterInstanceConfig46.getLeaseExpirationDurationInSeconds();
        java.lang.String str50 = myDataCenterInstanceConfig46.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo51 = myDataCenterInstanceConfig46.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder42.setDataCenterInfo(dataCenterInfo51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder52.setHomePageUrl("UNKNOWN", "na");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setLastDirtyTimestamp(1636098562203L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setStatusPageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastDirtyTimestamp((long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setHealthCheckUrls("HI!", "http://inesserver2.windows.cin.ufpe.br:80/Status", "na");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecurePort((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.build();
        long long8 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setCountryId(100);
        boolean boolean16 = instanceInfo7.equals((java.lang.Object) builder15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHealthCheckUrls("UNKNOWN", "", "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("/", "/Status", "/");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("hi!", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("/Status", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setHealthCheckUrlsForDeser("unknown", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder7.setSecureVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder7.setHomePageUrl("na", "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType16 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.enablePort(portType16, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder4.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder4.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder4.setHealthCheckUrls("eureka.", "/STATUS", "eureka.");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecurePort((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "eureka.");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp(1636098573551L);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHomePageUrl("/STATUS", "unknown");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setLastDirtyTimestamp(1636098562203L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str25 = myDataCenterInstanceConfig24.getStatusPageUrl();
        int int26 = myDataCenterInstanceConfig24.getLeaseExpirationDurationInSeconds();
        int int27 = myDataCenterInstanceConfig24.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = myDataCenterInstanceConfig24.getMetadataMap();
        java.lang.String str29 = myDataCenterInstanceConfig24.getIpAddress();
        boolean boolean30 = myDataCenterInstanceConfig24.getSecurePortEnabled();
        java.lang.String str31 = myDataCenterInstanceConfig24.getHealthCheckUrlPath();
        java.lang.String str32 = myDataCenterInstanceConfig24.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder19.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder10.setDataCenterInfo(dataCenterInfo33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder10.setHomePageUrl("", "/Status");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(0L);
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setNamespace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setHomePageUrl("", "/Status");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("/Status", "/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str21 = myDataCenterInstanceConfig20.getStatusPageUrl();
        java.lang.String str22 = myDataCenterInstanceConfig20.getSecureVirtualHostName();
        java.lang.String str23 = myDataCenterInstanceConfig20.getSecureHealthCheckUrl();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo25);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo27 = myDataCenterInstanceConfig26.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder14.setDataCenterInfo(dataCenterInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder14.setASGName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder31.setHomePageUrl("", "/Status");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "/Status", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setLastDirtyTimestamp(1636098565070L);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setPort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder22.setHealthCheckUrls("eureka.", "/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("/Status", "eureka.", "/healthcheck");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.add("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHealthCheckUrlsForDeser("unknown", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setStatusPageUrl("hi!", "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(1636098571722L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("HI!", "/healthcheck");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.add("eureka.", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatusPageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setAppName("/Status");
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setLastDirtyTimestamp(1636098656372L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setStatusPageUrl("", "172.20.26.3");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("172.20.26.3");
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setASGName("na");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder10.setLastDirtyTimestamp(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("", "/");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setCountryId((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder9.setHealthCheckUrls("eureka.", "inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("HI!", "unknown");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder23.setStatusPageUrl("/", "/healthcheck");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("172.20.26.3");
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setASGName("na");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder10.setLastDirtyTimestamp(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder10.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("UNKNOWN", "eureka.");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHealthCheckUrlsForDeser("eureka.", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHomePageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHealthCheckUrls("eureka.", "/STATUS", "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.add("inesserver2.windows.cin.ufpe.br:80", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("na", "http://inesserver2.windows.cin.ufpe.br:80/", "na");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        boolean boolean17 = builder12.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.setHomePageUrl("", "UNKNOWN");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("unknown", "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setVIPAddress("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setHomePageUrl("UNKNOWN", "/healthcheck");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("eureka.", "HI!", "HI!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setLastDirtyTimestamp(1636098565070L);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setPort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("", "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("hi!", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder18.setVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder18.setHealthCheckUrls("/STATUS", "http://inesserver2.windows.cin.ufpe.br:80/Status", "na");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setHealthCheckUrlsForDeser("", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setASGName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder4.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        boolean boolean12 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setPort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setASGName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "UNKNOWN");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.add("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHealthCheckUrlsForDeser("unknown", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setStatusPageUrl("/STATUS", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        boolean boolean12 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHealthCheckUrlsForDeser("/Status", "HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "na");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setCountryId((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("/", "eureka.", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("inesserver2.windows.cin.ufpe.br", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setHealthCheckUrls("na", "/Status", "UNKNOWN");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br:80", "/STATUS");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setStatusPageUrl("HI!", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSID("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setAppName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setHealthCheckUrls("hi!", "/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastDirtyTimestamp(1636098569202L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setPort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.setHomePageUrlForDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("172.20.26.3", "/Status", "/STATUS");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("", "http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setStatusPageUrl("na", "unknown");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("hi!", "na");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("/STATUS", "http://inesserver2.windows.cin.ufpe.br:80/", "/STATUS");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType20 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.enablePort(portType20, false);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType20, true);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setHostName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType32 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder29.enablePort(portType32, false);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder24.enablePort(portType32, false);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder8.enablePort(portType32, true);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setPort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder42.setStatusPageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setPort((int) (short) -1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str31 = myDataCenterInstanceConfig30.getStatusPageUrl();
        int int32 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig30.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder26.setDataCenterInfo(dataCenterInfo33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder37.setHomePageUrl("", "eureka.");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setASGName("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setHomePageUrl("", "/healthcheck");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.add("http://inesserver2.windows.cin.ufpe.br:80/", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("172.20.26.3", "/STATUS", "eureka.");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("/STATUS", "HI!", "/STATUS");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str25 = myDataCenterInstanceConfig24.getStatusPageUrl();
        int int26 = myDataCenterInstanceConfig24.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo27 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo27);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder21.setDataCenterInfo(dataCenterInfo27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHomePageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder4.build();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("HI!", "unknown", "/");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder0.setHealthCheckUrlsForDeser("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder0.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "na", "172.20.26.3");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setActionType(actionType21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder13.setActionType(actionType21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder2.setActionType(actionType21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setVIPAddress("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder10.setHealthCheckUrls("/Status", "/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/healthcheck");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder0.setHealthCheckUrlsForDeser("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("HI!", "UNKNOWN");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrlsForDeser("HI!", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("", "HI!", "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setAppName("/");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setOverriddenStatus(instanceStatus14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("", "172.20.26.3");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("eureka.", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId(90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp(1636098595058L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrls("/healthcheck", "hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHealthCheckUrls("/", "HI!", "/");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("/healthcheck", "UNKNOWN");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSID("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("");
        boolean boolean9 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setAppName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setHomePageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHealthCheckUrls("172.20.26.3", "", "na");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("", "eureka.");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrlsForDeser("HI!", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setHealthCheckUrls("172.20.26.3", "unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("na", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.add("na", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder12.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatusPageUrl("/STATUS", "eureka.");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("/Status");
        boolean boolean11 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setAppName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setHomePageUrlForDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "UNKNOWN");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("", "/healthcheck");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/", "unknown");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("/healthcheck", "/healthcheck", "HI!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.enablePort(portType19, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setLastDirtyTimestamp(1636098562203L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig33 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str34 = myDataCenterInstanceConfig33.getStatusPageUrl();
        int int35 = myDataCenterInstanceConfig33.getLeaseExpirationDurationInSeconds();
        int int36 = myDataCenterInstanceConfig33.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = myDataCenterInstanceConfig33.getMetadataMap();
        java.lang.String str38 = myDataCenterInstanceConfig33.getIpAddress();
        boolean boolean39 = myDataCenterInstanceConfig33.getSecurePortEnabled();
        java.lang.String str40 = myDataCenterInstanceConfig33.getHealthCheckUrlPath();
        java.lang.String str41 = myDataCenterInstanceConfig33.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo42 = myDataCenterInstanceConfig33.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder28.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder18.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder9.setDataCenterInfo(dataCenterInfo42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder45.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setHomePageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("/STATUS", "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setActionType(actionType24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatus(instanceStatus28);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig32 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str33 = myDataCenterInstanceConfig32.getStatusPageUrl();
        int int34 = myDataCenterInstanceConfig32.getLeaseExpirationDurationInSeconds();
        int int35 = myDataCenterInstanceConfig32.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = myDataCenterInstanceConfig32.getMetadataMap();
        java.lang.String str37 = myDataCenterInstanceConfig32.getIpAddress();
        java.lang.String str38 = myDataCenterInstanceConfig32.getVirtualHostName();
        int int39 = myDataCenterInstanceConfig32.getSecurePort();
        java.lang.String str40 = myDataCenterInstanceConfig32.getAppname();
        boolean boolean41 = myDataCenterInstanceConfig32.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo42 = myDataCenterInstanceConfig32.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder29.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder16.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder44.add("", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder44.setHomePageUrl("na", "/STATUS");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType16 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.enablePort(portType16, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder4.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder4.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setHomePageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.setStatusPageUrl("unknown", "/");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp(1636098584245L);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSID("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType32 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setActionType(actionType32);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder21.setActionType(actionType32);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder14.setActionType(actionType32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder14.setHomePageUrl("", "/healthcheck");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        boolean boolean8 = builder5.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setSID("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder5.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "", "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setSecurePort((int) (byte) -1);
        boolean boolean27 = builder21.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder21.setHomePageUrl("HI!", "na");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        boolean boolean15 = builder14.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "172.20.26.3");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("172.20.26.3", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrl("unknown", "na");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType16 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.enablePort(portType16, false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.enablePort(portType16, true);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder4.enablePort(portType16, false);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str25 = myDataCenterInstanceConfig24.getStatusPageUrl();
        int int26 = myDataCenterInstanceConfig24.getLeaseExpirationDurationInSeconds();
        int int27 = myDataCenterInstanceConfig24.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = myDataCenterInstanceConfig24.getMetadataMap();
        int int29 = myDataCenterInstanceConfig24.getLeaseExpirationDurationInSeconds();
        boolean boolean30 = myDataCenterInstanceConfig24.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig32 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder4.setDataCenterInfo(dataCenterInfo31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setHomePageUrl("unknown", "na");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "172.20.26.3", "UNKNOWN");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setASGName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        boolean boolean12 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setPort(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("/STATUS", "/healthcheck");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp(1636098565555L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("172.20.26.3", "unknown");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setStatusPageUrl("unknown", "/healthcheck");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        boolean boolean12 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setNamespace("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "hi!", "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(1636098571722L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("eureka.", "/");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("HI!", "hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        int int16 = myDataCenterInstanceConfig14.getLeaseExpirationDurationInSeconds();
        int int17 = myDataCenterInstanceConfig14.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = myDataCenterInstanceConfig14.getMetadataMap();
        java.lang.String str19 = myDataCenterInstanceConfig14.getIpAddress();
        boolean boolean20 = myDataCenterInstanceConfig14.getSecurePortEnabled();
        java.lang.String str21 = myDataCenterInstanceConfig14.getHealthCheckUrlPath();
        boolean boolean22 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo23 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo23);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder8.setDataCenterInfo(dataCenterInfo23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder8.setStatusPageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatusPageUrl("", "/STATUS");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "/Status");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setASGName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrlForDeser("/Status");
        boolean boolean11 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder10.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setStatusPageUrl("/", "unknown");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str31 = myDataCenterInstanceConfig30.getStatusPageUrl();
        int int32 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int33 = myDataCenterInstanceConfig30.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = myDataCenterInstanceConfig30.getMetadataMap();
        int int35 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int36 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        boolean boolean37 = myDataCenterInstanceConfig30.isInstanceEnabledOnit();
        java.lang.String str38 = myDataCenterInstanceConfig30.getSecureHealthCheckUrl();
        java.lang.String str39 = myDataCenterInstanceConfig30.getVirtualHostName();
        int int40 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = myDataCenterInstanceConfig30.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder29.setMetadata(strMap41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder42.setStatusPageUrl("/healthcheck", "/");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSID("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setStatusPageUrlForDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/", "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setPort((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setStatusPageUrl("/", "172.20.26.3");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSID("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setHomePageUrl("eureka.", "/healthcheck");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("na", "UNKNOWN", "hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str31 = myDataCenterInstanceConfig30.getStatusPageUrl();
        int int32 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int33 = myDataCenterInstanceConfig30.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = myDataCenterInstanceConfig30.getMetadataMap();
        int int35 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        int int36 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        boolean boolean37 = myDataCenterInstanceConfig30.isInstanceEnabledOnit();
        java.lang.String str38 = myDataCenterInstanceConfig30.getSecureHealthCheckUrl();
        java.lang.String str39 = myDataCenterInstanceConfig30.getVirtualHostName();
        int int40 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = myDataCenterInstanceConfig30.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder29.setMetadata(strMap41);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setCountryId((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setHealthCheckUrls("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "", "172.20.26.3");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str21 = myDataCenterInstanceConfig20.getStatusPageUrl();
        java.lang.String str22 = myDataCenterInstanceConfig20.getSecureVirtualHostName();
        java.lang.String str23 = myDataCenterInstanceConfig20.getStatusPageUrlPath();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = myDataCenterInstanceConfig20.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setMetadata(strMap24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder17.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSID("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder27.setHealthCheckUrls("UNKNOWN", "", "HI!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder30.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder30.add("", "/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str42 = myDataCenterInstanceConfig41.getStatusPageUrl();
        int int43 = myDataCenterInstanceConfig41.getLeaseExpirationDurationInSeconds();
        int int44 = myDataCenterInstanceConfig41.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = myDataCenterInstanceConfig41.getMetadataMap();
        java.lang.String str46 = myDataCenterInstanceConfig41.getIpAddress();
        boolean boolean47 = myDataCenterInstanceConfig41.getSecurePortEnabled();
        java.lang.String str48 = myDataCenterInstanceConfig41.getHealthCheckUrlPath();
        boolean boolean49 = myDataCenterInstanceConfig41.isNonSecurePortEnabled();
        java.lang.String str50 = myDataCenterInstanceConfig41.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo51 = myDataCenterInstanceConfig41.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig52 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder30.setDataCenterInfo(dataCenterInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder25.setDataCenterInfo(dataCenterInfo51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder25.setHealthCheckUrls("unknown", "na", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/healthcheck", "eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setHealthCheckUrls("hi!", "172.20.26.3", "/Status");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder23.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("172.20.26.3");
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder10.setHealthCheckUrlsForDeser("/", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp(1636098656622L);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("", "/STATUS");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType20 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.enablePort(portType20, false);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType20, true);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setHostName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType32 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder29.enablePort(portType32, false);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder24.enablePort(portType32, false);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder8.enablePort(portType32, true);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str42 = myDataCenterInstanceConfig41.getStatusPageUrl();
        int int43 = myDataCenterInstanceConfig41.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo44 = myDataCenterInstanceConfig41.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig45 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo44);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig46 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo44);
        java.lang.String str47 = myDataCenterInstanceConfig46.getNamespace();
        java.lang.String str48 = myDataCenterInstanceConfig46.getAppname();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = myDataCenterInstanceConfig46.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder38.setMetadata(strMap49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder38.setHealthCheckUrls("HI!", "HI!", "/");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("", "/healthcheck");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setLastDirtyTimestamp(1636098570690L);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setAppGroupName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setStatusPageUrl("UNKNOWN", "172.20.26.3");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.add("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddressDeser("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder29.setHealthCheckUrls("/healthcheck", "unknown", "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str11 = myDataCenterInstanceConfig10.getStatusPageUrl();
        java.lang.String str12 = myDataCenterInstanceConfig10.getSecureVirtualHostName();
        java.lang.String str13 = myDataCenterInstanceConfig10.getSecureHealthCheckUrl();
        boolean boolean14 = myDataCenterInstanceConfig10.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo15 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder2.setDataCenterInfo(dataCenterInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.add("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setSID("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder17.setLastDirtyTimestamp(1636098576850L);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.add("", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder24.setHomePageUrl("/Status", "/Status");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder2.build();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setStatusPageUrlForDeser("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setHomePageUrl("/healthcheck", "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrlsForDeser("172.20.26.3", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.add("unknown", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("/STATUS", "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setVIPAddress("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("UNKNOWN", "/STATUS");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setNamespace("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("/healthcheck", "UNKNOWN");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setHealthCheckUrls("unknown", "inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder2.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "default");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder16.getRawInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = instanceInfo19.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setMetadata(strMap20);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setHealthCheckUrls("/", "UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN", "/Status");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        boolean boolean8 = builder5.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSecurePort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("172.20.26.3", "", "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setPort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "eureka.");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("/", "HI!", "default");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        boolean boolean14 = builder11.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setStatusPageUrl("/STATUS", "/STATUS");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "hi!", "172.20.26.3");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("hi!", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("/Status", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHealthCheckUrls("hi!", "eureka.", "/healthcheck");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setActionType(actionType24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatus(instanceStatus28);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig32 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str33 = myDataCenterInstanceConfig32.getStatusPageUrl();
        int int34 = myDataCenterInstanceConfig32.getLeaseExpirationDurationInSeconds();
        int int35 = myDataCenterInstanceConfig32.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = myDataCenterInstanceConfig32.getMetadataMap();
        java.lang.String str37 = myDataCenterInstanceConfig32.getIpAddress();
        java.lang.String str38 = myDataCenterInstanceConfig32.getVirtualHostName();
        int int39 = myDataCenterInstanceConfig32.getSecurePort();
        java.lang.String str40 = myDataCenterInstanceConfig32.getAppname();
        boolean boolean41 = myDataCenterInstanceConfig32.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo42 = myDataCenterInstanceConfig32.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder29.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder16.setDataCenterInfo(dataCenterInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder16.add("HI!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder16.setHealthCheckUrls("hi!", "UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "/", "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setStatusPageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setPort(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setPort((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("/", "unknown");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setHealthCheckUrls("/healthcheck", "hi!", "na");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setAppName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHealthCheckUrls("na", "http://inesserver2.windows.cin.ufpe.br:80/Status", "unknown");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "unknown");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("eureka.", "unknown");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder15.setStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder8.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder26.setHealthCheckUrlsForDeser("eureka.", "HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder43.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType48 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder47.enablePort(portType48, true);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder56 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType59 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder56.enablePort(portType59, false);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder55.enablePort(portType59, true);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setHostName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder66 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder66.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder68.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType71 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder68.enablePort(portType71, false);
        com.netflix.appinfo.InstanceInfo.Builder builder75 = builder63.enablePort(portType71, false);
        com.netflix.appinfo.InstanceInfo.Builder builder77 = builder47.enablePort(portType71, true);
        com.netflix.appinfo.InstanceInfo.Builder builder79 = builder34.enablePort(portType71, true);
        com.netflix.appinfo.InstanceInfo.Builder builder81 = builder29.enablePort(portType71, true);
        com.netflix.appinfo.InstanceInfo.Builder builder83 = builder29.setSecurePort(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder83.setStatusPageUrl("unknown", "/Status");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("HI!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        boolean boolean15 = myDataCenterInstanceConfig14.getSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = myDataCenterInstanceConfig14.getMetadataMap();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setDataCenterInfo(dataCenterInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setHealthCheckUrls("172.20.26.3", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "/");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setStatusPageUrl("hi!", "172.20.26.3");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br", "HI!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("na", "default");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.add("eureka.", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddress("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatusPageUrl("172.20.26.3", "unknown");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str21 = myDataCenterInstanceConfig20.getStatusPageUrl();
        java.lang.String str22 = myDataCenterInstanceConfig20.getSecureVirtualHostName();
        java.lang.String str23 = myDataCenterInstanceConfig20.getStatusPageUrlPath();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = myDataCenterInstanceConfig20.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setMetadata(strMap24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("/STATUS", "/Status");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.add("unknown", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setNamespace("/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "172.20.26.3", "eureka.");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId(100);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("eureka.", "eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/Status");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str8 = myDataCenterInstanceConfig7.getStatusPageUrl();
        java.lang.String str9 = myDataCenterInstanceConfig7.getSecureVirtualHostName();
        java.lang.String str10 = myDataCenterInstanceConfig7.getSecureHealthCheckUrl();
        boolean boolean11 = myDataCenterInstanceConfig7.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setPort(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder4.setStatusPageUrl("default", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "/Status");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setASGName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(1636098628946L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("/STATUS", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId(100);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHomePageUrlForDeser("INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setHomePageUrl("172.20.26.3", "/STATUS");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.add("HI!", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.add("na", "http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder12.add("/healthcheck", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHomePageUrl("/STATUS", "/");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(443);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("hi!", "HI!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        boolean boolean12 = builder11.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setPort((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (short) 10);
        boolean boolean10 = builder9.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHomePageUrl("HI!", "172.20.26.3");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("172.20.26.3", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setNamespace("INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setPort(90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder21.setHealthCheckUrls("default", "http://inesserver2.windows.cin.ufpe.br:80/Status", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("na", "", "eureka.");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder7.setHealthCheckUrlsForDeser("unknown", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder24.setHealthCheckUrls("/", "/Status", "UNKNOWN");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setActionType(actionType10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("hi!", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppName("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType30 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder27.enablePort(portType30, false);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder34.setHealthCheckUrlsForDeser("na", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig54 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str55 = myDataCenterInstanceConfig54.getStatusPageUrl();
        java.lang.String str56 = myDataCenterInstanceConfig54.getSecureVirtualHostName();
        java.lang.String str57 = myDataCenterInstanceConfig54.getSecureHealthCheckUrl();
        boolean boolean58 = myDataCenterInstanceConfig54.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo59 = myDataCenterInstanceConfig54.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder51.setDataCenterInfo(dataCenterInfo59);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder42.setDataCenterInfo(dataCenterInfo59);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig64 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str65 = myDataCenterInstanceConfig64.getStatusPageUrl();
        int int66 = myDataCenterInstanceConfig64.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo67 = myDataCenterInstanceConfig64.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig68 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo67);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig69 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo67);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder61.setDataCenterInfo(dataCenterInfo67);
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder34.setDataCenterInfo(dataCenterInfo67);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig72 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo67);
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder21.setDataCenterInfo(dataCenterInfo67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder73.setHomePageUrl("HI!", "na");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHomePageUrl("hi!", "default");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(0L);
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrlsForDeser("/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setHealthCheckUrls("unknown", "unknown", "/healthcheck");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp(1636098571722L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setNamespace("/healthcheck");
        boolean boolean14 = builder13.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder13.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("na", "http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.add("eureka.", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setHomePageUrl("HI!", "na");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecurePort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setStatusPageUrlForDeser("eureka.");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str28 = myDataCenterInstanceConfig27.getNamespace();
        java.lang.String str29 = myDataCenterInstanceConfig27.getSecureVirtualHostName();
        java.lang.String str30 = myDataCenterInstanceConfig27.getNamespace();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = myDataCenterInstanceConfig27.getMetadataMap();
        java.lang.String str32 = myDataCenterInstanceConfig27.getHealthCheckUrlPath();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = myDataCenterInstanceConfig27.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder24.setMetadata(strMap33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder24.setStatusPageUrl("HI!", "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (byte) 0);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str15 = myDataCenterInstanceConfig14.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getSecureHealthCheckUrl();
        boolean boolean18 = myDataCenterInstanceConfig14.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder11.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType27 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setActionType(actionType27);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder24.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType39 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setActionType(actionType39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder31.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder45.getRawInstance();
        instanceInfo46.setIsCoordinatingDiscoveryServer();
        java.lang.String str48 = instanceInfo46.getVersion();
        java.lang.String str49 = instanceInfo46.getSecureVipAddress();
        instanceInfo46.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder52.enablePort(portType55, false);
        boolean boolean58 = instanceInfo46.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder21.enablePort(portType55, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder21.setHomePageUrl("unknown", "na");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setASGName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHealthCheckUrlsForDeser("hi!", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setCountryId((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrls("/healthcheck", "UNKNOWN", "hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str18 = myDataCenterInstanceConfig17.getStatusPageUrl();
        int int19 = myDataCenterInstanceConfig17.getLeaseRenewalIntervalInSeconds();
        int int20 = myDataCenterInstanceConfig17.getLeaseExpirationDurationInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo21 = myDataCenterInstanceConfig17.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setDataCenterInfo(dataCenterInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSID("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder22.setHomePageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder26.setHomePageUrl("HI!", "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.PortType portType9 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.enablePort(portType9, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "UNKNOWN");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType3 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.enablePort(portType3, false);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.add("na", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder5.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder5.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setVIPAddressDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setStatusPageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType5 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.enablePort(portType5, false);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecurePort((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrls("/healthcheck", "eureka.", "HI!");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setStatusPageUrlForDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder24.setHealthCheckUrls("/Status", "na", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setStatusPageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("unknown", "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setCountryId(1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("HI!", "/healthcheck");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("/Status", "UNKNOWN", "default");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setLastDirtyTimestamp(1636098565070L);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("na", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.PortType portType8 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.enablePort(portType8, false);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType8, true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHealthCheckUrlsForDeser("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHealthCheckUrls("default", "unknown", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.ActionType actionType10 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setActionType(actionType10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str13 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str14 = myDataCenterInstanceConfig12.getSecureVirtualHostName();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig12.getHomePageUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setStatusPageUrlForDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setCountryId(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setStatusPageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrlsForDeser("172.20.26.3", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/", "/STATUS");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str16 = myDataCenterInstanceConfig15.getStatusPageUrl();
        int int17 = myDataCenterInstanceConfig15.getLeaseExpirationDurationInSeconds();
        int int18 = myDataCenterInstanceConfig15.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = myDataCenterInstanceConfig15.getMetadataMap();
        java.lang.String str20 = myDataCenterInstanceConfig15.getIpAddress();
        java.lang.String str21 = myDataCenterInstanceConfig15.getVirtualHostName();
        int int22 = myDataCenterInstanceConfig15.getSecurePort();
        java.lang.String str23 = myDataCenterInstanceConfig15.getAppname();
        boolean boolean24 = myDataCenterInstanceConfig15.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder12.setDataCenterInfo(dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder12.setCountryId((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder12.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.ActionType actionType15 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setActionType(actionType15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder7.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.add("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder21.setHomePageUrlForDeser("/STATUS");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str32 = myDataCenterInstanceConfig31.getStatusPageUrl();
        java.lang.String str33 = myDataCenterInstanceConfig31.getSecureVirtualHostName();
        java.lang.String str34 = myDataCenterInstanceConfig31.getSecureHealthCheckUrl();
        boolean boolean35 = myDataCenterInstanceConfig31.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = myDataCenterInstanceConfig31.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig37 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo36);
        int int38 = myDataCenterInstanceConfig37.getNonSecurePort();
        java.lang.String str39 = myDataCenterInstanceConfig37.getSecureVirtualHostName();
        java.lang.String str40 = myDataCenterInstanceConfig37.getAppname();
        boolean boolean41 = myDataCenterInstanceConfig37.isInstanceEnabledOnit();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = myDataCenterInstanceConfig37.getMetadataMap();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo43 = myDataCenterInstanceConfig37.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder21.setDataCenterInfo(dataCenterInfo43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder44.setHomePageUrl("", "/healthcheck");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrl("eureka.", "inesserver2.windows.cin.ufpe.br:80");
    }
}

