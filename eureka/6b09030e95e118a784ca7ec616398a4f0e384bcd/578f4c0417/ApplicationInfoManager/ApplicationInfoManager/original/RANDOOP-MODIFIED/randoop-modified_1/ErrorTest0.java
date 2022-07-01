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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setStatusPageUrl("/", "/Status");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.getInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "", "/healthcheck");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray4 = new java.lang.String[] { "unknown", "unknown", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        java.lang.Long long14 = instanceInfo12.isDirtyWithTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("", "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("hi!", "na");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder4.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "na");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("hi!", "/Status");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("hi!", "", "unknown");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "", "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("unknown", "/", "/healthcheck");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("na", "na", "/Status");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.String[] strArray5 = new java.lang.String[] { "172.20.26.3", "unknown", "/", "172.20.26.3", "unknown" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        instanceInfo13.setLastUpdatedTimestamp();
        boolean boolean15 = instanceInfo13.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo13.setStatus(instanceStatus17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType10, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        instanceInfo20.setLastUpdatedTimestamp();
        boolean boolean22 = instanceInfo20.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo20.setStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder4.setOverriddenStatus(instanceStatus25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setHealthCheckUrls("hi!", "unknown", "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("unknown", "/healthcheck");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("172.20.26.3", "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.String[] strArray6 = new java.lang.String[] { "na", "172.20.26.3", "", "na", "hi!", "unknown" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        java.lang.Long long16 = instanceInfo14.getLastDirtyTimestamp();
        instanceInfo14.setSID("");
        instanceInfo14.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setHomePageUrl("", "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getASGName();
        java.lang.String str9 = instanceInfo7.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort(30);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder10.setHealthCheckUrls("na", "hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSID("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setHealthCheckUrls("172.20.26.3", "", "/healthcheck");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setActionType(actionType17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder4.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder5.setHealthCheckUrls("hi!", "/", "/Status");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder4.setHomePageUrl("/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatusPageUrl("/", "/healthcheck");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setASGName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.add("hi!", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setStatusPageUrl("/", "/");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastUpdatedTimestamp((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("172.20.26.3", "/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.String[] strArray2 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        int int11 = instanceInfo10.getSecurePort();
        java.lang.Long long12 = instanceInfo10.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo10);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        java.util.Set<java.lang.String> strSet16 = instanceInfo15.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setHealthCheckUrlsForDeser("", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder12.setHomePageUrl("hi!", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.String[] strArray6 = new java.lang.String[] { "172.20.26.3", "172.20.26.3", "172.20.26.3", "hi!", "inesserver2.windows.cin.ufpe.br", "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        java.lang.String str16 = instanceInfo14.getSID();
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = instanceInfo14.getActionType();
        java.lang.String str18 = instanceInfo14.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        int int10 = instanceInfo9.getSecurePort();
        java.lang.Long long11 = instanceInfo9.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        int int14 = instanceInfo13.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager24 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = applicationInfoManager24.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager24.setInstanceStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = instanceInfo22.setStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = instanceInfo22.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType36 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setActionType(actionType36);
        com.netflix.appinfo.InstanceInfo.PortType portType38 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder35.enablePort(portType38, false);
        com.netflix.appinfo.InstanceInfo.PortType portType41 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder35.enablePort(portType41, true);
        boolean boolean44 = instanceInfo22.isPortEnabled(portType41);
        boolean boolean45 = instanceInfo13.isPortEnabled(portType41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setSID("/");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setStatusPageUrl("", "unknown");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("unknown", "", "na");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("hi!", "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean10 = myDataCenterInstanceConfig9.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig9.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("/Status", "/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSID("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("hi!", "na", "/Status");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setStatusPageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("/Status", "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatusPageUrl("", "/Status");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        int int9 = instanceInfo8.getSecurePort();
        java.lang.Long long10 = instanceInfo8.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo8);
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo8);
        java.lang.Long long13 = instanceInfo12.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = instanceInfo12.getMetadata();
        int int15 = instanceInfo12.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = instanceInfo12.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHealthCheckUrls("/healthcheck", "/healthcheck", "/");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrls("hi!", "/healthcheck", "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHomePageUrl("unknown", "na");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setLastUpdatedTimestamp((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setStatusPageUrl("", "na");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setCountryId(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setHealthCheckUrls("hi!", "hi!", "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.String[] strArray6 = new java.lang.String[] { "/", "unknown", "inesserver2.windows.cin.ufpe.br", "/Status", "/", "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        instanceInfo14.setLastUpdatedTimestamp();
        java.lang.String str16 = instanceInfo14.getIPAddr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.String[] strArray1 = new java.lang.String[] { "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        int int10 = instanceInfo9.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = applicationInfoManager11.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager11.setInstanceStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo9.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder39.setHealthCheckUrls("unknown", "hi!", "unknown");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder11.setASGName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setHomePageUrl("/healthcheck", "na");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray3 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80", "/healthcheck", "" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        java.util.Set<java.lang.String> strSet17 = instanceInfo15.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setHealthCheckUrlsForDeser("", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder22.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType27 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setActionType(actionType27);
        com.netflix.appinfo.InstanceInfo.PortType portType29 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder26.enablePort(portType29, false);
        com.netflix.appinfo.InstanceInfo.PortType portType32 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder26.enablePort(portType32, true);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder21.enablePort(portType32, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder21.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastDirtyTimestamp((long) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder23.getRawInstance();
        int int25 = instanceInfo24.getSecurePort();
        java.lang.Long long26 = instanceInfo24.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = instanceInfo24.getOverriddenStatus();
        java.lang.String str29 = instanceInfo24.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder43.getRawInstance();
        int int45 = instanceInfo44.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager46 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo47 = applicationInfoManager46.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager46.setInstanceStatus(instanceStatus48);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus50 = instanceInfo44.setStatus(instanceStatus48);
        com.netflix.appinfo.InstanceInfo instanceInfo51 = new com.netflix.appinfo.InstanceInfo(instanceInfo44);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder59.getRawInstance();
        instanceInfo60.setLastUpdatedTimestamp();
        boolean boolean62 = instanceInfo60.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus65 = instanceInfo60.setStatus(instanceStatus64);
        instanceInfo51.setStatusWithoutDirty(instanceStatus65);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder34.setStatus(instanceStatus65);
        instanceInfo24.setOverriddenStatus(instanceStatus65);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder16.setStatus(instanceStatus65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder69.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray6 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br", "UNKNOWN", "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        java.lang.Long long16 = instanceInfo14.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        java.util.Set<java.lang.String> strSet20 = instanceInfo19.getHealthCheckUrls();
        instanceInfo19.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo22);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrls("unknown", "UNKNOWN", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager14.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager14.setInstanceStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setStatus(instanceStatus16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setStatusPageUrl("", "/healthcheck");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setHomePageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHealthCheckUrlsForDeser("/Status", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setLastUpdatedTimestamp((long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.String[] strArray5 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br", "na", "inesserver2.windows.cin.ufpe.br:80", "hi!", "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        int int14 = instanceInfo13.getSecurePort();
        java.lang.Long long15 = instanceInfo13.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        int int18 = instanceInfo17.getCountryId();
        java.lang.Long long19 = instanceInfo17.isDirtyWithTime();
        java.lang.String str20 = instanceInfo17.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = instanceInfo22.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder12.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80", "/Status");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.String[] strArray5 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br", "172.20.26.3", "unknown", "na", "/" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        int int14 = instanceInfo13.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setHostName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = applicationInfoManager25.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus27 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager25.setInstanceStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo23.setStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager31 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = applicationInfoManager31.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager31.setInstanceStatus(instanceStatus33);
        instanceInfo23.setStatusWithoutDirty(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder10.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder5.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder5.setVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder5.setHomePageUrl("", "172.20.26.3");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHealthCheckUrlsForDeser("unknown", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("/", "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder12.setHealthCheckUrls("hi!", "UNKNOWN", "172.20.26.3");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo26);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder11.setDataCenterInfo(dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder11.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder11.setStatusPageUrl("UNKNOWN", "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder11.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setActionType(actionType21);
        com.netflix.appinfo.InstanceInfo.PortType portType23 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.enablePort(portType23, false);
        com.netflix.appinfo.InstanceInfo.PortType portType26 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.enablePort(portType26, true);
        boolean boolean29 = instanceInfo7.isPortEnabled(portType26);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.LeaseInfo leaseInfo33 = instanceInfo30.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo34 = new com.netflix.appinfo.InstanceInfo(instanceInfo30);
        com.netflix.appinfo.InstanceInfo instanceInfo35 = new com.netflix.appinfo.InstanceInfo(instanceInfo34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder36.setStatusPageUrl("hi!", "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        int int21 = instanceInfo20.getSecurePort();
        java.lang.Long long22 = instanceInfo20.getLastDirtyTimestamp();
        instanceInfo20.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo20.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder12.setOverriddenStatus(instanceStatus26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder12.setStatusPageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager14.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager14.setInstanceStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setStatus(instanceStatus16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("", "UNKNOWN");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setHomePageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "/healthcheck", "/");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        java.lang.String str14 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/Status", "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("", "na", "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "unknown", "/");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("hi!", "unknown", "unknown");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray3 = new java.lang.String[] { "172.20.26.3", "", "UNKNOWN" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        java.lang.String str14 = instanceInfo11.getHostName();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = instanceInfo11.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder24.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        java.lang.Long long35 = instanceInfo33.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo instanceInfo37 = builder36.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo37);
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder38.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo40 = instanceInfo39.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo48 = builder47.getRawInstance();
        int int49 = instanceInfo48.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder50.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType55 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setActionType(actionType55);
        instanceInfo48.setActionType(actionType55);
        instanceInfo39.setActionType(actionType55);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder24.setActionType(actionType55);
        instanceInfo11.setActionType(actionType55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setSID("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("", "UNKNOWN");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str17 = myDataCenterInstanceConfig16.getVirtualHostName();
        int int18 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig16.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = myDataCenterInstanceConfig16.getMetadataMap();
        boolean boolean21 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setDataCenterInfo(dataCenterInfo22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setHealthCheckUrls("/Status", "inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder11.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder11.setASGName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder11.setHealthCheckUrls("172.20.26.3", "/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "/healthcheck", "inesserver2.windows.cin.ufpe.br", "na", "/", "UNKNOWN" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        java.lang.Long long16 = instanceInfo14.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        java.util.Set<java.lang.String> strSet20 = instanceInfo19.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        java.lang.String str22 = instanceInfo21.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setNamespace("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.String[] strArray4 = new java.lang.String[] { "UNKNOWN", "hi!", "/healthcheck", "/healthcheck" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        java.lang.String str13 = instanceInfo12.getASGName();
        java.lang.String str14 = instanceInfo12.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo12);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        instanceInfo12.setStatusWithoutDirty(instanceStatus17);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        java.lang.Long long20 = instanceInfo12.getLastDirtyTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp(1636099530805L);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager18 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = applicationInfoManager18.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager18.getInfo();
        applicationInfoManager18.unregisterStatusChangeListener("");
        applicationInfoManager18.unregisterStatusChangeListener("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType31 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setActionType(actionType31);
        com.netflix.appinfo.InstanceInfo.PortType portType33 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.enablePort(portType33, false);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder30.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder30.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig46 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean47 = myDataCenterInstanceConfig46.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo48 = myDataCenterInstanceConfig46.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig49 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo48);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig50 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo48);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig51 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo48);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo52 = myDataCenterInstanceConfig51.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder39.setDataCenterInfo(dataCenterInfo52);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig54 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo52);
        applicationInfoManager18.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig54);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder62.getRawInstance();
        int int64 = instanceInfo63.getSecurePort();
        java.lang.Long long65 = instanceInfo63.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder66 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo63);
        com.netflix.appinfo.InstanceInfo instanceInfo67 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.Long long68 = instanceInfo67.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = instanceInfo67.getMetadata();
        java.util.Map<java.lang.String, java.lang.String> strMap70 = instanceInfo67.getMetadata();
        applicationInfoManager18.registerAppMetadata(strMap70);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig77 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean78 = myDataCenterInstanceConfig77.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo79 = myDataCenterInstanceConfig77.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig80 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo79);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig81 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo79);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig82 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo79);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig83 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo79);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = myDataCenterInstanceConfig83.getMetadataMap();
        applicationInfoManager18.registerAppMetadata(strMap84);
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder17.setMetadata(strMap84);
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder86.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder91 = builder86.setStatusPageUrl("172.20.26.3", "/healthcheck");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        java.lang.String str18 = instanceInfo17.getASGName();
        java.lang.String str19 = instanceInfo17.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.PortType portType20 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        boolean boolean21 = instanceInfo17.isPortEnabled(portType20);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder2.enablePort(portType20, false);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder2.setNamespace("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder2.setHomePageUrl("172.20.26.3", "unknown");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setHealthCheckUrls("/healthcheck", "/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.String[] strArray3 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        java.lang.Long long13 = instanceInfo11.getLastDirtyTimestamp();
        instanceInfo11.setSID("");
        instanceInfo11.setIsCoordinatingDiscoveryServer();
        instanceInfo11.setSID("172.20.26.3");
        instanceInfo11.setSID("");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setStatusPageUrl("unknown", "/Status");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setASGName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder15.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "na", "/Status");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.String[] strArray6 = new java.lang.String[] { "/healthcheck", "hi!", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setActionType(actionType21);
        instanceInfo14.setActionType(actionType21);
        instanceInfo14.unsetIsDirty((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        java.lang.String str28 = instanceInfo14.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "unknown");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getASGName();
        java.lang.String str9 = instanceInfo7.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort(30);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatusPageUrl("/healthcheck", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastUpdatedTimestamp((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastDirtyTimestamp((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setStatusPageUrl("/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.String[] strArray2 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/", "/" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        int int11 = instanceInfo10.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo10);
        java.lang.String str13 = instanceInfo10.getId();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setHostName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder22.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType27 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setActionType(actionType27);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder21.setActionType(actionType27);
        instanceInfo10.setActionType(actionType27);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = instanceInfo10.getMetadata();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = new com.netflix.appinfo.InstanceInfo(instanceInfo10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.PortType portType24 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.enablePort(portType24, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder26.setStatusPageUrl("hi!", "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("/", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setHealthCheckUrls("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status", "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long12 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("172.20.26.3", "/", "unknown");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        int int10 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.String[] strArray4 = new java.lang.String[] { "na", "na", "inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager14.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager14.setInstanceStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo12);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo12.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        instanceInfo12.unsetIsDirty(1636099523368L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrlsForDeser("unknown", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setHealthCheckUrls("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/", "unknown");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder13.setDataCenterInfo(dataCenterInfo26);
        boolean boolean28 = builder13.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder13.setAppName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.String[] strArray2 = new java.lang.String[] { "/healthcheck", "na" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        instanceInfo10.setLastUpdatedTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder4.setStatusPageUrl("", "UNKNOWN");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setHealthCheckUrlsForDeser("hi!", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/", "unknown");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder4.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.add("UNKNOWN", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder41.setHealthCheckUrls("/Status", "unknown", "/Status");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setHealthCheckUrls("UNKNOWN", "/Status", "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.String[] strArray2 = new java.lang.String[] { "/healthcheck", "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType8 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setActionType(actionType8);
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.enablePort(portType10, false);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo13);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo13);
        long long16 = instanceInfo15.getLastUpdatedTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        long long12 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setHostName("unknown");
        boolean boolean20 = instanceInfo7.equals((java.lang.Object) builder19);
        java.lang.String str21 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str23 = instanceInfo22.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.String[] strArray4 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80", "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        java.lang.Long long14 = instanceInfo12.isDirtyWithTime();
        java.lang.String str15 = instanceInfo12.getStatusPageUrl();
        instanceInfo12.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo12);
        java.lang.String str19 = instanceInfo12.getAppName();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getSecurePort();
        java.lang.Long long29 = instanceInfo27.isDirtyWithTime();
        java.lang.String str30 = instanceInfo27.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.ActionType actionType33 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        instanceInfo27.setActionType(actionType33);
        instanceInfo12.setActionType(actionType33);
        java.lang.Long long36 = instanceInfo12.getLastDirtyTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp(1636099545446L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setHealthCheckUrls("/", "/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        java.lang.String str10 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("/Status", "", "172.20.26.3");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setHealthCheckUrls("", "unknown", "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo13.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setActionType(actionType29);
        instanceInfo22.setActionType(actionType29);
        instanceInfo13.setActionType(actionType29);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setStatusPageUrl("hi!", "/");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getSecurePort();
        java.lang.Long long29 = instanceInfo27.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo31);
        java.util.Set<java.lang.String> strSet33 = instanceInfo31.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo34 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo instanceInfo35 = new com.netflix.appinfo.InstanceInfo(instanceInfo34);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = instanceInfo34.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder17.setStatus(instanceStatus36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHealthCheckUrls("", "172.20.26.3", "na");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str18 = instanceInfo7.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo instanceInfo29 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = instanceInfo28.getOverriddenStatus();
        instanceInfo7.setStatusWithoutDirty(instanceStatus30);
        com.netflix.appinfo.InstanceInfo instanceInfo32 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setHealthCheckUrls("", "/Status", "na");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("172.20.26.3", "", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean27 = myDataCenterInstanceConfig26.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo28 = myDataCenterInstanceConfig26.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder23.setDataCenterInfo(dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder16.setDataCenterInfo(dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder38.getRawInstance();
        int int40 = instanceInfo39.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager41 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager41.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager41.setInstanceStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = instanceInfo39.setStatus(instanceStatus43);
        com.netflix.appinfo.InstanceInfo instanceInfo46 = new com.netflix.appinfo.InstanceInfo(instanceInfo39);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo46);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo55 = builder54.getRawInstance();
        instanceInfo55.setLastUpdatedTimestamp();
        boolean boolean57 = instanceInfo55.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus59 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = instanceInfo55.setStatus(instanceStatus59);
        instanceInfo46.setStatusWithoutDirty(instanceStatus60);
        instanceInfo46.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo70 = builder69.getRawInstance();
        instanceInfo70.setLastUpdatedTimestamp();
        boolean boolean72 = instanceInfo70.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus74 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus75 = instanceInfo70.setStatus(instanceStatus74);
        java.util.Map<java.lang.String, java.lang.String> strMap76 = instanceInfo70.getMetadata();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus77 = instanceInfo70.getStatus();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus78 = instanceInfo46.setStatus(instanceStatus77);
        com.netflix.appinfo.InstanceInfo.Builder builder79 = builder16.setOverriddenStatus(instanceStatus78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder79.setStatusPageUrl("", "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder13.setDataCenterInfo(dataCenterInfo26);
        boolean boolean28 = builder13.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder13.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setSecureVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.setStatusPageUrl("UNKNOWN", "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder4.setStatusPageUrl("", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.String[] strArray2 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/", "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        int int11 = instanceInfo10.getSecurePort();
        java.lang.Long long12 = instanceInfo10.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.LeaseInfo leaseInfo16 = instanceInfo14.getLeaseInfo();
        java.lang.String str17 = instanceInfo14.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder24.getRawInstance();
        int int26 = instanceInfo25.getSecurePort();
        java.lang.Long long27 = instanceInfo25.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo25.getOverriddenStatus();
        instanceInfo14.setOverriddenStatus(instanceStatus29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long17 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder18.setHomePageUrl("hi!", "na");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("172.20.26.3", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("/Status", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("hi!", "na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("inesserver2.windows.cin.ufpe.br", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setASGName("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean14 = myDataCenterInstanceConfig13.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo15 = myDataCenterInstanceConfig13.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo15);
        boolean boolean20 = myDataCenterInstanceConfig19.getSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = myDataCenterInstanceConfig19.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder5.setMetadata(strMap21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setASGName("inesserver2.windows.cin.ufpe.br");
        boolean boolean25 = builder24.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setStatusPageUrl("na", "unknown");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastUpdatedTimestamp((long) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        int int32 = instanceInfo31.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo34 = applicationInfoManager33.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager33.setInstanceStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo31.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo31.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType45 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setActionType(actionType45);
        com.netflix.appinfo.InstanceInfo.PortType portType47 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder44.enablePort(portType47, false);
        com.netflix.appinfo.InstanceInfo.PortType portType50 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder44.enablePort(portType50, true);
        boolean boolean53 = instanceInfo31.isPortEnabled(portType50);
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo54);
        java.lang.Long long56 = instanceInfo54.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder59.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo64 = builder63.getRawInstance();
        int int65 = instanceInfo64.getSecurePort();
        java.lang.Long long66 = instanceInfo64.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder67 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo64);
        com.netflix.appinfo.InstanceInfo instanceInfo68 = builder67.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo68);
        java.util.Set<java.lang.String> strSet70 = instanceInfo68.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo71 = new com.netflix.appinfo.InstanceInfo(instanceInfo68);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus72 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        instanceInfo71.setStatusWithoutDirty(instanceStatus72);
        com.netflix.appinfo.InstanceInfo.Builder builder74 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder74.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder78.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo81 = builder80.getRawInstance();
        java.lang.String str82 = instanceInfo81.getASGName();
        java.lang.String str83 = instanceInfo81.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder84 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo81);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus86 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        instanceInfo81.setStatusWithoutDirty(instanceStatus86);
        instanceInfo71.setStatusWithoutDirty(instanceStatus86);
        java.lang.String str89 = instanceInfo71.getVersion();
        boolean boolean90 = instanceInfo54.equals((java.lang.Object) instanceInfo71);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus91 = instanceInfo71.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder23.setStatus(instanceStatus91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder96 = builder23.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "hi!", "/");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        java.util.Set<java.lang.String> strSet10 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setNamespace("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setStatusPageUrl("/healthcheck", "/healthcheck");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        boolean boolean3 = builder2.isInitialized();
        boolean boolean4 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSID("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = instanceInfo17.getMetadata();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = instanceInfo17.getDataCenterInfo();
        java.util.Set<java.lang.String> strSet21 = instanceInfo17.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean27 = myDataCenterInstanceConfig26.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo28 = myDataCenterInstanceConfig26.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder23.setDataCenterInfo(dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder16.setDataCenterInfo(dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        int int9 = instanceInfo8.getSecurePort();
        java.lang.Long long10 = instanceInfo8.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo8);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo8.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo8);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = instanceInfo8.getOverriddenStatus();
        int int15 = instanceInfo8.getCountryId();
        instanceInfo8.setIsCoordinatingDiscoveryServer();
        java.lang.String str17 = instanceInfo8.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager16.setInstanceStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        instanceInfo14.setLastDirtyTimestamp((java.lang.Long) 1636099520437L);
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager35 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager35.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager35.setInstanceStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.setStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo instanceInfo40 = new com.netflix.appinfo.InstanceInfo(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setHostName("unknown");
        boolean boolean46 = instanceInfo33.equals((java.lang.Object) builder45);
        java.lang.String str47 = instanceInfo33.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo48 = new com.netflix.appinfo.InstanceInfo(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo57 = builder56.getRawInstance();
        int int58 = instanceInfo57.getSecurePort();
        java.lang.Long long59 = instanceInfo57.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder60 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo57);
        com.netflix.appinfo.InstanceInfo instanceInfo61 = new com.netflix.appinfo.InstanceInfo(instanceInfo57);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder62.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType67 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder66.setActionType(actionType67);
        com.netflix.appinfo.InstanceInfo.PortType portType69 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder66.enablePort(portType69, false);
        boolean boolean72 = instanceInfo57.isPortEnabled(portType69);
        boolean boolean73 = instanceInfo33.isPortEnabled(portType69);
        boolean boolean74 = instanceInfo14.isPortEnabled(portType69);
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder2.enablePort(portType69, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder76.setHealthCheckUrls("/healthcheck", "172.20.26.3", "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "na");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("UNKNOWN", "unknown", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        java.lang.String str14 = instanceInfo11.getVIPAddress();
        instanceInfo11.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str18 = myDataCenterInstanceConfig17.getVirtualHostName();
        java.lang.String str19 = myDataCenterInstanceConfig17.getSecureVirtualHostName();
        boolean boolean20 = instanceInfo11.equals((java.lang.Object) myDataCenterInstanceConfig17);
        java.lang.Boolean boolean21 = instanceInfo11.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        long long24 = instanceInfo11.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setStatusPageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        com.netflix.appinfo.LeaseInfo leaseInfo9 = instanceInfo7.getLeaseInfo();
        java.lang.String str10 = instanceInfo7.getId();
        java.util.Set<java.lang.String> strSet11 = instanceInfo7.getHealthCheckUrls();
        boolean boolean12 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType30 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setActionType(actionType30);
        instanceInfo23.setActionType(actionType30);
        instanceInfo23.unsetIsDirty((long) 80);
        instanceInfo23.setIsDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo36 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = instanceInfo23.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder13.setActionType(actionType37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.setStatusPageUrl("/Status", "/healthcheck");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setStatusPageUrl("na", "unknown");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        int int10 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddressDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setStatusPageUrl("/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        int int32 = instanceInfo31.getSecurePort();
        java.lang.Long long33 = instanceInfo31.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo31);
        com.netflix.appinfo.InstanceInfo instanceInfo35 = builder34.getRawInstance();
        int int36 = instanceInfo35.getCountryId();
        java.lang.Long long37 = instanceInfo35.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo35);
        com.netflix.appinfo.InstanceInfo instanceInfo39 = new com.netflix.appinfo.InstanceInfo(instanceInfo35);
        com.netflix.appinfo.InstanceInfo.ActionType actionType40 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        instanceInfo39.setActionType(actionType40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder23.setActionType(actionType40);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder23.setStatusPageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder44.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setStatusPageUrl("/", "default");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        instanceInfo7.setLastDirtyTimestamp((java.lang.Long) 30L);
        java.lang.String str12 = instanceInfo7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setSecureVIPAddress("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        instanceInfo7.setLastDirtyTimestamp((java.lang.Long) 30L);
        java.lang.String str12 = instanceInfo7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setSecureVIPAddress("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setHomePageUrl("UNKNOWN", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHomePageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("", "UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        java.lang.String str9 = instanceInfo7.getSecureVipAddress();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = instanceInfo7.getMetadata();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        java.lang.String str14 = instanceInfo11.getVIPAddress();
        java.lang.String str15 = instanceInfo11.getHostName();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setCountryId(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder13.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder15.getRawInstance();
        int int17 = instanceInfo16.getSecurePort();
        java.lang.Long long18 = instanceInfo16.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo16);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        java.util.Set<java.lang.String> strSet22 = instanceInfo20.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo24.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder6.setOverriddenStatus(instanceStatus25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "default", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo13.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setActionType(actionType29);
        instanceInfo22.setActionType(actionType29);
        instanceInfo13.setActionType(actionType29);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setHealthCheckUrls("", "default", "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean23 = myDataCenterInstanceConfig22.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig22.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder19.setDataCenterInfo(dataCenterInfo24);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean32 = myDataCenterInstanceConfig31.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig31.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder26.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo33);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = myDataCenterInstanceConfig38.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder10.setMetadata(strMap39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setSID("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder40.setStatusPageUrl("na", "/healthcheck");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        java.lang.String str14 = instanceInfo11.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId(100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecurePort(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHomePageUrl("UNKNOWN", "/");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str10 = instanceInfo7.getId();
        instanceInfo7.setIsDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setLastUpdatedTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setPort(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setStatusPageUrl("/", "/healthcheck");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        instanceInfo23.setLastUpdatedTimestamp();
        boolean boolean25 = instanceInfo23.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus27 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = instanceInfo23.setStatus(instanceStatus27);
        instanceInfo14.setStatusWithoutDirty(instanceStatus28);
        instanceInfo14.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setHealthCheckUrls("na", "inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrlsForDeser("unknown", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "unknown");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.String[] strArray4 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br", "na" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        java.lang.String str13 = instanceInfo12.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = instanceInfo12.getStatus();
        instanceInfo12.setLastDirtyTimestamp((java.lang.Long) 30L);
        java.lang.String str17 = instanceInfo12.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = instanceInfo12.getDataCenterInfo();
        java.lang.String str19 = instanceInfo12.getId();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        instanceInfo12.setIsDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecurePort((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo7.setLastDirtyTimestamp((java.lang.Long) 1636099523560L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("/", "http://inesserver2.windows.cin.ufpe.br:80/", "default");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder4.setStatusPageUrl("unknown", "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder13.setDataCenterInfo(dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.add("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setSecurePort(90);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder36.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setHealthCheckUrls("", "", "172.20.26.3");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setHomePageUrlForDeser("na");
        boolean boolean18 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo35 = builder34.getRawInstance();
        int int36 = instanceInfo35.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager37 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo38 = applicationInfoManager37.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager37.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus41 = instanceInfo35.setStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = new com.netflix.appinfo.InstanceInfo(instanceInfo35);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder50.getRawInstance();
        instanceInfo51.setLastUpdatedTimestamp();
        boolean boolean53 = instanceInfo51.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus56 = instanceInfo51.setStatus(instanceStatus55);
        instanceInfo42.setStatusWithoutDirty(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder25.setStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder59.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo66 = builder65.getRawInstance();
        int int67 = instanceInfo66.getSecurePort();
        java.lang.Long long68 = instanceInfo66.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo66);
        com.netflix.appinfo.InstanceInfo instanceInfo70 = builder69.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder71 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo70);
        com.netflix.appinfo.LeaseInfo leaseInfo72 = instanceInfo70.getLeaseInfo();
        java.lang.String str73 = instanceInfo70.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder74 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder74.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder78.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo81 = builder80.getRawInstance();
        int int82 = instanceInfo81.getSecurePort();
        java.lang.Long long83 = instanceInfo81.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder84 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo81);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus85 = instanceInfo81.getOverriddenStatus();
        instanceInfo70.setOverriddenStatus(instanceStatus85);
        com.netflix.appinfo.InstanceInfo.Builder builder87 = builder58.setOverriddenStatus(instanceStatus85);
        com.netflix.appinfo.InstanceInfo.PortType portType88 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder90 = builder87.enablePort(portType88, false);
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder20.enablePort(portType88, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder95 = builder92.setStatusPageUrl("172.20.26.3", "/Status");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str12 = instanceInfo11.getVersion();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = instanceInfo13.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecureVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setStatusPageUrl("/", "na");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        instanceInfo8.setLastUpdatedTimestamp();
        boolean boolean10 = instanceInfo8.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo8.setStatus(instanceStatus12);
        long long14 = instanceInfo8.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        java.lang.Long long24 = instanceInfo22.isDirtyWithTime();
        java.lang.String str25 = instanceInfo22.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        boolean boolean27 = instanceInfo8.equals((java.lang.Object) instanceInfo26);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo28);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str21 = myDataCenterInstanceConfig20.getVirtualHostName();
        int int22 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        java.lang.String str23 = myDataCenterInstanceConfig20.getIpAddress();
        int int24 = myDataCenterInstanceConfig20.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = myDataCenterInstanceConfig20.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder18.setMetadata(strMap25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder18.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder18.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHomePageUrl("na", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.Long long11 = instanceInfo7.getLastDirtyTimestamp();
        java.lang.Boolean boolean12 = instanceInfo7.isCoordinatingDiscoveryServer();
        int int13 = instanceInfo7.getPort();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo7.getDataCenterInfo();
        java.lang.String str15 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean25 = myDataCenterInstanceConfig24.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setDataCenterInfo(dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder28.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder28.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder28.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder28.setASGName("inesserver2.windows.cin.ufpe.br:80");
        boolean boolean39 = instanceInfo7.equals((java.lang.Object) builder38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        instanceInfo11.setIsDirty(true);
        instanceInfo11.setIsDirty(false);
        java.lang.String str20 = instanceInfo11.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "hi!", "UNKNOWN");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setAppGroupName("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder19.setSID("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder29.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN", "172.20.26.3");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.PortType portType24 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.enablePort(portType24, true);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp(1636099532152L);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setLastDirtyTimestamp(1636099592290L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.LeaseInfo leaseInfo10 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setSecureVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatusPageUrl("", "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        int int21 = instanceInfo20.getSecurePort();
        java.lang.Long long22 = instanceInfo20.getLastDirtyTimestamp();
        instanceInfo20.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo20.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder12.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatusPageUrlForDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder27.setHomePageUrl("", "/healthcheck");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.add("/Status", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setLastUpdatedTimestamp(1636099528939L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder9.setStatusPageUrl("/", "/Status");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setHomePageUrlForDeser("na");
        boolean boolean18 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setNamespace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        java.lang.Boolean boolean17 = instanceInfo14.isCoordinatingDiscoveryServer();
        java.lang.String str18 = instanceInfo14.getHostName();
        java.util.Set<java.lang.String> strSet19 = instanceInfo14.getHealthCheckUrls();
        java.lang.Long long20 = instanceInfo14.getLastDirtyTimestamp();
        java.lang.String str21 = instanceInfo14.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("", "/healthcheck");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.LeaseInfo leaseInfo11 = instanceInfo7.getLeaseInfo();
        long long12 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("", "/Status", "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.add("172.20.26.3", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long17 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder18.setHealthCheckUrls("172.20.26.3", "UNKNOWN", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        com.netflix.appinfo.LeaseInfo leaseInfo9 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("hi!", "/Status");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getASGName();
        java.lang.String str9 = instanceInfo7.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setPort(30);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastUpdatedTimestamp(1636099590498L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "default", "172.20.26.3");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder23.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setLastDirtyTimestamp(1636099601097L);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType40 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setActionType(actionType40);
        com.netflix.appinfo.InstanceInfo.PortType portType42 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder39.enablePort(portType42, false);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder39.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder48.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder48.setHealthCheckUrlsForDeser("/Status", "unknown");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig60 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean61 = myDataCenterInstanceConfig60.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo62 = myDataCenterInstanceConfig60.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig63 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig64 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig65 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig66 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo62);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder54.setDataCenterInfo(dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig68 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo62);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder31.setDataCenterInfo(dataCenterInfo62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder31.setHealthCheckUrls("/Status", "", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecurePort((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("na", "172.20.26.3");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHealthCheckUrls("/", "UNKNOWN", "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        long long8 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "unknown");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setHomePageUrl("unknown", "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        instanceInfo7.setSID("172.20.26.3");
        instanceInfo7.setSID("");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager19 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean24 = myDataCenterInstanceConfig23.isInstanceEnabledOnit();
        applicationInfoManager19.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        java.lang.Long long35 = instanceInfo33.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo instanceInfo37 = builder36.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo37);
        java.util.Set<java.lang.String> strSet39 = instanceInfo37.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = instanceInfo37.getOverriddenStatus();
        applicationInfoManager19.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder18.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder18.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder18.setHealthCheckUrlsForDeser("172.20.26.3", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder47.setHealthCheckUrls("/", "default", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        instanceInfo7.setSID("172.20.26.3");
        instanceInfo7.setSID("");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager19 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean24 = myDataCenterInstanceConfig23.isInstanceEnabledOnit();
        applicationInfoManager19.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        java.lang.Long long35 = instanceInfo33.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo instanceInfo37 = builder36.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo37);
        java.util.Set<java.lang.String> strSet39 = instanceInfo37.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = instanceInfo37.getOverriddenStatus();
        applicationInfoManager19.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder18.setStatus(instanceStatus40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setAppGroupName("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setNamespace("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder19.setStatusPageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo26);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder11.setDataCenterInfo(dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder11.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder38.getRawInstance();
        int int40 = instanceInfo39.getSecurePort();
        java.lang.Long long41 = instanceInfo39.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo39);
        com.netflix.appinfo.InstanceInfo instanceInfo43 = builder42.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo43);
        java.util.Set<java.lang.String> strSet45 = instanceInfo43.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus46 = instanceInfo43.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setHostName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder51.setStatusPageUrl("", "/");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder51.setStatus(instanceStatus55);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = instanceInfo43.setStatus(instanceStatus55);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder31.setStatus(instanceStatus55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder58.setStatusPageUrl("172.20.26.3", "na");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        java.util.Set<java.lang.String> strSet13 = instanceInfo11.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo14.getStatus();
        instanceInfo14.setIsDirty(false);
        instanceInfo14.setIsDirty();
        boolean boolean19 = instanceInfo14.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        java.lang.String str9 = instanceInfo7.getSecureVipAddress();
        com.netflix.appinfo.LeaseInfo leaseInfo10 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("", "unknown");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "default");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str12 = instanceInfo11.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        java.lang.Long long25 = instanceInfo23.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo instanceInfo29 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = instanceInfo29.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder15.setMetadata(strMap30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder15.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long12 = instanceInfo11.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        java.lang.Long long24 = instanceInfo22.isDirtyWithTime();
        java.lang.String str25 = instanceInfo22.getStatusPageUrl();
        com.netflix.appinfo.LeaseInfo leaseInfo26 = instanceInfo22.getLeaseInfo();
        long long27 = instanceInfo22.getLastUpdatedTimestamp();
        java.lang.String str28 = instanceInfo22.getSID();
        java.lang.String str29 = instanceInfo22.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo22.setOverriddenStatus(instanceStatus31);
        instanceInfo14.setStatusWithoutDirty(instanceStatus31);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = instanceInfo14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder35.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo8);
        boolean boolean10 = builder9.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setIPAddr("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder9.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "/Status", "/Status");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setHomePageUrl("default", "/Status");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("/Status", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setHomePageUrl("default", "/");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppGroupName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("UNKNOWN", "UNKNOWN", "unknown");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo13.getDataCenterInfo();
        instanceInfo13.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = applicationInfoManager25.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus27 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager25.setInstanceStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo23.setStatus(instanceStatus27);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder38.getRawInstance();
        instanceInfo39.setLastUpdatedTimestamp();
        boolean boolean41 = instanceInfo39.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo39.setStatus(instanceStatus43);
        instanceInfo30.setStatusWithoutDirty(instanceStatus44);
        instanceInfo13.setStatusWithoutDirty(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder47.setHealthCheckUrls("unknown", "/healthcheck", "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        java.lang.String str14 = instanceInfo7.getStatusPageUrl();
        java.lang.Boolean boolean15 = instanceInfo7.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long17 = instanceInfo16.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo16);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder18.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setHomePageUrl("", "172.20.26.3");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setNamespace("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "na");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder11.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("/Status", "unknown");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.lang.String[] strArray3 = new java.lang.String[] { "/healthcheck", "na", "" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = applicationInfoManager13.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager13.setInstanceStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = instanceInfo11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        instanceInfo18.setSID("/Status");
        java.lang.String str25 = instanceInfo18.getId();
        java.lang.Long long26 = instanceInfo18.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo27);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSID("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType14 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setActionType(actionType14);
        instanceInfo7.setActionType(actionType14);
        instanceInfo7.unsetIsDirty((long) 80);
        instanceInfo7.setIsDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setOverriddenStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder22.setStatusPageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHomePageUrl("", "default");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setLastUpdatedTimestamp((long) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastUpdatedTimestamp(1636099564483L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.String[] strArray3 = new java.lang.String[] { "/Status", "hi!", "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        int int16 = instanceInfo15.getCountryId();
        java.lang.Long long17 = instanceInfo15.isDirtyWithTime();
        java.lang.String str18 = instanceInfo15.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        int int21 = instanceInfo15.getPort();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder28.getRawInstance();
        int int30 = instanceInfo29.getSecurePort();
        java.lang.Long long31 = instanceInfo29.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo29);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo42 = builder41.getRawInstance();
        int int43 = instanceInfo42.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager44 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo45 = applicationInfoManager44.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus46 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager44.setInstanceStatus(instanceStatus46);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = instanceInfo42.setStatus(instanceStatus46);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus50 = instanceInfo42.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder51 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder51.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType56 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.PortType portType58 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder55.enablePort(portType58, false);
        com.netflix.appinfo.InstanceInfo.PortType portType61 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder55.enablePort(portType61, true);
        boolean boolean64 = instanceInfo42.isPortEnabled(portType61);
        boolean boolean65 = instanceInfo33.isPortEnabled(portType61);
        boolean boolean66 = instanceInfo15.isPortEnabled(portType61);
        com.netflix.appinfo.InstanceInfo instanceInfo67 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo67);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = instanceInfo7.getDataCenterInfo();
        instanceInfo7.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setHostName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setStatusPageUrl("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType26 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setActionType(actionType26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setActionType(actionType26);
        boolean boolean29 = builder28.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder28.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder28.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "na");
        boolean boolean35 = instanceInfo7.equals((java.lang.Object) builder34);
        com.netflix.appinfo.InstanceInfo instanceInfo36 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder43.getRawInstance();
        int int45 = instanceInfo44.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo46 = new com.netflix.appinfo.InstanceInfo(instanceInfo44);
        java.lang.String str47 = instanceInfo44.getId();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setHostName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder52.setStatusPageUrl("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder56 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder56.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType61 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setActionType(actionType61);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder55.setActionType(actionType61);
        instanceInfo44.setActionType(actionType61);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = instanceInfo44.getMetadata();
        instanceInfo44.setLastDirtyTimestamp((java.lang.Long) 0L);
        boolean boolean68 = instanceInfo36.equals((java.lang.Object) instanceInfo44);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo44);
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder69.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder69.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder69.setHomePageUrl("default", "default");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        instanceInfo7.setSID("172.20.26.3");
        instanceInfo7.setSID("");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager19 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = applicationInfoManager19.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean24 = myDataCenterInstanceConfig23.isInstanceEnabledOnit();
        applicationInfoManager19.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        java.lang.Long long35 = instanceInfo33.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo instanceInfo37 = builder36.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo37);
        java.util.Set<java.lang.String> strSet39 = instanceInfo37.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = instanceInfo37.getOverriddenStatus();
        applicationInfoManager19.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder18.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setASGName("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder42.setStatusPageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str18 = instanceInfo7.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHomePageUrl("default", "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "http://inesserver2.windows.cin.ufpe.br:80/", "/Status", "na", "/healthcheck" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        java.lang.Long long16 = instanceInfo14.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder17.getRawInstance();
        int int19 = instanceInfo18.getCountryId();
        java.lang.Long long20 = instanceInfo18.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        java.lang.String str23 = instanceInfo18.getId();
        java.lang.String str24 = instanceInfo18.getHostName();
        int int25 = instanceInfo18.getCountryId();
        long long26 = instanceInfo18.getLastUpdatedTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.add("172.20.26.3", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastUpdatedTimestamp(1636099572426L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        com.netflix.appinfo.LeaseInfo leaseInfo9 = instanceInfo7.getLeaseInfo();
        java.lang.String str10 = instanceInfo7.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType11 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("172.20.26.3", "UNKNOWN", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType14 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setActionType(actionType14);
        instanceInfo7.setActionType(actionType14);
        instanceInfo7.unsetIsDirty((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str21 = instanceInfo7.getSecureVipAddress();
        boolean boolean22 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setHealthCheckUrlsForDeser("", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setPort(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("na", "unknown");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.add("/Status", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        java.util.Set<java.lang.String> strSet13 = instanceInfo11.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo16 = instanceInfo11.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "/healthcheck", "na");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHealthCheckUrlsForDeser("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        int int34 = instanceInfo33.getSecurePort();
        com.netflix.appinfo.InstanceInfo.ActionType actionType35 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo33.setActionType(actionType35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder25.setActionType(actionType35);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setVIPAddress("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder37.setHomePageUrl("", "hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        java.lang.String str15 = instanceInfo11.getSID();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo16 = instanceInfo11.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastUpdatedTimestamp(1636099563910L);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastUpdatedTimestamp(1636099586839L);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder34.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort(100);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig45 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean46 = myDataCenterInstanceConfig45.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo47 = myDataCenterInstanceConfig45.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder43.setDataCenterInfo(dataCenterInfo47);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig49 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo47);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig50 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo47);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig51 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo47);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig52 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo47);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder25.setDataCenterInfo(dataCenterInfo47);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder25.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder55.setHomePageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        java.util.Set<java.lang.String> strSet13 = instanceInfo11.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str17 = myDataCenterInstanceConfig16.getVirtualHostName();
        int int18 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig16.getSecureVirtualHostName();
        java.lang.String str21 = myDataCenterInstanceConfig16.getHostName(false);
        java.lang.String str22 = myDataCenterInstanceConfig16.getHealthCheckUrl();
        int int23 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder14.setDataCenterInfo(dataCenterInfo24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean16 = myDataCenterInstanceConfig15.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setDataCenterInfo(dataCenterInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        int int27 = instanceInfo26.getSecurePort();
        java.lang.Long long28 = instanceInfo26.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo26);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setLastDirtyTimestamp(1636099528688L);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder29.add("", "");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig37 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80");
        java.lang.String str38 = myDataCenterInstanceConfig37.getAppGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = myDataCenterInstanceConfig37.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder35.setMetadata(strMap39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder18.setMetadata(strMap39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder41.setHomePageUrl("unknown", "na");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager29.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager29.setInstanceStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = instanceInfo27.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo27.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType36 = instanceInfo27.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus38 = instanceInfo27.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder15.setOverriddenStatus(instanceStatus38);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setLastUpdatedTimestamp(1636099544594L);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setCountryId(443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        java.util.Set<java.lang.String> strSet13 = instanceInfo11.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        instanceInfo11.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("", "/Status");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setCountryId(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setStatusPageUrl("na", "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("hi!", "/");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setActionType(actionType21);
        com.netflix.appinfo.InstanceInfo.PortType portType23 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.enablePort(portType23, false);
        com.netflix.appinfo.InstanceInfo.PortType portType26 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.enablePort(portType26, true);
        boolean boolean29 = instanceInfo7.isPortEnabled(portType26);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo30.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/", "na");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType14 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setActionType(actionType14);
        instanceInfo7.setActionType(actionType14);
        instanceInfo7.unsetIsDirty((long) 80);
        instanceInfo7.setIsDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder28.getRawInstance();
        int int30 = instanceInfo29.getSecurePort();
        java.lang.Long long31 = instanceInfo29.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo29);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder32.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo instanceInfo35 = builder34.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = instanceInfo35.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder43.getRawInstance();
        int int45 = instanceInfo44.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType51 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setActionType(actionType51);
        instanceInfo44.setActionType(actionType51);
        instanceInfo35.setActionType(actionType51);
        instanceInfo7.setActionType(actionType51);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder56.setHealthCheckUrls("hi!", "UNKNOWN", "/healthcheck");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        java.lang.String str15 = instanceInfo11.getSecureVipAddress();
        java.lang.String str16 = instanceInfo11.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder24.getRawInstance();
        int int26 = instanceInfo25.getSecurePort();
        java.lang.Long long27 = instanceInfo25.isDirtyWithTime();
        java.lang.String str28 = instanceInfo25.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo29 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo29);
        java.lang.String str31 = instanceInfo30.getStatusPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = instanceInfo30.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder17.setMetadata(strMap32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        int int13 = instanceInfo12.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager14.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager14.setInstanceStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setLastUpdatedTimestamp(1636099533177L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("UNKNOWN", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.lang.String[] strArray1 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder8.getRawInstance();
        int int10 = instanceInfo9.getSecurePort();
        java.lang.Long long11 = instanceInfo9.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo9);
        java.lang.Long long14 = instanceInfo13.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = instanceInfo13.getMetadata();
        int int16 = instanceInfo13.getCountryId();
        java.lang.Long long17 = instanceInfo13.isDirtyWithTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo13);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo7.unsetIsDirty((long) 10);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        applicationInfoManager16.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        applicationInfoManager16.setInstanceStatus(instanceStatus24);
        instanceInfo7.setStatusWithoutDirty(instanceStatus24);
        com.netflix.appinfo.LeaseInfo leaseInfo27 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder28.setStatusPageUrl("hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setLastUpdatedTimestamp(1636099522815L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder4.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setSID("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "default", "/healthcheck");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str12 = myDataCenterInstanceConfig11.getVirtualHostName();
        int int13 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = myDataCenterInstanceConfig11.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setDataCenterInfo(dataCenterInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder16.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setHealthCheckUrls("default", "172.20.26.3", "/healthcheck");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo17.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("UNKNOWN", "", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder4.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder41.setHomePageUrl("172.20.26.3", "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder20.setLastUpdatedTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder20.setNamespace("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean35 = myDataCenterInstanceConfig34.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = myDataCenterInstanceConfig34.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig37 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo36);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo36);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo36);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = myDataCenterInstanceConfig39.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder20.setMetadata(strMap40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder13.setMetadata(strMap40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder13.setStatusPageUrl("172.20.26.3", "UNKNOWN");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder4.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setIPAddr("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatusPageUrl("172.20.26.3", "172.20.26.3");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.PortType portType10 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder4.enablePort(portType10, true);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        instanceInfo20.setLastUpdatedTimestamp();
        boolean boolean22 = instanceInfo20.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo20.setStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder4.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder4.setSecureVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder4.setActionType(actionType29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.setHomePageUrl("172.20.26.3", "/healthcheck");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId(100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecurePort(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setLastDirtyTimestamp(1636099539890L);
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder25.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "", "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str17 = myDataCenterInstanceConfig16.getVirtualHostName();
        int int18 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig16.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = myDataCenterInstanceConfig16.getMetadataMap();
        boolean boolean21 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setDataCenterInfo(dataCenterInfo22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder10.setHomePageUrl("UNKNOWN", "/Status");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str15 = instanceInfo7.getVersion();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setHealthCheckUrlsForDeser("default", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("/", "hi!", "unknown");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setSID("/");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("default", "/", "unknown");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setHealthCheckUrlsForDeser("/healthcheck", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder21.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder4.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setVIPAddressDeser("");
        boolean boolean44 = builder41.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder41.add("", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder41.setHealthCheckUrls("na", "na", "172.20.26.3");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType33 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setActionType(actionType33);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder22.setActionType(actionType33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setHealthCheckUrls("default", "hi!", "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str11 = instanceInfo7.getASGName();
        instanceInfo7.setSID("/");
        com.netflix.appinfo.InstanceInfo.PortType portType14 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        boolean boolean15 = instanceInfo7.isPortEnabled(portType14);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        int int27 = instanceInfo26.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo29 = applicationInfoManager28.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager28.setInstanceStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo26.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo26);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo35 = applicationInfoManager34.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager34.setInstanceStatus(instanceStatus36);
        instanceInfo26.setStatusWithoutDirty(instanceStatus36);
        java.lang.String str39 = instanceInfo26.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType45 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setActionType(actionType45);
        com.netflix.appinfo.InstanceInfo.PortType portType47 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder44.enablePort(portType47, false);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder44.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder44.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig60 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean61 = myDataCenterInstanceConfig60.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo62 = myDataCenterInstanceConfig60.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig63 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig64 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo62);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig65 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo62);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo66 = myDataCenterInstanceConfig65.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder53.setDataCenterInfo(dataCenterInfo66);
        boolean boolean68 = instanceInfo26.equals((java.lang.Object) dataCenterInfo66);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder18.setDataCenterInfo(dataCenterInfo66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder69.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "UNKNOWN");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("UNKNOWN", "/Status", "unknown");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setLastUpdatedTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setIPAddr("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setNamespace("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setHealthCheckUrls("/Status", "unknown", "na");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        boolean boolean11 = builder10.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHealthCheckUrls("/healthcheck", "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str15 = instanceInfo7.getId();
        java.lang.String str16 = instanceInfo7.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80", "172.20.26.3");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setHomePageUrl("172.20.26.3", "UNKNOWN");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setHomePageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder10.setHomePageUrl("hi!", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean23 = myDataCenterInstanceConfig22.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig22.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder19.setDataCenterInfo(dataCenterInfo24);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean32 = myDataCenterInstanceConfig31.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig31.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder26.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo33);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = myDataCenterInstanceConfig38.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder10.setMetadata(strMap39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder10.setCountryId((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder10.setHomePageUrl("", "/");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("inesserver2.windows.cin.ufpe.br", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setASGName("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean14 = myDataCenterInstanceConfig13.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo15 = myDataCenterInstanceConfig13.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo15);
        boolean boolean20 = myDataCenterInstanceConfig19.getSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = myDataCenterInstanceConfig19.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder5.setMetadata(strMap21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp(1636099523233L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setHomePageUrl("", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        java.lang.String str14 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.PortType portType24 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.enablePort(portType24, false);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder21.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig37 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean38 = myDataCenterInstanceConfig37.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo39 = myDataCenterInstanceConfig37.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig40 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo39);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo39);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig42 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo39);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo43 = myDataCenterInstanceConfig42.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder30.setDataCenterInfo(dataCenterInfo43);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig45 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo43);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder15.setDataCenterInfo(dataCenterInfo43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder15.setHealthCheckUrls("/", "default", "UNKNOWN");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastUpdatedTimestamp(1636099530194L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "172.20.26.3", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        int int10 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder13.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "na");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        java.util.Set<java.lang.String> strSet10 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp(1636099570205L);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "UNKNOWN");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        instanceInfo7.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("na", "", "na");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        java.lang.Long long25 = instanceInfo23.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo36 = builder35.getRawInstance();
        int int37 = instanceInfo36.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager38 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager38.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager38.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus42 = instanceInfo36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo36);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo36.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType50 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.PortType portType52 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder49.enablePort(portType52, false);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder49.enablePort(portType55, true);
        boolean boolean58 = instanceInfo36.isPortEnabled(portType55);
        boolean boolean59 = instanceInfo27.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder15.enablePort(portType55, true);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setLastDirtyTimestamp(1636099642116L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder65.setHomePageUrl("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getPort();
        instanceInfo11.setSID("/healthcheck");
        instanceInfo11.setIsDirty(true);
        java.lang.String str17 = instanceInfo11.getAppGroupName();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        java.lang.String str19 = instanceInfo11.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.ActionType actionType20 = instanceInfo11.getActionType();
        instanceInfo11.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setStatusPageUrl("/", "/");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setSID("/");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo17.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        int int27 = instanceInfo26.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo29 = applicationInfoManager28.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager28.setInstanceStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo26.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo42 = builder41.getRawInstance();
        instanceInfo42.setLastUpdatedTimestamp();
        boolean boolean44 = instanceInfo42.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus46 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus47 = instanceInfo42.setStatus(instanceStatus46);
        instanceInfo33.setStatusWithoutDirty(instanceStatus47);
        java.lang.String str49 = instanceInfo33.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        java.lang.String str51 = instanceInfo33.getHomePageUrl();
        boolean boolean52 = instanceInfo17.equals((java.lang.Object) instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setStatusPageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        java.lang.String str14 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str16 = instanceInfo7.getId();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        int int27 = instanceInfo26.getSecurePort();
        java.lang.Long long28 = instanceInfo26.isDirtyWithTime();
        java.lang.String str29 = instanceInfo26.getStatusPageUrl();
        instanceInfo26.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo26);
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo42 = builder41.getRawInstance();
        int int43 = instanceInfo42.getSecurePort();
        java.lang.Long long44 = instanceInfo42.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder45.getRawInstance();
        int int47 = instanceInfo46.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo55 = builder54.getRawInstance();
        int int56 = instanceInfo55.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager57 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo58 = applicationInfoManager57.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus59 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager57.setInstanceStatus(instanceStatus59);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus61 = instanceInfo55.setStatus(instanceStatus59);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo55);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus63 = instanceInfo55.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder64 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder64.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder64.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType69 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder68.setActionType(actionType69);
        com.netflix.appinfo.InstanceInfo.PortType portType71 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder68.enablePort(portType71, false);
        com.netflix.appinfo.InstanceInfo.PortType portType74 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder68.enablePort(portType74, true);
        boolean boolean77 = instanceInfo55.isPortEnabled(portType74);
        boolean boolean78 = instanceInfo46.isPortEnabled(portType74);
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder34.enablePort(portType74, true);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder18.enablePort(portType74, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder85 = builder82.setStatusPageUrl("default", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str17 = myDataCenterInstanceConfig16.getVirtualHostName();
        int int18 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig16.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = myDataCenterInstanceConfig16.getMetadataMap();
        boolean boolean21 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder10.setLastDirtyTimestamp(1636099556454L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager15 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = applicationInfoManager15.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager15.getInfo();
        applicationInfoManager15.unregisterStatusChangeListener("");
        applicationInfoManager15.unregisterStatusChangeListener("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType28 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setActionType(actionType28);
        com.netflix.appinfo.InstanceInfo.PortType portType30 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder27.enablePort(portType30, false);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder27.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder27.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean44 = myDataCenterInstanceConfig43.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig46 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo45);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig47 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo45);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig48 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo45);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo49 = myDataCenterInstanceConfig48.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder36.setDataCenterInfo(dataCenterInfo49);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig51 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo49);
        applicationInfoManager15.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig51);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder59.getRawInstance();
        int int61 = instanceInfo60.getSecurePort();
        java.lang.Long long62 = instanceInfo60.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo60);
        com.netflix.appinfo.InstanceInfo instanceInfo64 = new com.netflix.appinfo.InstanceInfo(instanceInfo60);
        java.lang.Long long65 = instanceInfo64.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap66 = instanceInfo64.getMetadata();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = instanceInfo64.getMetadata();
        applicationInfoManager15.registerAppMetadata(strMap67);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder14.setMetadata(strMap67);
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder69.setAppGroupName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder69.setStatusPageUrl("default", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.PortType portType24 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.enablePort(portType24, true);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo34 = builder33.getRawInstance();
        int int35 = instanceInfo34.getSecurePort();
        java.lang.Long long36 = instanceInfo34.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo34);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus38 = instanceInfo34.getOverriddenStatus();
        java.lang.String str39 = instanceInfo34.getASGName();
        com.netflix.appinfo.InstanceInfo instanceInfo40 = new com.netflix.appinfo.InstanceInfo(instanceInfo34);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo40);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig49 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean50 = myDataCenterInstanceConfig49.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo51 = myDataCenterInstanceConfig49.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig52 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder46.setDataCenterInfo(dataCenterInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus59 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder53.setStatus(instanceStatus59);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo68 = builder67.getRawInstance();
        int int69 = instanceInfo68.getSecurePort();
        java.lang.Long long70 = instanceInfo68.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder71 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo68);
        com.netflix.appinfo.InstanceInfo instanceInfo72 = builder71.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder73 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        java.util.Set<java.lang.String> strSet74 = instanceInfo72.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo75 = new com.netflix.appinfo.InstanceInfo(instanceInfo72);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus76 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        instanceInfo75.setStatusWithoutDirty(instanceStatus76);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder60.setOverriddenStatus(instanceStatus76);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus79 = instanceInfo40.setStatus(instanceStatus76);
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder26.setStatus(instanceStatus79);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder80.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder85 = builder80.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        instanceInfo11.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHealthCheckUrlsForDeser("hi!", "default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        instanceInfo15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getOverriddenStatus();
        java.lang.String str19 = instanceInfo15.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType14 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setActionType(actionType14);
        instanceInfo7.setActionType(actionType14);
        instanceInfo7.unsetIsDirty((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        java.lang.String str22 = instanceInfo21.getStatusPageUrl();
        int int23 = instanceInfo21.getCountryId();
        java.lang.String str24 = instanceInfo21.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setHealthCheckUrls("na", "inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setASGName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo8);
        instanceInfo9.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("172.20.26.3", "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setCountryId((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean16 = myDataCenterInstanceConfig15.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setDataCenterInfo(dataCenterInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSID("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder17.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "na", "default");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        long long17 = instanceInfo7.getLastUpdatedTimestamp();
        instanceInfo7.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo20.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = instanceInfo20.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("172.20.26.3", "/healthcheck");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType21 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setActionType(actionType21);
        com.netflix.appinfo.InstanceInfo.PortType portType23 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.enablePort(portType23, false);
        com.netflix.appinfo.InstanceInfo.PortType portType26 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.enablePort(portType26, true);
        boolean boolean29 = instanceInfo7.isPortEnabled(portType26);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        int int32 = instanceInfo30.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setAppName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setSecurePort((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder33.setHealthCheckUrls("default", "/Status", "172.20.26.3");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        java.lang.Long long25 = instanceInfo23.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo36 = builder35.getRawInstance();
        int int37 = instanceInfo36.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager38 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager38.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager38.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus42 = instanceInfo36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo36);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo36.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType50 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.PortType portType52 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder49.enablePort(portType52, false);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder49.enablePort(portType55, true);
        boolean boolean58 = instanceInfo36.isPortEnabled(portType55);
        boolean boolean59 = instanceInfo27.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder15.enablePort(portType55, true);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setLastDirtyTimestamp(1636099642116L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder63.setStatusPageUrl("default", "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setVIPAddressDeser("unknown");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo22);
        java.lang.String str28 = myDataCenterInstanceConfig27.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = myDataCenterInstanceConfig27.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder13.setMetadata(strMap29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager16.setInstanceStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        instanceInfo30.setLastUpdatedTimestamp();
        boolean boolean32 = instanceInfo30.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo30.setStatus(instanceStatus34);
        instanceInfo21.setStatusWithoutDirty(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder4.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder44.getRawInstance();
        int int46 = instanceInfo45.getSecurePort();
        java.lang.Long long47 = instanceInfo45.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo45);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = builder48.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo49);
        com.netflix.appinfo.LeaseInfo leaseInfo51 = instanceInfo49.getLeaseInfo();
        java.lang.String str52 = instanceInfo49.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder59.getRawInstance();
        int int61 = instanceInfo60.getSecurePort();
        java.lang.Long long62 = instanceInfo60.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo60);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo60.getOverriddenStatus();
        instanceInfo49.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder37.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig72 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean73 = myDataCenterInstanceConfig72.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo74 = myDataCenterInstanceConfig72.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig75 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig76 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig77 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig78 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo74);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = myDataCenterInstanceConfig78.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder37.setMetadata(strMap79);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder80.setVIPAddressDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder80.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "na", "default");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo12.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "/", "unknown");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHealthCheckUrlsForDeser("unknown", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setASGName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp(1636099698619L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setHealthCheckUrls("UNKNOWN", "/healthcheck", "/healthcheck");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean21 = myDataCenterInstanceConfig20.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo22);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig25.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder13.setDataCenterInfo(dataCenterInfo26);
        boolean boolean28 = builder13.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder13.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.setHealthCheckUrlsForDeser("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setHealthCheckUrls("", "unknown", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        int int16 = instanceInfo15.getSecurePort();
        java.lang.Long long17 = instanceInfo15.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder18.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo19);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder20.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = instanceInfo21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        int int31 = instanceInfo30.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setActionType(actionType37);
        instanceInfo30.setActionType(actionType37);
        instanceInfo21.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder6.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder6.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder43.setStatusPageUrl("default", "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        instanceInfo7.setSID("");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        instanceInfo7.setSID("172.20.26.3");
        com.netflix.appinfo.LeaseInfo leaseInfo15 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        int int17 = instanceInfo16.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str10 = instanceInfo7.getHostName();
        java.lang.String str11 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setIsDirty();
        java.lang.String str13 = instanceInfo7.getVIPAddress();
        java.lang.Long long14 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder23.getRawInstance();
        int int25 = instanceInfo24.getSecurePort();
        java.lang.Long long26 = instanceInfo24.getLastDirtyTimestamp();
        instanceInfo24.setSID("");
        instanceInfo24.setIsCoordinatingDiscoveryServer();
        instanceInfo24.setSID("172.20.26.3");
        instanceInfo24.setSID("");
        com.netflix.appinfo.InstanceInfo instanceInfo34 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        boolean boolean36 = instanceInfo24.isDirty();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = instanceInfo24.getMetadata();
        instanceInfo24.unsetIsDirty(1636099586951L);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo47 = builder46.getRawInstance();
        int int48 = instanceInfo47.getSecurePort();
        java.lang.Long long49 = instanceInfo47.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo47);
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder50.getRawInstance();
        int int52 = instanceInfo51.getPort();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo61 = builder60.getRawInstance();
        int int62 = instanceInfo61.getSecurePort();
        java.lang.Long long63 = instanceInfo61.isDirtyWithTime();
        java.lang.String str64 = instanceInfo61.getStatusPageUrl();
        instanceInfo61.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo61);
        com.netflix.appinfo.InstanceInfo instanceInfo68 = new com.netflix.appinfo.InstanceInfo(instanceInfo61);
        com.netflix.appinfo.LeaseInfo leaseInfo69 = instanceInfo68.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder70 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder72.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder74.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo77 = builder76.getRawInstance();
        int int78 = instanceInfo77.getSecurePort();
        java.lang.Long long79 = instanceInfo77.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder80 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo77);
        com.netflix.appinfo.InstanceInfo instanceInfo81 = builder80.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder82 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo81);
        java.util.Set<java.lang.String> strSet83 = instanceInfo81.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus84 = instanceInfo81.getOverriddenStatus();
        instanceInfo68.setStatusWithoutDirty(instanceStatus84);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus86 = instanceInfo53.setStatus(instanceStatus84);
        instanceInfo24.setStatusWithoutDirty(instanceStatus84);
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder16.setStatus(instanceStatus84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder16.setHealthCheckUrls("unknown", "", "/Status");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrlsForDeser("unknown", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHealthCheckUrls("/", "default", "/Status");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setHomePageUrlForDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("hi!", "/");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHomePageUrlForDeser("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder15.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatus(instanceStatus17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("/", "", "/healthcheck");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo13.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setActionType(actionType29);
        instanceInfo22.setActionType(actionType29);
        instanceInfo13.setActionType(actionType29);
        java.lang.String str33 = instanceInfo13.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo42 = builder41.getRawInstance();
        int int43 = instanceInfo42.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager44 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo45 = applicationInfoManager44.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus46 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager44.setInstanceStatus(instanceStatus46);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = instanceInfo42.setStatus(instanceStatus46);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus50 = instanceInfo42.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder51 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder51.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType56 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.PortType portType58 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder55.enablePort(portType58, false);
        com.netflix.appinfo.InstanceInfo.PortType portType61 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder55.enablePort(portType61, true);
        boolean boolean64 = instanceInfo42.isPortEnabled(portType61);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo66 = instanceInfo42.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder67 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder69.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder71.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo74 = builder73.getRawInstance();
        int int75 = instanceInfo74.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder76.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType81 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder80.setActionType(actionType81);
        instanceInfo74.setActionType(actionType81);
        instanceInfo42.setActionType(actionType81);
        com.netflix.appinfo.InstanceInfo.Builder builder85 = builder34.setActionType(actionType81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder89 = builder34.setHealthCheckUrls("", "UNKNOWN", "/healthcheck");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager16.setInstanceStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        instanceInfo30.setLastUpdatedTimestamp();
        boolean boolean32 = instanceInfo30.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo30.setStatus(instanceStatus34);
        instanceInfo21.setStatusWithoutDirty(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder4.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder44.getRawInstance();
        int int46 = instanceInfo45.getSecurePort();
        java.lang.Long long47 = instanceInfo45.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo45);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = builder48.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo49);
        com.netflix.appinfo.LeaseInfo leaseInfo51 = instanceInfo49.getLeaseInfo();
        java.lang.String str52 = instanceInfo49.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder59.getRawInstance();
        int int61 = instanceInfo60.getSecurePort();
        java.lang.Long long62 = instanceInfo60.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo60);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo60.getOverriddenStatus();
        instanceInfo49.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder37.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.PortType portType67 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder66.enablePort(portType67, false);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder70.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder74.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setHostName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder81 = builder76.setStatusPageUrl("na", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder76.setStatusPageUrl("unknown", "/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig87 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean88 = myDataCenterInstanceConfig87.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo89 = myDataCenterInstanceConfig87.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig90 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo89);
        com.netflix.appinfo.InstanceInfo.Builder builder91 = builder76.setDataCenterInfo(dataCenterInfo89);
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder69.setDataCenterInfo(dataCenterInfo89);
        com.netflix.appinfo.InstanceInfo.Builder builder94 = builder69.setLastDirtyTimestamp(1636099600656L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder97 = builder94.setHomePageUrl("/", "na");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType33 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setActionType(actionType33);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder22.setActionType(actionType33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder22.setStatusPageUrl("default", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSID("hi!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str17 = myDataCenterInstanceConfig16.getVirtualHostName();
        int int18 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig16.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = myDataCenterInstanceConfig16.getMetadataMap();
        boolean boolean21 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder10.setLastDirtyTimestamp(1636099556454L);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder10.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder10.setHomePageUrl("unknown", "unknown");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/healthcheck", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.PortType portType19 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.enablePort(portType19, false);
        com.netflix.appinfo.InstanceInfo.PortType portType22 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.enablePort(portType22, true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo32 = builder31.getRawInstance();
        instanceInfo32.setLastUpdatedTimestamp();
        boolean boolean34 = instanceInfo32.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo32.setStatus(instanceStatus36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder16.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder4.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder41.setHealthCheckUrls("na", "default", "/");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo16.setActionType(actionType17);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = instanceInfo16.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setHealthCheckUrls("", "UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        java.lang.Boolean boolean16 = instanceInfo15.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo14.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo14.getActionType();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = instanceInfo14.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("na", "UNKNOWN");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.Long long12 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "172.20.26.3", "/healthcheck");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setIPAddr("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("default", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHealthCheckUrls("UNKNOWN", "na", "hi!");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("", "na", "/");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        int int17 = instanceInfo16.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("UNKNOWN", "/", "/healthcheck");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        java.lang.String str11 = instanceInfo9.getSID();
        int int12 = instanceInfo9.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager16.setInstanceStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        instanceInfo30.setLastUpdatedTimestamp();
        boolean boolean32 = instanceInfo30.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo30.setStatus(instanceStatus34);
        instanceInfo21.setStatusWithoutDirty(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder4.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder44.getRawInstance();
        int int46 = instanceInfo45.getSecurePort();
        java.lang.Long long47 = instanceInfo45.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo45);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = builder48.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo49);
        com.netflix.appinfo.LeaseInfo leaseInfo51 = instanceInfo49.getLeaseInfo();
        java.lang.String str52 = instanceInfo49.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder59.getRawInstance();
        int int61 = instanceInfo60.getSecurePort();
        java.lang.Long long62 = instanceInfo60.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo60);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo60.getOverriddenStatus();
        instanceInfo49.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder37.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig72 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean73 = myDataCenterInstanceConfig72.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo74 = myDataCenterInstanceConfig72.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig75 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig76 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig77 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo74);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig78 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo74);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = myDataCenterInstanceConfig78.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder37.setMetadata(strMap79);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder80.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder82.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder82.setLastUpdatedTimestamp(1636099620538L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder90 = builder82.setHealthCheckUrls("/", "172.20.26.3", "unknown");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        java.lang.String str14 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("", "hi!", "");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setIPAddr("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean19 = myDataCenterInstanceConfig18.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig18.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder4.setDataCenterInfo(dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setHealthCheckUrlsForDeser("", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status", "/Status");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getPort();
        instanceInfo11.setSID("/healthcheck");
        instanceInfo11.setIsDirty(true);
        java.lang.String str17 = instanceInfo11.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setASGName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setHomePageUrl("na", "UNKNOWN");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setASGName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setVIPAddressDeser("");
        boolean boolean17 = builder16.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setStatusPageUrl("hi!", "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(10);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str12 = myDataCenterInstanceConfig11.getVirtualHostName();
        int int13 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = myDataCenterInstanceConfig11.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setDataCenterInfo(dataCenterInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setLastUpdatedTimestamp((long) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSecureVIPAddressDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str18 = instanceInfo7.getHomePageUrl();
        boolean boolean19 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str21 = instanceInfo7.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager29.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager29.setInstanceStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = instanceInfo27.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo27.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType36 = instanceInfo27.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus38 = instanceInfo27.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder15.setOverriddenStatus(instanceStatus38);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setLastUpdatedTimestamp(1636099544594L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder41.setStatusPageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder9.setHomePageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setHealthCheckUrlsForDeser("", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder12.setHomePageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder12.setStatusPageUrl("", "na");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean23 = myDataCenterInstanceConfig22.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig22.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder19.setDataCenterInfo(dataCenterInfo24);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean32 = myDataCenterInstanceConfig31.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig31.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder26.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo33);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = myDataCenterInstanceConfig38.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder10.setMetadata(strMap39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder10.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder10.add("172.20.26.3", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder10.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean8 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo9);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setDataCenterInfo(dataCenterInfo9);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder11.setDataCenterInfo(dataCenterInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHealthCheckUrlsForDeser("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSecurePort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder27.setHealthCheckUrls("", "", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastUpdatedTimestamp(1636099578611L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636099611262L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("/healthcheck", "UNKNOWN");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setLastUpdatedTimestamp((long) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setHealthCheckUrls("na", "hi!", "hi!");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.setStatus(instanceStatus11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = instanceInfo7.getMetadata();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setIPAddr("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setNamespace("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder17.setStatusPageUrl("/Status", "unknown");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrlsForDeser("unknown", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder29.setHealthCheckUrls("unknown", "inesserver2.windows.cin.ufpe.br", "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setCountryId(1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setStatusPageUrl("na", "/healthcheck");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.LeaseInfo leaseInfo11 = instanceInfo7.getLeaseInfo();
        long long12 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("unknown", "unknown", "/Status");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean17 = myDataCenterInstanceConfig16.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo18);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo18);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = myDataCenterInstanceConfig21.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder11.setMetadata(strMap22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder11.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder11.setLastDirtyTimestamp(1636099670957L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder11.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "unknown");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHealthCheckUrls("/Status", "", "/");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getCountryId();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        int int15 = instanceInfo14.getCountryId();
        instanceInfo14.setIsCoordinatingDiscoveryServer();
        java.lang.String str17 = instanceInfo14.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastDirtyTimestamp((long) 80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setHealthCheckUrls("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/", "172.20.26.3");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setLastUpdatedTimestamp(1636099522815L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder4.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder4.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setStatusPageUrl("na", "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.add("inesserver2.windows.cin.ufpe.br:80", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/healthcheck");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str18 = instanceInfo7.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setIPAddr("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.setStatusPageUrl("UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder7.getRawInstance();
        java.lang.String str9 = instanceInfo8.getHostName();
        instanceInfo8.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder17.getRawInstance();
        int int19 = instanceInfo18.getSecurePort();
        java.lang.Long long20 = instanceInfo18.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.getRawInstance();
        int int23 = instanceInfo22.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        int int32 = instanceInfo31.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo34 = applicationInfoManager33.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager33.setInstanceStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo31.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo31.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType45 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setActionType(actionType45);
        com.netflix.appinfo.InstanceInfo.PortType portType47 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder44.enablePort(portType47, false);
        com.netflix.appinfo.InstanceInfo.PortType portType50 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder44.enablePort(portType50, true);
        boolean boolean53 = instanceInfo31.isPortEnabled(portType50);
        boolean boolean54 = instanceInfo22.isPortEnabled(portType50);
        boolean boolean55 = instanceInfo8.equals((java.lang.Object) boolean54);
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo8);
        instanceInfo8.setIsCoordinatingDiscoveryServer();
        int int58 = instanceInfo8.getCountryId();
        com.netflix.appinfo.InstanceInfo instanceInfo59 = new com.netflix.appinfo.InstanceInfo(instanceInfo8);
        java.lang.Long long60 = instanceInfo8.getLastDirtyTimestamp();
        java.lang.String str61 = instanceInfo8.getVIPAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.Long long11 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.add("inesserver2.windows.cin.ufpe.br", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        int int15 = instanceInfo14.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager16.setInstanceStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        instanceInfo30.setLastUpdatedTimestamp();
        boolean boolean32 = instanceInfo30.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo30.setStatus(instanceStatus34);
        instanceInfo21.setStatusWithoutDirty(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder4.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder4.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder39.setHomePageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean11 = myDataCenterInstanceConfig10.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo12);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setDataCenterInfo(dataCenterInfo12);
        boolean boolean16 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str21 = myDataCenterInstanceConfig20.getVirtualHostName();
        int int22 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        java.lang.String str23 = myDataCenterInstanceConfig20.getIpAddress();
        int int24 = myDataCenterInstanceConfig20.getNonSecurePort();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = myDataCenterInstanceConfig20.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder18.setMetadata(strMap25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder18.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getHostName();
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder16.getRawInstance();
        int int18 = instanceInfo17.getSecurePort();
        java.lang.Long long19 = instanceInfo17.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder20.getRawInstance();
        int int22 = instanceInfo21.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        int int31 = instanceInfo30.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager32 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = applicationInfoManager32.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager32.setInstanceStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus36 = instanceInfo30.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus38 = instanceInfo30.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder39.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType44 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setActionType(actionType44);
        com.netflix.appinfo.InstanceInfo.PortType portType46 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder43.enablePort(portType46, false);
        com.netflix.appinfo.InstanceInfo.PortType portType49 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder43.enablePort(portType49, true);
        boolean boolean52 = instanceInfo30.isPortEnabled(portType49);
        boolean boolean53 = instanceInfo21.isPortEnabled(portType49);
        boolean boolean54 = instanceInfo7.equals((java.lang.Object) boolean53);
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setPort((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder58.setHealthCheckUrlsForDeser("", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder61.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "", "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        java.lang.String str8 = instanceInfo7.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getStatus();
        int int10 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder13.setHomePageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder13.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setStatusPageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setStatusPageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder28.getRawInstance();
        int int30 = instanceInfo29.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager31 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = applicationInfoManager31.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager31.setInstanceStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo29.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder17.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder16.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder37.add("/Status", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder37.setHealthCheckUrls("UNKNOWN", "/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        java.lang.String[] strArray3 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80", "", "http://inesserver2.windows.cin.ufpe.br:80/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        int int12 = instanceInfo11.getSecurePort();
        java.lang.Long long13 = instanceInfo11.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder14.getRawInstance();
        int int16 = instanceInfo15.getCountryId();
        java.lang.Long long17 = instanceInfo15.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        java.lang.String str19 = instanceInfo15.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean28 = myDataCenterInstanceConfig27.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo29 = myDataCenterInstanceConfig27.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder24.setDataCenterInfo(dataCenterInfo29);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig36 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean37 = myDataCenterInstanceConfig36.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo38 = myDataCenterInstanceConfig36.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo38);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig40 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo38);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo38);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder31.setDataCenterInfo(dataCenterInfo38);
        boolean boolean43 = instanceInfo15.equals((java.lang.Object) dataCenterInfo38);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        java.lang.String str45 = instanceInfo15.getHostName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo15);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setLastUpdatedTimestamp((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastUpdatedTimestamp(1636099532152L);
        boolean boolean14 = builder9.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder9.setHealthCheckUrls("/healthcheck", "", "UNKNOWN");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo13);
        instanceInfo14.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "default");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder15.getRawInstance();
        int int17 = instanceInfo16.getSecurePort();
        java.lang.Long long18 = instanceInfo16.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo16);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        java.util.Set<java.lang.String> strSet22 = instanceInfo20.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo24.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder6.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setSecurePort((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder26.setHomePageUrl("default", "UNKNOWN");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str11 = instanceInfo7.getASGName();
        instanceInfo7.setSID("/");
        com.netflix.appinfo.InstanceInfo.PortType portType14 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        boolean boolean15 = instanceInfo7.isPortEnabled(portType14);
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setHealthCheckUrls("", "", "/healthcheck");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = instanceInfo7.getOverriddenStatus();
        java.lang.String str12 = instanceInfo7.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = instanceInfo7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str15 = instanceInfo7.getVersion();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("", "hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        instanceInfo7.setLastUpdatedTimestamp();
        boolean boolean9 = instanceInfo7.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("hi!", "/healthcheck", "hi!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str15 = instanceInfo7.getId();
        java.lang.String str16 = instanceInfo7.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getSecurePort();
        java.lang.Long long29 = instanceInfo27.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        int int32 = instanceInfo31.getCountryId();
        java.lang.Long long33 = instanceInfo31.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo31);
        instanceInfo31.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = instanceInfo31.getDataCenterInfo();
        java.lang.String str37 = instanceInfo31.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder44.getRawInstance();
        int int46 = instanceInfo45.getSecurePort();
        java.lang.Long long47 = instanceInfo45.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo45);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = builder48.getRawInstance();
        int int50 = instanceInfo49.getCountryId();
        java.lang.Long long51 = instanceInfo49.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo49);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder52.add("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder52.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder52.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder59.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.PortType portType62 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder61.enablePort(portType62, true);
        boolean boolean65 = instanceInfo31.isPortEnabled(portType62);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder19.enablePort(portType62, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder67.setHealthCheckUrls("default", "unknown", "unknown");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.InstanceInfo instanceInfo9 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str10 = instanceInfo7.getHostName();
        java.lang.String str11 = instanceInfo7.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.lang.String str14 = instanceInfo13.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        java.lang.String str16 = instanceInfo7.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setHealthCheckUrls("default", "/healthcheck", "");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo18 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setHomePageUrl("", "na");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo7.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        java.lang.String str18 = instanceInfo7.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        java.lang.String str21 = instanceInfo20.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = instanceInfo20.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        int int32 = instanceInfo31.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo34 = applicationInfoManager33.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager33.setInstanceStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo31.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo instanceInfo38 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo instanceInfo39 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        instanceInfo39.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus41 = instanceInfo39.getStatus();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = instanceInfo39.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder23.setMetadata(strMap42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder23.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "hi!");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setAppGroupName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.add("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder4.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder4.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSID("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.LeaseInfo leaseInfo13 = instanceInfo11.getLeaseInfo();
        java.lang.String str14 = instanceInfo11.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo11);
        instanceInfo15.setLastDirtyTimestamp((java.lang.Long) 0L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        boolean boolean19 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setCountryId(1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br");
        java.lang.String str40 = myDataCenterInstanceConfig38.getHostName(false);
        java.lang.String str41 = myDataCenterInstanceConfig38.getVirtualHostName();
        java.lang.String str42 = myDataCenterInstanceConfig38.getHomePageUrl();
        java.lang.String str43 = myDataCenterInstanceConfig38.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo44 = myDataCenterInstanceConfig38.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig45 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo44);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder35.setDataCenterInfo(dataCenterInfo44);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig47 = new com.netflix.appinfo.MyDataCenterInstanceConfig("UNKNOWN", dataCenterInfo44);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig48 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo44);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig49 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo44);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder18.setDataCenterInfo(dataCenterInfo44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder50.setHomePageUrl("/healthcheck", "/Status");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setPort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddress("UNKNOWN");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean16 = myDataCenterInstanceConfig15.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo17);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo17);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo17);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/healthcheck", dataCenterInfo17);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder4.setDataCenterInfo(dataCenterInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager9.setInstanceStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = instanceInfo7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder28.getRawInstance();
        int int30 = instanceInfo29.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager31 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = applicationInfoManager31.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager31.setInstanceStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo29.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder17.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder16.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder16.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder16.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSID("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder43.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder6.getRawInstance();
        int int8 = instanceInfo7.getSecurePort();
        java.lang.Long long9 = instanceInfo7.isDirtyWithTime();
        java.lang.String str10 = instanceInfo7.getStatusPageUrl();
        instanceInfo7.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder22.getRawInstance();
        int int24 = instanceInfo23.getSecurePort();
        java.lang.Long long25 = instanceInfo23.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder26.getRawInstance();
        int int28 = instanceInfo27.getCountryId();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setCountryId((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo36 = builder35.getRawInstance();
        int int37 = instanceInfo36.getSecurePort();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager38 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager38.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        applicationInfoManager38.setInstanceStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus42 = instanceInfo36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo36);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo36.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType50 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.PortType portType52 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder49.enablePort(portType52, false);
        com.netflix.appinfo.InstanceInfo.PortType portType55 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder49.enablePort(portType55, true);
        boolean boolean58 = instanceInfo36.isPortEnabled(portType55);
        boolean boolean59 = instanceInfo27.isPortEnabled(portType55);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder15.enablePort(portType55, true);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder63.setHealthCheckUrls("/Status", "hi!", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastDirtyTimestamp((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean16 = myDataCenterInstanceConfig15.isInstanceEnabledOnit();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setDataCenterInfo(dataCenterInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSID("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "unknown");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setLastDirtyTimestamp((long) 30);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder4.setLastDirtyTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setCountryId((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.add("172.20.26.3", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setPort((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/healthcheck");
    }
}

